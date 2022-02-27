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

/**
 * ToscaTestCaseResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T17:05:50.259Z")
public class ToscaTestCaseResource {
  @SerializedName("toscaUniqueId")
  private String toscaUniqueId = null;

  @SerializedName("toscaNodePath")
  private String toscaNodePath = null;

  @SerializedName("toscaUrl")
  private String toscaUrl = null;

  @SerializedName("parentId")
  private Long parentId = null;

  @SerializedName("parentType")
  private String parentType = null;

  public ToscaTestCaseResource toscaUniqueId(String toscaUniqueId) {
    this.toscaUniqueId = toscaUniqueId;
    return this;
  }

   /**
   * Get toscaUniqueId
   * @return toscaUniqueId
  **/
  @ApiModelProperty(example = "a606c5a8-d648-4b09-bc28-929d58773631", required = true, value = "")
  public String getToscaUniqueId() {
    return toscaUniqueId;
  }

  public void setToscaUniqueId(String toscaUniqueId) {
    this.toscaUniqueId = toscaUniqueId;
  }

  public ToscaTestCaseResource toscaNodePath(String toscaNodePath) {
    this.toscaNodePath = toscaNodePath;
    return this;
  }

   /**
   * Get toscaNodePath
   * @return toscaNodePath
  **/
  @ApiModelProperty(example = "/TestCases/Execution Entry", required = true, value = "")
  public String getToscaNodePath() {
    return toscaNodePath;
  }

  public void setToscaNodePath(String toscaNodePath) {
    this.toscaNodePath = toscaNodePath;
  }

  public ToscaTestCaseResource toscaUrl(String toscaUrl) {
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

  public ToscaTestCaseResource parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public ToscaTestCaseResource parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

   /**
   * Get parentType
   * @return parentType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentType() {
    return parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToscaTestCaseResource toscaTestCaseResource = (ToscaTestCaseResource) o;
    return Objects.equals(this.toscaUniqueId, toscaTestCaseResource.toscaUniqueId) &&
        Objects.equals(this.toscaNodePath, toscaTestCaseResource.toscaNodePath) &&
        Objects.equals(this.toscaUrl, toscaTestCaseResource.toscaUrl) &&
        Objects.equals(this.parentId, toscaTestCaseResource.parentId) &&
        Objects.equals(this.parentType, toscaTestCaseResource.parentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toscaUniqueId, toscaNodePath, toscaUrl, parentId, parentType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToscaTestCaseResource {\n");
    
    sb.append("    toscaUniqueId: ").append(toIndentedString(toscaUniqueId)).append("\n");
    sb.append("    toscaNodePath: ").append(toIndentedString(toscaNodePath)).append("\n");
    sb.append("    toscaUrl: ").append(toIndentedString(toscaUrl)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
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

