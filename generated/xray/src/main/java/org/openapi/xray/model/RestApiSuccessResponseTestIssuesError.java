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

/**
 * RestApiSuccessResponseTestIssuesError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-27T23:50:23.072934600+11:00[Australia/Sydney]")
public class RestApiSuccessResponseTestIssuesError {
  public static final String SERIALIZED_NAME_TEST_DEFINITION = "testDefinition";
  @SerializedName(SERIALIZED_NAME_TEST_DEFINITION)
  private String testDefinition;

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<String> messages = null;

  public RestApiSuccessResponseTestIssuesError() { 
  }

  public RestApiSuccessResponseTestIssuesError testDefinition(String testDefinition) {
    
    this.testDefinition = testDefinition;
    return this;
  }

   /**
   * Get testDefinition
   * @return testDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTestDefinition() {
    return testDefinition;
  }


  public void setTestDefinition(String testDefinition) {
    this.testDefinition = testDefinition;
  }


  public RestApiSuccessResponseTestIssuesError messages(List<String> messages) {
    
    this.messages = messages;
    return this;
  }

  public RestApiSuccessResponseTestIssuesError addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMessages() {
    return messages;
  }


  public void setMessages(List<String> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestApiSuccessResponseTestIssuesError restApiSuccessResponseTestIssuesError = (RestApiSuccessResponseTestIssuesError) o;
    return Objects.equals(this.testDefinition, restApiSuccessResponseTestIssuesError.testDefinition) &&
        Objects.equals(this.messages, restApiSuccessResponseTestIssuesError.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testDefinition, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestApiSuccessResponseTestIssuesError {\n");
    sb.append("    testDefinition: ").append(toIndentedString(testDefinition)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

