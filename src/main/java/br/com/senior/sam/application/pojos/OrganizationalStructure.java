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
import br.com.senior.sam.application.pojos.OrganizationalStructurePerson;
import br.com.senior.sam.application.pojos.OrganizationalStructureType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrganizationalStructure
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-14T16:45:01.743Z")



public class OrganizationalStructure {
  @SerializedName("parent")
  private Integer parent = null;

  @SerializedName("organizationalStructurePeople")
  private List<OrganizationalStructurePerson> organizationalStructurePeople = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("organizationalStructureType")
  private OrganizationalStructureType organizationalStructureType = null;

  @SerializedName("integrated")
  private Boolean integrated = null;

  public OrganizationalStructure parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Estrutura organizacional pai
   * @return parent
  **/
  @ApiModelProperty(value = "Estrutura organizacional pai")
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public OrganizationalStructure organizationalStructurePeople(List<OrganizationalStructurePerson> organizationalStructurePeople) {
    this.organizationalStructurePeople = organizationalStructurePeople;
    return this;
  }

  public OrganizationalStructure addOrganizationalStructurePeopleItem(OrganizationalStructurePerson organizationalStructurePeopleItem) {
    if (this.organizationalStructurePeople == null) {
      this.organizationalStructurePeople = new ArrayList<OrganizationalStructurePerson>();
    }
    this.organizationalStructurePeople.add(organizationalStructurePeopleItem);
    return this;
  }

   /**
   * Pessoas da estrutura organizacional
   * @return organizationalStructurePeople
  **/
  @ApiModelProperty(value = "Pessoas da estrutura organizacional")
  public List<OrganizationalStructurePerson> getOrganizationalStructurePeople() {
    return organizationalStructurePeople;
  }

  public void setOrganizationalStructurePeople(List<OrganizationalStructurePerson> organizationalStructurePeople) {
    this.organizationalStructurePeople = organizationalStructurePeople;
  }

  public OrganizationalStructure description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descrição
   * @return description
  **/
  @ApiModelProperty(value = "Descrição")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrganizationalStructure id(Integer id) {
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

  public OrganizationalStructure organizationalStructureType(OrganizationalStructureType organizationalStructureType) {
    this.organizationalStructureType = organizationalStructureType;
    return this;
  }

   /**
   * Get organizationalStructureType
   * @return organizationalStructureType
  **/
  @ApiModelProperty(value = "")
  public OrganizationalStructureType getOrganizationalStructureType() {
    return organizationalStructureType;
  }

  public void setOrganizationalStructureType(OrganizationalStructureType organizationalStructureType) {
    this.organizationalStructureType = organizationalStructureType;
  }

  public OrganizationalStructure integrated(Boolean integrated) {
    this.integrated = integrated;
    return this;
  }

   /**
   * Realiza Validação de Papel
   * @return integrated
  **/
  @ApiModelProperty(value = "Realiza Validação de Papel")
  public Boolean isIntegrated() {
    return integrated;
  }

  public void setIntegrated(Boolean integrated) {
    this.integrated = integrated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationalStructure organizationalStructure = (OrganizationalStructure) o;
    return Objects.equals(this.parent, organizationalStructure.parent) &&
        Objects.equals(this.organizationalStructurePeople, organizationalStructure.organizationalStructurePeople) &&
        Objects.equals(this.description, organizationalStructure.description) &&
        Objects.equals(this.id, organizationalStructure.id) &&
        Objects.equals(this.organizationalStructureType, organizationalStructure.organizationalStructureType) &&
        Objects.equals(this.integrated, organizationalStructure.integrated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, organizationalStructurePeople, description, id, organizationalStructureType, integrated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationalStructure {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    organizationalStructurePeople: ").append(toIndentedString(organizationalStructurePeople)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organizationalStructureType: ").append(toIndentedString(organizationalStructureType)).append("\n");
    sb.append("    integrated: ").append(toIndentedString(integrated)).append("\n");
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

