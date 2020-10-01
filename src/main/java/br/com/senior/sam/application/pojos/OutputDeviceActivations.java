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
import br.com.senior.sam.application.pojos.InputDevice;
import br.com.senior.sam.application.pojos.OutputDevice;
import java.io.IOException;

/**
 * OutputDeviceActivations
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-01T20:35:37.706Z")



public class OutputDeviceActivations {
  @SerializedName("outputDevice")
  private OutputDevice outputDevice = null;

  @SerializedName("inputDevice")
  private InputDevice inputDevice = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("activationTime")
  private Integer activationTime = null;

  public OutputDeviceActivations outputDevice(OutputDevice outputDevice) {
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

  public OutputDeviceActivations inputDevice(InputDevice inputDevice) {
    this.inputDevice = inputDevice;
    return this;
  }

   /**
   * Get inputDevice
   * @return inputDevice
  **/
  @ApiModelProperty(value = "")
  public InputDevice getInputDevice() {
    return inputDevice;
  }

  public void setInputDevice(InputDevice inputDevice) {
    this.inputDevice = inputDevice;
  }

  public OutputDeviceActivations id(Integer id) {
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

  public OutputDeviceActivations activationTime(Integer activationTime) {
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
    OutputDeviceActivations outputDeviceActivations = (OutputDeviceActivations) o;
    return Objects.equals(this.outputDevice, outputDeviceActivations.outputDevice) &&
        Objects.equals(this.inputDevice, outputDeviceActivations.inputDevice) &&
        Objects.equals(this.id, outputDeviceActivations.id) &&
        Objects.equals(this.activationTime, outputDeviceActivations.activationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputDevice, inputDevice, id, activationTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputDeviceActivations {\n");
    
    sb.append("    outputDevice: ").append(toIndentedString(outputDevice)).append("\n");
    sb.append("    inputDevice: ").append(toIndentedString(inputDevice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

