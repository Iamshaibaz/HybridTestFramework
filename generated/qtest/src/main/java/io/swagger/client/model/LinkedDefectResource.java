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
import java.util.ArrayList;
import java.util.List;

/**
 * LinkedDefectResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T17:05:50.259Z")
public class LinkedDefectResource {
  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("external_defect_id")
  private String externalDefectId = null;

  @SerializedName("connection_id")
  private Long connectionId = null;

  @SerializedName("external_project_id")
  private String externalProjectId = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("pid")
  private String pid = null;

  @SerializedName("web_url")
  private String webUrl = null;

  @SerializedName("description")
  private String description = null;

  public LinkedDefectResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public LinkedDefectResource addLinksItem(Link linksItem) {
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

  public LinkedDefectResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of Defect
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "ID of Defect")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LinkedDefectResource externalDefectId(String externalDefectId) {
    this.externalDefectId = externalDefectId;
    return this;
  }

   /**
   * External ID of Defect
   * @return externalDefectId
  **/
  @ApiModelProperty(example = "EXP-1", value = "External ID of Defect")
  public String getExternalDefectId() {
    return externalDefectId;
  }

  public void setExternalDefectId(String externalDefectId) {
    this.externalDefectId = externalDefectId;
  }

  public LinkedDefectResource connectionId(Long connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * ID of the external Integration Connection
   * @return connectionId
  **/
  @ApiModelProperty(example = "1", value = "ID of the external Integration Connection")
  public Long getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(Long connectionId) {
    this.connectionId = connectionId;
  }

  public LinkedDefectResource externalProjectId(String externalProjectId) {
    this.externalProjectId = externalProjectId;
    return this;
  }

   /**
   * ID of external Project
   * @return externalProjectId
  **/
  @ApiModelProperty(example = "EXP", value = "ID of external Project")
  public String getExternalProjectId() {
    return externalProjectId;
  }

  public void setExternalProjectId(String externalProjectId) {
    this.externalProjectId = externalProjectId;
  }

  public LinkedDefectResource summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Summary of external Defect
   * @return summary
  **/
  @ApiModelProperty(example = "Defect summary", value = "Summary of external Defect")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public LinkedDefectResource status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of external Defect
   * @return status
  **/
  @ApiModelProperty(example = "New", value = "Status of external Defect")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LinkedDefectResource pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * PID of external Defect
   * @return pid
  **/
  @ApiModelProperty(example = "EXP-1", value = "PID of external Defect")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

   /**
   * Web url to external Defect
   * @return webUrl
  **/
  @ApiModelProperty(example = "https://example.com/EXP-1", value = "Web url to external Defect")
  public String getWebUrl() {
    return webUrl;
  }

  public LinkedDefectResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of external Defect
   * @return description
  **/
  @ApiModelProperty(example = "Defect description", value = "Description of external Defect")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedDefectResource linkedDefectResource = (LinkedDefectResource) o;
    return Objects.equals(this.links, linkedDefectResource.links) &&
        Objects.equals(this.id, linkedDefectResource.id) &&
        Objects.equals(this.externalDefectId, linkedDefectResource.externalDefectId) &&
        Objects.equals(this.connectionId, linkedDefectResource.connectionId) &&
        Objects.equals(this.externalProjectId, linkedDefectResource.externalProjectId) &&
        Objects.equals(this.summary, linkedDefectResource.summary) &&
        Objects.equals(this.status, linkedDefectResource.status) &&
        Objects.equals(this.pid, linkedDefectResource.pid) &&
        Objects.equals(this.webUrl, linkedDefectResource.webUrl) &&
        Objects.equals(this.description, linkedDefectResource.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, externalDefectId, connectionId, externalProjectId, summary, status, pid, webUrl, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedDefectResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalDefectId: ").append(toIndentedString(externalDefectId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    externalProjectId: ").append(toIndentedString(externalProjectId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

