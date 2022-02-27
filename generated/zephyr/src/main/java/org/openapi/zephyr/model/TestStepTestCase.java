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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapi.zephyr.model.Link;
import org.openapi.zephyr.model.TestStepTestCaseAllOf;

/**
 * TestStepTestCase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-28T00:21:27.203715400+11:00[Australia/Sydney]")
public class TestStepTestCase {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_TEST_CASE_KEY = "testCaseKey";
  @SerializedName(SERIALIZED_NAME_TEST_CASE_KEY)
  private String testCaseKey;

  public TestStepTestCase() { 
  }

  public TestStepTestCase self(String self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSelf() {
    return self;
  }


  public void setSelf(String self) {
    this.self = self;
  }


  public TestStepTestCase testCaseKey(String testCaseKey) {
    
    this.testCaseKey = testCaseKey;
    return this;
  }

   /**
   * The key of the other test case that the test step should delegate execution to. This cannot be the parent test case.
   * @return testCaseKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The key of the other test case that the test step should delegate execution to. This cannot be the parent test case.")

  public String getTestCaseKey() {
    return testCaseKey;
  }


  public void setTestCaseKey(String testCaseKey) {
    this.testCaseKey = testCaseKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestStepTestCase testStepTestCase = (TestStepTestCase) o;
    return Objects.equals(this.self, testStepTestCase.self) &&
        Objects.equals(this.testCaseKey, testStepTestCase.testCaseKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, testCaseKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestStepTestCase {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    testCaseKey: ").append(toIndentedString(testCaseKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

