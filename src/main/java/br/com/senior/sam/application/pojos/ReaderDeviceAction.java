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
import br.com.senior.sam.application.pojos.AccessType;
import br.com.senior.sam.application.pojos.OutputDevice;
import br.com.senior.sam.application.pojos.ReaderDevice;
import java.io.IOException;

/**
 * ReaderDeviceAction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-14T16:45:01.743Z")



public class ReaderDeviceAction {
  @SerializedName("accessType")
  private AccessType accessType = null;

  @SerializedName("outputDevice")
  private OutputDevice outputDevice = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("readerDevice")
  private ReaderDevice readerDevice = null;

  @SerializedName("activationTime")
  private Integer activationTime = null;

  public ReaderDeviceAction accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @ApiModelProperty(value = "")
  public AccessType getAccessType() {
    return accessType;
  }

  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }

  public ReaderDeviceAction outputDevice(OutputDevice outputDevice) {
    this.outputDevice = outputDevice;
    return this;
  }

   /**
   * Get outputDevice
   * @return outputDevice
  **/
  @ApiModelProperty(value = "")
  public OutputDevice getOutputDevice() {
    return outputDevice;
  }

  public void setOutputDevice(OutputDevice outputDevice) {
    this.outputDevice = outputDevice;
  }

  public ReaderDeviceAction id(Integer id) {
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

  public ReaderDeviceAction readerDevice(ReaderDevice readerDevice) {
    this.readerDevice = readerDevice;
    return this;
  }

   /**
   * Get readerDevice
   * @return readerDevice
  **/
  @ApiModelProperty(value = "")
  public ReaderDevice getReaderDevice() {
    return readerDevice;
  }

  public void setReaderDevice(ReaderDevice readerDevice) {
    this.readerDevice = readerDevice;
  }

  public ReaderDeviceAction activationTime(Integer activationTime) {
    this.activationTime = activationTime;
    return this;
  }

   /**
   * Tempo do Acionamento
   * @return activationTime
  **/
  @ApiModelProperty(value = "Tempo do Acionamento")
  public Integer getActivationTime() {
    return activationTime;
  }

  public void setActivationTime(Integer activationTime) {
    this.activationTime = activationTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReaderDeviceAction readerDeviceAction = (ReaderDeviceAction) o;
    return Objects.equals(this.accessType, readerDeviceAction.accessType) &&
        Objects.equals(this.outputDevice, readerDeviceAction.outputDevice) &&
        Objects.equals(this.id, readerDeviceAction.id) &&
        Objects.equals(this.readerDevice, readerDeviceAction.readerDevice) &&
        Objects.equals(this.activationTime, readerDeviceAction.activationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, outputDevice, id, readerDevice, activationTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReaderDeviceAction {\n");
    
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    outputDevice: ").append(toIndentedString(outputDevice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    readerDevice: ").append(toIndentedString(readerDevice)).append("\n");
    sb.append("    activationTime: ").append(toIndentedString(activationTime)).append("\n");
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

