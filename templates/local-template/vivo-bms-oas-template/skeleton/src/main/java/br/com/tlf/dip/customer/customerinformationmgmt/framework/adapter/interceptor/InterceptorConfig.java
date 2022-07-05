package br.com.tlf.dip.customer.customerinformationmgmt.framework.adapter.interceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
 
//@Configuration 
public class InterceptorConfig extends WebMvcConfigurerAdapter {

	@Value("MIICrzCCAhgCBHCo93EwDQYJKoZIhvcNAQELBQAwgZsxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRIwEAYDVQQHEwlDdXBlcnRpbm8xFDASBgNVBAoTC09ibGl4LCBJbmMuMREwDwYDVQQLEwhOZXRQb2ludDE6MDgGA1UEAxMxTmV0UG9pbnQgU2ltcGxlIFNlY3VyaXR5IENBIC0gTm90IGZvciBHZW5lcmFsIFVzZTAeFw0yMDAyMTcxOTE3NDlaFw0yNTAyMTUxOTE3NDlaMB0xGzAZBgNVBAMTElZpdm9DdXN0b21lckRvbWFpbjCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAIXC8Oe8IQbil55/QQk/AEWChrk61uDerOK7Ht8gHw4YrrM+zxxeMWakPsoKlQgj9s3KFbHDY0Bzx+ba3u5AoKMv007MuQdcvzgNxhn1e8a9jjECnzH1ocdWYKeQFPqGpv7cjdC41bETlias8HS4zVKjrLFWRvoLnHId948b0oODfPJ56uLib8zmjUThI/78yNlIL989FWBOS8bogn5/8pL24qb/CmiKhKrKm8ve2pb7gwD2ZdhND6ZIkqFvHCIQgyiLvpwnY0v2fUI9CgKYrU7W/Yoha8ArDbnYaBXYdeAcXek60Gyqk1P3GGNDevwuHoAxnuVmOgoSklcgaqhkYaMCAwEAATANBgkqhkiG9w0BAQsFAAOBgQA4ElnEAX8cmCXJP2I5frFFOoGkks6ShMtmeEt9ah4+gocftCsFNfQC484iAmbQmCv48XSQkJZYyHhwpWvV3/1Zf7RFU8e3Jnoq7ReMY+NosZKye5HKhKgCaROdc88lcDrioLQj+8bYg7nA5iK8RQ8pla4U1qGeCvELngHnwyvijg==")
    private String rpaCertificate;
      
    @Value("SVC_RPA_OAUTH")
    private String rpaUserAPI;
     
    @Value("ServiceAccount.Profile")
    private String rpaScopeAPI;
    
    @Value("550746a0644dbc602f29658ec5729894")
    private String rpaClienId;
     
    @Bean
    public AuthInterceptor requestHandler() {
    	String[] rpaCertificateList = new String[] {rpaCertificate};
    	String[] rpaUserList = new String[] {rpaUserAPI};
    	String[] rpaScopeList = new String[] {rpaScopeAPI};
    	String[] rpaClientList = new String[] {rpaClienId};
    	
    	return new AuthInterceptor(rpaCertificateList, rpaUserList, rpaScopeList, rpaClientList);
    }
 
    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        registry.addInterceptor(requestHandler()).excludePathPatterns(
                "/healthcheck"
        );
    }
}
