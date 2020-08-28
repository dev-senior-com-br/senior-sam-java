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
import br.com.senior.sam.application.pojos.OrganizationalStructure;
import br.com.senior.sam.application.pojos.Person;
import java.io.IOException;

/**
 * OrganizationalStructurePerson
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-28T14:57:01.350Z")



public class OrganizationalStructurePerson {
  @SerializedName("person")
  private Person person = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("organizationalStructure")
  private OrganizationalStructure organizationalStructure = null;

  public OrganizationalStructurePerson person(Person person) {
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

  public OrganizationalStructurePerson id(Integer id) {
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

  public OrganizationalStructurePerson organizationalStructure(OrganizationalStructure organizationalStructure) {
    this.organizationalStructure = organizationalStructure;
    return this;
  }

   /**
   * Get organizationalStructure
   * @return organizationalStructure
  **/
  @ApiModelProperty(value = "")
  public OrganizationalStructure getOrganizationalStructure() {
    return organizationalStructure;
  }

  public void setOrganizationalStructure(OrganizationalStructure organizationalStructure) {
    this.organizationalStructure = organizationalStructure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationalStructurePerson organizationalStructurePerson = (OrganizationalStructurePerson) o;
    return Objects.equals(this.person, organizationalStructurePerson.person) &&
        Objects.equals(this.id, organizationalStructurePerson.id) &&
        Objects.equals(this.organizationalStructure, organizationalStructurePerson.organizationalStructure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(person, id, organizationalStructure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationalStructurePerson {\n");
    
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationalStructure: ").append(toIndentedString(organizationalStructure)).append("\n");
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

