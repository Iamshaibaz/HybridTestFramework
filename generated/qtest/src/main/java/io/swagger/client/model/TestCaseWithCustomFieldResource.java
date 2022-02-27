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
import io.swagger.client.model.Link;
import io.swagger.client.model.PropertyResource;
import io.swagger.client.model.TestStepResource;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * TestCaseWithCustomFieldResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T17:05:50.259Z")
public class TestCaseWithCustomFieldResource {
  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("pid")
  private String pid = null;

  @SerializedName("created_date")
  private DateTime createdDate = null;

  @SerializedName("last_modified_date")
  private DateTime lastModifiedDate = null;

  @SerializedName("properties")
  private List<PropertyResource> properties = new ArrayList<PropertyResource>();

  @SerializedName("web_url")
  private String webUrl = null;

  @SerializedName("test_steps")
  private List<TestStepResource> testSteps = new ArrayList<TestStepResource>();

  @SerializedName("parent_id")
  private Long parentId = null;

  @SerializedName("test_case_version_id")
  private Long testCaseVersionId = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("precondition")
  private String precondition = null;

  @SerializedName("creator_id")
  private Long creatorId = null;

  @SerializedName("agent_ids")
  private List<Long> agentIds = new ArrayList<Long>();

  @SerializedName("tosca_guid")
  private String toscaGuid = null;

  @SerializedName("tosca_node_path")
  private String toscaNodePath = null;

  @SerializedName("tosca_url")
  private String toscaUrl = null;

  @SerializedName("tosca_test_case_unique_id")
  private String toscaTestCaseUniqueId = null;

  public TestCaseWithCustomFieldResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public TestCaseWithCustomFieldResource addLinksItem(Link linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Link to resource
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "Link to resource")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public TestCaseWithCustomFieldResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the Test Case
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "ID of the Test Case")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TestCaseWithCustomFieldResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Test Case
   * @return name
  **/
  @ApiModelProperty(example = "Test Case 1", value = "Name of the Test Case")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestCaseWithCustomFieldResource order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Display order of the Test Case
   * @return order
  **/
  @ApiModelProperty(example = "1", value = "Display order of the Test Case")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public TestCaseWithCustomFieldResource pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * PID of the Test Case
   * @return pid
  **/
  @ApiModelProperty(example = "TC-1", value = "PID of the Test Case")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public TestCaseWithCustomFieldResource createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

  public TestCaseWithCustomFieldResource lastModifiedDate(DateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(DateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public TestCaseWithCustomFieldResource properties(List<PropertyResource> properties) {
    this.properties = properties;
    return this;
  }

  public TestCaseWithCustomFieldResource addPropertiesItem(PropertyResource propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Fields value of the Test Case
   * @return properties
  **/
  @ApiModelProperty(example = "null", required = true, value = "Fields value of the Test Case")
  public List<PropertyResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyResource> properties) {
    this.properties = properties;
  }

   /**
   * Web URL of the Test Case
   * @return webUrl
  **/
  @ApiModelProperty(example = "https://apitryout.qtestnet.com/p/1/portal/project#tab&#x3D;testdesign&amp;object&#x3D;1&amp;id&#x3D;1", value = "Web URL of the Test Case")
  public String getWebUrl() {
    return webUrl;
  }

  public TestCaseWithCustomFieldResource testSteps(List<TestStepResource> testSteps) {
    this.testSteps = testSteps;
    return this;
  }

  public TestCaseWithCustomFieldResource addTestStepsItem(TestStepResource testStepsItem) {
    this.testSteps.add(testStepsItem);
    return this;
  }

   /**
   * Arrays of Test Step of the Test Case
   * @return testSteps
  **/
  @ApiModelProperty(example = "null", value = "Arrays of Test Step of the Test Case")
  public List<TestStepResource> getTestSteps() {
    return testSteps;
  }

  public void setTestSteps(List<TestStepResource> testSteps) {
    this.testSteps = testSteps;
  }

  public TestCaseWithCustomFieldResource parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Module ID of the Test Case
   * @return parentId
  **/
  @ApiModelProperty(example = "2107628", value = "Module ID of the Test Case")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public TestCaseWithCustomFieldResource testCaseVersionId(Long testCaseVersionId) {
    this.testCaseVersionId = testCaseVersionId;
    return this;
  }

   /**
   * ID of Test Case Version
   * @return testCaseVersionId
  **/
  @ApiModelProperty(example = "11", value = "ID of Test Case Version")
  public Long getTestCaseVersionId() {
    return testCaseVersionId;
  }

  public void setTestCaseVersionId(Long testCaseVersionId) {
    this.testCaseVersionId = testCaseVersionId;
  }

  public TestCaseWithCustomFieldResource version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Test Case Version of the Test Case
   * @return version
  **/
  @ApiModelProperty(example = "null", value = "Test Case Version of the Test Case")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public TestCaseWithCustomFieldResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the Test Case
   * @return description
  **/
  @ApiModelProperty(example = "Description of test case 1", value = "Description of the Test Case")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TestCaseWithCustomFieldResource precondition(String precondition) {
    this.precondition = precondition;
    return this;
  }

   /**
   * Precondition of the Test Case
   * @return precondition
  **/
  @ApiModelProperty(example = "Precondition of test case 1", value = "Precondition of the Test Case")
  public String getPrecondition() {
    return precondition;
  }

  public void setPrecondition(String precondition) {
    this.precondition = precondition;
  }

  public TestCaseWithCustomFieldResource creatorId(Long creatorId) {
    this.creatorId = creatorId;
    return this;
  }

   /**
   * ID of the User who create the Test Case
   * @return creatorId
  **/
  @ApiModelProperty(example = "1", value = "ID of the User who create the Test Case")
  public Long getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Long creatorId) {
    this.creatorId = creatorId;
  }

  public TestCaseWithCustomFieldResource agentIds(List<Long> agentIds) {
    this.agentIds = agentIds;
    return this;
  }

  public TestCaseWithCustomFieldResource addAgentIdsItem(Long agentIdsItem) {
    this.agentIds.add(agentIdsItem);
    return this;
  }

   /**
   * Get agentIds
   * @return agentIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getAgentIds() {
    return agentIds;
  }

  public void setAgentIds(List<Long> agentIds) {
    this.agentIds = agentIds;
  }

  public TestCaseWithCustomFieldResource toscaGuid(String toscaGuid) {
    this.toscaGuid = toscaGuid;
    return this;
  }

   /**
   * GUID of Tosca test case.
   * @return toscaGuid
  **/
  @ApiModelProperty(example = "null", value = "GUID of Tosca test case.")
  public String getToscaGuid() {
    return toscaGuid;
  }

  public void setToscaGuid(String toscaGuid) {
    this.toscaGuid = toscaGuid;
  }

  public TestCaseWithCustomFieldResource toscaNodePath(String toscaNodePath) {
    this.toscaNodePath = toscaNodePath;
    return this;
  }

   /**
   * Node Path of Tosca test case.
   * @return toscaNodePath
  **/
  @ApiModelProperty(example = "null", value = "Node Path of Tosca test case.")
  public String getToscaNodePath() {
    return toscaNodePath;
  }

  public void setToscaNodePath(String toscaNodePath) {
    this.toscaNodePath = toscaNodePath;
  }

  public TestCaseWithCustomFieldResource toscaUrl(String toscaUrl) {
    this.toscaUrl = toscaUrl;
    return this;
  }

   /**
   * Get toscaUrl
   * @return toscaUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getToscaUrl() {
    return toscaUrl;
  }

  public void setToscaUrl(String toscaUrl) {
    this.toscaUrl = toscaUrl;
  }

  public TestCaseWithCustomFieldResource toscaTestCaseUniqueId(String toscaTestCaseUniqueId) {
    this.toscaTestCaseUniqueId = toscaTestCaseUniqueId;
    return this;
  }

   /**
   * Get toscaTestCaseUniqueId
   * @return toscaTestCaseUniqueId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getToscaTestCaseUniqueId() {
    return toscaTestCaseUniqueId;
  }

  public void setToscaTestCaseUniqueId(String toscaTestCaseUniqueId) {
    this.toscaTestCaseUniqueId = toscaTestCaseUniqueId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCaseWithCustomFieldResource testCaseWithCustomFieldResource = (TestCaseWithCustomFieldResource) o;
    return Objects.equals(this.links, testCaseWithCustomFieldResource.links) &&
        Objects.equals(this.id, testCaseWithCustomFieldResource.id) &&
        Objects.equals(this.name, testCaseWithCustomFieldResource.name) &&
        Objects.equals(this.order, testCaseWithCustomFieldResource.order) &&
        Objects.equals(this.pid, testCaseWithCustomFieldResource.pid) &&
        Objects.equals(this.createdDate, testCaseWithCustomFieldResource.createdDate) &&
        Objects.equals(this.lastModifiedDate, testCaseWithCustomFieldResource.lastModifiedDate) &&
        Objects.equals(this.properties, testCaseWithCustomFieldResource.properties) &&
        Objects.equals(this.webUrl, testCaseWithCustomFieldResource.webUrl) &&
        Objects.equals(this.testSteps, testCaseWithCustomFieldResource.testSteps) &&
        Objects.equals(this.parentId, testCaseWithCustomFieldResource.parentId) &&
        Objects.equals(this.testCaseVersionId, testCaseWithCustomFieldResource.testCaseVersionId) &&
        Objects.equals(this.version, testCaseWithCustomFieldResource.version) &&
        Objects.equals(this.description, testCaseWithCustomFieldResource.description) &&
        Objects.equals(this.precondition, testCaseWithCustomFieldResource.precondition) &&
        Objects.equals(this.creatorId, testCaseWithCustomFieldResource.creatorId) &&
        Objects.equals(this.agentIds, testCaseWithCustomFieldResource.agentIds) &&
        Objects.equals(this.toscaGuid, testCaseWithCustomFieldResource.toscaGuid) &&
        Objects.equals(this.toscaNodePath, testCaseWithCustomFieldResource.toscaNodePath) &&
        Objects.equals(this.toscaUrl, testCaseWithCustomFieldResource.toscaUrl) &&
        Objects.equals(this.toscaTestCaseUniqueId, testCaseWithCustomFieldResource.toscaTestCaseUniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, name, order, pid, createdDate, lastModifiedDate, properties, webUrl, testSteps, parentId, testCaseVersionId, version, description, precondition, creatorId, agentIds, toscaGuid, toscaNodePath, toscaUrl, toscaTestCaseUniqueId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCaseWithCustomFieldResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    testSteps: ").append(toIndentedString(testSteps)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    testCaseVersionId: ").append(toIndentedString(testCaseVersionId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    precondition: ").append(toIndentedString(precondition)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    toscaGuid: ").append(toIndentedString(toscaGuid)).append("\n");
    sb.append("    toscaNodePath: ").append(toIndentedString(toscaNodePath)).append("\n");
    sb.append("    toscaUrl: ").append(toIndentedString(toscaUrl)).append("\n");
    sb.append("    toscaTestCaseUniqueId: ").append(toIndentedString(toscaTestCaseUniqueId)).append("\n");
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

