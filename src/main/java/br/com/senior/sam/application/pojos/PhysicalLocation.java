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
import br.com.senior.sam.application.pojos.Blueprint;
import br.com.senior.sam.application.pojos.LocalTimezone;
import br.com.senior.sam.application.pojos.PhysicalLocationStatus;
import br.com.senior.sam.application.pojos.RoleAccessPhysicalLocation;
import br.com.senior.sam.application.pojos.TimeSlotList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PhysicalLocation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-28T14:57:01.350Z")



public class PhysicalLocation {
  @SerializedName("roleAccessPhysicalLocations")
  private List<RoleAccessPhysicalLocation> roleAccessPhysicalLocations = null;

  @SerializedName("parent")
  private Integer parent = null;

  @SerializedName("antiPassbackValidation")
  private Boolean antiPassbackValidation = null;

  @SerializedName("checkInBetweenWorkdays")
  private Boolean checkInBetweenWorkdays = null;

  @SerializedName("slotTimeRoleValidation")
  private Boolean slotTimeRoleValidation = null;

  @SerializedName("antiPassbackTimeout")
  private Integer antiPassbackTimeout = null;

  @SerializedName("timeSlotList")
  private TimeSlotList timeSlotList = null;

  @SerializedName("localTimezone")
  private LocalTimezone localTimezone = null;

  @SerializedName("externalPhysicalLocation")
  private Boolean externalPhysicalLocation = null;

  @SerializedName("blueprint")
  private Blueprint blueprint = null;

  @SerializedName("customValidationUrl")
  private String customValidationUrl = null;

  @SerializedName("roleSuspensionValidation")
  private Boolean roleSuspensionValidation = null;

  @SerializedName("slotTimePhysicalValidation")
  private Boolean slotTimePhysicalValidation = null;

  @SerializedName("physicalLocationAuthorizerValidation")
  private Boolean physicalLocationAuthorizerValidation = null;

  @SerializedName("roleAuthorizerValidation")
  private Boolean roleAuthorizerValidation = null;

  @SerializedName("accessCreditValidation")
  private Boolean accessCreditValidation = null;

  @SerializedName("roleValidation")
  private Boolean roleValidation = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("customValidation")
  private Boolean customValidation = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("levelValidation")
  private Boolean levelValidation = null;

  @SerializedName("capacityValidation")
  private Boolean capacityValidation = null;

  @SerializedName("status")
  private PhysicalLocationStatus status = null;

  public PhysicalLocation roleAccessPhysicalLocations(List<RoleAccessPhysicalLocation> roleAccessPhysicalLocations) {
    this.roleAccessPhysicalLocations = roleAccessPhysicalLocations;
    return this;
  }

  public PhysicalLocation addRoleAccessPhysicalLocationsItem(RoleAccessPhysicalLocation roleAccessPhysicalLocationsItem) {
    if (this.roleAccessPhysicalLocations == null) {
      this.roleAccessPhysicalLocations = new ArrayList<RoleAccessPhysicalLocation>();
    }
    this.roleAccessPhysicalLocations.add(roleAccessPhysicalLocationsItem);
    return this;
  }

   /**
   * Papel Acessa Local Físico
   * @return roleAccessPhysicalLocations
  **/
  @ApiModelProperty(value = "Papel Acessa Local Físico")
  public List<RoleAccessPhysicalLocation> getRoleAccessPhysicalLocations() {
    return roleAccessPhysicalLocations;
  }

  public void setRoleAccessPhysicalLocations(List<RoleAccessPhysicalLocation> roleAccessPhysicalLocations) {
    this.roleAccessPhysicalLocations = roleAccessPhysicalLocations;
  }

  public PhysicalLocation parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Local Físico Pai
   * @return parent
  **/
  @ApiModelProperty(value = "Local Físico Pai")
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public PhysicalLocation antiPassbackValidation(Boolean antiPassbackValidation) {
    this.antiPassbackValidation = antiPassbackValidation;
    return this;
  }

   /**
   * Realiza Validação da Antidupla
   * @return antiPassbackValidation
  **/
  @ApiModelProperty(value = "Realiza Validação da Antidupla")
  public Boolean isAntiPassbackValidation() {
    return antiPassbackValidation;
  }

  public void setAntiPassbackValidation(Boolean antiPassbackValidation) {
    this.antiPassbackValidation = antiPassbackValidation;
  }

  public PhysicalLocation checkInBetweenWorkdays(Boolean checkInBetweenWorkdays) {
    this.checkInBetweenWorkdays = checkInBetweenWorkdays;
    return this;
  }

   /**
   * Realiza validação de interjonada
   * @return checkInBetweenWorkdays
  **/
  @ApiModelProperty(value = "Realiza validação de interjonada")
  public Boolean isCheckInBetweenWorkdays() {
    return checkInBetweenWorkdays;
  }

