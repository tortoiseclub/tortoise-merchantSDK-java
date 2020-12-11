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
import io.swagger.client.model.Plan;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Payment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:10:28.965Z")



public class Payment {
  @SerializedName("id")
  private String id = null;

  @SerializedName("plan")
  private Plan plan = null;

  @SerializedName("instalmentId")
  private Integer instalmentId = null;

  /**
   * Mode of payment
   */
  @JsonAdapter(ModeEnum.Adapter.class)
  public enum ModeEnum {
    DEBIT("debit"),
    
    CREDIT("credit"),
    
    UPI("upi"),
    
    NETBANKING("netbanking"),
    
    CASH("cash");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("mode")
  private ModeEnum mode = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("createdOn")
  private OffsetDateTime createdOn = null;

  /**
   * Status of the payment
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESSFUL("successful"),
    
    FAILED("failed"),
    
    REFUNDED("refunded"),
    
    REFUNDINITIATED("refundInitiated"),
    
    PROCESSING("processing");

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

   /**
   * Unique identifier for the payment
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the payment")
  public String getId() {
    return id;
  }

  public Payment plan(Plan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @ApiModelProperty(value = "")
  public Plan getPlan() {
    return plan;
  }

  public void setPlan(Plan plan) {
    this.plan = plan;
  }

  public Payment instalmentId(Integer instalmentId) {
    this.instalmentId = instalmentId;
    return this;
  }

   /**
   * Instalment serial number for which the payment has been made
   * @return instalmentId
  **/
  @ApiModelProperty(value = "Instalment serial number for which the payment has been made")
  public Integer getInstalmentId() {
    return instalmentId;
  }

  public void setInstalmentId(Integer instalmentId) {
    this.instalmentId = instalmentId;
  }

  public Payment mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Mode of payment
   * @return mode
  **/
  @ApiModelProperty(value = "Mode of payment")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public Payment amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount paid on the payment
   * @return amount
  **/
  @ApiModelProperty(value = "Amount paid on the payment")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

   /**
   * Timestamp at which the payment has been made
   * @return createdOn
  **/
  @ApiModelProperty(value = "Timestamp at which the payment has been made")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public Payment status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the payment
   * @return status
  **/
  @ApiModelProperty(value = "Status of the payment")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return Objects.equals(this.id, payment.id) &&
        Objects.equals(this.plan, payment.plan) &&
        Objects.equals(this.instalmentId, payment.instalmentId) &&
        Objects.equals(this.mode, payment.mode) &&
        Objects.equals(this.amount, payment.amount) &&
        Objects.equals(this.createdOn, payment.createdOn) &&
        Objects.equals(this.status, payment.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plan, instalmentId, mode, amount, createdOn, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    instalmentId: ").append(toIndentedString(instalmentId)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
