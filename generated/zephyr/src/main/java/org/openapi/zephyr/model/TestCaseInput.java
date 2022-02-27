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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TestCaseInput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-28T00:21:27.203715400+11:00[Australia/Sydney]")
public class TestCaseInput {
  public static final String SERIALIZED_NAME_PROJECT_KEY = "projectKey";
  @SerializedName(SERIALIZED_NAME_PROJECT_KEY)
  private String projectKey;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OBJECTIVE = "objective";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE)
  private String objective;

  public static final String SERIALIZED_NAME_PRECONDITION = "precondition";
  @SerializedName(SERIALIZED_NAME_PRECONDITION)
  private String precondition;

  public static final String SERIALIZED_NAME_ESTIMATED_TIME = "estimatedTime";
  @SerializedName(SERIALIZED_NAME_ESTIMATED_TIME)
  private Long estimatedTime;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "componentId";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Long componentId;

  public static final String SERIALIZED_NAME_PRIORITY_NAME = "priorityName";
  @SerializedName(SERIALIZED_NAME_PRIORITY_NAME)
  private String priorityName;

  public static final String SERIALIZED_NAME_STATUS_NAME = "statusName";
  @SerializedName(SERIALIZED_NAME_STATUS_NAME)
  private String statusName;

  public static final String SERIALIZED_NAME_FOLDER_ID = "folderId";
  @SerializedName(SERIALIZED_NAME_FOLDER_ID)
  private Long folderId;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, Object> customFields = null;

  public TestCaseInput() { 
  }

  public TestCaseInput projectKey(String projectKey) {
    
    this.projectKey = projectKey;
    return this;
  }

   /**
   * Jira project key.
   * @return projectKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "TIS", required = true, value = "Jira project key.")

  public String getProjectKey() {
    return projectKey;
  }


  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }


  public TestCaseInput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Check axial pump", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TestCaseInput objective(String objective) {
    
    this.objective = objective;
    return this;
  }

   /**
   * A description of the objective.
   * @return objective
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "To ensure the axial pump can be enabled", value = "A description of the objective.")

  public String getObjective() {
    return objective;
  }


  public void setObjective(String objective) {
    this.objective = objective;
  }


  public TestCaseInput precondition(String precondition) {
    
    this.precondition = precondition;
    return this;
  }

   /**
   * Any conditions that need to be met.
   * @return precondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Latest version of the axial pump available", value = "Any conditions that need to be met.")

  public String getPrecondition() {
    return precondition;
  }


  public void setPrecondition(String precondition) {
    this.precondition = precondition;
  }


  public TestCaseInput estimatedTime(Long estimatedTime) {
    
    this.estimatedTime = estimatedTime;
    return this;
  }

   /**
   * Estimated duration in milliseconds.
   * minimum: 0
   * @return estimatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "138000", value = "Estimated duration in milliseconds.")

  public Long getEstimatedTime() {
    return estimatedTime;
  }


  public void setEstimatedTime(Long estimatedTime) {
    this.estimatedTime = estimatedTime;
  }


  public TestCaseInput componentId(Long componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * ID of a component from Jira.
   * minimum: 0
   * @return componentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10001", value = "ID of a component from Jira.")

  public Long getComponentId() {
    return componentId;
  }


  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }


  public TestCaseInput priorityName(String priorityName) {
    
    this.priorityName = priorityName;
    return this;
  }

   /**
   * The priority name.
   * @return priorityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Low", value = "The priority name.")

  public String getPriorityName() {
    return priorityName;
  }


  public void setPriorityName(String priorityName) {
    this.priorityName = priorityName;
  }


  public TestCaseInput statusName(String statusName) {
    
    this.statusName = statusName;
    return this;
  }

   /**
   * The status name.
   * @return statusName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Low", value = "The status name.")

  public String getStatusName() {
    return statusName;
  }


  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }


  public TestCaseInput folderId(Long folderId) {
    
    this.folderId = folderId;
    return this;
  }

   /**
   * ID of a folder to place the entity within.
   * minimum: 1
   * @return folderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of a folder to place the entity within.")

  public Long getFolderId() {
    return folderId;
  }


  public void setFolderId(Long folderId) {
    this.folderId = folderId;
  }


  public TestCaseInput ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Atlassian Account ID of the Jira user.
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5b10a2844c20165700ede21g", value = "Atlassian Account ID of the Jira user.")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public TestCaseInput labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public TestCaseInput addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Array of labels associated to this entity.
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Regression\",\"Performance\",\"Automated\"]", value = "Array of labels associated to this entity.")

  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public TestCaseInput customFields(Map<String, Object> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public TestCaseInput putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Multi-line text fields should denote a new line with the \\&lt;br\\&gt; syntax. Dates should be in the format &#39;yyyy-MM-dd&#39;. Users should provided by the user ID. 
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"Build Number\":20,\"Release Date\":\"2020-01-01\",\"Pre-Condition(s)\":\"User should have logged in. <br> User should have navigated to the administration panel.\",\"Implemented\":false,\"Category\":[\"Performance\",\"Regression\"],\"Tester\":\"fa2e582e-5e15-521e-92e3-47e6ca2e7256\"}", value = "Multi-line text fields should denote a new line with the \\<br\\> syntax. Dates should be in the format 'yyyy-MM-dd'. Users should provided by the user ID. ")

  public Map<String, Object> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCaseInput testCaseInput = (TestCaseInput) o;
    return Objects.equals(this.projectKey, testCaseInput.projectKey) &&
        Objects.equals(this.name, testCaseInput.name) &&
        Objects.equals(this.objective, testCaseInput.objective) &&
        Objects.equals(this.precondition, testCaseInput.precondition) &&
        Objects.equals(this.estimatedTime, testCaseInput.estimatedTime) &&
        Objects.equals(this.componentId, testCaseInput.componentId) &&
        Objects.equals(this.priorityName, testCaseInput.priorityName) &&
        Objects.equals(this.statusName, testCaseInput.statusName) &&
        Objects.equals(this.folderId, testCaseInput.folderId) &&
        Objects.equals(this.ownerId, testCaseInput.ownerId) &&
        Objects.equals(this.labels, testCaseInput.labels) &&
        Objects.equals(this.customFields, testCaseInput.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectKey, name, objective, precondition, estimatedTime, componentId, priorityName, statusName, folderId, ownerId, labels, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCaseInput {\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    precondition: ").append(toIndentedString(precondition)).append("\n");
    sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    priorityName: ").append(toIndentedString(priorityName)).append("\n");
    sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

