/*
 * Tortoise Merchant API
 * Tortoise API for merchant to integrate with their existing systems 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: developer@tortoise.pro
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SchemeRedemptionOption;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Scheme
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:10:28.965Z")



public class Scheme {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    DISABLED("disabled"),
    
    REVIEWPENDING("reviewPending"),
    
    REVIEWREJECTED("reviewRejected");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("redemptionOption")
  private SchemeRedemptionOption redemptionOption = null;

  @SerializedName("durationInMonths")
  private Integer durationInMonths = null;

   /**
   * Unique identifier for the scheme
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the scheme")
  public String getId() {
    return id;
  }

  public Scheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the scheme
   * @return name
  **/
  @ApiModelProperty(value = "Name of the scheme")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * Timestamp at which the scheme is created
   * @return createdOn
  **/
  @ApiModelProperty(value = "Timestamp at which the scheme is created")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public Scheme redemptionOption(SchemeRedemptionOption redemptionOption) {
    this.redemptionOption = redemptionOption;
    return this;
  }

   /**
   * Get redemptionOption
   * @return redemptionOption
  **/
  @ApiModelProperty(value = "")
  public SchemeRedemptionOption getRedemptionOption() {
    return redemptionOption;
  }

  public void setRedemptionOption(SchemeRedemptionOption redemptionOption) {
    this.redemptionOption = redemptionOption;
  }

  public Scheme durationInMonths(Integer durationInMonths) {
    this.durationInMonths = durationInMonths;
    return this;
  }

   /**
   * Duration of the scheme in months, in other words, number of instalments to be paid by the customer
   * @return durationInMonths
  **/
  @ApiModelProperty(value = "Duration of the scheme in months, in other words, number of instalments to be paid by the customer")
  public Integer getDurationInMonths() {
    return durationInMonths;
  }

  public void setDurationInMonths(Integer durationInMonths) {
    this.durationInMonths = durationInMonths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scheme scheme = (Scheme) o;
    return Objects.equals(this.id, scheme.id) &&
        Objects.equals(this.name, scheme.name) &&
        Objects.equals(this.createdOn, scheme.createdOn) &&
        Objects.equals(this.status, scheme.status) &&
        Objects.equals(this.redemptionOption, scheme.redemptionOption) &&
        Objects.equals(this.durationInMonths, scheme.durationInMonths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdOn, status, redemptionOption, durationInMonths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scheme {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    redemptionOption: ").append(toIndentedString(redemptionOption)).append("\n");
    sb.append("    durationInMonths: ").append(toIndentedString(durationInMonths)).append("\n");
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

