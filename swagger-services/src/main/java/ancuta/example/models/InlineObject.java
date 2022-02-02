package ancuta.example.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-02T09:14:52.086+02:00[Europe/Athens]")
public class InlineObject   {
  @JsonProperty("orderid")
  private UUID orderid;

  @JsonProperty("orderStatus")
  private String orderStatus;

  public InlineObject orderid(UUID orderid) {
    this.orderid = orderid;
    return this;
  }

  /**
   * Get orderid
   * @return orderid
  */
  @ApiModelProperty(value = "")

  @Valid

  public UUID getOrderid() {
    return orderid;
  }

  public void setOrderid(UUID orderid) {
    this.orderid = orderid;
  }

  public InlineObject orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

  /**
   * Get orderStatus
   * @return orderStatus
  */
  @ApiModelProperty(value = "")


  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject inlineObject = (InlineObject) o;
    return Objects.equals(this.orderid, inlineObject.orderid) &&
        Objects.equals(this.orderStatus, inlineObject.orderStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderid, orderStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject {\n");
    
    sb.append("    orderid: ").append(toIndentedString(orderid)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

