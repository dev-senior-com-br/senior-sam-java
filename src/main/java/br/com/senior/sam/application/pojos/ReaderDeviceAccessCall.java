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
import br.com.senior.sam.application.pojos.AccessCall;
import br.com.senior.sam.application.pojos.AccessEventType;
import br.com.senior.sam.application.pojos.Credential;
import br.com.senior.sam.application.pojos.ReaderDevice;
import java.io.IOException;

/**
 * ReaderDeviceAccessCall
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-28T14:57:01.350Z")



public class ReaderDeviceAccessCall {
  @SerializedName("accessCall")
  private AccessCall accessCall = null;

  @SerializedName("credential")
  private Credential credential = null;

  @SerializedName("accessEventType")
  private AccessEventType accessEventType = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("readerDevice")
  private ReaderDevice readerDevice = null;

  public ReaderDeviceAccessCall accessCall(AccessCall accessCall) {
    this.accessCall = accessCall;
    return this;
  }

   /**
   * Get accessCall
   * @return accessCall
  **/
  @ApiModelProperty(value = "")
  public AccessCall getAccessCall() {
    return accessCall;
  }

  public void setAccessCall(AccessCall accessCall) {
    this.accessCall = accessCall;
  }

  public ReaderDeviceAccessCall credential(Credential credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @ApiModelProperty(value = "")
  public Credential getCredential() {
    return credential;
  }

  public void setCredential(Credential credential) {
    this.credential = credential;
  }

  public ReaderDeviceAccessCall accessEventType(AccessEventType accessEventType) {
    this.accessEventType = accessEventType;
    return this;
  }

   /**
   * Get accessEventType
   * @return accessEventType
  **/
  @ApiModelProperty(value = "")
  public AccessEventType getAccessEventType() {
    return accessEventType;
  }

  public void setAccessEventType(AccessEventType accessEventType) {
    this.accessEventType = accessEventType;
  }

  public ReaderDeviceAccessCall id(Integer id) {
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

  public ReaderDeviceAccessCall readerDevice(ReaderDevice readerDevice) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReaderDeviceAccessCall readerDeviceAccessCall = (ReaderDeviceAccessCall) o;
    return Objects.equals(this.accessCall, readerDeviceAccessCall.accessCall) &&
        Objects.equals(this.credential, readerDeviceAccessCall.credential) &&
        Objects.equals(this.accessEventType, readerDeviceAccessCall.accessEventType) &&
        Objects.equals(this.id, readerDeviceAccessCall.id) &&
        Objects.equals(this.readerDevice, readerDeviceAccessCall.readerDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessCall, credential, accessEventType, id, readerDevice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReaderDeviceAccessCall {\n");
    
    sb.append("    accessCall: ").append(toIndentedString(accessCall)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    accessEventType: ").append(toIndentedString(accessEventType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    readerDevice: ").append(toIndentedString(readerDevice)).append("\n");
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

