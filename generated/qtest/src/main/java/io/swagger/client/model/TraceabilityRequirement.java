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
import io.swagger.client.model.TraceabilityRequirement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * TraceabilityRequirement
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T17:05:50.259Z")
public class TraceabilityRequirement {
  @SerializedName("order")
  private Long order = null;

  @SerializedName("children")
  private List<TraceabilityRequirement> children = new ArrayList<TraceabilityRequirement>();

  @SerializedName("root")
  private Boolean root = false;

  @SerializedName("requirements")
  private List<Map<String, Object>> requirements = new ArrayList<Map<String, Object>>();

  public TraceabilityRequirement order(Long order) {
    this.order = order;
    return this;
  }

   /**
   * Order
   * @return order
  **/
  @ApiModelProperty(example = "1", value = "Order")
  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }

  public TraceabilityRequirement children(List<TraceabilityRequirement> children) {
    this.children = children;
    return this;
  }

  public TraceabilityRequirement addChildrenItem(TraceabilityRequirement childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Arrays of TraceabilityRequirement
   * @return children
  **/
  @ApiModelProperty(example = "null", value = "Arrays of TraceabilityRequirement")
  public List<TraceabilityRequirement> getChildren() {
    return children;
  }

  public void setChildren(List<TraceabilityRequirement> children) {
    this.children = children;
  }

  public TraceabilityRequirement root(Boolean root) {
    this.root = root;
    return this;
  }

   /**
   * Is root Requirement Module or not
   * @return root
  **/
  @ApiModelProperty(example = "false", value = "Is root Requirement Module or not")
  public Boolean getRoot() {
    return root;
  }

  public void setRoot(Boolean root) {
    this.root = root;
  }

  public TraceabilityRequirement requirements(List<Map<String, Object>> requirements) {
    this.requirements = requirements;
    return this;
  }

  public TraceabilityRequirement addRequirementsItem(Map<String, Object> requirementsItem) {
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Arrays of Requirement data
   * @return requirements
  **/
  @ApiModelProperty(example = "null", value = "Arrays of Requirement data")
  public List<Map<String, Object>> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<Map<String, Object>> requirements) {
    this.requirements = requirements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceabilityRequirement traceabilityRequirement = (TraceabilityRequirement) o;
    return Objects.equals(this.order, traceabilityRequirement.order) &&
        Objects.equals(this.children, traceabilityRequirement.children) &&
        Objects.equals(this.root, traceabilityRequirement.root) &&
        Objects.equals(this.requirements, traceabilityRequirement.requirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, children, root, requirements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceabilityRequirement {\n");
    
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    root: ").append(toIndentedString(root)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
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

