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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * AutomationScheduleCreationAPI
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T17:05:50.259Z")
public class AutomationScheduleCreationAPI {
  @SerializedName("clientId")
  private Long clientId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("agentId")
  private Long agentId = null;

  @SerializedName("startDate")
  private DateTime startDate = null;

  @SerializedName("creator")
  private Long creator = null;

  @SerializedName("projectId")
  private Long projectId = null;

  @SerializedName("testRunIds")
  private List<Long> testRunIds = new ArrayList<Long>();

  @SerializedName("dynamic")
  private Map<String, String> dynamic = new HashMap<String, String>();

  public AutomationScheduleCreationAPI clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public AutomationScheduleCreationAPI name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of schedule
   * @return name
  **/
  @ApiModelProperty(example = "Demo Suite Auto", value = "Name of schedule")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AutomationScheduleCreationAPI agentId(Long agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * ID of the agent which will execute your automation script
   * @return agentId
  **/
  @ApiModelProperty(example = "1", required = true, value = "ID of the agent which will execute your automation script")
  public Long getAgentId() {
    return agentId;
  }

  public void setAgentId(Long agentId) {
    this.agentId = agentId;
  }

  public AutomationScheduleCreationAPI startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public AutomationScheduleCreationAPI creator(Long creator) {
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreator() {
    return creator;
  }

  public void setCreator(Long creator) {
    this.creator = creator;
  }

  public AutomationScheduleCreationAPI projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public AutomationScheduleCreationAPI testRunIds(List<Long> testRunIds) {
    this.testRunIds = testRunIds;
    return this;
  }

  public AutomationScheduleCreationAPI addTestRunIdsItem(Long testRunIdsItem) {
    this.testRunIds.add(testRunIdsItem);
    return this;
  }

   /**
   * Arrays of Test Run ID
   * @return testRunIds
  **/
  @ApiModelProperty(example = "null", value = "Arrays of Test Run ID")
  public List<Long> getTestRunIds() {
    return testRunIds;
  }

  public void setTestRunIds(List<Long> testRunIds) {
    this.testRunIds = testRunIds;
  }

  public AutomationScheduleCreationAPI dynamic(Map<String, String> dynamic) {
    this.dynamic = dynamic;
    return this;
  }

  public AutomationScheduleCreationAPI putDynamicItem(String key, String dynamicItem) {
    this.dynamic.put(key, dynamicItem);
    return this;
  }

   /**
   * Additions values
   * @return dynamic
  **/
  @ApiModelProperty(example = "null", value = "Additions values")
  public Map<String, String> getDynamic() {
    return dynamic;
  }

  public void setDynamic(Map<String, String> dynamic) {
    this.dynamic = dynamic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationScheduleCreationAPI automationScheduleCreationAPI = (AutomationScheduleCreationAPI) o;
    return Objects.equals(this.clientId, automationScheduleCreationAPI.clientId) &&
        Objects.equals(this.name, automationScheduleCreationAPI.name) &&
        Objects.equals(this.agentId, automationScheduleCreationAPI.agentId) &&
        Objects.equals(this.startDate, automationScheduleCreationAPI.startDate) &&
        Objects.equals(this.creator, automationScheduleCreationAPI.creator) &&
        Objects.equals(this.projectId, automationScheduleCreationAPI.projectId) &&
        Objects.equals(this.testRunIds, automationScheduleCreationAPI.testRunIds) &&
        Objects.equals(this.dynamic, automationScheduleCreationAPI.dynamic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, name, agentId, startDate, creator, projectId, testRunIds, dynamic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationScheduleCreationAPI {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    testRunIds: ").append(toIndentedString(testRunIds)).append("\n");
    sb.append("    dynamic: ").append(toIndentedString(dynamic)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

