/*
 * qTest Manager API Version 8.6 - 11.0
 * qTest Manager API Version 8.6 - 11.0
 *
 * OpenAPI spec version: 8.6 - 11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AdminProfile;
import io.swagger.client.model.ProjectUsersProfile;
import io.swagger.client.model.SiteUsersProfile;
import io.swagger.client.model.UserProfile;
import io.swagger.client.model.UserProfileResponse;
import io.swagger.client.model.UserResourceExtension;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserProfileApi {
    private ApiClient apiClient;

    public UserProfileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserProfileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for batchAssignUserProfileInClient */
    private com.squareup.okhttp.Call batchAssignUserProfileInClientCall(SiteUsersProfile body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v3/user-profiles/batch-assign-users".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };

        if (!localVarHeaderParams.containsKey("Content-Type")) {
            final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call batchAssignUserProfileInClientValidateBeforeCall(SiteUsersProfile body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling batchAssignUserProfileInClient(Async)");
        }
        
        
        com.squareup.okhttp.Call call = batchAssignUserProfileInClientCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Assigns multiple Users to a Profile
     * To batch assign users to a profile (Admin profile, User profile) (as in qTest Manager &lt;em&gt;admin panel&lt;/em&gt;). It requires that your qTest Manager profile is a site admin with &lt;em&gt;Manage Client Users&lt;/em&gt; permissions  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     * @param body An array of user IDs and admin and/or normal user profile (required)
     * @return List&lt;UserResourceExtension&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<UserResourceExtension> batchAssignUserProfileInClient(SiteUsersProfile body) throws ApiException {
        ApiResponse<List<UserResourceExtension>> resp = batchAssignUserProfileInClientWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Assigns multiple Users to a Profile
     * To batch assign users to a profile (Admin profile, User profile) (as in qTest Manager &lt;em&gt;admin panel&lt;/em&gt;). It requires that your qTest Manager profile is a site admin with &lt;em&gt;Manage Client Users&lt;/em&gt; permissions  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     * @param body An array of user IDs and admin and/or normal user profile (required)
     * @return ApiResponse&lt;List&lt;UserResourceExtension&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<UserResourceExtension>> batchAssignUserProfileInClientWithHttpInfo(SiteUsersProfile body) throws ApiException {
        com.squareup.okhttp.Call call = batchAssignUserProfileInClientValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<List<UserResourceExtension>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assigns multiple Users to a Profile (asynchronously)
     * To batch assign users to a profile (Admin profile, User profile) (as in qTest Manager &lt;em&gt;admin panel&lt;/em&gt;). It requires that your qTest Manager profile is a site admin with &lt;em&gt;Manage Client Users&lt;/em&gt; permissions  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     * @param body An array of user IDs and admin and/or normal user profile (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call batchAssignUserProfileInClientAsync(SiteUsersProfile body, final ApiCallback<List<UserResourceExtension>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = batchAssignUserProfileInClientValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<UserResourceExtension>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for batchAssignUserProfileInProject */
    private com.squareup.okhttp.Call batchAssignUserProfileInProjectCall(Long projectId, ProjectUsersProfile body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v3/user-profiles/{projectId}/batch-assign-users".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };

        if (!localVarHeaderParams.containsKey("Content-Type")) {
            final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call batchAssignUserProfileInProjectValidateBeforeCall(Long projectId, ProjectUsersProfile body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling batchAssignUserProfileInProject(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling batchAssignUserProfileInProject(Async)");
        }
        
        
        com.squareup.okhttp.Call call = batchAssignUserProfileInProjectCall(projectId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Assigns multiple Users to a Profile in a Project
     * To change profile of assigned users (as a project&#39;s User Management page). It requires that your qTest Manager profile within the project is Project Admin  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     * @param projectId ID of the project (required)
     * @param body An array of user IDs and a user profile (required)
     * @return List&lt;UserResourceExtension&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<UserResourceExtension> batchAssignUserProfileInProject(Long projectId, ProjectUsersProfile body) throws ApiException {
        ApiResponse<List<UserResourceExtension>> resp = batchAssignUserProfileInProjectWithHttpInfo(projectId, body);
        return resp.getData();
    }

    /**
     * Assigns multiple Users to a Profile in a Project
     * To change profile of assigned users (as a project&#39;s User Management page). It requires that your qTest Manager profile within the project is Project Admin  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     * @param projectId ID of the project (required)
     * @param body An array of user IDs and a user profile (required)
     * @return ApiResponse&lt;List&lt;UserResourceExtension&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<UserResourceExtension>> batchAssignUserProfileInProjectWithHttpInfo(Long projectId, ProjectUsersProfile body) throws ApiException {
        com.squareup.okhttp.Call call = batchAssignUserProfileInProjectValidateBeforeCall(projectId, body, null, null);
        Type localVarReturnType = new TypeToken<List<UserResourceExtension>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assigns multiple Users to a Profile in a Project (asynchronously)
     * To change profile of assigned users (as a project&#39;s User Management page). It requires that your qTest Manager profile within the project is Project Admin  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     * @param projectId ID of the project (required)
     * @param body An array of user IDs and a user profile (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call batchAssignUserProfileInProjectAsync(Long projectId, ProjectUsersProfile body, final ApiCallback<List<UserResourceExtension>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = batchAssignUserProfileInProjectValidateBeforeCall(projectId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<UserResourceExtension>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getCurrent */
    private com.squareup.okhttp.Call getCurrentCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v3/admin-profiles/current".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };

        if (!localVarHeaderParams.containsKey("Content-Type")) {
            final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getCurrentValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getCurrentCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets current User&#39;s Admin Profile
     * To retrieve your Admin Profile  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     * @return AdminProfile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdminProfile getCurrent() throws ApiException {
        ApiResponse<AdminProfile> resp = getCurrentWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets current User&#39;s Admin Profile
     * To retrieve your Admin Profile  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     * @return ApiResponse&lt;AdminProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdminProfile> getCurrentWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getCurrentValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<AdminProfile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets current User&#39;s Admin Profile (asynchronously)
     * To retrieve your Admin Profile  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCurrentAsync(final ApiCallback<AdminProfile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCurrentValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdminProfile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getProfilesOfCurrentUser */
    private com.squareup.okhttp.Call getProfilesOfCurrentUserCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v3/user-profiles/current".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };

        if (!localVarHeaderParams.containsKey("Content-Type")) {
            final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getProfilesOfCurrentUserValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getProfilesOfCurrentUserCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets current User&#39;s Profiles in different Projects
     * To retrieve your User Profiles in different Projects
     * @return List&lt;UserProfile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<UserProfile> getProfilesOfCurrentUser() throws ApiException {
        ApiResponse<List<UserProfile>> resp = getProfilesOfCurrentUserWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets current User&#39;s Profiles in different Projects
     * To retrieve your User Profiles in different Projects
     * @return ApiResponse&lt;List&lt;UserProfile&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<UserProfile>> getProfilesOfCurrentUserWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getProfilesOfCurrentUserValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<UserProfile>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets current User&#39;s Profiles in different Projects (asynchronously)
     * To retrieve your User Profiles in different Projects
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProfilesOfCurrentUserAsync(final ApiCallback<List<UserProfile>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getProfilesOfCurrentUserValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<UserProfile>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getUserProfiles */
    private com.squareup.okhttp.Call getUserProfilesCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v3/user-profiles".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };

        if (!localVarHeaderParams.containsKey("Content-Type")) {
            final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUserProfilesValidateBeforeCall(String type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getUserProfilesCall(type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Gets available Profiles
     * To retrieve all available profiles in your qTest Manager instance. It requires that your qTest Manager profile is a site admin with &lt;em&gt;View User Profiles&lt;/em&gt; permissions  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     * @param type &lt;em&gt;type&#x3D;admin&lt;/em&gt; - to retrieve only admin profiles  &lt;em&gt;type&#x3D;use&lt;/em&gt; - to retrieve only normal user profiles  Omit this parameter to include both (optional)
     * @return UserProfileResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UserProfileResponse getUserProfiles(String type) throws ApiException {
        ApiResponse<UserProfileResponse> resp = getUserProfilesWithHttpInfo(type);
        return resp.getData();
    }

    /**
     * Gets available Profiles
     * To retrieve all available profiles in your qTest Manager instance. It requires that your qTest Manager profile is a site admin with &lt;em&gt;View User Profiles&lt;/em&gt; permissions  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     * @param type &lt;em&gt;type&#x3D;admin&lt;/em&gt; - to retrieve only admin profiles  &lt;em&gt;type&#x3D;use&lt;/em&gt; - to retrieve only normal user profiles  Omit this parameter to include both (optional)
     * @return ApiResponse&lt;UserProfileResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UserProfileResponse> getUserProfilesWithHttpInfo(String type) throws ApiException {
        com.squareup.okhttp.Call call = getUserProfilesValidateBeforeCall(type, null, null);
        Type localVarReturnType = new TypeToken<UserProfileResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets available Profiles (asynchronously)
     * To retrieve all available profiles in your qTest Manager instance. It requires that your qTest Manager profile is a site admin with &lt;em&gt;View User Profiles&lt;/em&gt; permissions  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     * @param type &lt;em&gt;type&#x3D;admin&lt;/em&gt; - to retrieve only admin profiles  &lt;em&gt;type&#x3D;use&lt;/em&gt; - to retrieve only normal user profiles  Omit this parameter to include both (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserProfilesAsync(String type, final ApiCallback<UserProfileResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserProfilesValidateBeforeCall(type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UserProfileResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
