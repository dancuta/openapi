package ancuta.example.models;

import java.util.Objects;
import ancuta.example.models.Brewery;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Beer object
 */
@ApiModel(description = "Beer object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-02T09:14:52.086+02:00[Europe/Athens]")
public class Beer   {
  @JsonProperty("id")
  private UUID id;

  @JsonProperty("name")
  private String name;

  /**
   * Beer Style
   */
  public enum StyleEnum {
    ALE("ALE"),
    
    PALE_ALE("PALE_ALE"),
    
    IPA("IPA"),
    
    WHEAT("WHEAT"),
    
    LAGER("LAGER");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StyleEnum fromValue(String value) {
      for (StyleEnum b : StyleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("style")
  private StyleEnum style;

  @JsonProperty("upc")
  private String upc;

  @JsonProperty("price")
  private Integer price;

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("brewery")
  private Brewery brewery;

  public Beer id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Beer unique ID
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "Beer unique ID")

  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Beer name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Beer name
   * @return name
  */
  @ApiModelProperty(value = "Beer name")

@Size(min = 2, max = 100) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Beer style(StyleEnum style) {
    this.style = style;
    return this;
  }

  /**
   * Beer Style
   * @return style
  */
  @ApiModelProperty(value = "Beer Style")


  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public Beer upc(String upc) {
    this.upc = upc;
    return this;
  }

  /**
   * Beer name
   * @return upc
  */
  @ApiModelProperty(value = "Beer name")

@Size(min = 2, max = 100) 
  public String getUpc() {
    return upc;
  }

  public void setUpc(String upc) {
    this.upc = upc;
  }

  public Beer price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")


  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Beer quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Beer brewery(Brewery brewery) {
    this.brewery = brewery;
    return this;
  }

  /**
   * Get brewery
   * @return brewery
  */
  @ApiModelProperty(value = "")

  @Valid

  public Brewery getBrewery() {
    return brewery;
  }

  public void setBrewery(Brewery brewery) {
    this.brewery = brewery;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beer beer = (Beer) o;
    return Objects.equals(this.id, beer.id) &&
        Objects.equals(this.name, beer.name) &&
        Objects.equals(this.style, beer.style) &&
        Objects.equals(this.upc, beer.upc) &&
        Objects.equals(this.price, beer.price) &&
        Objects.equals(this.quantity, beer.quantity) &&
        Objects.equals(this.brewery, beer.brewery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, style, upc, price, quantity, brewery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    brewery: ").append(toIndentedString(brewery)).append("\n");
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

