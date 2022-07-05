package br.com.tlf.dip.customer.customerinformationmgmt.framework.helper;

import java.util.Date;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import br.com.tlf.dip.customer.customerinformationmgmt.framework.exception.AbstractBusinessException;

/**
 * 
 * @author A0089321
 * O objetivo da classe é conter métodos genéricos que atendam a qualquer demanda.
 * 08/04/2021
 *
 */
public class Util {

	/*size
     * Converts XMLGregorianCalendar to java.util.Date in Java
     */
    public static Date toDate(XMLGregorianCalendar calendar){
        if(calendar == null) {
            return null;
        }
        return calendar.toGregorianCalendar().getTime();
    }
    
	/**
	 * Converte o Token JWT em Java Object e recupera a chave para validação.
	 * @param jwtToken: token JWT recebido na solicitação.
	 * @param key: chave utilizada para validação do token
	 * @return key: o parâmetro usado para comparar e validar o acesso
	 * @author A0089321 arthur.gjunior
	 * @data: 18/05/2021
	 * @throws AbstractBusinessException
	 */
	@SuppressWarnings("unchecked")
	public static String getTokenEntity(String jwtToken, String key) throws AbstractBusinessException {

		try {

			String[] split_string = jwtToken.split("\\.");
			String base64EncodedBody = split_string[1];
			Base64 base64Url = new Base64(true);
			String body = new String(base64Url.decode(base64EncodedBody));
			Gson gson = new Gson();
			//Converte em object
			Object param = gson.fromJson(body, Object.class);
			//Atribui para um LinkedTreeMap Object
			LinkedTreeMap<String, String> map = (LinkedTreeMap<String, String>) param;
			//Percorre e recupera o valor da "key"
			for(Map.Entry<String,String> entry : map.entrySet()) {
				  if(entry.getKey().equalsIgnoreCase(key)) 
					   key = entry.getValue();
			}
			return key;
			
		} catch (Exception e) {
			throw new AbstractBusinessException(MessagesEnun.ERROR_TOKEN_NOT_VALIDATE, null,e.getCause().getMessage());
			
		}			
		
		
	}
	
	
	/**
	 * @author R320975
	 * validar tamanho string
	 * 
	 */
    public static boolean isValidString(String str, int size) {
        

        if (str.isBlank() || str.isEmpty() || str == null) {
            return false;
        }else{
        	if (str.length() == size)
        		return true;
        	else
        		return false;
        	
        }
        
    }
	
    /**
     * Valida se uma string não é nula e vazia
     * @param str
     * @return
     */
    public static boolean isNotEmptyString(String str) {
    	
    	if (str != null && !str.isEmpty()) {
    	    return true;
    	}
    	
    	return false;
    }

    
}
