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
import org.joda.time.DateTime;

/**
 * ShortTestLogResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T17:05:50.259Z")
public class ShortTestLogResource {
  @SerializedName("status")
  private String status = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("exe_start_date")
  private DateTime exeStartDate = null;

  @SerializedName("exe_end_date")
  private DateTime exeEndDate = null;

  public ShortTestLogResource status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ShortTestLogResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShortTestLogResource exeStartDate(DateTime exeStartDate) {
    this.exeStartDate = exeStartDate;
    return this;
  }

   /**
   * Get exeStartDate
   * @return exeStartDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getExeStartDate() {
    return exeStartDate;
  }

  public void setExeStartDate(DateTime exeStartDate) {
    this.exeStartDate = exeStartDate;
  }

  public ShortTestLogResource exeEndDate(DateTime exeEndDate) {
    this.exeEndDate = exeEndDate;
    return this;
  }

   /**
   * Get exeEndDate
   * @return exeEndDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getExeEndDate() {
    return exeEndDate;
  }

  public void setExeEndDate(DateTime exeEndDate) {
    this.exeEndDate = exeEndDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShortTestLogResource shortTestLogResource = (ShortTestLogResource) o;
    return Objects.equals(this.status, shortTestLogResource.status) &&
        Objects.equals(this.id, shortTestLogResource.id) &&
        Objects.equals(this.exeStartDate, shortTestLogResource.exeStartDate) &&
        Objects.equals(this.exeEndDate, shortTestLogResource.exeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, id, exeStartDate, exeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShortTestLogResource {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    exeStartDate: ").append(toIndentedString(exeStartDate)).append("\n");
    sb.append("    exeEndDate: ").append(toIndentedString(exeEndDate)).append("\n");
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

