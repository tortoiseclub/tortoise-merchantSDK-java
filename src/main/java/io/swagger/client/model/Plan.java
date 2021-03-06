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
import io.swagger.client.model.PlanCustomer;
import io.swagger.client.model.PlanProduct;
import io.swagger.client.model.PlanScheme;
import java.io.IOException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Plan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:10:28.965Z")



public class Plan {
  @SerializedName("id")
  private String id = null;

  @SerializedName("customer")
  private PlanCustomer customer = null;

  @SerializedName("product")
  private PlanProduct product = null;

  @SerializedName("scheme")
  private PlanScheme scheme = null;

  @SerializedName("enrolledOn")
  private OffsetDateTime enrolledOn = null;

  @SerializedName("planValue")
  private Integer planValue = null;

  @SerializedName("instalmentValue")
  private Integer instalmentValue = null;

  @SerializedName("totalPaidValue")
  private Integer totalPaidValue = null;

  @SerializedName("completedInstalments")
  private Integer completedInstalments = null;

  @SerializedName("nextInstalmentDate")
  private LocalDate nextInstalmentDate = null;

  @SerializedName("planMaturityDate")
  private LocalDate planMaturityDate = null;

  @SerializedName("totalExpectedRedemptionValue")
  private Integer totalExpectedRedemptionValue = null;

  @SerializedName("currentRedemptionValue")
  private Integer currentRedemptionValue = null;

  @SerializedName("currentCancellationValue")
  private Integer currentCancellationValue = null;

  @SerializedName("lastInstalmentPaidOn")
  private OffsetDateTime lastInstalmentPaidOn = null;

   /**
   * Unique identifier for the plan
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier for the plan")
  public String getId() {
    return id;
  }

  public Plan customer(PlanCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public PlanCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(PlanCustomer customer) {
    this.customer = customer;
  }

  public Plan product(PlanProduct product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")
  public PlanProduct getProduct() {
    return product;
  }

  public void setProduct(PlanProduct product) {
    this.product = product;
  }

  public Plan scheme(PlanScheme scheme) {
    this.scheme = scheme;
    return this;
  }

   /**
   * Get scheme
   * @return scheme
  **/
  @ApiModelProperty(value = "")
  public PlanScheme getScheme() {
    return scheme;
  }

  public void setScheme(PlanScheme scheme) {
    this.scheme = scheme;
  }

   /**
   * Time when customer enrolled on the plan
   * @return enrolledOn
  **/
  @ApiModelProperty(value = "Time when customer enrolled on the plan")
  public OffsetDateTime getEnrolledOn() {
    return enrolledOn;
  }

  public Plan planValue(Integer planValue) {
    this.planValue = planValue;
    return this;
  }

   /**
   * Total price of the plan, to be paid by the customer
   * @return planValue
  **/
  @ApiModelProperty(value = "Total price of the plan, to be paid by the customer")
  public Integer getPlanValue() {
    return planValue;
  }

  public void setPlanValue(Integer planValue) {
    this.planValue = planValue;
  }

  public Plan instalmentValue(Integer instalmentValue) {
    this.instalmentValue = instalmentValue;
    return this;
  }

   /**
   * Value of each instalment to be paid by the customer
   * @return instalmentValue
  **/
  @ApiModelProperty(value = "Value of each instalment to be paid by the customer")
  public Integer getInstalmentValue() {
    return instalmentValue;
  }

  public void setInstalmentValue(Integer instalmentValue) {
    this.instalmentValue = instalmentValue;
  }

   /**
   * Total amount paid by the customer towards the plan till date
   * @return totalPaidValue
  **/
  @ApiModelProperty(value = "Total amount paid by the customer towards the plan till date")
  public Integer getTotalPaidValue() {
    return totalPaidValue;
  }

   /**
   * Instalments paid by customer till date
   * @return completedInstalments
  **/
  @ApiModelProperty(value = "Instalments paid by customer till date")
  public Integer getCompletedInstalments() {
    return completedInstalments;
  }

   /**
   * Due date for the upcoming instalment of the plan
   * @return nextInstalmentDate
  **/
  @ApiModelProperty(value = "Due date for the upcoming instalment of the plan")
  public LocalDate getNextInstalmentDate() {
    return nextInstalmentDate;
  }

   /**
   * Date on which the plan is expected to mature
   * @return planMaturityDate
  **/
  @ApiModelProperty(value = "Date on which the plan is expected to mature")
  public LocalDate getPlanMaturityDate() {
    return planMaturityDate;
  }

