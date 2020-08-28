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
import br.com.senior.sam.application.pojos.CredentialFormat;
import br.com.senior.sam.application.pojos.Group;
import br.com.senior.sam.application.pojos.Person;
import br.com.senior.sam.application.pojos.PhysicalLocation;
import br.com.senior.sam.application.pojos.Role;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * ScheduledCredential
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-28T14:57:01.350Z")



public class ScheduledCredential {
  @SerializedName("visitedPerson")
  private Person visitedPerson = null;

  @SerializedName("role")
  private Role role = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("person")
  private Person person = null;

  @SerializedName("credentialFormat")
  private CredentialFormat credentialFormat = null;

  @SerializedName("visitedPlace")
  private PhysicalLocation visitedPlace = null;

  @SerializedName("scheludingDate")
  private OffsetDateTime scheludingDate = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("locator")
  private String locator = null;

  @SerializedName("group")
  private Group group = null;

  public ScheduledCredential visitedPerson(Person visitedPerson) {
    this.visitedPerson = visitedPerson;
    return this;
  }

   /**
   * Get visitedPerson
   * @return visitedPerson
  **/
  @ApiModelProperty(value = "")
  public Person getVisitedPerson() {
    return visitedPerson;
  }

  public void setVisitedPerson(Person visitedPerson) {
    this.visitedPerson = visitedPerson;
  }

  public ScheduledCredential role(Role role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public ScheduledCredential endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Data Final
   * @return endDate
  **/
  @ApiModelProperty(value = "Data Final")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ScheduledCredential person(Person person) {
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

  public ScheduledCredential credentialFormat(CredentialFormat credentialFormat) {
    this.credentialFormat = credentialFormat;
    return this;
  }

   /**
   * Get credentialFormat
   * @return credentialFormat
  **/
  @ApiModelProperty(value = "")
  public CredentialFormat getCredentialFormat() {
    return credentialFormat;
  }

  public void setCredentialFormat(CredentialFormat credentialFormat) {
    this.credentialFormat = credentialFormat;
  }

  public ScheduledCredential visitedPlace(PhysicalLocation visitedPlace) {
    this.visitedPlace = visitedPlace;
    return this;
  }

   /**
   * Get visitedPlace
   * @return visitedPlace
  **/
  @ApiModelProperty(value = "")
  public PhysicalLocation getVisitedPlace() {
    return visitedPlace;
  }

  public void setVisitedPlace(PhysicalLocation visitedPlace) {
    this.visitedPlace = visitedPlace;
  }

  public ScheduledCredential scheludingDate(OffsetDateTime scheludingDate) {
    this.scheludingDate = scheludingDate;
    return this;
  }

   /**
   * Data do Agendamento
   * @return scheludingDate
  **/
  @ApiModelProperty(value = "Data do Agendamento")
  public OffsetDateTime getScheludingDate() {
    return scheludingDate;
  }

  public void setScheludingDate(OffsetDateTime scheludingDate) {
    this.scheludingDate = scheludingDate;
  }

  public ScheduledCredential id(Integer id) {
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

  public ScheduledCredential locator(String locator) {
    this.locator = locator;
    return this;
  }

   /**
   * Localizador
   * @return locator
  **/
  @ApiModelProperty(value = "Localizador")
  public String getLocator() {
    return locator;
  }

  public void setLocator(String locator) {
    this.locator = locator;
  }

  public ScheduledCredential group(Group group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledCredential scheduledCredential = (ScheduledCredential) o;
    return Objects.equals(this.visitedPerson, scheduledCredential.visitedPerson) &&
        Objects.equals(this.role, scheduledCredential.role) &&
        Objects.equals(this.endDate, scheduledCredential.endDate) &&
        Objects.equals(this.person, scheduledCredential.person) &&
        Objects.equals(this.credentialFormat, scheduledCredential.credentialFormat) &&
        Objects.equals(this.visitedPlace, scheduledCredential.visitedPlace) &&
        Objects.equals(this.scheludingDate, scheduledCredential.scheludingDate) &&
        Objects.equals(this.id, scheduledCredential.id) &&
        Objects.equals(this.locator, scheduledCredential.locator) &&
        Objects.equals(this.group, scheduledCredential.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visitedPerson, role, endDate, person, credentialFormat, visitedPlace, scheludingDate, id, locator, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledCredential {\n");
    
    sb.append("    visitedPerson: ").append(toIndentedString(visitedPerson)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    credentialFormat: ").append(toIndentedString(credentialFormat)).append("\n");
    sb.append("    visitedPlace: ").append(toIndentedString(visitedPlace)).append("\n");
    sb.append("    scheludingDate: ").append(toIndentedString(scheludingDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locator: ").append(toIndentedString(locator)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

