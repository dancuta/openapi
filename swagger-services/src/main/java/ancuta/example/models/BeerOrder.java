package ancuta.example.models;

import java.util.Objects;
import ancuta.example.models.Beer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Beer Order object
 */
@ApiModel(description = "Beer Order object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-02T09:14:52.086+02:00[Europe/Athens]")
public class BeerOrder   {
  @JsonProperty("orderId")
  private UUID orderId;

  @JsonProperty("customerId")
  private UUID customerId;

  @JsonProperty("beers")
  @Valid
  private List<Beer> beers = null;

  @JsonProperty("orderStatusCallbackUrl")
  private URI orderStatusCallbackUrl;

  public BeerOrder orderId(UUID orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order unique ID
   * @return orderId
  */
  @ApiModelProperty(readOnly = true, value = "Order unique ID")

  @Valid

  public UUID getOrderId() {
    return orderId;
  }

  public void setOrderId(UUID orderId) {
    this.orderId = orderId;
  }

  public BeerOrder customerId(UUID customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Customer unique ID
   * @return customerId
  */
  @ApiModelProperty(readOnly = true, value = "Customer unique ID")

  @Valid

  public UUID getCustomerId() {
    return customerId;
  }

  public void setCustomerId(UUID customerId) {
    this.customerId = customerId;
  }

  public BeerOrder beers(List<Beer> beers) {
    this.beers = beers;
    return this;
  }

  public BeerOrder addBeersItem(Beer beersItem) {
    if (this.beers == null) {
      this.beers = new ArrayList<>();
    }
    this.beers.add(beersItem);
    return this;
  }

  /**
   * Get beers
   * @return beers
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Beer> getBeers() {
    return beers;
  }

  public void setBeers(List<Beer> beers) {
    this.beers = beers;
  }

  public BeerOrder orderStatusCallbackUrl(URI orderStatusCallbackUrl) {
    this.orderStatusCallbackUrl = orderStatusCallbackUrl;
    return this;
  }

  /**
   * Get orderStatusCallbackUrl
   * @return orderStatusCallbackUrl
  */
  @ApiModelProperty(example = "https://myserver.com/send/callback/here", value = "")

  @Valid

  public URI getOrderStatusCallbackUrl() {
    return orderStatusCallbackUrl;
  }

  public void setOrderStatusCallbackUrl(URI orderStatusCallbackUrl) {
    this.orderStatusCallbackUrl = orderStatusCallbackUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeerOrder beerOrder = (BeerOrder) o;
    return Objects.equals(this.orderId, beerOrder.orderId) &&
        Objects.equals(this.customerId, beerOrder.customerId) &&
        Objects.equals(this.beers, beerOrder.beers) &&
        Objects.equals(this.orderStatusCallbackUrl, beerOrder.orderStatusCallbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, customerId, beers, orderStatusCallbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeerOrder {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    beers: ").append(toIndentedString(beers)).append("\n");
    sb.append("    orderStatusCallbackUrl: ").append(toIndentedString(orderStatusCallbackUrl)).append("\n");
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

