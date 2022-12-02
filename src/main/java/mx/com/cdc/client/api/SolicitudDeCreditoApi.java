package mx.com.cdc.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import mx.com.cdc.client.ApiCallback;
import mx.com.cdc.client.ApiClient;
import mx.com.cdc.client.ApiException;
import mx.com.cdc.client.ApiResponse;
import mx.com.cdc.client.Configuration;
import mx.com.cdc.client.Pair;
import mx.com.cdc.client.ProgressRequestBody;
import mx.com.cdc.client.ProgressResponseBody;
import mx.com.cdc.client.model.RequestExportarExpediente;
import mx.com.cdc.client.model.ResponseExportarExpediente;

public class SolicitudDeCreditoApi {
    private ApiClient apiClient;
    public SolicitudDeCreditoApi() {
        this(Configuration.getDefaultApiClient());
    }
    public SolicitudDeCreditoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call exportarExpedienteCall(String xApiKey, String username, String password, RequestExportarExpediente exportar, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = exportar;
        String localVarPath = "/exportar/informacion";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    @SuppressWarnings("rawtypes")
    private okhttp3.Call exportarExpedienteValidateBeforeCall(String xApiKey, String username, String password, RequestExportarExpediente exportar, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {    
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling exportarExpediente(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling exportarExpediente(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling exportarExpediente(Async)");
        }
        if (exportar == null) {
            throw new ApiException("Missing the required parameter 'exportar' when calling exportarExpediente(Async)");
        }
        
        okhttp3.Call call = exportarExpedienteCall(xApiKey, username, password, exportar, progressListener, progressRequestListener);
        return call;
    }
    
    public ResponseExportarExpediente exportarExpediente(String xApiKey, String username, String password, RequestExportarExpediente exportar) throws ApiException {
        ApiResponse<ResponseExportarExpediente> resp = exportarExpedienteWithHttpInfo( xApiKey, username, password, exportar);
        return resp.getData();
    }
    
    public ApiResponse<ResponseExportarExpediente> exportarExpedienteWithHttpInfo(String xApiKey, String username, String password, RequestExportarExpediente exportar) throws ApiException {
        okhttp3.Call call = exportarExpedienteValidateBeforeCall(xApiKey, username, password, exportar, null, null);
        Type localVarReturnType = new TypeToken<ResponseExportarExpediente>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }
    
    public okhttp3.Call exportarExpedienteAsync(String xSignature, String xApiKey, String username, String password, RequestExportarExpediente exportar, final ApiCallback<ResponseExportarExpediente> callback) throws ApiException {
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;
        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };
            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }
        okhttp3.Call call = exportarExpedienteValidateBeforeCall( xApiKey, username, password, exportar, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResponseExportarExpediente>(){}.getType();
        apiClient.execute(call, localVarReturnType);
        return call;
    }
}
