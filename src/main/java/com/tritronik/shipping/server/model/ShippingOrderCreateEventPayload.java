package com.tritronik.shipping.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.tritronik.shipping.server.model.ShippingOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@Validated


public class ShippingOrderCreateEventPayload   {
  @JsonProperty("shippingOrder")
  private ShippingOrder shippingOrder = null;

  public ShippingOrderCreateEventPayload shippingOrder(ShippingOrder shippingOrder) {
    this.shippingOrder = shippingOrder;
    return this;
  }

  /**
   * The involved resource data for the event
   * @return shippingOrder
  **/
  @ApiModelProperty(value = "The involved resource data for the event")

  @Valid

  public ShippingOrder getShippingOrder() {
    return shippingOrder;
  }

  public void setShippingOrder(ShippingOrder shippingOrder) {
    this.shippingOrder = shippingOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingOrderCreateEventPayload shippingOrderCreateEventPayload = (ShippingOrderCreateEventPayload) o;
    return Objects.equals(this.shippingOrder, shippingOrderCreateEventPayload.shippingOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippingOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingOrderCreateEventPayload {\n");
    
    sb.append("    shippingOrder: ").append(toIndentedString(shippingOrder)).append("\n");
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

