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
 * LdapConfigDetailResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-02-04T17:05:50.259Z")
public class LdapConfigDetailResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("is_activated")
  private Boolean isActivated = false;

  /**
   * Type of authentication system
   */
  public enum AuthTypeEnum {
    @SerializedName("INTERNAL")
    INTERNAL("INTERNAL"),
    
    @SerializedName("LDAP")
    LDAP("LDAP"),
    
    @SerializedName("SSO_SAML2")
    SSO_SAML2("SSO_SAML2"),
    
    @SerializedName("TUA_OPENID")
    TUA_OPENID("TUA_OPENID");

    private String value;

    AuthTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("auth_type")
  private AuthTypeEnum authType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("base")
  private String base = null;

  @SerializedName("base_search")
  private String baseSearch = null;

  @SerializedName("search_filter")
  private String searchFilter = null;

  @SerializedName("mapped_username")
  private String mappedUsername = null;

  @SerializedName("mapped_firstname")
  private String mappedFirstname = null;

  @SerializedName("mapped_lastname")
  private String mappedLastname = null;

  @SerializedName("mapped_email")
  private String mappedEmail = null;

  @SerializedName("is_ldap_ssl")
  private Boolean isLdapSsl = false;

  @SerializedName("is_active_directory")
  private Boolean isActiveDirectory = false;

  public LdapConfigDetailResponse id(Long id) {
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

  public LdapConfigDetailResponse isActivated(Boolean isActivated) {
    this.isActivated = isActivated;
    return this;
  }

   /**
   * Get isActivated
   * @return isActivated
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsActivated() {
    return isActivated;
  }

  public void setIsActivated(Boolean isActivated) {
    this.isActivated = isActivated;
  }

  public LdapConfigDetailResponse authType(AuthTypeEnum authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Type of authentication system
   * @return authType
  **/
  @ApiModelProperty(example = "LDAP", value = "Type of authentication system")
  public AuthTypeEnum getAuthType() {
    return authType;
  }

  public void setAuthType(AuthTypeEnum authType) {
    this.authType = authType;
  }

  public LdapConfigDetailResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LdapConfigDetailResponse username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username of Ldap system
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "Username of Ldap system")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public LdapConfigDetailResponse url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url of Ldap system
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The url of Ldap system")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public LdapConfigDetailResponse base(String base) {
    this.base = base;
    return this;
  }

   /**
   * Base of Ldap system
   * @return base
  **/
  @ApiModelProperty(example = "null", value = "Base of Ldap system")
  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public LdapConfigDetailResponse baseSearch(String baseSearch) {
    this.baseSearch = baseSearch;
    return this;
  }

   /**
   * Base search of Ldap system
   * @return baseSearch
  **/
  @ApiModelProperty(example = "null", value = "Base search of Ldap system")
  public String getBaseSearch() {
    return baseSearch;
  }

  public void setBaseSearch(String baseSearch) {
    this.baseSearch = baseSearch;
  }

  public LdapConfigDetailResponse searchFilter(String searchFilter) {
    this.searchFilter = searchFilter;
    return this;
  }

   /**
   * Search filter of Ldap system
   * @return searchFilter
  **/
  @ApiModelProperty(example = "null", value = "Search filter of Ldap system")
  public String getSearchFilter() {
    return searchFilter;
  }

  public void setSearchFilter(String searchFilter) {
    this.searchFilter = searchFilter;
  }

  public LdapConfigDetailResponse mappedUsername(String mappedUsername) {
    this.mappedUsername = mappedUsername;
    return this;
  }

   /**
   * The mapped username field of Ldap system
   * @return mappedUsername
  **/
  @ApiModelProperty(example = "null", value = "The mapped username field of Ldap system")
  public String getMappedUsername() {
    return mappedUsername;
  }

  public void setMappedUsername(String mappedUsername) {
    this.mappedUsername = mappedUsername;
  }

  public LdapConfigDetailResponse mappedFirstname(String mappedFirstname) {
    this.mappedFirstname = mappedFirstname;
    return this;
  }

   /**
   * The mapped firstname field of Ldap system
   * @return mappedFirstname
  **/
  @ApiModelProperty(example = "null", value = "The mapped firstname field of Ldap system")
  public String getMappedFirstname() {
    return mappedFirstname;
  }

  public void setMappedFirstname(String mappedFirstname) {
    this.mappedFirstname = mappedFirstname;
  }

  public LdapConfigDetailResponse mappedLastname(String mappedLastname) {
    this.mappedLastname = mappedLastname;
    return this;
  }

   /**
   * The mapped lastname field of Ldap system
   * @return mappedLastname
  **/
  @ApiModelProperty(example = "null", value = "The mapped lastname field of Ldap system")
  public String getMappedLastname() {
    return mappedLastname;
  }

  public void setMappedLastname(String mappedLastname) {
    this.mappedLastname = mappedLastname;
  }

  public LdapConfigDetailResponse mappedEmail(String mappedEmail) {
    this.mappedEmail = mappedEmail;
    return this;
  }

   /**
   * The mapped email field of Ldap system
   * @return mappedEmail
  **/
  @ApiModelProperty(example = "null", value = "The mapped email field of Ldap system")
  public String getMappedEmail() {
    return mappedEmail;
  }

  public void setMappedEmail(String mappedEmail) {
    this.mappedEmail = mappedEmail;
  }

  public LdapConfigDetailResponse isLdapSsl(Boolean isLdapSsl) {
    this.isLdapSsl = isLdapSsl;
    return this;
  }

   /**
   * Use SSL connect or not
   * @return isLdapSsl
  **/
  @ApiModelProperty(example = "true", value = "Use SSL connect or not")
  public Boolean getIsLdapSsl() {
    return isLdapSsl;
  }

  public void setIsLdapSsl(Boolean isLdapSsl) {
    this.isLdapSsl = isLdapSsl;
  }

  public LdapConfigDetailResponse isActiveDirectory(Boolean isActiveDirectory) {
    this.isActiveDirectory = isActiveDirectory;
    return this;
  }

   /**
   * Is active directory or not
   * @return isActiveDirectory
  **/
  @ApiModelProperty(example = "false", value = "Is active directory or not")
  public Boolean getIsActiveDirectory() {
    return isActiveDirectory;
  }

  public void setIsActiveDirectory(Boolean isActiveDirectory) {
    this.isActiveDirectory = isActiveDirectory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LdapConfigDetailResponse ldapConfigDetailResponse = (LdapConfigDetailResponse) o;
    return Objects.equals(this.id, ldapConfigDetailResponse.id) &&
        Objects.equals(this.isActivated, ldapConfigDetailResponse.isActivated) &&
        Objects.equals(this.authType, ldapConfigDetailResponse.authType) &&
        Objects.equals(this.name, ldapConfigDetailResponse.name) &&
        Objects.equals(this.username, ldapConfigDetailResponse.username) &&
        Objects.equals(this.url, ldapConfigDetailResponse.url) &&
        Objects.equals(this.base, ldapConfigDetailResponse.base) &&
        Objects.equals(this.baseSearch, ldapConfigDetailResponse.baseSearch) &&
        Objects.equals(this.searchFilter, ldapConfigDetailResponse.searchFilter) &&
        Objects.equals(this.mappedUsername, ldapConfigDetailResponse.mappedUsername) &&
        Objects.equals(this.mappedFirstname, ldapConfigDetailResponse.mappedFirstname) &&
        Objects.equals(this.mappedLastname, ldapConfigDetailResponse.mappedLastname) &&
        Objects.equals(this.mappedEmail, ldapConfigDetailResponse.mappedEmail) &&
        Objects.equals(this.isLdapSsl, ldapConfigDetailResponse.isLdapSsl) &&
        Objects.equals(this.isActiveDirectory, ldapConfigDetailResponse.isActiveDirectory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isActivated, authType, name, username, url, base, baseSearch, searchFilter, mappedUsername, mappedFirstname, mappedLastname, mappedEmail, isLdapSsl, isActiveDirectory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LdapConfigDetailResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActivated: ").append(toIndentedString(isActivated)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    baseSearch: ").append(toIndentedString(baseSearch)).append("\n");
    sb.append("    searchFilter: ").append(toIndentedString(searchFilter)).append("\n");
    sb.append("    mappedUsername: ").append(toIndentedString(mappedUsername)).append("\n");
    sb.append("    mappedFirstname: ").append(toIndentedString(mappedFirstname)).append("\n");
    sb.append("    mappedLastname: ").append(toIndentedString(mappedLastname)).append("\n");
    sb.append("    mappedEmail: ").append(toIndentedString(mappedEmail)).append("\n");
    sb.append("    isLdapSsl: ").append(toIndentedString(isLdapSsl)).append("\n");
    sb.append("    isActiveDirectory: ").append(toIndentedString(isActiveDirectory)).append("\n");
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

