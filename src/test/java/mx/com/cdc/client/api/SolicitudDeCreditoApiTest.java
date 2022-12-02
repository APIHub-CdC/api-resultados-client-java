package mx.com.cdc.client.api;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.apihub.signer.manager.interceptor.SignerInterceptor;

import mx.com.cdc.client.ApiClient;
import mx.com.cdc.client.ApiException;
import mx.com.cdc.client.model.RequestExportarExpediente;
import mx.com.cdc.client.model.ResponseExportarExpediente;
import okhttp3.OkHttpClient;

public class SolicitudDeCreditoApiTest {
    private final SolicitudDeCreditoApi api = new SolicitudDeCreditoApi();
    
    private Logger logger = LoggerFactory.getLogger(SolicitudDeCreditoApiTest.class.getName());
    
    private ApiClient apiClient;
          
    private String url		= "cdc-api-url";
    private String xApiKey	= "your-x-api-key";
    private String username	= "your-username";
    private String password	= "your-password";

    private String keystoreFile		= "";
    private String cdcCertFile		= "";
    private String keystorePassword = "";
    private String keyAlias			= "";
    private String keyPassword		= "";
      
      @Before()
      public void Setup() {
         this.apiClient = api.getApiClient();
           this.apiClient.setBasePath(url);
           OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                  .readTimeout(30, TimeUnit.SECONDS)
                  .addInterceptor(new SignerInterceptor(
              keystoreFile, 
              cdcCertFile, 
              keystorePassword, 
              keyAlias, 
              keyPassword))
                  .build();
           apiClient.setHttpClient(okHttpClient);
      }
    
    @Test
    public void exportarExpedienteTest() throws Exception {
    	
    	RequestExportarExpediente exportar = new RequestExportarExpediente();

		exportar.setIdOtorgante("kPDjCZpf");
		exportar.setFolio(new Long(1069));
    	
		try {
			ResponseExportarExpediente response = api.exportarExpediente(xApiKey, username, password, exportar);

			Assert.assertTrue(response != null);
			if (response != null) {
				logger.info(response.toString());
			}
		} catch (ApiException e) {
			logger.info(e.getResponseBody());
		}

        
    }
    
}
