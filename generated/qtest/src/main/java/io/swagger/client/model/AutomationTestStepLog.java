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
import io.swagger.client.model.AttachmentResource;
import io.swagger.client.model.Link;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * AutomationTestStepLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T17:05:50.259Z")
public class AutomationTestStepLog {
  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("expected_result")
  private String expectedResult = null;

  @SerializedName("actual_result")
  private String actualResult = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("attachments")
  private List<AttachmentResource> attachments = new ArrayList<AttachmentResource>();

  @SerializedName("defect_pids")
  private List<String> defectPids = new ArrayList<String>();

  @SerializedName("exe_date")
  private DateTime exeDate = null;

  public AutomationTestStepLog links(List<Link> links) {
    this.links = links;
    return this;
  }

  public AutomationTestStepLog addLinksItem(Link linksItem) {
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

  public AutomationTestStepLog description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Test Step Log's description
   * @return description
  **/
  @ApiModelProperty(example = "description", required = true, value = "Test Step Log's description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AutomationTestStepLog expectedResult(String expectedResult) {
    this.expectedResult = expectedResult;
    return this;
  }

   /**
   * Test Step Log's expected result
   * @return expectedResult
  **/
  @ApiModelProperty(example = "expected result", required = true, value = "Test Step Log's expected result")
  public String getExpectedResult() {
    return expectedResult;
  }

  public void setExpectedResult(String expectedResult) {
    this.expectedResult = expectedResult;
  }

  public AutomationTestStepLog actualResult(String actualResult) {
    this.actualResult = actualResult;
    return this;
  }

   /**
   * Test Step Log's actual result
   * @return actualResult
  **/
  @ApiModelProperty(example = "actual result", value = "Test Step Log's actual result")
  public String getActualResult() {
    return actualResult;
  }

  public void setActualResult(String actualResult) {
    this.actualResult = actualResult;
  }

  public AutomationTestStepLog order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Test Step Log's order
   * @return order
  **/
  @ApiModelProperty(example = "1", value = "Test Step Log's order")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public AutomationTestStepLog status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Test Step Log's status
   * @return status
  **/
  @ApiModelProperty(example = "PASSED", value = "Test Step Log's status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AutomationTestStepLog attachments(List<AttachmentResource> attachments) {
    this.attachments = attachments;
    return this;
  }

  public AutomationTestStepLog addAttachmentsItem(AttachmentResource attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AttachmentResource> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentResource> attachments) {
    this.attachments = attachments;
  }

  public AutomationTestStepLog defectPids(List<String> defectPids) {
    this.defectPids = defectPids;
    return this;
  }

  public AutomationTestStepLog addDefectPidsItem(String defectPidsItem) {
    this.defectPids.add(defectPidsItem);
    return this;
  }

   /**
   * Defect Pids
   * @return defectPids
  **/
  @ApiModelProperty(example = "null", value = "Defect Pids")
  public List<String> getDefectPids() {
    return defectPids;
  }

  public void setDefectPids(List<String> defectPids) {
    this.defectPids = defectPids;
  }

  public AutomationTestStepLog exeDate(DateTime exeDate) {
    this.exeDate = exeDate;
    return this;
  }

   /**
   * Execution date
   * @return exeDate
  **/
  @ApiModelProperty(example = "null", value = "Execution date")
  public DateTime getExeDate() {
    return exeDate;
  }

  public void setExeDate(DateTime exeDate) {
    this.exeDate = exeDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationTestStepLog automationTestStepLog = (AutomationTestStepLog) o;
    return Objects.equals(this.links, automationTestStepLog.links) &&
        Objects.equals(this.description, automationTestStepLog.description) &&
        Objects.equals(this.expectedResult, automationTestStepLog.expectedResult) &&
        Objects.equals(this.actualResult, automationTestStepLog.actualResult) &&
        Objects.equals(this.order, automationTestStepLog.order) &&
        Objects.equals(this.status, automationTestStepLog.status) &&
        Objects.equals(this.attachments, automationTestStepLog.attachments) &&
        Objects.equals(this.defectPids, automationTestStepLog.defectPids) &&
        Objects.equals(this.exeDate, automationTestStepLog.exeDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, description, expectedResult, actualResult, order, status, attachments, defectPids, exeDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationTestStepLog {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expectedResult: ").append(toIndentedString(expectedResult)).append("\n");
    sb.append("    actualResult: ").append(toIndentedString(actualResult)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    defectPids: ").append(toIndentedString(defectPids)).append("\n");
    sb.append("    exeDate: ").append(toIndentedString(exeDate)).append("\n");
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

