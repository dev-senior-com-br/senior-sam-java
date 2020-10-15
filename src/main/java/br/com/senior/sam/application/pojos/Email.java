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
import br.com.senior.sam.application.pojos.Person;
import java.io.IOException;

/**
 * Email
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-15T16:25:01.526Z")



public class Email {
  @SerializedName("preferential")
  private Boolean preferential = null;

  @SerializedName("person")
  private Person person = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("email")
  private String email = null;

  public Email preferential(Boolean preferential) {
    this.preferential = preferential;
    return this;
  }

   /**
   * Email Preferencial
   * @return preferential
  **/
  @ApiModelProperty(value = "Email Preferencial")
  public Boolean isPreferential() {
    return preferential;
  }

  public void setPreferential(Boolean preferential) {
    this.preferential = preferential;
  }

  public Email person(Person person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @ApiModelProperty(value = "")
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Email id(Integer id) {
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

  public Email email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Documento
   * @return email
  **/
  @ApiModelProperty(value = "Documento")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Email email = (Email) o;
    return Objects.equals(this.preferential, email.preferential) &&
        Objects.equals(this.person, email.person) &&
        Objects.equals(this.id, email.id) &&
        Objects.equals(this.email, email.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferential, person, id, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    
    sb.append("    preferential: ").append(toIndentedString(preferential)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