  public void setCheckInBetweenWorkdays(Boolean checkInBetweenWorkdays) {
    this.checkInBetweenWorkdays = checkInBetweenWorkdays;
  }

  public PhysicalLocation slotTimeRoleValidation(Boolean slotTimeRoleValidation) {
    this.slotTimeRoleValidation = slotTimeRoleValidation;
    return this;
  }

   /**
   * Realiza Validação da Faixa Horária do Papel
   * @return slotTimeRoleValidation
  **/
  @ApiModelProperty(value = "Realiza Validação da Faixa Horária do Papel")
  public Boolean isSlotTimeRoleValidation() {
    return slotTimeRoleValidation;
  }

  public void setSlotTimeRoleValidation(Boolean slotTimeRoleValidation) {
    this.slotTimeRoleValidation = slotTimeRoleValidation;
  }

  public PhysicalLocation antiPassbackTimeout(Integer antiPassbackTimeout) {
    this.antiPassbackTimeout = antiPassbackTimeout;
    return this;
  }

   /**
   * Tempo da Antidupla
   * @return antiPassbackTimeout
  **/
  @ApiModelProperty(value = "Tempo da Antidupla")
  public Integer getAntiPassbackTimeout() {
    return antiPassbackTimeout;
  }

  public void setAntiPassbackTimeout(Integer antiPassbackTimeout) {
    this.antiPassbackTimeout = antiPassbackTimeout;
  }

  public PhysicalLocation timeSlotList(TimeSlotList timeSlotList) {
    this.timeSlotList = timeSlotList;
    return this;
  }

   /**
   * Get timeSlotList
   * @return timeSlotList
  **/
  @ApiModelProperty(value = "")
  public TimeSlotList getTimeSlotList() {
    return timeSlotList;
  }

  public void setTimeSlotList(TimeSlotList timeSlotList) {
    this.timeSlotList = timeSlotList;
  }

  public PhysicalLocation localTimezone(LocalTimezone localTimezone) {
    this.localTimezone = localTimezone;
    return this;
  }

   /**
   * Get localTimezone
   * @return localTimezone
  **/
  @ApiModelProperty(value = "")
  public LocalTimezone getLocalTimezone() {
    return localTimezone;
  }

  public void setLocalTimezone(LocalTimezone localTimezone) {
    this.localTimezone = localTimezone;
  }

  public PhysicalLocation externalPhysicalLocation(Boolean externalPhysicalLocation) {
    this.externalPhysicalLocation = externalPhysicalLocation;
    return this;
  }

   /**
   * Local Físico Externo
   * @return externalPhysicalLocation
  **/
  @ApiModelProperty(value = "Local Físico Externo")
  public Boolean isExternalPhysicalLocation() {
    return externalPhysicalLocation;
  }

  public void setExternalPhysicalLocation(Boolean externalPhysicalLocation) {
    this.externalPhysicalLocation = externalPhysicalLocation;
  }

  public PhysicalLocation blueprint(Blueprint blueprint) {
    this.blueprint = blueprint;
    return this;
  }

   /**
   * Get blueprint
   * @return blueprint
  **/
  @ApiModelProperty(value = "")
  public Blueprint getBlueprint() {
    return blueprint;
  }

  public void setBlueprint(Blueprint blueprint) {
    this.blueprint = blueprint;
  }

  public PhysicalLocation customValidationUrl(String customValidationUrl) {
    this.customValidationUrl = customValidationUrl;
    return this;
  }

   /**
   * Url da Validação Customizada
   * @return customValidationUrl
  **/
  @ApiModelProperty(value = "Url da Validação Customizada")
  public String getCustomValidationUrl() {
    return customValidationUrl;
  }

  public void setCustomValidationUrl(String customValidationUrl) {
    this.customValidationUrl = customValidationUrl;
  }

  public PhysicalLocation roleSuspensionValidation(Boolean roleSuspensionValidation) {
    this.roleSuspensionValidation = roleSuspensionValidation;
    return this;
  }

   /**
   * Realiza Validação da Suspensão do Papel
   * @return roleSuspensionValidation
  **/
  @ApiModelProperty(value = "Realiza Validação da Suspensão do Papel")
  public Boolean isRoleSuspensionValidation() {
    return roleSuspensionValidation;
  }

  public void setRoleSuspensionValidation(Boolean roleSuspensionValidation) {
    this.roleSuspensionValidation = roleSuspensionValidation;
  }

  public PhysicalLocation slotTimePhysicalValidation(Boolean slotTimePhysicalValidation) {
    this.slotTimePhysicalValidation = slotTimePhysicalValidation;
    return this;
  }

