/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 *
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
import br.com.senior.sam.application.pojos.Group;
import br.com.senior.sam.application.pojos.GroupPerson;
import br.com.senior.sam.application.pojos.PhysicalLocation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Group
 */




public class Group {
  @SerializedName("parent")
  private Group parent = null;

  @SerializedName("physicalLocation")
  private PhysicalLocation physicalLocation = null;

  @SerializedName("parkingSpaceInUse")
  private Integer parkingSpaceInUse = null;

  @SerializedName("fullHierarchicalPath")
  private String fullHierarchicalPath = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("people")
  private List<GroupPerson> people = null;

  @SerializedName("parkingSpace")
  private Integer parkingSpace = null;

  public Group parent(Group parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public Group getParent() {
    return parent;
  }

  public void setParent(Group parent) {
    this.parent = parent;
  }

  public Group physicalLocation(PhysicalLocation physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }

   /**
   * Get physicalLocation
   * @return physicalLocation
  **/
  @ApiModelProperty(value = "")
  public PhysicalLocation getPhysicalLocation() {
    return physicalLocation;
  }

  public void setPhysicalLocation(PhysicalLocation physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  public Group parkingSpaceInUse(Integer parkingSpaceInUse) {
    this.parkingSpaceInUse = parkingSpaceInUse;
    return this;
  }

   /**
   * Vaga de Estacionamento em Uso
   * @return parkingSpaceInUse
  **/
  @ApiModelProperty(required = true, value = "Vaga de Estacionamento em Uso")
  public Integer getParkingSpaceInUse() {
    return parkingSpaceInUse;
  }

  public void setParkingSpaceInUse(Integer parkingSpaceInUse) {
    this.parkingSpaceInUse = parkingSpaceInUse;
  }

  public Group fullHierarchicalPath(String fullHierarchicalPath) {
    this.fullHierarchicalPath = fullHierarchicalPath;
    return this;
  }

   /**
   * Caminho hierárquico completo
   * @return fullHierarchicalPath
  **/
  @ApiModelProperty(value = "Caminho hierárquico completo")
  public String getFullHierarchicalPath() {
    return fullHierarchicalPath;
  }

  public void setFullHierarchicalPath(String fullHierarchicalPath) {
    this.fullHierarchicalPath = fullHierarchicalPath;
  }

  public Group name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome do Grupo
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome do Grupo")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Group id(Integer id) {
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

  public Group people(List<GroupPerson> people) {
    this.people = people;
    return this;
  }

  public Group addPeopleItem(GroupPerson peopleItem) {
    if (this.people == null) {
      this.people = new ArrayList<GroupPerson>();
    }
    this.people.add(peopleItem);
    return this;
  }

   /**
   * Pessoas do Grupo
   * @return people
  **/
  @ApiModelProperty(value = "Pessoas do Grupo")
  public List<GroupPerson> getPeople() {
    return people;
  }

  public void setPeople(List<GroupPerson> people) {
    this.people = people;
  }

  public Group parkingSpace(Integer parkingSpace) {
    this.parkingSpace = parkingSpace;
    return this;
  }

   /**
   * Vaga de Estacionamento
   * @return parkingSpace
  **/
  @ApiModelProperty(required = true, value = "Vaga de Estacionamento")
  public Integer getParkingSpace() {
    return parkingSpace;
  }

  public void setParkingSpace(Integer parkingSpace) {
    this.parkingSpace = parkingSpace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.parent, group.parent) &&
        Objects.equals(this.physicalLocation, group.physicalLocation) &&
        Objects.equals(this.parkingSpaceInUse, group.parkingSpaceInUse) &&
        Objects.equals(this.fullHierarchicalPath, group.fullHierarchicalPath) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.id, group.id) &&
        Objects.equals(this.people, group.people) &&
        Objects.equals(this.parkingSpace, group.parkingSpace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, physicalLocation, parkingSpaceInUse, fullHierarchicalPath, name, id, people, parkingSpace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Group {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    parkingSpaceInUse: ").append(toIndentedString(parkingSpaceInUse)).append("\n");
    sb.append("    fullHierarchicalPath: ").append(toIndentedString(fullHierarchicalPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    people: ").append(toIndentedString(people)).append("\n");
    sb.append("    parkingSpace: ").append(toIndentedString(parkingSpace)).append("\n");
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

