/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.7.0
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
import br.com.senior.sam.application.pojos.PhoneType;
import java.io.IOException;

/**
 * Phone
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-28T14:57:01.350Z")



public class Phone {
  @SerializedName("preferential")
  private Boolean preferential = null;

  @SerializedName("number")
  private String number = null;

  @SerializedName("phoneType")
  private PhoneType phoneType = null;

  @SerializedName("person")
  private Person person = null;

  @SerializedName("phoneExtension")
  private String phoneExtension = null;

  @SerializedName("idd")
  private Integer idd = null;

  @SerializedName("id")
  private Integer id = null;

  public Phone preferential(Boolean preferential) {
    this.preferential = preferential;
    return this;
  }

   /**
   * Telefone Preferencial
   * @return preferential
  **/
  @ApiModelProperty(value = "Telefone Preferencial")
  public Boolean isPreferential() {
    return preferential;
  }

  public void setPreferential(Boolean preferential) {
    this.preferential = preferential;
  }

  public Phone number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Número do Telefone
   * @return number
  **/
  @ApiModelProperty(value = "Número do Telefone")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Phone phoneType(PhoneType phoneType) {
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @ApiModelProperty(value = "")
  public PhoneType getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(PhoneType phoneType) {
    this.phoneType = phoneType;
  }

  public Phone person(Person person) {
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

  public Phone phoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
    return this;
  }

   /**
   * Ramal
   * @return phoneExtension
  **/
  @ApiModelProperty(value = "Ramal")
  public String getPhoneExtension() {
    return phoneExtension;
  }

  public void setPhoneExtension(String phoneExtension) {
    this.phoneExtension = phoneExtension;
  }

  public Phone idd(Integer idd) {
    this.idd = idd;
    return this;
  }

   /**
   * DDI/IDD (International Direct Dialing)
   * @return idd
  **/
  @ApiModelProperty(value = "DDI/IDD (International Direct Dialing)")
  public Integer getIdd() {
    return idd;
  }

  public void setIdd(Integer idd) {
    this.idd = idd;
  }

  public Phone id(Integer id) {
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
    Phone phone = (Phone) o;
    return Objects.equals(this.preferential, phone.preferential) &&
        Objects.equals(this.number, phone.number) &&
        Objects.equals(this.phoneType, phone.phoneType) &&
        Objects.equals(this.person, phone.person) &&
        Objects.equals(this.phoneExtension, phone.phoneExtension) &&
        Objects.equals(this.idd, phone.idd) &&
        Objects.equals(this.id, phone.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferential, number, phoneType, person, phoneExtension, idd, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    
    sb.append("    preferential: ").append(toIndentedString(preferential)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    phoneExtension: ").append(toIndentedString(phoneExtension)).append("\n");
    sb.append("    idd: ").append(toIndentedString(idd)).append("\n");
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