   /**
   * Realiza Validação da Faixa Horária do Local Físico
   * @return slotTimePhysicalValidation
  **/
  @ApiModelProperty(value = "Realiza Validação da Faixa Horária do Local Físico")
  public Boolean isSlotTimePhysicalValidation() {
    return slotTimePhysicalValidation;
  }

  public void setSlotTimePhysicalValidation(Boolean slotTimePhysicalValidation) {
    this.slotTimePhysicalValidation = slotTimePhysicalValidation;
  }

  public PhysicalLocation physicalLocationAuthorizerValidation(Boolean physicalLocationAuthorizerValidation) {
    this.physicalLocationAuthorizerValidation = physicalLocationAuthorizerValidation;
    return this;
  }

   /**
   * Realiza Validação do Autorizador do Local Físico
   * @return physicalLocationAuthorizerValidation
  **/
  @ApiModelProperty(value = "Realiza Validação do Autorizador do Local Físico")
  public Boolean isPhysicalLocationAuthorizerValidation() {
    return physicalLocationAuthorizerValidation;
  }

  public void setPhysicalLocationAuthorizerValidation(Boolean physicalLocationAuthorizerValidation) {
    this.physicalLocationAuthorizerValidation = physicalLocationAuthorizerValidation;
  }

  public PhysicalLocation roleAuthorizerValidation(Boolean roleAuthorizerValidation) {
    this.roleAuthorizerValidation = roleAuthorizerValidation;
    return this;
  }

   /**
   * Realiza Validação do Autorizador do Papel
   * @return roleAuthorizerValidation
  **/
  @ApiModelProperty(value = "Realiza Validação do Autorizador do Papel")
  public Boolean isRoleAuthorizerValidation() {
    return roleAuthorizerValidation;
  }

  public void setRoleAuthorizerValidation(Boolean roleAuthorizerValidation) {
    this.roleAuthorizerValidation = roleAuthorizerValidation;
  }

  public PhysicalLocation accessCreditValidation(Boolean accessCreditValidation) {
    this.accessCreditValidation = accessCreditValidation;
    return this;
  }

   /**
   * Realiza Validação de Crédito de Acesso
   * @return accessCreditValidation
  **/
  @ApiModelProperty(value = "Realiza Validação de Crédito de Acesso")
  public Boolean isAccessCreditValidation() {
    return accessCreditValidation;
  }

  public void setAccessCreditValidation(Boolean accessCreditValidation) {
    this.accessCreditValidation = accessCreditValidation;
  }

  public PhysicalLocation roleValidation(Boolean roleValidation) {
    this.roleValidation = roleValidation;
    return this;
  }

   /**
   * Realiza Validação de Papel
   * @return roleValidation
  **/
  @ApiModelProperty(value = "Realiza Validação de Papel")
  public Boolean isRoleValidation() {
    return roleValidation;
  }

  public void setRoleValidation(Boolean roleValidation) {
    this.roleValidation = roleValidation;
  }

  public PhysicalLocation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome
   * @return name
  **/
  @ApiModelProperty(value = "Nome")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PhysicalLocation customValidation(Boolean customValidation) {
    this.customValidation = customValidation;
    return this;
  }

   /**
   * Realiza Validação Customizada
   * @return customValidation
  **/
  @ApiModelProperty(value = "Realiza Validação Customizada")
  public Boolean isCustomValidation() {
    return customValidation;
  }

  public void setCustomValidation(Boolean customValidation) {
    this.customValidation = customValidation;
  }

