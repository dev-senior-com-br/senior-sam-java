/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.8.2
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
import br.com.senior.sam.application.pojos.StatusHistoric;
import br.com.senior.sam.application.pojos.Vehicle;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * PersonVehicle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-21T14:51:01.521Z")



public class PersonVehicle {
  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("person")
  private Person person = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("vehicle")
  private Vehicle vehicle = null;

  @SerializedName("status")
  private StatusHistoric status = null;

  public PersonVehicle endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Data Fim
   * @return endDate
  **/
  @ApiModelProperty(value = "Data Fim")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public PersonVehicle person(Person person) {
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

  public PersonVehicle id(Integer id) {
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

  public PersonVehicle startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Data Início
   * @return startDate
  **/
  @ApiModelProperty(value = "Data Início")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public PersonVehicle vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Get vehicle
   * @return vehicle
  **/
  @ApiModelProperty(value = "")
  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public PersonVehicle status(StatusHistoric status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusHistoric getStatus() {
    return status;
  }

  public void setStatus(StatusHistoric status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonVehicle personVehicle = (PersonVehicle) o;
    return Objects.equals(this.endDate, personVehicle.endDate) &&
        Objects.equals(this.person, personVehicle.person) &&
        Objects.equals(this.id, personVehicle.id) &&
        Objects.equals(this.startDate, personVehicle.startDate) &&
        Objects.equals(this.vehicle, personVehicle.vehicle) &&
        Objects.equals(this.status, personVehicle.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, person, id, startDate, vehicle, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonVehicle {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

