/*
 * Zephyr Scale Cloud API
 *  # Introduction  This is the **Zephyr Scale Cloud** API. If you are looking for the Server API, please refer to the [documentation](https://support.smartbear.com/zephyr-scale-server/docs/) for more information.  This API uses the OpenAPI specification. If you want to generate clients for different languages, please use the link above to download the API specification and use it with your preferred tools.  For feature requests or general support, please head to our [support site](https://smartbear.atlassian.net/servicedesk/customer/portal/42).  # Authentication The API authentication is based on JSON Web Token (JWT), which is a key for accessing the API. Authenticating using JWT requires the following steps: * Generate a key * Make authenticated requests  ## Generate a Key For accessing the API, you must generate an access key in Jira. To generate an access token, click on your profile picture at the page bottom left, and choose the option “Zephyr Scale API keys\". For more information, please check out the [documentation](https://support.smartbear.com/zephyr-scale-cloud/docs/api-and-test-automation/generating-access-keys.html).  ## Accessing the API The API is available at the following base URL: ``` https://api.zephyrscale.smartbear.com/v2 ``` For example, the final URL for retrieving test cases would be: ``` https://api.zephyrscale.smartbear.com/v2/testcases ```  ## Making Authenticated Requests To authenticate subsequent API requests, you must provide a valid token in an HTTP header, which is the key generated on the previous step: ``` Authorization: Bearer {bearer_token} ``` # Representing Users  Previous API definitions used Atlassian User Keys to identify users. This parameter is deprecated because of privacy changes. Use Atlassian Account ID instead.   Atlassian Account IDs are globally unique opaque identifiers for identifying a user. Every Atlassian Account has a ID which is assigned when the account is created and is immutable. Account IDs contain no personally identifiable information and are only used to retrieve user information ondemand. This API does not return any user information other than the Account ID (with the exception of the deprecated user keys during the deprecation period). 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapi.zephyr.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapi.zephyr.model.PagedList;
import org.openapi.zephyr.model.Status;
import org.openapi.zephyr.model.StatusListAllOf;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for StatusList
 */
public class StatusListTest {
    private final StatusList model = new StatusList();

    /**
     * Model tests for StatusList
     */
    @Test
    public void testStatusList() {
        // TODO: test StatusList
    }

    /**
     * Test the property 'next'
     */
    @Test
    public void nextTest() {
        // TODO: test next
    }

    /**
     * Test the property 'startAt'
     */
    @Test
    public void startAtTest() {
        // TODO: test startAt
    }

    /**
     * Test the property 'maxResults'
     */
    @Test
    public void maxResultsTest() {
        // TODO: test maxResults
    }

    /**
     * Test the property 'total'
     */
    @Test
    public void totalTest() {
        // TODO: test total
    }

    /**
     * Test the property 'isLast'
     */
    @Test
    public void isLastTest() {
        // TODO: test isLast
    }

    /**
     * Test the property 'values'
     */
    @Test
    public void valuesTest() {
        // TODO: test values
    }

}
