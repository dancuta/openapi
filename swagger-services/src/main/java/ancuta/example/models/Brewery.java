package ancuta.example.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Brewery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-02T09:14:52.086+02:00[Europe/Athens]")
public class Brewery   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("location")
  private String location;

  public Brewery name(String name) {
    this.name = name;
    return this;
  }

  /**
   * brewery name
   * @return name
  */
  @ApiModelProperty(value = "brewery name")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Brewery location(String location) {
    this.location = location;
    return this;
  }

  /**
   * brewery location
   * @return location
  */
  @ApiModelProperty(value = "brewery location")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Brewery brewery = (Brewery) o;
    return Objects.equals(this.name, brewery.name) &&
        Objects.equals(this.location, brewery.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Brewery {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

