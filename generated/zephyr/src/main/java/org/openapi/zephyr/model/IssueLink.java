/*
 * Zephyr Scale Cloud API
 *  # Introduction  This is the **Zephyr Scale Cloud** API. If you are looking for the Server API, please refer to the [documentation](https://support.smartbear.com/zephyr-scale-server/docs/) for more information.  This API uses the OpenAPI specification. If you want to generate clients for different languages, please use the link above to download the API specification and use it with your preferred tools.  For feature requests or general support, please head to our [support site](https://smartbear.atlassian.net/servicedesk/customer/portal/42).  # Authentication The API authentication is based on JSON Web Token (JWT), which is a key for accessing the API. Authenticating using JWT requires the following steps: * Generate a key * Make authenticated requests  ## Generate a Key For accessing the API, you must generate an access key in Jira. To generate an access token, click on your profile picture at the page bottom left, and choose the option “Zephyr Scale API keys\". For more information, please check out the [documentation](https://support.smartbear.com/zephyr-scale-cloud/docs/api-and-test-automation/generating-access-keys.html).  ## Accessing the API The API is available at the following base URL: ``` https://api.zephyrscale.smartbear.com/v2 ``` For example, the final URL for retrieving test cases would be: ``` https://api.zephyrscale.smartbear.com/v2/testcases ```  ## Making Authenticated Requests To authenticate subsequent API requests, you must provide a valid token in an HTTP header, which is the key generated on the previous step: ``` Authorization: Bearer {bearer_token} ``` # Representing Users  Previous API definitions used Atlassian User Keys to identify users. This parameter is deprecated because of privacy changes. Use Atlassian Account ID instead.   Atlassian Account IDs are globally unique opaque identifiers for identifying a user. Every Atlassian Account has a ID which is assigned when the account is created and is immutable. Account IDs contain no personally identifiable information and are only used to retrieve user information ondemand. This API does not return any user information other than the Account ID (with the exception of the deprecated user keys during the deprecation period). 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapi.zephyr.model;

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
import org.openapi.zephyr.model.IssueLinkAllOf;
import org.openapi.zephyr.model.IssueLinkInput;
import org.openapi.zephyr.model.Link;

/**
 * IssueLink
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-28T00:21:27.203715400+11:00[Australia/Sydney]")
public class IssueLink {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_ISSUE_ID = "issueId";
  @SerializedName(SERIALIZED_NAME_ISSUE_ID)
  private Long issueId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  /**
   * The link type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    COVERAGE("COVERAGE"),
    
    BLOCKS("BLOCKS"),
    
    RELATED("RELATED");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public IssueLink() { 
  }

  public IssueLink self(String self) {
    
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSelf() {
    return self;
  }


  public void setSelf(String self) {
    this.self = self;
  }


  public IssueLink issueId(Long issueId) {
    
    this.issueId = issueId;
    return this;
  }

   /**
   * The issue ID
   * minimum: 1
   * @return issueId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10100", required = true, value = "The issue ID")

  public Long getIssueId() {
    return issueId;
  }


  public void setIssueId(Long issueId) {
    this.issueId = issueId;
  }


  public IssueLink id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * minimum: 1
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public IssueLink target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * The Jira Cloud REST API endpoint to get the full representation of the issue
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://myjira.com/rest/api/2/issue/10000", value = "The Jira Cloud REST API endpoint to get the full representation of the issue")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public IssueLink type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The link type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The link type")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLink issueLink = (IssueLink) o;
    return Objects.equals(this.self, issueLink.self) &&
        Objects.equals(this.issueId, issueLink.issueId) &&
        Objects.equals(this.id, issueLink.id) &&
        Objects.equals(this.target, issueLink.target) &&
        Objects.equals(this.type, issueLink.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, issueId, id, target, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLink {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

