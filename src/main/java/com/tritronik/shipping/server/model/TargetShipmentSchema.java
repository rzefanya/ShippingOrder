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
 * The reference object to the schema and type of target shipment which is described by shipment specification
 */
@ApiModel(description = "The reference object to the schema and type of target shipment which is described by shipment specification")
@Validated


public class TargetShipmentSchema   {
  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public TargetShipmentSchema schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * This field provides a link to the schema describing the target shipment  
   * @return schemaLocation
  **/
  @ApiModelProperty(required = true, value = "This field provides a link to the schema describing the target shipment  ")
  @NotNull


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public TargetShipmentSchema type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Class type of the target shipment
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Class type of the target shipment")
  @NotNull


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
    TargetShipmentSchema targetShipmentSchema = (TargetShipmentSchema) o;
    return Objects.equals(this.schemaLocation, targetShipmentSchema.schemaLocation) &&
        Objects.equals(this.type, targetShipmentSchema.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetShipmentSchema {\n");
    
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

