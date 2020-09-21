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
import br.com.senior.sam.application.pojos.Device;
import br.com.senior.sam.application.pojos.VirtualLobbyAction;
import br.com.senior.sam.application.pojos.VirtualLobbyActionType;
import java.io.IOException;

/**
 * VirtualLobbyActionOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-21T14:51:01.521Z")



public class VirtualLobbyActionOutput {
  @SerializedName("actionTime")
  private Integer actionTime = null;

  @SerializedName("virtualLobbyActionType")
  private VirtualLobbyActionType virtualLobbyActionType = null;

  @SerializedName("outputDevice")
  private Device outputDevice = null;

  @SerializedName("virtualLobbyAction")
  private VirtualLobbyAction virtualLobbyAction = null;

  @SerializedName("id")
  private Integer id = null;

  public VirtualLobbyActionOutput actionTime(Integer actionTime) {
    this.actionTime = actionTime;
    return this;
  }

   /**
   * Tempo do Acionamento
   * @return actionTime
  **/
  @ApiModelProperty(value = "Tempo do Acionamento")
  public Integer getActionTime() {
    return actionTime;
  }

  public void setActionTime(Integer actionTime) {
    this.actionTime = actionTime;
  }

  public VirtualLobbyActionOutput virtualLobbyActionType(VirtualLobbyActionType virtualLobbyActionType) {
    this.virtualLobbyActionType = virtualLobbyActionType;
    return this;
  }

   /**
   * Get virtualLobbyActionType
   * @return virtualLobbyActionType
  **/
  @ApiModelProperty(value = "")
  public VirtualLobbyActionType getVirtualLobbyActionType() {
    return virtualLobbyActionType;
  }

  public void setVirtualLobbyActionType(VirtualLobbyActionType virtualLobbyActionType) {
    this.virtualLobbyActionType = virtualLobbyActionType;
  }

  public VirtualLobbyActionOutput outputDevice(Device outputDevice) {
    this.outputDevice = outputDevice;
    return this;
  }

   /**
   * Get outputDevice
   * @return outputDevice
  **/
  @ApiModelProperty(value = "")
  public Device getOutputDevice() {
    return outputDevice;
  }

  public void setOutputDevice(Device outputDevice) {
    this.outputDevice = outputDevice;
  }

  public VirtualLobbyActionOutput virtualLobbyAction(VirtualLobbyAction virtualLobbyAction) {
    this.virtualLobbyAction = virtualLobbyAction;
    return this;
  }

   /**
   * Get virtualLobbyAction
   * @return virtualLobbyAction
  **/
  @ApiModelProperty(value = "")
  public VirtualLobbyAction getVirtualLobbyAction() {
    return virtualLobbyAction;
  }

  public void setVirtualLobbyAction(VirtualLobbyAction virtualLobbyAction) {
    this.virtualLobbyAction = virtualLobbyAction;
  }

  public VirtualLobbyActionOutput id(Integer id) {
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
    VirtualLobbyActionOutput virtualLobbyActionOutput = (VirtualLobbyActionOutput) o;
    return Objects.equals(this.actionTime, virtualLobbyActionOutput.actionTime) &&
        Objects.equals(this.virtualLobbyActionType, virtualLobbyActionOutput.virtualLobbyActionType) &&
        Objects.equals(this.outputDevice, virtualLobbyActionOutput.outputDevice) &&
        Objects.equals(this.virtualLobbyAction, virtualLobbyActionOutput.virtualLobbyAction) &&
        Objects.equals(this.id, virtualLobbyActionOutput.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTime, virtualLobbyActionType, outputDevice, virtualLobbyAction, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualLobbyActionOutput {\n");
    
    sb.append("    actionTime: ").append(toIndentedString(actionTime)).append("\n");
    sb.append("    virtualLobbyActionType: ").append(toIndentedString(virtualLobbyActionType)).append("\n");
    sb.append("    outputDevice: ").append(toIndentedString(outputDevice)).append("\n");
    sb.append("    virtualLobbyAction: ").append(toIndentedString(virtualLobbyAction)).append("\n");
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

