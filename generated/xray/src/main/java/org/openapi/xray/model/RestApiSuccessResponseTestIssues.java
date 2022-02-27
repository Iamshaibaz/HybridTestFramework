/*
 * Xray REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapi.xray.model;

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
import java.util.List;
import org.openapi.xray.model.RestApiSuccessResponseTestIssuesError;
import org.openapi.xray.model.RestApiSuccessResponseTestIssuesSuccess;

/**
 * RestApiSuccessResponseTestIssues
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-27T23:50:23.072934600+11:00[Australia/Sydney]")
public class RestApiSuccessResponseTestIssues {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private List<RestApiSuccessResponseTestIssuesSuccess> success = null;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private List<RestApiSuccessResponseTestIssuesError> error = null;

  public RestApiSuccessResponseTestIssues() { 
  }

  public RestApiSuccessResponseTestIssues success(List<RestApiSuccessResponseTestIssuesSuccess> success) {
    
    this.success = success;
    return this;
  }

  public RestApiSuccessResponseTestIssues addSuccessItem(RestApiSuccessResponseTestIssuesSuccess successItem) {
    if (this.success == null) {
      this.success = new ArrayList<>();
    }
    this.success.add(successItem);
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RestApiSuccessResponseTestIssuesSuccess> getSuccess() {
    return success;
  }


  public void setSuccess(List<RestApiSuccessResponseTestIssuesSuccess> success) {
    this.success = success;
  }


  public RestApiSuccessResponseTestIssues error(List<RestApiSuccessResponseTestIssuesError> error) {
    
    this.error = error;
    return this;
  }

  public RestApiSuccessResponseTestIssues addErrorItem(RestApiSuccessResponseTestIssuesError errorItem) {
    if (this.error == null) {
      this.error = new ArrayList<>();
    }
    this.error.add(errorItem);
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RestApiSuccessResponseTestIssuesError> getError() {
    return error;
  }


  public void setError(List<RestApiSuccessResponseTestIssuesError> error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestApiSuccessResponseTestIssues restApiSuccessResponseTestIssues = (RestApiSuccessResponseTestIssues) o;
    return Objects.equals(this.success, restApiSuccessResponseTestIssues.success) &&
        Objects.equals(this.error, restApiSuccessResponseTestIssues.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestApiSuccessResponseTestIssues {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

