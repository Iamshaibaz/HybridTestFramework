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
import io.swagger.client.model.TestCaseWithCustomFieldResource;
import io.swagger.client.model.TestStepInformationVM;
import java.util.ArrayList;
import java.util.List;

/**
 * TestStepResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T17:05:50.259Z")
public class TestStepResource {
  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("expected")
  private String expected = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("group")
  private Integer group = null;

  @SerializedName("called_test_case_name")
  private String calledTestCaseName = null;

  @SerializedName("root_called_test_case_id")
  private Long rootCalledTestCaseId = null;

  @SerializedName("called_test_case")
  private TestCaseWithCustomFieldResource calledTestCase = null;

  @SerializedName("parent_test_step_id")
  private Long parentTestStepId = null;

  @SerializedName("information")
  private TestStepInformationVM information = null;

  @SerializedName("plain_value_text")
  private String plainValueText = null;

  @SerializedName("parameter_values")
  private List<String> parameterValues = new ArrayList<String>();

  @SerializedName("called_test_case_id")
  private Long calledTestCaseId = null;

  public TestStepResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public TestStepResource addLinksItem(Link linksItem) {
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

  public TestStepResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "111", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TestStepResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Test Step description", required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TestStepResource expected(String expected) {
    this.expected = expected;
    return this;
  }

   /**
   * Get expected
   * @return expected
  **/
  @ApiModelProperty(example = "Test Step description", required = true, value = "")
  public String getExpected() {
    return expected;
  }

  public void setExpected(String expected) {
    this.expected = expected;
  }

  public TestStepResource order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * minimum: 1
   * @return order
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public TestStepResource group(Integer group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getGroup() {
    return group;
  }

  public void setGroup(Integer group) {
    this.group = group;
  }

  public TestStepResource calledTestCaseName(String calledTestCaseName) {
    this.calledTestCaseName = calledTestCaseName;
    return this;
  }

   /**
   * Get calledTestCaseName
   * @return calledTestCaseName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCalledTestCaseName() {
    return calledTestCaseName;
  }

  public void setCalledTestCaseName(String calledTestCaseName) {
    this.calledTestCaseName = calledTestCaseName;
  }

  public TestStepResource rootCalledTestCaseId(Long rootCalledTestCaseId) {
    this.rootCalledTestCaseId = rootCalledTestCaseId;
    return this;
  }

   /**
   * Get rootCalledTestCaseId
   * @return rootCalledTestCaseId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getRootCalledTestCaseId() {
    return rootCalledTestCaseId;
  }

  public void setRootCalledTestCaseId(Long rootCalledTestCaseId) {
    this.rootCalledTestCaseId = rootCalledTestCaseId;
  }

  public TestStepResource calledTestCase(TestCaseWithCustomFieldResource calledTestCase) {
    this.calledTestCase = calledTestCase;
    return this;
  }

   /**
   * Get calledTestCase
   * @return calledTestCase
  **/
  @ApiModelProperty(example = "null", value = "")
  public TestCaseWithCustomFieldResource getCalledTestCase() {
    return calledTestCase;
  }

  public void setCalledTestCase(TestCaseWithCustomFieldResource calledTestCase) {
    this.calledTestCase = calledTestCase;
  }

  public TestStepResource parentTestStepId(Long parentTestStepId) {
    this.parentTestStepId = parentTestStepId;
    return this;
  }

   /**
   * Get parentTestStepId
   * @return parentTestStepId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getParentTestStepId() {
    return parentTestStepId;
  }

  public void setParentTestStepId(Long parentTestStepId) {
    this.parentTestStepId = parentTestStepId;
  }

  public TestStepResource information(TestStepInformationVM information) {
    this.information = information;
    return this;
  }

   /**
   * Get information
   * @return information
  **/
  @ApiModelProperty(example = "null", value = "")
  public TestStepInformationVM getInformation() {
    return information;
  }

  public void setInformation(TestStepInformationVM information) {
    this.information = information;
  }

  public TestStepResource plainValueText(String plainValueText) {
    this.plainValueText = plainValueText;
    return this;
  }

   /**
   * Get plainValueText
   * @return plainValueText
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlainValueText() {
    return plainValueText;
  }

  public void setPlainValueText(String plainValueText) {
    this.plainValueText = plainValueText;
  }

  public TestStepResource parameterValues(List<String> parameterValues) {
    this.parameterValues = parameterValues;
    return this;
  }

  public TestStepResource addParameterValuesItem(String parameterValuesItem) {
    this.parameterValues.add(parameterValuesItem);
    return this;
  }

   /**
   * Get parameterValues
   * @return parameterValues
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getParameterValues() {
    return parameterValues;
  }

  public void setParameterValues(List<String> parameterValues) {
    this.parameterValues = parameterValues;
  }

  public TestStepResource calledTestCaseId(Long calledTestCaseId) {
    this.calledTestCaseId = calledTestCaseId;
    return this;
  }

   /**
   * Get calledTestCaseId
   * @return calledTestCaseId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCalledTestCaseId() {
    return calledTestCaseId;
  }

  public void setCalledTestCaseId(Long calledTestCaseId) {
    this.calledTestCaseId = calledTestCaseId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestStepResource testStepResource = (TestStepResource) o;
    return Objects.equals(this.links, testStepResource.links) &&
        Objects.equals(this.id, testStepResource.id) &&
        Objects.equals(this.description, testStepResource.description) &&
        Objects.equals(this.expected, testStepResource.expected) &&
        Objects.equals(this.order, testStepResource.order) &&
        Objects.equals(this.group, testStepResource.group) &&
        Objects.equals(this.calledTestCaseName, testStepResource.calledTestCaseName) &&
        Objects.equals(this.rootCalledTestCaseId, testStepResource.rootCalledTestCaseId) &&
        Objects.equals(this.calledTestCase, testStepResource.calledTestCase) &&
        Objects.equals(this.parentTestStepId, testStepResource.parentTestStepId) &&
        Objects.equals(this.information, testStepResource.information) &&
        Objects.equals(this.plainValueText, testStepResource.plainValueText) &&
        Objects.equals(this.parameterValues, testStepResource.parameterValues) &&
        Objects.equals(this.calledTestCaseId, testStepResource.calledTestCaseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, description, expected, order, group, calledTestCaseName, rootCalledTestCaseId, calledTestCase, parentTestStepId, information, plainValueText, parameterValues, calledTestCaseId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestStepResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    calledTestCaseName: ").append(toIndentedString(calledTestCaseName)).append("\n");
    sb.append("    rootCalledTestCaseId: ").append(toIndentedString(rootCalledTestCaseId)).append("\n");
    sb.append("    calledTestCase: ").append(toIndentedString(calledTestCase)).append("\n");
    sb.append("    parentTestStepId: ").append(toIndentedString(parentTestStepId)).append("\n");
    sb.append("    information: ").append(toIndentedString(information)).append("\n");
    sb.append("    plainValueText: ").append(toIndentedString(plainValueText)).append("\n");
    sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
    sb.append("    calledTestCaseId: ").append(toIndentedString(calledTestCaseId)).append("\n");
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

