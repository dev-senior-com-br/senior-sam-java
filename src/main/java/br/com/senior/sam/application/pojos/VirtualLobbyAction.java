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
import br.com.senior.sam.application.pojos.VirtualLobby;
import br.com.senior.sam.application.pojos.VirtualLobbyActionOutput;
import br.com.senior.sam.application.pojos.VirtualLobbyMovementType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * VirtualLobbyAction
 */




public class VirtualLobbyAction {
  @SerializedName("outputs")
  private List<VirtualLobbyActionOutput> outputs = null;

  @SerializedName("virtualLobby")
  private VirtualLobby virtualLobby = null;

  @SerializedName("virtualLobbyMovementType")
  private VirtualLobbyMovementType virtualLobbyMovementType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("isActive")
  private Boolean isActive = null;

  public VirtualLobbyAction outputs(List<VirtualLobbyActionOutput> outputs) {
    this.outputs = outputs;
    return this;
  }

  public VirtualLobbyAction addOutputsItem(VirtualLobbyActionOutput outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<VirtualLobbyActionOutput>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * Saídas do Acionamento
   * @return outputs
  **/
  @ApiModelProperty(value = "Saídas do Acionamento")
  public List<VirtualLobbyActionOutput> getOutputs() {
    return outputs;
  }

  public void setOutputs(List<VirtualLobbyActionOutput> outputs) {
    this.outputs = outputs;
  }

  public VirtualLobbyAction virtualLobby(VirtualLobby virtualLobby) {
    this.virtualLobby = virtualLobby;
    return this;
  }

   /**
   * Get virtualLobby
   * @return virtualLobby
  **/
  @ApiModelProperty(value = "")
  public VirtualLobby getVirtualLobby() {
    return virtualLobby;
  }

  public void setVirtualLobby(VirtualLobby virtualLobby) {
    this.virtualLobby = virtualLobby;
  }

  public VirtualLobbyAction virtualLobbyMovementType(VirtualLobbyMovementType virtualLobbyMovementType) {
    this.virtualLobbyMovementType = virtualLobbyMovementType;
    return this;
  }

   /**
   * Get virtualLobbyMovementType
   * @return virtualLobbyMovementType
  **/
  @ApiModelProperty(value = "")
  public VirtualLobbyMovementType getVirtualLobbyMovementType() {
    return virtualLobbyMovementType;
  }

  public void setVirtualLobbyMovementType(VirtualLobbyMovementType virtualLobbyMovementType) {
    this.virtualLobbyMovementType = virtualLobbyMovementType;
  }

  public VirtualLobbyAction name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VirtualLobbyAction id(Integer id) {
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

  public VirtualLobbyAction isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Acionamento Ativo
   * @return isActive
  **/
  @ApiModelProperty(required = true, value = "Acionamento Ativo")
  public Boolean isIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualLobbyAction virtualLobbyAction = (VirtualLobbyAction) o;
    return Objects.equals(this.outputs, virtualLobbyAction.outputs) &&
        Objects.equals(this.virtualLobby, virtualLobbyAction.virtualLobby) &&
        Objects.equals(this.virtualLobbyMovementType, virtualLobbyAction.virtualLobbyMovementType) &&
        Objects.equals(this.name, virtualLobbyAction.name) &&
        Objects.equals(this.id, virtualLobbyAction.id) &&
        Objects.equals(this.isActive, virtualLobbyAction.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputs, virtualLobby, virtualLobbyMovementType, name, id, isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualLobbyAction {\n");
    
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    virtualLobby: ").append(toIndentedString(virtualLobby)).append("\n");
    sb.append("    virtualLobbyMovementType: ").append(toIndentedString(virtualLobbyMovementType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

