/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.9.1
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.sam.application.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.sam.application.pojos.AccessCall;
import br.com.senior.sam.application.pojos.Person;
import br.com.senior.sam.application.pojos.ScheduledCredential;
import java.io.IOException;

/**
 * VisitAccessCall
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-14T16:45:01.743Z")



public class VisitAccessCall {
  @SerializedName("personCaller")
  private Person personCaller = null;

  @SerializedName("accessCall")
  private AccessCall accessCall = null;

  @SerializedName("scheduledCredential")
  private ScheduledCredential scheduledCredential = null;

  @SerializedName("id")
  private Integer id = null;

  public VisitAccessCall personCaller(Person personCaller) {
    this.personCaller = personCaller;
    return this;
  }

   /**
   * Get personCaller
   * @return personCaller
  **/
  @ApiModelProperty(value = "")
  public Person getPersonCaller() {
    return personCaller;
  }

  public void setPersonCaller(Person personCaller) {
    this.personCaller = personCaller;
  }

  public VisitAccessCall accessCall(AccessCall accessCall) {
    this.accessCall = accessCall;
    return this;
  }

   /**
   * Get accessCall
   * @return accessCall
  **/
  @ApiModelProperty(value = "")
  public AccessCall getAccessCall() {
    return accessCall;
  }

  public void setAccessCall(AccessCall accessCall) {
    this.accessCall = accessCall;
  }

  public VisitAccessCall scheduledCredential(ScheduledCredential scheduledCredential) {
    this.scheduledCredential = scheduledCredential;
    return this;
  }

   /**
   * Get scheduledCredential
   * @return scheduledCredential
  **/
  @ApiModelProperty(value = "")
  public ScheduledCredential getScheduledCredential() {
    return scheduledCredential;
  }

  public void setScheduledCredential(ScheduledCredential scheduledCredential) {
    this.scheduledCredential = scheduledCredential;
  }

  public VisitAccessCall id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisitAccessCall visitAccessCall = (VisitAccessCall) o;
    return Objects.equals(this.personCaller, visitAccessCall.personCaller) &&
        Objects.equals(this.accessCall, visitAccessCall.accessCall) &&
        Objects.equals(this.scheduledCredential, visitAccessCall.scheduledCredential) &&
        Objects.equals(this.id, visitAccessCall.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personCaller, accessCall, scheduledCredential, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisitAccessCall {\n");
    
    sb.append("    personCaller: ").append(toIndentedString(personCaller)).append("\n");
    sb.append("    accessCall: ").append(toIndentedString(accessCall)).append("\n");
    sb.append("    scheduledCredential: ").append(toIndentedString(scheduledCredential)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

