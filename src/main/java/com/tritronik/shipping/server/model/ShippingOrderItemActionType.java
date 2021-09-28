package com.tritronik.shipping.server.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * action to be performed on the shipping order item
 */
public enum ShippingOrderItemActionType {
  
  ADD("add"),
  
  MODIFY("modify"),
  
  DELETE("delete"),
  
  NOCHANGE("noChange");

  private String value;

  ShippingOrderItemActionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ShippingOrderItemActionType fromValue(String text) {
    for (ShippingOrderItemActionType b : ShippingOrderItemActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

