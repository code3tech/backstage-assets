package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.google.gson.Gson;

import br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.validator.TokenValidator;
import br.com.tlf.dip.customer.customerinformationmgmt.framework.errors.Error;


public class AuthInterceptor implements HandlerInterceptor{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    private String[] publicKey;
    private String[] userAPI;
    private String[] clientId;
    private String[] scopeAPI; 
    
    
    public AuthInterceptor(String[] rpaCertificateList, String[] rpaUserList, String[] rpaScopeList, String[] rpaClientList) {
        this.publicKey = rpaCertificateList;
        this.userAPI = rpaUserList;
        this.scopeAPI = rpaScopeList;
        this.clientId = rpaClientList;
    }
    
    

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String authorization = request.getHeader("Authorization");
          
        logger.info("Here we have to validate the token. Authorization.");
        //logger.info("Header Authorization: " + authorization);
  
        try {
            TokenValidator vToken = new TokenValidator();
            vToken.validateToken(authorization, this.publicKey[0], this.userAPI, this.clientId, this.scopeAPI[0]);
        } catch(TokenExpiredException ex) {
            logger.error(ex.getMessage());
              
            Error error = new Error("401", "Unauthorized Request", "Token expirado", 1);
            response.getWriter().write(new Gson().toJson(error));
            response.setStatus(401);
            response.setContentType("application/json");
              
            return false;
        } catch(JWTDecodeException e) {
            logger.error(e.getMessage());
              
            Error error = new Error("401", "Unauthorized Request", "Token inválido", 1);
            response.getWriter().write(new Gson().toJson(error));
            response.setStatus(401);
            response.setContentType("application/json");
              
            return false;
            
        } catch(Exception e) {
            logger.error(e.getMessage());
              
            Error error = new Error("401", "Unauthorized Request", e.getMessage(), 1);
            response.getWriter().write(new Gson().toJson(error));
            response.setStatus(401);
            response.setContentType("application/json");
              
            return false;
        }
          
        return true;
    }
    
    
}
