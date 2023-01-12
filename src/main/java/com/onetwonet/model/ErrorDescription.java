package com.onetwonet.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Error description
 */
@ApiModel(description = "Error description")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class ErrorDescription  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("field")
  private String field;

  @JsonProperty("error")
  private String error;

  public ErrorDescription field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  @ApiModelProperty(value = "")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ErrorDescription error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @ApiModelProperty(value = "")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDescription errorDescription = (ErrorDescription) o;
    return Objects.equals(this.field, errorDescription.field) &&
        Objects.equals(this.error, errorDescription.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDescription {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

