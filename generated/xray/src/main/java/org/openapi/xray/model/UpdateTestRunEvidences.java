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
import org.openapi.xray.model.ModelFile;

/**
 * UpdateTestRunEvidences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-27T23:50:23.072934600+11:00[Australia/Sydney]")
public class UpdateTestRunEvidences {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  private List<ModelFile> add = null;

  public static final String SERIALIZED_NAME_REMOVE = "remove";
  @SerializedName(SERIALIZED_NAME_REMOVE)
  private List<Integer> remove = null;

  public UpdateTestRunEvidences() { 
  }

  public UpdateTestRunEvidences add(List<ModelFile> add) {
    
    this.add = add;
    return this;
  }

  public UpdateTestRunEvidences addAddItem(ModelFile addItem) {
    if (this.add == null) {
      this.add = new ArrayList<>();
    }
    this.add.add(addItem);
    return this;
  }

   /**
   * Get add
   * @return add
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelFile> getAdd() {
    return add;
  }


  public void setAdd(List<ModelFile> add) {
    this.add = add;
  }


  public UpdateTestRunEvidences remove(List<Integer> remove) {
    
    this.remove = remove;
    return this;
  }

  public UpdateTestRunEvidences addRemoveItem(Integer removeItem) {
    if (this.remove == null) {
      this.remove = new ArrayList<>();
    }
    this.remove.add(removeItem);
    return this;
  }

   /**
   * Get remove
   * @return remove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1235,5674]", value = "")

  public List<Integer> getRemove() {
    return remove;
  }


  public void setRemove(List<Integer> remove) {
    this.remove = remove;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTestRunEvidences updateTestRunEvidences = (UpdateTestRunEvidences) o;
    return Objects.equals(this.add, updateTestRunEvidences.add) &&
        Objects.equals(this.remove, updateTestRunEvidences.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, remove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTestRunEvidences {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
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

