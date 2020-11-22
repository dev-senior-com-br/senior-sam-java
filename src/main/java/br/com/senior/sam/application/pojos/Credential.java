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
import br.com.senior.sam.application.pojos.AccessCall;
import br.com.senior.sam.application.pojos.Biometry;
import br.com.senior.sam.application.pojos.CardCredential;
import br.com.senior.sam.application.pojos.CredentialFormat;
import br.com.senior.sam.application.pojos.CredentialOwner;
import br.com.senior.sam.application.pojos.CredentialSituation;
import br.com.senior.sam.application.pojos.CredentialType;
import br.com.senior.sam.application.pojos.Group;
import br.com.senior.sam.application.pojos.Lobby;
import br.com.senior.sam.application.pojos.Person;
import br.com.senior.sam.application.pojos.Role;
import br.com.senior.sam.application.pojos.Scheduling;
import br.com.senior.sam.application.pojos.StatusHistoric;
import br.com.senior.sam.application.pojos.Vehicle;
import br.com.senior.sam.application.pojos.VirtualLobby;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Credential
 */




public class Credential {
  @SerializedName("biometry")
  private Biometry biometry = null;

  @SerializedName("role")
  private Role role = null;

  @SerializedName("accessCall")
  private AccessCall accessCall = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  @SerializedName("credentialSituation")
  private CredentialSituation credentialSituation = null;

  @SerializedName("vehicle")
  private Vehicle vehicle = null;

  @SerializedName("credentialOwner")
  private CredentialOwner credentialOwner = null;

  @SerializedName("credentialType")
  private CredentialType credentialType = null;

  @SerializedName("visitedPerson")
  private Person visitedPerson = null;

  @SerializedName("virtualLobby")
  private VirtualLobby virtualLobby = null;

  @SerializedName("cardCredentialList")
  private List<CardCredential> cardCredentialList = null;

  @SerializedName("lobby")
  private Lobby lobby = null;

  @SerializedName("person")
  private Person person = null;

  @SerializedName("credentialFormat")
  private CredentialFormat credentialFormat = null;

  @SerializedName("scheduling")
  private Scheduling scheduling = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("provisoryCredentialReasonId")
  private Integer provisoryCredentialReasonId = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("group")
  private Group group = null;

  @SerializedName("status")
  private StatusHistoric status = null;

  public Credential biometry(Biometry biometry) {
    this.biometry = biometry;
    return this;
  }

   /**
   * Get biometry
   * @return biometry
  **/
  @ApiModelProperty(value = "")
  public Biometry getBiometry() {
    return biometry;
  }

  public void setBiometry(Biometry biometry) {
    this.biometry = biometry;
  }