  public PhysicalLocation id(Integer id) {
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

  public PhysicalLocation levelValidation(Boolean levelValidation) {
    this.levelValidation = levelValidation;
    return this;
  }

   /**
   * Realiza Validação do Nível
   * @return levelValidation
  **/
  @ApiModelProperty(value = "Realiza Validação do Nível")
  public Boolean isLevelValidation() {
    return levelValidation;
  }

  public void setLevelValidation(Boolean levelValidation) {
    this.levelValidation = levelValidation;
  }

  public PhysicalLocation capacityValidation(Boolean capacityValidation) {
    this.capacityValidation = capacityValidation;
    return this;
  }

   /**
   * Realiza Validação de Lotação
   * @return capacityValidation
  **/
  @ApiModelProperty(value = "Realiza Validação de Lotação")
  public Boolean isCapacityValidation() {
    return capacityValidation;
  }

  public void setCapacityValidation(Boolean capacityValidation) {
    this.capacityValidation = capacityValidation;
  }

  public PhysicalLocation status(PhysicalLocationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public PhysicalLocationStatus getStatus() {
    return status;
  }

  public void setStatus(PhysicalLocationStatus status) {
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
    PhysicalLocation physicalLocation = (PhysicalLocation) o;
    return Objects.equals(this.roleAccessPhysicalLocations, physicalLocation.roleAccessPhysicalLocations) &&
        Objects.equals(this.parent, physicalLocation.parent) &&
        Objects.equals(this.antiPassbackValidation, physicalLocation.antiPassbackValidation) &&
        Objects.equals(this.checkInBetweenWorkdays, physicalLocation.checkInBetweenWorkdays) &&
        Objects.equals(this.slotTimeRoleValidation, physicalLocation.slotTimeRoleValidation) &&
        Objects.equals(this.antiPassbackTimeout, physicalLocation.antiPassbackTimeout) &&
        Objects.equals(this.timeSlotList, physicalLocation.timeSlotList) &&
        Objects.equals(this.localTimezone, physicalLocation.localTimezone) &&
        Objects.equals(this.externalPhysicalLocation, physicalLocation.externalPhysicalLocation) &&
        Objects.equals(this.blueprint, physicalLocation.blueprint) &&
        Objects.equals(this.customValidationUrl, physicalLocation.customValidationUrl) &&
        Objects.equals(this.roleSuspensionValidation, physicalLocation.roleSuspensionValidation) &&
        Objects.equals(this.slotTimePhysicalValidation, physicalLocation.slotTimePhysicalValidation) &&
        Objects.equals(this.physicalLocationAuthorizerValidation, physicalLocation.physicalLocationAuthorizerValidation) &&
        Objects.equals(this.roleAuthorizerValidation, physicalLocation.roleAuthorizerValidation) &&
        Objects.equals(this.accessCreditValidation, physicalLocation.accessCreditValidation) &&
        Objects.equals(this.roleValidation, physicalLocation.roleValidation) &&
        Objects.equals(this.name, physicalLocation.name) &&
        Objects.equals(this.customValidation, physicalLocation.customValidation) &&
        Objects.equals(this.id, physicalLocation.id) &&
        Objects.equals(this.levelValidation, physicalLocation.levelValidation) &&
        Objects.equals(this.capacityValidation, physicalLocation.capacityValidation) &&
        Objects.equals(this.status, physicalLocation.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleAccessPhysicalLocations, parent, antiPassbackValidation, checkInBetweenWorkdays, slotTimeRoleValidation, antiPassbackTimeout, timeSlotList, localTimezone, externalPhysicalLocation, blueprint, customValidationUrl, roleSuspensionValidation, slotTimePhysicalValidation, physicalLocationAuthorizerValidation, roleAuthorizerValidation, accessCreditValidation, roleValidation, name, customValidation, id, levelValidation, capacityValidation, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalLocation {\n");
    
    sb.append("    roleAccessPhysicalLocations: ").append(toIndentedString(roleAccessPhysicalLocations)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    antiPassbackValidation: ").append(toIndentedString(antiPassbackValidation)).append("\n");
    sb.append("    checkInBetweenWorkdays: ").append(toIndentedString(checkInBetweenWorkdays)).append("\n");
    sb.append("    slotTimeRoleValidation: ").append(toIndentedString(slotTimeRoleValidation)).append("\n");
    sb.append("    antiPassbackTimeout: ").append(toIndentedString(antiPassbackTimeout)).append("\n");
    sb.append("    timeSlotList: ").append(toIndentedString(timeSlotList)).append("\n");
    sb.append("    localTimezone: ").append(toIndentedString(localTimezone)).append("\n");
    sb.append("    externalPhysicalLocation: ").append(toIndentedString(externalPhysicalLocation)).append("\n");
    sb.append("    blueprint: ").append(toIndentedString(blueprint)).append("\n");
    sb.append("    customValidationUrl: ").append(toIndentedString(customValidationUrl)).append("\n");
    sb.append("    roleSuspensionValidation: ").append(toIndentedString(roleSuspensionValidation)).append("\n");
    sb.append("    slotTimePhysicalValidation: ").append(toIndentedString(slotTimePhysicalValidation)).append("\n");
    sb.append("    physicalLocationAuthorizerValidation: ").append(toIndentedString(physicalLocationAuthorizerValidation)).append("\n");
    sb.append("    roleAuthorizerValidation: ").append(toIndentedString(roleAuthorizerValidation)).append("\n");
    sb.append("    accessCreditValidation: ").append(toIndentedString(accessCreditValidation)).append("\n");
    sb.append("    roleValidation: ").append(toIndentedString(roleValidation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    customValidation: ").append(toIndentedString(customValidation)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    levelValidation: ").append(toIndentedString(levelValidation)).append("\n");
    sb.append("    capacityValidation: ").append(toIndentedString(capacityValidation)).append("\n");
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

