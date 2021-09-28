package com.tritronik.shipping.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A period of time, either as a deadline (endDateTime only) a startDateTime only, or both
 */
@ApiModel(description = "A period of time, either as a deadline (endDateTime only) a startDateTime only, or both")
@Validated


public class TimePeriod   {
  @JsonProperty("endDateTime")
  private Date endDateTime = null;

  @JsonProperty("startDateTime")
  private Date startDateTime = null;

  public TimePeriod endDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * End of the time period, using IETC-RFC-3339 format
   * @return endDateTime
  **/
  @ApiModelProperty(example = "1985-04-12T23:20:50.52Z", value = "End of the time period, using IETC-RFC-3339 format")

  @Valid

  public Date getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(Date endDateTime) {
    this.endDateTime = endDateTime;
  }

  public TimePeriod startDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Start of the time period, using IETC-RFC-3339 format
   * @return startDateTime
  **/
  @ApiModelProperty(example = "1985-04-12T23:20:50.52Z", value = "Start of the time period, using IETC-RFC-3339 format")

  @Valid

  public Date getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(Date startDateTime) {
    this.startDateTime = startDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimePeriod timePeriod = (TimePeriod) o;
    return Objects.equals(this.endDateTime, timePeriod.endDateTime) &&
        Objects.equals(this.startDateTime, timePeriod.startDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDateTime, startDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimePeriod {\n");
    
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
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

