/*
 * Postmark API
 * Postmark makes sending and receiving email incredibly easy. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.EditServerConfigurationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ServerConfigurationApiApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ServerConfigurationApiApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ServerConfigurationApiApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getServerToken() == null) {
            throw new IllegalArgumentException("\"X-Postmark-Server-Token\" is required but no API key was provided. Please set \"X-Postmark-Server-Token\" with ApiClient#setServerToken(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getConfigurationCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/server";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "serverToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getConfigurationValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getConfigurationCall(_callback);

    }


    private ApiResponse<Object> getConfigurationWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getConfigurationValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getConfigurationAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getConfigurationValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetConfigurationRequestBuilder {

        private GetConfigurationRequestBuilder() {
        }

        /**
         * Build call for getConfiguration
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Indicates an internal server error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getConfigurationCall(_callback);
        }


        /**
         * Execute getConfiguration request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Indicates an internal server error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getConfigurationWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getConfiguration request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Indicates an internal server error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getConfigurationWithHttpInfo();
        }

        /**
         * Execute getConfiguration request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Indicates an internal server error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getConfigurationAsync(_callback);
        }
    }

    /**
     * Get Server Configuration
     * 
     * @return GetConfigurationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Indicates an internal server error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public GetConfigurationRequestBuilder getConfiguration() throws IllegalArgumentException {
        return new GetConfigurationRequestBuilder();
    }
    private okhttp3.Call updateConfigurationCall(EditServerConfigurationRequest editServerConfigurationRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = editServerConfigurationRequest;

        // create path and map variables
        String localVarPath = "/server";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "serverToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateConfigurationValidateBeforeCall(EditServerConfigurationRequest editServerConfigurationRequest, final ApiCallback _callback) throws ApiException {
        return updateConfigurationCall(editServerConfigurationRequest, _callback);

    }


    private ApiResponse<Object> updateConfigurationWithHttpInfo(EditServerConfigurationRequest editServerConfigurationRequest) throws ApiException {
        okhttp3.Call localVarCall = updateConfigurationValidateBeforeCall(editServerConfigurationRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateConfigurationAsync(EditServerConfigurationRequest editServerConfigurationRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateConfigurationValidateBeforeCall(editServerConfigurationRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateConfigurationRequestBuilder {
        private String bounceHookUrl;
        private String clickHookUrl;
        private String color;
        private String deliveryHookUrl;
        private String inboundDomain;
        private String inboundHookUrl;
        private Integer inboundSpamThreshold;
        private String name;
        private String openHookUrl;
        private Boolean postFirstOpenOnly;
        private Boolean rawEmailEnabled;
        private Boolean smtpApiActivated;
        private String trackLinks;
        private Boolean trackOpens;

        private UpdateConfigurationRequestBuilder() {
        }

        /**
         * Set bounceHookUrl
         * @param bounceHookUrl  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder bounceHookUrl(String bounceHookUrl) {
            this.bounceHookUrl = bounceHookUrl;
            return this;
        }
        
        /**
         * Set clickHookUrl
         * @param clickHookUrl Webhook url allowing real-time notification when tracked links are clicked. (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder clickHookUrl(String clickHookUrl) {
            this.clickHookUrl = clickHookUrl;
            return this;
        }
        
        /**
         * Set color
         * @param color  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder color(String color) {
            this.color = color;
            return this;
        }
        
        /**
         * Set deliveryHookUrl
         * @param deliveryHookUrl  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder deliveryHookUrl(String deliveryHookUrl) {
            this.deliveryHookUrl = deliveryHookUrl;
            return this;
        }
        
        /**
         * Set inboundDomain
         * @param inboundDomain  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder inboundDomain(String inboundDomain) {
            this.inboundDomain = inboundDomain;
            return this;
        }
        
        /**
         * Set inboundHookUrl
         * @param inboundHookUrl  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder inboundHookUrl(String inboundHookUrl) {
            this.inboundHookUrl = inboundHookUrl;
            return this;
        }
        
        /**
         * Set inboundSpamThreshold
         * @param inboundSpamThreshold  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder inboundSpamThreshold(Integer inboundSpamThreshold) {
            this.inboundSpamThreshold = inboundSpamThreshold;
            return this;
        }
        
        /**
         * Set name
         * @param name  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set openHookUrl
         * @param openHookUrl  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder openHookUrl(String openHookUrl) {
            this.openHookUrl = openHookUrl;
            return this;
        }
        
        /**
         * Set postFirstOpenOnly
         * @param postFirstOpenOnly  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder postFirstOpenOnly(Boolean postFirstOpenOnly) {
            this.postFirstOpenOnly = postFirstOpenOnly;
            return this;
        }
        
        /**
         * Set rawEmailEnabled
         * @param rawEmailEnabled  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder rawEmailEnabled(Boolean rawEmailEnabled) {
            this.rawEmailEnabled = rawEmailEnabled;
            return this;
        }
        
        /**
         * Set smtpApiActivated
         * @param smtpApiActivated  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder smtpApiActivated(Boolean smtpApiActivated) {
            this.smtpApiActivated = smtpApiActivated;
            return this;
        }
        
        /**
         * Set trackLinks
         * @param trackLinks  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder trackLinks(String trackLinks) {
            this.trackLinks = trackLinks;
            return this;
        }
        
        /**
         * Set trackOpens
         * @param trackOpens  (optional)
         * @return UpdateConfigurationRequestBuilder
         */
        public UpdateConfigurationRequestBuilder trackOpens(Boolean trackOpens) {
            this.trackOpens = trackOpens;
            return this;
        }
        
        /**
         * Build call for updateConfiguration
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Indicates an internal server error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            EditServerConfigurationRequest editServerConfigurationRequest = buildBodyParams();
            return updateConfigurationCall(editServerConfigurationRequest, _callback);
        }

        private EditServerConfigurationRequest buildBodyParams() {
            EditServerConfigurationRequest editServerConfigurationRequest = new EditServerConfigurationRequest();
            editServerConfigurationRequest.bounceHookUrl(this.bounceHookUrl);
            editServerConfigurationRequest.clickHookUrl(this.clickHookUrl);
            if (this.color != null)
            editServerConfigurationRequest.color(EditServerConfigurationRequest.ColorEnum.fromValue(this.color));
            editServerConfigurationRequest.deliveryHookUrl(this.deliveryHookUrl);
            editServerConfigurationRequest.inboundDomain(this.inboundDomain);
            editServerConfigurationRequest.inboundHookUrl(this.inboundHookUrl);
            editServerConfigurationRequest.inboundSpamThreshold(this.inboundSpamThreshold);
            editServerConfigurationRequest.name(this.name);
            editServerConfigurationRequest.openHookUrl(this.openHookUrl);
            editServerConfigurationRequest.postFirstOpenOnly(this.postFirstOpenOnly);
            editServerConfigurationRequest.rawEmailEnabled(this.rawEmailEnabled);
            editServerConfigurationRequest.smtpApiActivated(this.smtpApiActivated);
            if (this.trackLinks != null)
            editServerConfigurationRequest.trackLinks(EditServerConfigurationRequest.TrackLinksEnum.fromValue(this.trackLinks));
            editServerConfigurationRequest.trackOpens(this.trackOpens);
            return editServerConfigurationRequest;
        }

        /**
         * Execute updateConfiguration request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Indicates an internal server error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            EditServerConfigurationRequest editServerConfigurationRequest = buildBodyParams();
            ApiResponse<Object> localVarResp = updateConfigurationWithHttpInfo(editServerConfigurationRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateConfiguration request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Indicates an internal server error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            EditServerConfigurationRequest editServerConfigurationRequest = buildBodyParams();
            return updateConfigurationWithHttpInfo(editServerConfigurationRequest);
        }

        /**
         * Execute updateConfiguration request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Indicates an internal server error occurred. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            EditServerConfigurationRequest editServerConfigurationRequest = buildBodyParams();
            return updateConfigurationAsync(editServerConfigurationRequest, _callback);
        }
    }

    /**
     * Edit Server Configuration
     * 
     * @return UpdateConfigurationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Indicates an internal server error occurred. </td><td>  -  </td></tr>
     </table>
     */
    public UpdateConfigurationRequestBuilder updateConfiguration() throws IllegalArgumentException {
        return new UpdateConfigurationRequestBuilder();
    }
}