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
import br.com.senior.sam.application.pojos.AccessCallOrigin;
import br.com.senior.sam.application.pojos.AccessCallStatus;
import br.com.senior.sam.application.pojos.InputDeviceAccessCall;
import br.com.senior.sam.application.pojos.ReaderDeviceAccessCall;
import br.com.senior.sam.application.pojos.VirtualLobby;
import br.com.senior.sam.application.pojos.VirtualLobbyMovement;
import br.com.senior.sam.application.pojos.VirtualLobbyMovementType;
import br.com.senior.sam.application.pojos.VisitAccessCall;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * AccessCall
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-28T14:57:01.350Z")



public class AccessCall {
  @SerializedName("visitAccessCall")
  private VisitAccessCall visitAccessCall = null;

  @SerializedName("accessCallOrigin")
  private AccessCallOrigin accessCallOrigin = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("inputDeviceAccessCall")
  private InputDeviceAccessCall inputDeviceAccessCall = null;

  @SerializedName("creationDate")
  private OffsetDateTime creationDate = null;

  @SerializedName("accessCallStatus")
  private AccessCallStatus accessCallStatus = null;

  @SerializedName("userName")
  private String userName = null;

  @SerializedName("virtualLobby")
  private VirtualLobby virtualLobby = null;

  @SerializedName("virtualLobbyMovementType")
  private VirtualLobbyMovementType virtualLobbyMovementType = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("readerDeviceAccessCall")
  private ReaderDeviceAccessCall readerDeviceAccessCall = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("virtualLobbyMovement")
  private VirtualLobbyMovement virtualLobbyMovement = null;

  public AccessCall visitAccessCall(VisitAccessCall visitAccessCall) {
    this.visitAccessCall = visitAccessCall;
    return this;
  }

   /**
   * Get visitAccessCall
   * @return visitAccessCall
  **/
  @ApiModelProperty(value = "")
  public VisitAccessCall getVisitAccessCall() {
    return visitAccessCall;
  }

  public void setVisitAccessCall(VisitAccessCall visitAccessCall) {
    this.visitAccessCall = visitAccessCall;
  }

  public AccessCall accessCallOrigin(AccessCallOrigin accessCallOrigin) {
    this.accessCallOrigin = accessCallOrigin;
    return this;
  }

   /**
   * Get accessCallOrigin
   * @return accessCallOrigin
  **/
  @ApiModelProperty(value = "")
  public AccessCallOrigin getAccessCallOrigin() {
    return accessCallOrigin;
  }

  public void setAccessCallOrigin(AccessCallOrigin accessCallOrigin) {
    this.accessCallOrigin = accessCallOrigin;
  }

  public AccessCall endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Data Fim
   * @return endDate
  **/
  @ApiModelProperty(value = "Data Fim")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public AccessCall inputDeviceAccessCall(InputDeviceAccessCall inputDeviceAccessCall) {
    this.inputDeviceAccessCall = inputDeviceAccessCall;
    return this;
  }

   /**
   * Get inputDeviceAccessCall
   * @return inputDeviceAccessCall
  **/
  @ApiModelProperty(value = "")
  public InputDeviceAccessCall getInputDeviceAccessCall() {
    return inputDeviceAccessCall;
  }

  public void setInputDeviceAccessCall(InputDeviceAccessCall inputDeviceAccessCall) {
    this.inputDeviceAccessCall = inputDeviceAccessCall;
  }

  public AccessCall creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Data da Criação
   * @return creationDate
  **/
  @ApiModelProperty(value = "Data da Criação")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public AccessCall accessCallStatus(AccessCallStatus accessCallStatus) {
    this.accessCallStatus = accessCallStatus;
    return this;
  }

   /**
   * Get accessCallStatus
   * @return accessCallStatus
  **/
  @ApiModelProperty(value = "")
  public AccessCallStatus getAccessCallStatus() {
    return accessCallStatus;
  }

