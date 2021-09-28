package com.tritronik.shipping.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tritronik.shipping.server.model.AttachmentRefOrValue;
import com.tritronik.shipping.server.model.CharacteristicSpecification;
import com.tritronik.shipping.server.model.ConstraintRef;
import com.tritronik.shipping.server.model.RelatedParty;
import com.tritronik.shipping.server.model.ShipmentSpecificationRelationship;
import com.tritronik.shipping.server.model.TargetShipmentSchema;
import com.tritronik.shipping.server.model.TimePeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A shipment specification defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation &amp;amp; @referredType are related to the shipment specification entity and not the related ShipmentSpecificationRefOrValue class itself
 */
@ApiModel(description = "A shipment specification defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation &amp; @referredType are related to the shipment specification entity and not the related ShipmentSpecificationRefOrValue class itself")
@Validated


public class ShipmentSpecificationRefOrValue   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isBundle")
  private Boolean isBundle = null;

  @JsonProperty("lastUpdate")
  private Date lastUpdate = null;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("attachment")
  @Valid
  private List<AttachmentRefOrValue> attachment = null;

  @JsonProperty("constraint")
  @Valid
  private List<ConstraintRef> constraint = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("shipmentSpecRelationship")
  @Valid
  private List<ShipmentSpecificationRelationship> shipmentSpecRelationship = null;

  @JsonProperty("shipmentSpecificationCharacteristic")
  @Valid
  private List<CharacteristicSpecification> shipmentSpecificationCharacteristic = null;

  @JsonProperty("targetShipmentSchema")
  private TargetShipmentSchema targetShipmentSchema = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public ShipmentSpecificationRefOrValue id(String id) {
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

  public ShipmentSpecificationRefOrValue href(String href) {
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

  public ShipmentSpecificationRefOrValue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of this REST resource
   * @return description
  **/
  @ApiModelProperty(example = "Airmail delivery", value = "Description of this REST resource")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ShipmentSpecificationRefOrValue isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * isBundle determines whether an ShipmentSpecification represents a single ShipmentSpecification (false), or a bundle of ShipmentSpecification (true).
   * @return isBundle
  **/
  @ApiModelProperty(example = "true", value = "isBundle determines whether an ShipmentSpecification represents a single ShipmentSpecification (false), or a bundle of ShipmentSpecification (true).")


  public Boolean isIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ShipmentSpecificationRefOrValue lastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the last update of this REST resource
   * @return lastUpdate
  **/
  @ApiModelProperty(example = "2020-11-20T08:00:00Z", value = "Date and time of the last update of this REST resource")

  @Valid

  public Date getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ShipmentSpecificationRefOrValue lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status of this catalog item
   * @return lifecycleStatus
  **/
  @ApiModelProperty(example = "active", value = "Used to indicate the current lifecycle status of this catalog item")


  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public ShipmentSpecificationRefOrValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the related entity.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the related entity.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShipmentSpecificationRefOrValue version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Entity specification version
   * @return version
  **/
  @ApiModelProperty(example = "4.0.1", value = "Entity specification version")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ShipmentSpecificationRefOrValue attachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public ShipmentSpecificationRefOrValue addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * Attachments that may be of relevance to this specification, such as picture, document, media  
   * @return attachment
  **/
  @ApiModelProperty(value = "Attachments that may be of relevance to this specification, such as picture, document, media  ")

  @Valid

  public List<AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }

  public ShipmentSpecificationRefOrValue constraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
    return this;
  }

  public ShipmentSpecificationRefOrValue addConstraintItem(ConstraintRef constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<>();
    }
    this.constraint.add(constraintItem);
    return this;
  }

  /**
   * This is a list of constraint references applied to this specification  
   * @return constraint
  **/
  @ApiModelProperty(value = "This is a list of constraint references applied to this specification  ")

  @Valid

  public List<ConstraintRef> getConstraint() {
    return constraint;
  }

  public void setConstraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
  }

  public ShipmentSpecificationRefOrValue relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ShipmentSpecificationRefOrValue addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Parties who manage or otherwise have an interest in this shipment specification
   * @return relatedParty
  **/
  @ApiModelProperty(value = "Parties who manage or otherwise have an interest in this shipment specification")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ShipmentSpecificationRefOrValue shipmentSpecRelationship(List<ShipmentSpecificationRelationship> shipmentSpecRelationship) {
    this.shipmentSpecRelationship = shipmentSpecRelationship;
    return this;
  }

  public ShipmentSpecificationRefOrValue addShipmentSpecRelationshipItem(ShipmentSpecificationRelationship shipmentSpecRelationshipItem) {
    if (this.shipmentSpecRelationship == null) {
      this.shipmentSpecRelationship = new ArrayList<>();
    }
    this.shipmentSpecRelationship.add(shipmentSpecRelationshipItem);
    return this;
  }

  /**
   * Relationship to another shipment specification, might be dependency, substitution, etc.  
   * @return shipmentSpecRelationship
  **/
  @ApiModelProperty(value = "Relationship to another shipment specification, might be dependency, substitution, etc.  ")

  @Valid

  public List<ShipmentSpecificationRelationship> getShipmentSpecRelationship() {
    return shipmentSpecRelationship;
  }

  public void setShipmentSpecRelationship(List<ShipmentSpecificationRelationship> shipmentSpecRelationship) {
    this.shipmentSpecRelationship = shipmentSpecRelationship;
  }

  public ShipmentSpecificationRefOrValue shipmentSpecificationCharacteristic(List<CharacteristicSpecification> shipmentSpecificationCharacteristic) {
    this.shipmentSpecificationCharacteristic = shipmentSpecificationCharacteristic;
    return this;
  }

  public ShipmentSpecificationRefOrValue addShipmentSpecificationCharacteristicItem(CharacteristicSpecification shipmentSpecificationCharacteristicItem) {
    if (this.shipmentSpecificationCharacteristic == null) {
      this.shipmentSpecificationCharacteristic = new ArrayList<>();
    }
    this.shipmentSpecificationCharacteristic.add(shipmentSpecificationCharacteristicItem);
    return this;
  }

  /**
   * List of characteristics that the shipment can take
   * @return shipmentSpecificationCharacteristic
  **/
  @ApiModelProperty(value = "List of characteristics that the shipment can take")

  @Valid

  public List<CharacteristicSpecification> getShipmentSpecificationCharacteristic() {
    return shipmentSpecificationCharacteristic;
  }

  public void setShipmentSpecificationCharacteristic(List<CharacteristicSpecification> shipmentSpecificationCharacteristic) {
    this.shipmentSpecificationCharacteristic = shipmentSpecificationCharacteristic;
  }

  public ShipmentSpecificationRefOrValue targetShipmentSchema(TargetShipmentSchema targetShipmentSchema) {
    this.targetShipmentSchema = targetShipmentSchema;
    return this;
  }

  /**
   * Pointer to a schema that defines the target shipment
   * @return targetShipmentSchema
  **/
  @ApiModelProperty(value = "Pointer to a schema that defines the target shipment")

  @Valid

  public TargetShipmentSchema getTargetShipmentSchema() {
    return targetShipmentSchema;
  }

  public void setTargetShipmentSchema(TargetShipmentSchema targetShipmentSchema) {
    this.targetShipmentSchema = targetShipmentSchema;
  }

  public ShipmentSpecificationRefOrValue validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which this REST resource is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which this REST resource is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ShipmentSpecificationRefOrValue baseType(String baseType) {
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

  public ShipmentSpecificationRefOrValue schemaLocation(String schemaLocation) {
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

  public ShipmentSpecificationRefOrValue type(String type) {
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

  public ShipmentSpecificationRefOrValue referredType(String referredType) {
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
    ShipmentSpecificationRefOrValue shipmentSpecificationRefOrValue = (ShipmentSpecificationRefOrValue) o;
    return Objects.equals(this.id, shipmentSpecificationRefOrValue.id) &&
        Objects.equals(this.href, shipmentSpecificationRefOrValue.href) &&
        Objects.equals(this.description, shipmentSpecificationRefOrValue.description) &&
        Objects.equals(this.isBundle, shipmentSpecificationRefOrValue.isBundle) &&
        Objects.equals(this.lastUpdate, shipmentSpecificationRefOrValue.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, shipmentSpecificationRefOrValue.lifecycleStatus) &&
        Objects.equals(this.name, shipmentSpecificationRefOrValue.name) &&
        Objects.equals(this.version, shipmentSpecificationRefOrValue.version) &&
        Objects.equals(this.attachment, shipmentSpecificationRefOrValue.attachment) &&
        Objects.equals(this.constraint, shipmentSpecificationRefOrValue.constraint) &&
        Objects.equals(this.relatedParty, shipmentSpecificationRefOrValue.relatedParty) &&
        Objects.equals(this.shipmentSpecRelationship, shipmentSpecificationRefOrValue.shipmentSpecRelationship) &&
        Objects.equals(this.shipmentSpecificationCharacteristic, shipmentSpecificationRefOrValue.shipmentSpecificationCharacteristic) &&
        Objects.equals(this.targetShipmentSchema, shipmentSpecificationRefOrValue.targetShipmentSchema) &&
        Objects.equals(this.validFor, shipmentSpecificationRefOrValue.validFor) &&
        Objects.equals(this.baseType, shipmentSpecificationRefOrValue.baseType) &&
        Objects.equals(this.schemaLocation, shipmentSpecificationRefOrValue.schemaLocation) &&
        Objects.equals(this.type, shipmentSpecificationRefOrValue.type) &&
        Objects.equals(this.referredType, shipmentSpecificationRefOrValue.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, isBundle, lastUpdate, lifecycleStatus, name, version, attachment, constraint, relatedParty, shipmentSpecRelationship, shipmentSpecificationCharacteristic, targetShipmentSchema, validFor, baseType, schemaLocation, type, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentSpecificationRefOrValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    shipmentSpecRelationship: ").append(toIndentedString(shipmentSpecRelationship)).append("\n");
    sb.append("    shipmentSpecificationCharacteristic: ").append(toIndentedString(shipmentSpecificationCharacteristic)).append("\n");
    sb.append("    targetShipmentSchema: ").append(toIndentedString(targetShipmentSchema)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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

