package com.onetwonet.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.onetwonet.model.ErrorDescription;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ValidationErrorResponseAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class ValidationErrorResponseAllOf  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("errors")
  @Valid
  private List<ErrorDescription> errors = null;

  public ValidationErrorResponseAllOf errors(List<ErrorDescription> errors) {
    this.errors = errors;
    return this;
  }

  public ValidationErrorResponseAllOf addErrorsItem(ErrorDescription errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ErrorDescription> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorDescription> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationErrorResponseAllOf validationErrorResponseAllOf = (ValidationErrorResponseAllOf) o;
    return Objects.equals(this.errors, validationErrorResponseAllOf.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorResponseAllOf {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

