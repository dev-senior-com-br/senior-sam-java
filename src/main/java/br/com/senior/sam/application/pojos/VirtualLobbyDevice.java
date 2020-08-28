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
import br.com.senior.sam.application.pojos.CallGenerationType;
import br.com.senior.sam.application.pojos.Device;
import br.com.senior.sam.application.pojos.VirtualLobby;
import br.com.senior.sam.application.pojos.VirtualLobbyAction;
import java.io.IOException;

/**
 * VirtualLobbyDevice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-28T14:57:01.350Z")



public class VirtualLobbyDevice {
  @SerializedName("virtualLobby")
  private VirtualLobby virtualLobby = null;

  @SerializedName("virtualLobbyAction")
  private VirtualLobbyAction virtualLobbyAction = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("device")
  private Device device = null;

  @SerializedName("callGenerationType")
  private CallGenerationType callGenerationType = null;

  public VirtualLobbyDevice virtualLobby(VirtualLobby virtualLobby) {
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

  public VirtualLobbyDevice virtualLobbyAction(VirtualLobbyAction virtualLobbyAction) {
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

  public VirtualLobbyDevice id(Integer id) {
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

  public VirtualLobbyDevice device(Device device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @ApiModelProperty(value = "")
  public Device getDevice() {
    return device;
  }

  public void setDevice(Device device) {
    this.device = device;
  }

  public VirtualLobbyDevice callGenerationType(CallGenerationType callGenerationType) {
    this.callGenerationType = callGenerationType;
    return this;
  }

   /**
   * Get callGenerationType
   * @return callGenerationType
  **/
  @ApiModelProperty(value = "")
  public CallGenerationType getCallGenerationType() {
    return callGenerationType;
  }

  public void setCallGenerationType(CallGenerationType callGenerationType) {
    this.callGenerationType = callGenerationType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualLobbyDevice virtualLobbyDevice = (VirtualLobbyDevice) o;
    return Objects.equals(this.virtualLobby, virtualLobbyDevice.virtualLobby) &&
        Objects.equals(this.virtualLobbyAction, virtualLobbyDevice.virtualLobbyAction) &&
        Objects.equals(this.id, virtualLobbyDevice.id) &&
        Objects.equals(this.device, virtualLobbyDevice.device) &&
        Objects.equals(this.callGenerationType, virtualLobbyDevice.callGenerationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(virtualLobby, virtualLobbyAction, id, device, callGenerationType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualLobbyDevice {\n");
    
    sb.append("    virtualLobby: ").append(toIndentedString(virtualLobby)).append("\n");
    sb.append("    virtualLobbyAction: ").append(toIndentedString(virtualLobbyAction)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    callGenerationType: ").append(toIndentedString(callGenerationType)).append("\n");
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

