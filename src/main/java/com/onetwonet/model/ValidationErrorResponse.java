package com.onetwonet.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.onetwonet.model.ErrorDescription;
import com.onetwonet.model.ErrorResponse;
import com.onetwonet.model.ValidationErrorResponseAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ValidationErrorResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@lombok.AllArgsConstructor
@lombok.Builder
@lombok.NoArgsConstructor

public class ValidationErrorResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("message")
  private String message;

  @JsonProperty("errors")
  @Valid
  private List<ErrorDescription> errors = null;

  public ValidationErrorResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ValidationErrorResponse errors(List<ErrorDescription> errors) {
    this.errors = errors;
    return this;
  }

  public ValidationErrorResponse addErrorsItem(ErrorDescription errorsItem) {
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
    ValidationErrorResponse validationErrorResponse = (ValidationErrorResponse) o;
    return Objects.equals(this.message, validationErrorResponse.message) &&
        Objects.equals(this.errors, validationErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationErrorResponse {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

