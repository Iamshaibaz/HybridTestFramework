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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * TestSuiteWithCustomFieldResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T17:05:50.259Z")
public class TestSuiteWithCustomFieldResource {
  @SerializedName("parentId")
  private Long parentId = null;

  /**
   * Gets or Sets parentType
   */
  public enum ParentTypeEnum {
    @SerializedName("root")
    ROOT("root"),
    
    @SerializedName("release")
    RELEASE("release"),
    
    @SerializedName("test-cycle")
    TEST_CYCLE("test-cycle");

    private String value;

    ParentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("parentType")
  private ParentTypeEnum parentType = null;

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

  @SerializedName("target_release_id")
  private Long targetReleaseId = null;

  @SerializedName("target_build_id")
  private Long targetBuildId = null;

  public TestSuiteWithCustomFieldResource parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "462378", value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public TestSuiteWithCustomFieldResource parentType(ParentTypeEnum parentType) {
    this.parentType = parentType;
    return this;
  }

   /**
   * Get parentType
   * @return parentType
  **/
  @ApiModelProperty(example = "test-cycle", value = "")
  public ParentTypeEnum getParentType() {
    return parentType;
  }

  public void setParentType(ParentTypeEnum parentType) {
    this.parentType = parentType;
  }

  public TestSuiteWithCustomFieldResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public TestSuiteWithCustomFieldResource addLinksItem(Link linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public TestSuiteWithCustomFieldResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "843971", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TestSuiteWithCustomFieldResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Functional test suite 2", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TestSuiteWithCustomFieldResource order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "0", value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public TestSuiteWithCustomFieldResource pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @ApiModelProperty(example = "TS-3", value = "")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public TestSuiteWithCustomFieldResource createdDate(DateTime createdDate) {
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

  public TestSuiteWithCustomFieldResource lastModifiedDate(DateTime lastModifiedDate) {
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

  public TestSuiteWithCustomFieldResource properties(List<PropertyResource> properties) {
    this.properties = properties;
    return this;
  }

  public TestSuiteWithCustomFieldResource addPropertiesItem(PropertyResource propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<PropertyResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyResource> properties) {
    this.properties = properties;
  }

   /**
   * Get webUrl
   * @return webUrl
  **/
  @ApiModelProperty(example = "https://apitryout.qtestnet.com/p/39047/portal/project#tab&#x3D;testexecution&amp;object&#x3D;2&amp;id&#x3D;843971", value = "")
  public String getWebUrl() {
    return webUrl;
  }

  public TestSuiteWithCustomFieldResource targetReleaseId(Long targetReleaseId) {
    this.targetReleaseId = targetReleaseId;
    return this;
  }

   /**
   * Get targetReleaseId
   * @return targetReleaseId
  **/
  @ApiModelProperty(example = "149652", value = "")
  public Long getTargetReleaseId() {
    return targetReleaseId;
  }

  public void setTargetReleaseId(Long targetReleaseId) {
    this.targetReleaseId = targetReleaseId;
  }

  public TestSuiteWithCustomFieldResource targetBuildId(Long targetBuildId) {
    this.targetBuildId = targetBuildId;
    return this;
  }

   /**
   * Get targetBuildId
   * @return targetBuildId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTargetBuildId() {
    return targetBuildId;
  }

  public void setTargetBuildId(Long targetBuildId) {
    this.targetBuildId = targetBuildId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestSuiteWithCustomFieldResource testSuiteWithCustomFieldResource = (TestSuiteWithCustomFieldResource) o;
    return Objects.equals(this.parentId, testSuiteWithCustomFieldResource.parentId) &&
        Objects.equals(this.parentType, testSuiteWithCustomFieldResource.parentType) &&
        Objects.equals(this.links, testSuiteWithCustomFieldResource.links) &&
        Objects.equals(this.id, testSuiteWithCustomFieldResource.id) &&
        Objects.equals(this.name, testSuiteWithCustomFieldResource.name) &&
        Objects.equals(this.order, testSuiteWithCustomFieldResource.order) &&
        Objects.equals(this.pid, testSuiteWithCustomFieldResource.pid) &&
        Objects.equals(this.createdDate, testSuiteWithCustomFieldResource.createdDate) &&
        Objects.equals(this.lastModifiedDate, testSuiteWithCustomFieldResource.lastModifiedDate) &&
        Objects.equals(this.properties, testSuiteWithCustomFieldResource.properties) &&
        Objects.equals(this.webUrl, testSuiteWithCustomFieldResource.webUrl) &&
        Objects.equals(this.targetReleaseId, testSuiteWithCustomFieldResource.targetReleaseId) &&
        Objects.equals(this.targetBuildId, testSuiteWithCustomFieldResource.targetBuildId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, parentType, links, id, name, order, pid, createdDate, lastModifiedDate, properties, webUrl, targetReleaseId, targetBuildId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestSuiteWithCustomFieldResource {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    targetReleaseId: ").append(toIndentedString(targetReleaseId)).append("\n");
    sb.append("    targetBuildId: ").append(toIndentedString(targetBuildId)).append("\n");
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

