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

import io.swagger.client.ApiException;
import io.swagger.client.model.AdminProfile;
import io.swagger.client.model.ProjectUsersProfile;
import io.swagger.client.model.SiteUsersProfile;
import io.swagger.client.model.UserProfile;
import io.swagger.client.model.UserProfileResponse;
import io.swagger.client.model.UserResourceExtension;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserProfileApi
 */
@Ignore
public class UserProfileApiTest {

    private final UserProfileApi api = new UserProfileApi();

    
    /**
     * Assigns multiple Users to a Profile
     *
     * To batch assign users to a profile (Admin profile, User profile) (as in qTest Manager &lt;em&gt;admin panel&lt;/em&gt;). It requires that your qTest Manager profile is a site admin with &lt;em&gt;Manage Client Users&lt;/em&gt; permissions  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchAssignUserProfileInClientTest() throws ApiException {
        SiteUsersProfile body = null;
        List<UserResourceExtension> response = api.batchAssignUserProfileInClient(body);

        // TODO: test validations
    }
    
    /**
     * Assigns multiple Users to a Profile in a Project
     *
     * To change profile of assigned users (as a project&#39;s User Management page). It requires that your qTest Manager profile within the project is Project Admin  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void batchAssignUserProfileInProjectTest() throws ApiException {
        Long projectId = null;
        ProjectUsersProfile body = null;
        List<UserResourceExtension> response = api.batchAssignUserProfileInProject(projectId, body);

        // TODO: test validations
    }
    
    /**
     * Gets current User&#39;s Admin Profile
     *
     * To retrieve your Admin Profile  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 4+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentTest() throws ApiException {
        AdminProfile response = api.getCurrent();

        // TODO: test validations
    }
    
    /**
     * Gets current User&#39;s Profiles in different Projects
     *
     * To retrieve your User Profiles in different Projects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProfilesOfCurrentUserTest() throws ApiException {
        List<UserProfile> response = api.getProfilesOfCurrentUser();

        // TODO: test validations
    }
    
    /**
     * Gets available Profiles
     *
     * To retrieve all available profiles in your qTest Manager instance. It requires that your qTest Manager profile is a site admin with &lt;em&gt;View User Profiles&lt;/em&gt; permissions  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 8.4.2+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserProfilesTest() throws ApiException {
        String type = null;
        UserProfileResponse response = api.getUserProfiles(type);

        // TODO: test validations
    }
    
}
