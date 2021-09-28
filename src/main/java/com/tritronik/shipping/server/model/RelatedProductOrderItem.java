package com.tritronik.shipping.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RelatedProductOrderItem (ProductOrder item) .The product order item which triggered product creation/change/termination.
 */
@ApiModel(description = "RelatedProductOrderItem (ProductOrder item) .The product order item which triggered product creation/change/termination.")
@Validated


public class RelatedProductOrderItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("orderItemAction")
  private String orderItemAction = null;

  @JsonProperty("orderItemId")
  private String orderItemId = null;

  @JsonProperty("productOrderHref")
  private String productOrderHref = null;

  @JsonProperty("productOrderId")
  private String productOrderId = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public RelatedProductOrderItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  **/
  @ApiModelProperty(value = "unique identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedProductOrderItem href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink reference")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RelatedProductOrderItem orderItemAction(String orderItemAction) {
    this.orderItemAction = orderItemAction;
    return this;
  }

  /**
   * Action of the order item for this product
   * @return orderItemAction
  **/
  @ApiModelProperty(value = "Action of the order item for this product")


  public String getOrderItemAction() {
    return orderItemAction;
  }

  public void setOrderItemAction(String orderItemAction) {
    this.orderItemAction = orderItemAction;
  }

  public RelatedProductOrderItem orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

  /**
   * Identifier of the order item where the product was managed
   * @return orderItemId
  **/
  @ApiModelProperty(required = true, value = "Identifier of the order item where the product was managed")
  @NotNull


  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public RelatedProductOrderItem productOrderHref(String productOrderHref) {
    this.productOrderHref = productOrderHref;
    return this;
  }

  /**
   * Reference of the related entity.
   * @return productOrderHref
  **/
  @ApiModelProperty(value = "Reference of the related entity.")


  public String getProductOrderHref() {
    return productOrderHref;
  }

  public void setProductOrderHref(String productOrderHref) {
    this.productOrderHref = productOrderHref;
  }

  public RelatedProductOrderItem productOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
    return this;
  }

  /**
   * Unique identifier of a related entity.
   * @return productOrderId
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of a related entity.")
  @NotNull


  public String getProductOrderId() {
    return productOrderId;
  }

  public void setProductOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
  }

  public RelatedProductOrderItem role(String role) {
    this.role = role;
    return this;
  }

  /**
   * role of the product order item for this product
   * @return role
  **/
  @ApiModelProperty(value = "role of the product order item for this product")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedProductOrderItem baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public RelatedProductOrderItem schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public RelatedProductOrderItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RelatedProductOrderItem referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  **/
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedProductOrderItem relatedProductOrderItem = (RelatedProductOrderItem) o;
    return Objects.equals(this.id, relatedProductOrderItem.id) &&
        Objects.equals(this.href, relatedProductOrderItem.href) &&
        Objects.equals(this.orderItemAction, relatedProductOrderItem.orderItemAction) &&
        Objects.equals(this.orderItemId, relatedProductOrderItem.orderItemId) &&
        Objects.equals(this.productOrderHref, relatedProductOrderItem.productOrderHref) &&
        Objects.equals(this.productOrderId, relatedProductOrderItem.productOrderId) &&
        Objects.equals(this.role, relatedProductOrderItem.role) &&
        Objects.equals(this.baseType, relatedProductOrderItem.baseType) &&
        Objects.equals(this.schemaLocation, relatedProductOrderItem.schemaLocation) &&
        Objects.equals(this.type, relatedProductOrderItem.type) &&
        Objects.equals(this.referredType, relatedProductOrderItem.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, orderItemAction, orderItemId, productOrderHref, productOrderId, role, baseType, schemaLocation, type, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedProductOrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    orderItemAction: ").append(toIndentedString(orderItemAction)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    productOrderHref: ").append(toIndentedString(productOrderHref)).append("\n");
    sb.append("    productOrderId: ").append(toIndentedString(productOrderId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