  public void setAccessCallStatus(AccessCallStatus accessCallStatus) {
    this.accessCallStatus = accessCallStatus;
  }

  public AccessCall userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Nome usuário
   * @return userName
  **/
  @ApiModelProperty(value = "Nome usuário")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public AccessCall virtualLobby(VirtualLobby virtualLobby) {
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

  public AccessCall virtualLobbyMovementType(VirtualLobbyMovementType virtualLobbyMovementType) {
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

  public AccessCall id(Integer id) {
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

  public AccessCall readerDeviceAccessCall(ReaderDeviceAccessCall readerDeviceAccessCall) {
    this.readerDeviceAccessCall = readerDeviceAccessCall;
    return this;
  }

   /**
   * Get readerDeviceAccessCall
   * @return readerDeviceAccessCall
  **/
  @ApiModelProperty(value = "")
  public ReaderDeviceAccessCall getReaderDeviceAccessCall() {
    return readerDeviceAccessCall;
  }

  public void setReaderDeviceAccessCall(ReaderDeviceAccessCall readerDeviceAccessCall) {
    this.readerDeviceAccessCall = readerDeviceAccessCall;
  }

  public AccessCall startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Data Início
   * @return startDate
  **/
  @ApiModelProperty(value = "Data Início")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public AccessCall virtualLobbyMovement(VirtualLobbyMovement virtualLobbyMovement) {
    this.virtualLobbyMovement = virtualLobbyMovement;
    return this;
  }

   /**
   * Get virtualLobbyMovement
   * @return virtualLobbyMovement
  **/
  @ApiModelProperty(value = "")
  public VirtualLobbyMovement getVirtualLobbyMovement() {
    return virtualLobbyMovement;
  }

  public void setVirtualLobbyMovement(VirtualLobbyMovement virtualLobbyMovement) {
    this.virtualLobbyMovement = virtualLobbyMovement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessCall accessCall = (AccessCall) o;
    return Objects.equals(this.visitAccessCall, accessCall.visitAccessCall) &&
        Objects.equals(this.accessCallOrigin, accessCall.accessCallOrigin) &&
        Objects.equals(this.endDate, accessCall.endDate) &&
        Objects.equals(this.inputDeviceAccessCall, accessCall.inputDeviceAccessCall) &&
        Objects.equals(this.creationDate, accessCall.creationDate) &&
        Objects.equals(this.accessCallStatus, accessCall.accessCallStatus) &&
        Objects.equals(this.userName, accessCall.userName) &&
        Objects.equals(this.virtualLobby, accessCall.virtualLobby) &&
        Objects.equals(this.virtualLobbyMovementType, accessCall.virtualLobbyMovementType) &&
        Objects.equals(this.id, accessCall.id) &&
        Objects.equals(this.readerDeviceAccessCall, accessCall.readerDeviceAccessCall) &&
        Objects.equals(this.startDate, accessCall.startDate) &&
        Objects.equals(this.virtualLobbyMovement, accessCall.virtualLobbyMovement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visitAccessCall, accessCallOrigin, endDate, inputDeviceAccessCall, creationDate, accessCallStatus, userName, virtualLobby, virtualLobbyMovementType, id, readerDeviceAccessCall, startDate, virtualLobbyMovement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessCall {\n");
    
    sb.append("    visitAccessCall: ").append(toIndentedString(visitAccessCall)).append("\n");
    sb.append("    accessCallOrigin: ").append(toIndentedString(accessCallOrigin)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    inputDeviceAccessCall: ").append(toIndentedString(inputDeviceAccessCall)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    accessCallStatus: ").append(toIndentedString(accessCallStatus)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    virtualLobby: ").append(toIndentedString(virtualLobby)).append("\n");
    sb.append("    virtualLobbyMovementType: ").append(toIndentedString(virtualLobbyMovementType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    readerDeviceAccessCall: ").append(toIndentedString(readerDeviceAccessCall)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    virtualLobbyMovement: ").append(toIndentedString(virtualLobbyMovement)).append("\n");
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