  public Credential role(Role role) {
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

  public Credential accessCall(AccessCall accessCall) {
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

  public Credential endDate(OffsetDateTime endDate) {
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

  public Credential credentialSituation(CredentialSituation credentialSituation) {
    this.credentialSituation = credentialSituation;
    return this;
  }

   /**
   * Get credentialSituation
   * @return credentialSituation
  **/
  @ApiModelProperty(required = true, value = "")
  public CredentialSituation getCredentialSituation() {
    return credentialSituation;
  }

  public void setCredentialSituation(CredentialSituation credentialSituation) {
    this.credentialSituation = credentialSituation;
  }

  public Credential vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Get vehicle
   * @return vehicle
  **/
  @ApiModelProperty(value = "")
  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Credential credentialOwner(CredentialOwner credentialOwner) {
    this.credentialOwner = credentialOwner;
    return this;
  }

   /**
   * Get credentialOwner
   * @return credentialOwner
  **/
  @ApiModelProperty(required = true, value = "")
  public CredentialOwner getCredentialOwner() {
    return credentialOwner;
  }

  public void setCredentialOwner(CredentialOwner credentialOwner) {
    this.credentialOwner = credentialOwner;
  }

  public Credential credentialType(CredentialType credentialType) {
    this.credentialType = credentialType;
    return this;
  }

   /**
   * Get credentialType
   * @return credentialType
  **/
  @ApiModelProperty(required = true, value = "")
  public CredentialType getCredentialType() {
    return credentialType;
  }

  public void setCredentialType(CredentialType credentialType) {
    this.credentialType = credentialType;
  }

  public Credential visitedPerson(Person visitedPerson) {
    this.visitedPerson = visitedPerson;
    return this;
  }

   /**
   * Get visitedPerson
   * @return visitedPerson
  **/
  @ApiModelProperty(value = "")
  public Person getVisitedPerson() {
    return visitedPerson;
  }

  public void setVisitedPerson(Person visitedPerson) {
    this.visitedPerson = visitedPerson;
  }

  public Credential virtualLobby(VirtualLobby virtualLobby) {
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

  public Credential cardCredentialList(List<CardCredential> cardCredentialList) {
    this.cardCredentialList = cardCredentialList;
    return this;
  }

  public Credential addCardCredentialListItem(CardCredential cardCredentialListItem) {
    if (this.cardCredentialList == null) {
      this.cardCredentialList = new ArrayList<CardCredential>();
    }
    this.cardCredentialList.add(cardCredentialListItem);
    return this;
  }

   /**
   * Credênciais de Cartão
   * @return cardCredentialList
  **/
  @ApiModelProperty(value = "Credênciais de Cartão")
  public List<CardCredential> getCardCredentialList() {
    return cardCredentialList;
  }

  public void setCardCredentialList(List<CardCredential> cardCredentialList) {
    this.cardCredentialList = cardCredentialList;
  }

  public Credential lobby(Lobby lobby) {
    this.lobby = lobby;
    return this;
  }

   /**
   * Get lobby
   * @return lobby
  **/
  @ApiModelProperty(value = "")
  public Lobby getLobby() {
    return lobby;
  }

  public void setLobby(Lobby lobby) {
    this.lobby = lobby;
  }

  public Credential person(Person person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @ApiModelProperty(value = "")
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Credential credentialFormat(CredentialFormat credentialFormat) {
    this.credentialFormat = credentialFormat;
    return this;
  }

   /**
   * Get credentialFormat
   * @return credentialFormat
  **/
  @ApiModelProperty(required = true, value = "")
  public CredentialFormat getCredentialFormat() {
    return credentialFormat;
  }

  public void setCredentialFormat(CredentialFormat credentialFormat) {
    this.credentialFormat = credentialFormat;
  }

  public Credential scheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/
  @ApiModelProperty(value = "")
  public Scheduling getScheduling() {
    return scheduling;
  }

  public void setScheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
  }

  public Credential id(Integer id) {
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

  public Credential provisoryCredentialReasonId(Integer provisoryCredentialReasonId) {
    this.provisoryCredentialReasonId = provisoryCredentialReasonId;
    return this;
  }

   /**
   * ID do Motivo da Credencial Provisória
   * @return provisoryCredentialReasonId
  **/
  @ApiModelProperty(value = "ID do Motivo da Credencial Provisória")
  public Integer getProvisoryCredentialReasonId() {
    return provisoryCredentialReasonId;
  }

  public void setProvisoryCredentialReasonId(Integer provisoryCredentialReasonId) {
    this.provisoryCredentialReasonId = provisoryCredentialReasonId;
  }

  public Credential startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Data Início
   * @return startDate
  **/
  @ApiModelProperty(required = true, value = "Data Início")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public Credential group(Group group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public Credential status(StatusHistoric status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public StatusHistoric getStatus() {
    return status;
  }

  public void setStatus(StatusHistoric status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credential credential = (Credential) o;
    return Objects.equals(this.biometry, credential.biometry) &&
        Objects.equals(this.role, credential.role) &&
        Objects.equals(this.accessCall, credential.accessCall) &&
        Objects.equals(this.endDate, credential.endDate) &&
        Objects.equals(this.credentialSituation, credential.credentialSituation) &&
        Objects.equals(this.vehicle, credential.vehicle) &&
        Objects.equals(this.credentialOwner, credential.credentialOwner) &&
        Objects.equals(this.credentialType, credential.credentialType) &&
        Objects.equals(this.visitedPerson, credential.visitedPerson) &&
        Objects.equals(this.virtualLobby, credential.virtualLobby) &&
        Objects.equals(this.cardCredentialList, credential.cardCredentialList) &&
        Objects.equals(this.lobby, credential.lobby) &&
        Objects.equals(this.person, credential.person) &&
        Objects.equals(this.credentialFormat, credential.credentialFormat) &&
        Objects.equals(this.scheduling, credential.scheduling) &&
        Objects.equals(this.id, credential.id) &&
        Objects.equals(this.provisoryCredentialReasonId, credential.provisoryCredentialReasonId) &&
        Objects.equals(this.startDate, credential.startDate) &&
        Objects.equals(this.group, credential.group) &&
        Objects.equals(this.status, credential.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biometry, role, accessCall, endDate, credentialSituation, vehicle, credentialOwner, credentialType, visitedPerson, virtualLobby, cardCredentialList, lobby, person, credentialFormat, scheduling, id, provisoryCredentialReasonId, startDate, group, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credential {\n");
    
    sb.append("    biometry: ").append(toIndentedString(biometry)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    accessCall: ").append(toIndentedString(accessCall)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    credentialSituation: ").append(toIndentedString(credentialSituation)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    credentialOwner: ").append(toIndentedString(credentialOwner)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    visitedPerson: ").append(toIndentedString(visitedPerson)).append("\n");
    sb.append("    virtualLobby: ").append(toIndentedString(virtualLobby)).append("\n");
    sb.append("    cardCredentialList: ").append(toIndentedString(cardCredentialList)).append("\n");
    sb.append("    lobby: ").append(toIndentedString(lobby)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    credentialFormat: ").append(toIndentedString(credentialFormat)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provisoryCredentialReasonId: ").append(toIndentedString(provisoryCredentialReasonId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

