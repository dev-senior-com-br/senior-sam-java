/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.8.1
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
import br.com.senior.sam.application.pojos.PhysicalLocation;
import br.com.senior.sam.application.pojos.Role;
import java.io.IOException;

/**
 * RoleAccessPhysicalLocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-15T12:45:04.275Z")



public class RoleAccessPhysicalLocation {
  @SerializedName("role")
  private Role role = null;

  @SerializedName("physicalLocation")
  private PhysicalLocation physicalLocation = null;

  @SerializedName("id")
  private Integer id = null;

  public RoleAccessPhysicalLocation role(Role role) {
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

  public RoleAccessPhysicalLocation physicalLocation(PhysicalLocation physicalLocation) {
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

  public RoleAccessPhysicalLocation id(Integer id) {
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
    RoleAccessPhysicalLocation roleAccessPhysicalLocation = (RoleAccessPhysicalLocation) o;
    return Objects.equals(this.role, roleAccessPhysicalLocation.role) &&
        Objects.equals(this.physicalLocation, roleAccessPhysicalLocation.physicalLocation) &&
        Objects.equals(this.id, roleAccessPhysicalLocation.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, physicalLocation, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleAccessPhysicalLocation {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
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

