package com.tritronik.shipping.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tritronik.shipping.server.model.BillingAccountRef;
import com.tritronik.shipping.server.model.Price;
import com.tritronik.shipping.server.model.PriceAlteration;
import com.tritronik.shipping.server.model.ProductOfferingPriceRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An amount, usually of money, that represents the actual price paid by a Customer for a purchase, a rent or a lease of a Product. The price is valid for a defined period of time.
 */
@ApiModel(description = "An amount, usually of money, that represents the actual price paid by a Customer for a purchase, a rent or a lease of a Product. The price is valid for a defined period of time.")
@Validated


public class ProductPrice   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("priceType")
  private String priceType = null;

  @JsonProperty("recurringChargePeriod")
  private String recurringChargePeriod = null;

  @JsonProperty("unitOfMeasure")
  private String unitOfMeasure = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("productOfferingPrice")
  private ProductOfferingPriceRef productOfferingPrice = null;

  @JsonProperty("productPriceAlteration")
  @Valid
  private List<PriceAlteration> productPriceAlteration = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public ProductPrice id(String id) {
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

  public ProductPrice href(String href) {
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

  public ProductPrice description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains in detail the semantics of this product price.
   * @return description
  **/
  @ApiModelProperty(value = "A narrative that explains in detail the semantics of this product price.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductPrice name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A short descriptive name such as \"Subscription price\".
   * @return name
  **/
  @ApiModelProperty(value = "A short descriptive name such as \"Subscription price\".")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductPrice priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.
   * @return priceType
  **/
  @ApiModelProperty(required = true, value = "A category that describes the price, such as recurring, discount, allowance, penalty, and so forth.")
  @NotNull


  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public ProductPrice recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  /**
   * Could be month, week...
   * @return recurringChargePeriod
  **/
  @ApiModelProperty(value = "Could be month, week...")


  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  public ProductPrice unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * Could be minutes, GB...
   * @return unitOfMeasure
  **/
  @ApiModelProperty(value = "Could be minutes, GB...")


  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public ProductPrice billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Get billingAccount
   * @return billingAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public ProductPrice price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public ProductPrice productOfferingPrice(ProductOfferingPriceRef productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
    return this;
  }

  /**
   * Get productOfferingPrice
   * @return productOfferingPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductOfferingPriceRef getProductOfferingPrice() {
    return productOfferingPrice;
  }

  public void setProductOfferingPrice(ProductOfferingPriceRef productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
  }

  public ProductPrice productPriceAlteration(List<PriceAlteration> productPriceAlteration) {
    this.productPriceAlteration = productPriceAlteration;
    return this;
  }

  public ProductPrice addProductPriceAlterationItem(PriceAlteration productPriceAlterationItem) {
    if (this.productPriceAlteration == null) {
      this.productPriceAlteration = new ArrayList<>();
    }
    this.productPriceAlteration.add(productPriceAlterationItem);
    return this;
  }

  /**
   * Get productPriceAlteration
   * @return productPriceAlteration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<PriceAlteration> getProductPriceAlteration() {
    return productPriceAlteration;
  }

  public void setProductPriceAlteration(List<PriceAlteration> productPriceAlteration) {
    this.productPriceAlteration = productPriceAlteration;
  }

  public ProductPrice baseType(String baseType) {
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

  public ProductPrice schemaLocation(String schemaLocation) {
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

  public ProductPrice type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductPrice productPrice = (ProductPrice) o;
    return Objects.equals(this.id, productPrice.id) &&
        Objects.equals(this.href, productPrice.href) &&
        Objects.equals(this.description, productPrice.description) &&
        Objects.equals(this.name, productPrice.name) &&
        Objects.equals(this.priceType, productPrice.priceType) &&
        Objects.equals(this.recurringChargePeriod, productPrice.recurringChargePeriod) &&
        Objects.equals(this.unitOfMeasure, productPrice.unitOfMeasure) &&
        Objects.equals(this.billingAccount, productPrice.billingAccount) &&
        Objects.equals(this.price, productPrice.price) &&
        Objects.equals(this.productOfferingPrice, productPrice.productOfferingPrice) &&
        Objects.equals(this.productPriceAlteration, productPrice.productPriceAlteration) &&
        Objects.equals(this.baseType, productPrice.baseType) &&
        Objects.equals(this.schemaLocation, productPrice.schemaLocation) &&
        Objects.equals(this.type, productPrice.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, name, priceType, recurringChargePeriod, unitOfMeasure, billingAccount, price, productOfferingPrice, productPriceAlteration, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductPrice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productOfferingPrice: ").append(toIndentedString(productOfferingPrice)).append("\n");
    sb.append("    productPriceAlteration: ").append(toIndentedString(productPriceAlteration)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