  public Plan totalExpectedRedemptionValue(Integer totalExpectedRedemptionValue) {
    this.totalExpectedRedemptionValue = totalExpectedRedemptionValue;
    return this;
  }

   /**
   * Total amount expected to be redeemed by the customer at the end of the plan
   * @return totalExpectedRedemptionValue
  **/
  @ApiModelProperty(value = "Total amount expected to be redeemed by the customer at the end of the plan")
  public Integer getTotalExpectedRedemptionValue() {
    return totalExpectedRedemptionValue;
  }

  public void setTotalExpectedRedemptionValue(Integer totalExpectedRedemptionValue) {
    this.totalExpectedRedemptionValue = totalExpectedRedemptionValue;
  }

   /**
   * Total amount that can be redeemed by the customer by closing the plan today
   * @return currentRedemptionValue
  **/
  @ApiModelProperty(value = "Total amount that can be redeemed by the customer by closing the plan today")
  public Integer getCurrentRedemptionValue() {
    return currentRedemptionValue;
  }

   /**
   * Total amount that is paid back to customer if the plan is cancelled today
   * @return currentCancellationValue
  **/
  @ApiModelProperty(value = "Total amount that is paid back to customer if the plan is cancelled today")
  public Integer getCurrentCancellationValue() {
    return currentCancellationValue;
  }

   /**
   * Timestamp of last paid instalment
   * @return lastInstalmentPaidOn
  **/
  @ApiModelProperty(value = "Timestamp of last paid instalment")
  public OffsetDateTime getLastInstalmentPaidOn() {
    return lastInstalmentPaidOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plan plan = (Plan) o;
    return Objects.equals(this.id, plan.id) &&
        Objects.equals(this.customer, plan.customer) &&
        Objects.equals(this.product, plan.product) &&
        Objects.equals(this.scheme, plan.scheme) &&
        Objects.equals(this.enrolledOn, plan.enrolledOn) &&
        Objects.equals(this.planValue, plan.planValue) &&
        Objects.equals(this.instalmentValue, plan.instalmentValue) &&
        Objects.equals(this.totalPaidValue, plan.totalPaidValue) &&
        Objects.equals(this.completedInstalments, plan.completedInstalments) &&
        Objects.equals(this.nextInstalmentDate, plan.nextInstalmentDate) &&
        Objects.equals(this.planMaturityDate, plan.planMaturityDate) &&
        Objects.equals(this.totalExpectedRedemptionValue, plan.totalExpectedRedemptionValue) &&
        Objects.equals(this.currentRedemptionValue, plan.currentRedemptionValue) &&
        Objects.equals(this.currentCancellationValue, plan.currentCancellationValue) &&
        Objects.equals(this.lastInstalmentPaidOn, plan.lastInstalmentPaidOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, product, scheme, enrolledOn, planValue, instalmentValue, totalPaidValue, completedInstalments, nextInstalmentDate, planMaturityDate, totalExpectedRedemptionValue, currentRedemptionValue, currentCancellationValue, lastInstalmentPaidOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plan {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    scheme: ").append(toIndentedString(scheme)).append("\n");
    sb.append("    enrolledOn: ").append(toIndentedString(enrolledOn)).append("\n");
    sb.append("    planValue: ").append(toIndentedString(planValue)).append("\n");
    sb.append("    instalmentValue: ").append(toIndentedString(instalmentValue)).append("\n");
    sb.append("    totalPaidValue: ").append(toIndentedString(totalPaidValue)).append("\n");
    sb.append("    completedInstalments: ").append(toIndentedString(completedInstalments)).append("\n");
    sb.append("    nextInstalmentDate: ").append(toIndentedString(nextInstalmentDate)).append("\n");
    sb.append("    planMaturityDate: ").append(toIndentedString(planMaturityDate)).append("\n");
    sb.append("    totalExpectedRedemptionValue: ").append(toIndentedString(totalExpectedRedemptionValue)).append("\n");
    sb.append("    currentRedemptionValue: ").append(toIndentedString(currentRedemptionValue)).append("\n");
    sb.append("    currentCancellationValue: ").append(toIndentedString(currentCancellationValue)).append("\n");
    sb.append("    lastInstalmentPaidOn: ").append(toIndentedString(lastInstalmentPaidOn)).append("\n");
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

