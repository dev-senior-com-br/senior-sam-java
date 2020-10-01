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
import br.com.senior.sam.application.pojos.BiometricManufacturer;
import br.com.senior.sam.application.pojos.BiometricOneToOneValidationType;
import br.com.senior.sam.application.pojos.BiometricValidation;
import br.com.senior.sam.application.pojos.Device;
import br.com.senior.sam.application.pojos.DeviceCommunicationStatus;
import br.com.senior.sam.application.pojos.DeviceSituation;
import br.com.senior.sam.application.pojos.DeviceType;
import br.com.senior.sam.application.pojos.ExtensibleConfiguration;
import br.com.senior.sam.application.pojos.PhysicalLocation;
import br.com.senior.sam.application.pojos.ReaderDevice;
import br.com.senior.sam.application.pojos.ReaderDeviceAction;
import br.com.senior.sam.application.pojos.ReaderDeviceCardFormat;
import br.com.senior.sam.application.pojos.ReaderDeviceTechnology;
import br.com.senior.sam.application.pojos.ReaderDirection;
import br.com.senior.sam.application.pojos.ReaderValidationType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReaderDevice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-01T20:35:37.706Z")



public class ReaderDevice {
  @SerializedName("parkingSpaceControll")
  private Boolean parkingSpaceControll = null;

  @SerializedName("parent")
  private Device parent = null;

  @SerializedName("destinyPhysicalLocation")
  private PhysicalLocation destinyPhysicalLocation = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("readerDeviceTechnology")
  private ReaderDeviceTechnology readerDeviceTechnology = null;

  @SerializedName("headKeyId")
  private String headKeyId = null;

  @SerializedName("integrated")
  private Boolean integrated = null;

  @SerializedName("biometricOneToOneValidationType")
  private BiometricOneToOneValidationType biometricOneToOneValidationType = null;

  @SerializedName("biometricValidation")
  private BiometricValidation biometricValidation = null;

  @SerializedName("urnSensor")
  private Device urnSensor = null;

  @SerializedName("validateVehicle")
  private Boolean validateVehicle = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("originPhysicalLocation")
  private PhysicalLocation originPhysicalLocation = null;

  @SerializedName("situation")
  private DeviceSituation situation = null;

  @SerializedName("blockProvisoryOnExit")
  private Boolean blockProvisoryOnExit = null;

  @SerializedName("deviceType")
  private DeviceType deviceType = null;

  @SerializedName("offlineReaderValidationType")
  private ReaderValidationType offlineReaderValidationType = null;

  @SerializedName("biometricManufacturer")
  private BiometricManufacturer biometricManufacturer = null;

  @SerializedName("releaseProvisoryOnExit")
  private Boolean releaseProvisoryOnExit = null;

  @SerializedName("address")
  private Integer address = null;

  @SerializedName("physicalLocation")
  private PhysicalLocation physicalLocation = null;

  @SerializedName("cardFormats")
  private List<ReaderDeviceCardFormat> cardFormats = null;

  @SerializedName("pairingInReaderInterface")
  private Boolean pairingInReaderInterface = null;

  @SerializedName("heldOpenTime")
  private Integer heldOpenTime = null;

  @SerializedName("urnSensorTime")
  private Integer urnSensorTime = null;

  @SerializedName("onlineReaderValidationType")
  private ReaderValidationType onlineReaderValidationType = null;

  @SerializedName("biometryLevel")
  private Integer biometryLevel = null;

  @SerializedName("communicationStatus")
  private DeviceCommunicationStatus communicationStatus = null;

  @SerializedName("extensibleConfiguration")
  private ExtensibleConfiguration extensibleConfiguration = null;

  @SerializedName("activations")
  private List<ReaderDeviceAction> activations = null;

  @SerializedName("readerDirection")
  private ReaderDirection readerDirection = null;

  @SerializedName("relatedReader")
  private ReaderDevice relatedReader = null;

  @SerializedName("accessTime")
  private Integer accessTime = null;

  public ReaderDevice parkingSpaceControll(Boolean parkingSpaceControll) {
    this.parkingSpaceControll = parkingSpaceControll;
    return this;
  }

   /**
   * Controla Vagas
   * @return parkingSpaceControll
  **/
  @ApiModelProperty(value = "Controla Vagas")
  public Boolean isParkingSpaceControll() {
    return parkingSpaceControll;
  }

  public void setParkingSpaceControll(Boolean parkingSpaceControll) {
    this.parkingSpaceControll = parkingSpaceControll;
  }

  public ReaderDevice parent(Device parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public Device getParent() {
    return parent;
  }

  public void setParent(Device parent) {
    this.parent = parent;
  }

  public ReaderDevice destinyPhysicalLocation(PhysicalLocation destinyPhysicalLocation) {
    this.destinyPhysicalLocation = destinyPhysicalLocation;
    return this;
  }

   /**
   * Get destinyPhysicalLocation
   * @return destinyPhysicalLocation
  **/
  @ApiModelProperty(value = "")
  public PhysicalLocation getDestinyPhysicalLocation() {
    return destinyPhysicalLocation;
  }

  public void setDestinyPhysicalLocation(PhysicalLocation destinyPhysicalLocation) {
    this.destinyPhysicalLocation = destinyPhysicalLocation;
  }

  public ReaderDevice description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descrição do Dispositivo
   * @return description
  **/
  @ApiModelProperty(value = "Descrição do Dispositivo")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReaderDevice readerDeviceTechnology(ReaderDeviceTechnology readerDeviceTechnology) {
    this.readerDeviceTechnology = readerDeviceTechnology;
    return this;
  }

   /**
   * Get readerDeviceTechnology
   * @return readerDeviceTechnology
  **/
  @ApiModelProperty(value = "")
  public ReaderDeviceTechnology getReaderDeviceTechnology() {
    return readerDeviceTechnology;
  }

  public void setReaderDeviceTechnology(ReaderDeviceTechnology readerDeviceTechnology) {
    this.readerDeviceTechnology = readerDeviceTechnology;
  }

  public ReaderDevice headKeyId(String headKeyId) {
    this.headKeyId = headKeyId;
    return this;
  }

   /**
   * Identificador da Leitora HeadKey
   * @return headKeyId
  **/
  @ApiModelProperty(value = "Identificador da Leitora HeadKey")
  public String getHeadKeyId() {
    return headKeyId;
  }

  public void setHeadKeyId(String headKeyId) {
    this.headKeyId = headKeyId;
  }

  public ReaderDevice integrated(Boolean integrated) {
    this.integrated = integrated;
    return this;
  }

   /**
   * Dispositivo Integrado
   * @return integrated
  **/
  @ApiModelProperty(value = "Dispositivo Integrado")
  public Boolean isIntegrated() {
    return integrated;
  }

  public void setIntegrated(Boolean integrated) {
    this.integrated = integrated;
  }

  public ReaderDevice biometricOneToOneValidationType(BiometricOneToOneValidationType biometricOneToOneValidationType) {
    this.biometricOneToOneValidationType = biometricOneToOneValidationType;
    return this;
  }

   /**
   * Get biometricOneToOneValidationType
   * @return biometricOneToOneValidationType
  **/
  @ApiModelProperty(value = "")
  public BiometricOneToOneValidationType getBiometricOneToOneValidationType() {
    return biometricOneToOneValidationType;
  }

  public void setBiometricOneToOneValidationType(BiometricOneToOneValidationType biometricOneToOneValidationType) {
    this.biometricOneToOneValidationType = biometricOneToOneValidationType;
  }

  public ReaderDevice biometricValidation(BiometricValidation biometricValidation) {
    this.biometricValidation = biometricValidation;
    return this;
  }

   /**
   * Get biometricValidation
   * @return biometricValidation
  **/
  @ApiModelProperty(value = "")
  public BiometricValidation getBiometricValidation() {
    return biometricValidation;
  }

  public void setBiometricValidation(BiometricValidation biometricValidation) {
    this.biometricValidation = biometricValidation;
  }

  public ReaderDevice urnSensor(Device urnSensor) {
    this.urnSensor = urnSensor;
    return this;
  }

   /**
   * Get urnSensor
   * @return urnSensor
  **/
  @ApiModelProperty(value = "")
  public Device getUrnSensor() {
    return urnSensor;
  }

  public void setUrnSensor(Device urnSensor) {
    this.urnSensor = urnSensor;
  }

  public ReaderDevice validateVehicle(Boolean validateVehicle) {
    this.validateVehicle = validateVehicle;
    return this;
  }

   /**
   * Valida Veículo
   * @return validateVehicle
  **/
  @ApiModelProperty(value = "Valida Veículo")
  public Boolean isValidateVehicle() {
    return validateVehicle;
  }

  public void setValidateVehicle(Boolean validateVehicle) {
    this.validateVehicle = validateVehicle;
  }

  public ReaderDevice id(Integer id) {
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

  public ReaderDevice originPhysicalLocation(PhysicalLocation originPhysicalLocation) {
    this.originPhysicalLocation = originPhysicalLocation;
    return this;
  }

   /**
   * Get originPhysicalLocation
   * @return originPhysicalLocation
  **/
  @ApiModelProperty(value = "")
  public PhysicalLocation getOriginPhysicalLocation() {
    return originPhysicalLocation;
  }

  public void setOriginPhysicalLocation(PhysicalLocation originPhysicalLocation) {
    this.originPhysicalLocation = originPhysicalLocation;
  }

  public ReaderDevice situation(DeviceSituation situation) {
    this.situation = situation;
    return this;
  }

   /**
   * Get situation
   * @return situation
  **/
  @ApiModelProperty(value = "")
  public DeviceSituation getSituation() {
    return situation;
  }

  public void setSituation(DeviceSituation situation) {
    this.situation = situation;
  }

  public ReaderDevice blockProvisoryOnExit(Boolean blockProvisoryOnExit) {
    this.blockProvisoryOnExit = blockProvisoryOnExit;
    return this;
  }

   /**
   * Bloqueia Provisório na Saída
   * @return blockProvisoryOnExit
  **/
  @ApiModelProperty(value = "Bloqueia Provisório na Saída")
  public Boolean isBlockProvisoryOnExit() {
    return blockProvisoryOnExit;
  }

  public void setBlockProvisoryOnExit(Boolean blockProvisoryOnExit) {
    this.blockProvisoryOnExit = blockProvisoryOnExit;
  }

  public ReaderDevice deviceType(DeviceType deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @ApiModelProperty(value = "")
  public DeviceType getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceType deviceType) {
    this.deviceType = deviceType;
  }

  public ReaderDevice offlineReaderValidationType(ReaderValidationType offlineReaderValidationType) {
    this.offlineReaderValidationType = offlineReaderValidationType;
    return this;
  }

   /**
   * Get offlineReaderValidationType
   * @return offlineReaderValidationType
  **/
  @ApiModelProperty(value = "")
  public ReaderValidationType getOfflineReaderValidationType() {
    return offlineReaderValidationType;
  }

  public void setOfflineReaderValidationType(ReaderValidationType offlineReaderValidationType) {
    this.offlineReaderValidationType = offlineReaderValidationType;
  }

  public ReaderDevice biometricManufacturer(BiometricManufacturer biometricManufacturer) {
    this.biometricManufacturer = biometricManufacturer;
    return this;
  }

   /**
   * Get biometricManufacturer
   * @return biometricManufacturer
  **/
  @ApiModelProperty(value = "")
  public BiometricManufacturer getBiometricManufacturer() {
    return biometricManufacturer;
  }

  public void setBiometricManufacturer(BiometricManufacturer biometricManufacturer) {
    this.biometricManufacturer = biometricManufacturer;
  }

  public ReaderDevice releaseProvisoryOnExit(Boolean releaseProvisoryOnExit) {
    this.releaseProvisoryOnExit = releaseProvisoryOnExit;
    return this;
  }

   /**
   * Baixa Provisório na Saída
   * @return releaseProvisoryOnExit
  **/
  @ApiModelProperty(value = "Baixa Provisório na Saída")
  public Boolean isReleaseProvisoryOnExit() {
    return releaseProvisoryOnExit;
  }

  public void setReleaseProvisoryOnExit(Boolean releaseProvisoryOnExit) {
    this.releaseProvisoryOnExit = releaseProvisoryOnExit;
  }

  public ReaderDevice address(Integer address) {
    this.address = address;
    return this;
  }

   /**
   * Endereço
   * @return address
  **/
  @ApiModelProperty(value = "Endereço")
  public Integer getAddress() {
    return address;
  }

  public void setAddress(Integer address) {
    this.address = address;
  }

  public ReaderDevice physicalLocation(PhysicalLocation physicalLocation) {
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

  public ReaderDevice cardFormats(List<ReaderDeviceCardFormat> cardFormats) {
    this.cardFormats = cardFormats;
    return this;
  }

  public ReaderDevice addCardFormatsItem(ReaderDeviceCardFormat cardFormatsItem) {
    if (this.cardFormats == null) {
      this.cardFormats = new ArrayList<ReaderDeviceCardFormat>();
    }
    this.cardFormats.add(cardFormatsItem);
    return this;
  }

   /**
   * Formatos de Cartão
   * @return cardFormats
  **/
  @ApiModelProperty(value = "Formatos de Cartão")
  public List<ReaderDeviceCardFormat> getCardFormats() {
    return cardFormats;
  }

  public void setCardFormats(List<ReaderDeviceCardFormat> cardFormats) {
    this.cardFormats = cardFormats;
  }

  public ReaderDevice pairingInReaderInterface(Boolean pairingInReaderInterface) {
    this.pairingInReaderInterface = pairingInReaderInterface;
    return this;
  }

   /**
   * Leitora Pairada
   * @return pairingInReaderInterface
  **/
  @ApiModelProperty(value = "Leitora Pairada")
  public Boolean isPairingInReaderInterface() {
    return pairingInReaderInterface;
  }

  public void setPairingInReaderInterface(Boolean pairingInReaderInterface) {
    this.pairingInReaderInterface = pairingInReaderInterface;
  }

  public ReaderDevice heldOpenTime(Integer heldOpenTime) {
    this.heldOpenTime = heldOpenTime;
    return this;
  }

   /**
   * Tempo do Alarme de Porta Aberta
   * @return heldOpenTime
  **/
  @ApiModelProperty(value = "Tempo do Alarme de Porta Aberta")
  public Integer getHeldOpenTime() {
    return heldOpenTime;
  }

  public void setHeldOpenTime(Integer heldOpenTime) {
    this.heldOpenTime = heldOpenTime;
  }

  public ReaderDevice urnSensorTime(Integer urnSensorTime) {
    this.urnSensorTime = urnSensorTime;
    return this;
  }

   /**
   * Tempo do Sensor de Urna
   * @return urnSensorTime
  **/
  @ApiModelProperty(value = "Tempo do Sensor de Urna")
  public Integer getUrnSensorTime() {
    return urnSensorTime;
  }

  public void setUrnSensorTime(Integer urnSensorTime) {
    this.urnSensorTime = urnSensorTime;
  }

  public ReaderDevice onlineReaderValidationType(ReaderValidationType onlineReaderValidationType) {
    this.onlineReaderValidationType = onlineReaderValidationType;
    return this;
  }

   /**
   * Get onlineReaderValidationType
   * @return onlineReaderValidationType
  **/
  @ApiModelProperty(value = "")
  public ReaderValidationType getOnlineReaderValidationType() {
    return onlineReaderValidationType;
  }

  public void setOnlineReaderValidationType(ReaderValidationType onlineReaderValidationType) {
    this.onlineReaderValidationType = onlineReaderValidationType;
  }

  public ReaderDevice biometryLevel(Integer biometryLevel) {
    this.biometryLevel = biometryLevel;
    return this;
  }

   /**
   * Nível de Conferência Biométrica
   * @return biometryLevel
  **/
  @ApiModelProperty(value = "Nível de Conferência Biométrica")
  public Integer getBiometryLevel() {
    return biometryLevel;
  }

  public void setBiometryLevel(Integer biometryLevel) {
    this.biometryLevel = biometryLevel;
  }

  public ReaderDevice communicationStatus(DeviceCommunicationStatus communicationStatus) {
    this.communicationStatus = communicationStatus;
    return this;
  }

   /**
   * Get communicationStatus
   * @return communicationStatus
  **/
  @ApiModelProperty(value = "")
  public DeviceCommunicationStatus getCommunicationStatus() {
    return communicationStatus;
  }

  public void setCommunicationStatus(DeviceCommunicationStatus communicationStatus) {
    this.communicationStatus = communicationStatus;
  }

  public ReaderDevice extensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
    this.extensibleConfiguration = extensibleConfiguration;
    return this;
  }

   /**
   * Get extensibleConfiguration
   * @return extensibleConfiguration
  **/
  @ApiModelProperty(value = "")
  public ExtensibleConfiguration getExtensibleConfiguration() {
    return extensibleConfiguration;
  }

  public void setExtensibleConfiguration(ExtensibleConfiguration extensibleConfiguration) {
    this.extensibleConfiguration = extensibleConfiguration;
  }

  public ReaderDevice activations(List<ReaderDeviceAction> activations) {
    this.activations = activations;
    return this;
  }

  public ReaderDevice addActivationsItem(ReaderDeviceAction activationsItem) {
    if (this.activations == null) {
      this.activations = new ArrayList<ReaderDeviceAction>();
    }
    this.activations.add(activationsItem);
    return this;
  }

   /**
   * Saídas do Acionamento
   * @return activations
  **/
  @ApiModelProperty(value = "Saídas do Acionamento")
  public List<ReaderDeviceAction> getActivations() {
    return activations;
  }

  public void setActivations(List<ReaderDeviceAction> activations) {
    this.activations = activations;
  }

  public ReaderDevice readerDirection(ReaderDirection readerDirection) {
    this.readerDirection = readerDirection;
    return this;
  }

   /**
   * Get readerDirection
   * @return readerDirection
  **/
  @ApiModelProperty(value = "")
  public ReaderDirection getReaderDirection() {
    return readerDirection;
  }

  public void setReaderDirection(ReaderDirection readerDirection) {
    this.readerDirection = readerDirection;
  }

  public ReaderDevice relatedReader(ReaderDevice relatedReader) {
    this.relatedReader = relatedReader;
    return this;
  }

   /**
   * Get relatedReader
   * @return relatedReader
  **/
  @ApiModelProperty(value = "")
  public ReaderDevice getRelatedReader() {
    return relatedReader;
  }

  public void setRelatedReader(ReaderDevice relatedReader) {
    this.relatedReader = relatedReader;
  }

  public ReaderDevice accessTime(Integer accessTime) {
    this.accessTime = accessTime;
    return this;
  }

   /**
   * Tempo de Acesso
   * @return accessTime
  **/
  @ApiModelProperty(value = "Tempo de Acesso")
  public Integer getAccessTime() {
    return accessTime;
  }

  public void setAccessTime(Integer accessTime) {
    this.accessTime = accessTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReaderDevice readerDevice = (ReaderDevice) o;
    return Objects.equals(this.parkingSpaceControll, readerDevice.parkingSpaceControll) &&
        Objects.equals(this.parent, readerDevice.parent) &&
        Objects.equals(this.destinyPhysicalLocation, readerDevice.destinyPhysicalLocation) &&
        Objects.equals(this.description, readerDevice.description) &&
        Objects.equals(this.readerDeviceTechnology, readerDevice.readerDeviceTechnology) &&
        Objects.equals(this.headKeyId, readerDevice.headKeyId) &&
        Objects.equals(this.integrated, readerDevice.integrated) &&
        Objects.equals(this.biometricOneToOneValidationType, readerDevice.biometricOneToOneValidationType) &&
        Objects.equals(this.biometricValidation, readerDevice.biometricValidation) &&
        Objects.equals(this.urnSensor, readerDevice.urnSensor) &&
        Objects.equals(this.validateVehicle, readerDevice.validateVehicle) &&
        Objects.equals(this.id, readerDevice.id) &&
        Objects.equals(this.originPhysicalLocation, readerDevice.originPhysicalLocation) &&
        Objects.equals(this.situation, readerDevice.situation) &&
        Objects.equals(this.blockProvisoryOnExit, readerDevice.blockProvisoryOnExit) &&
        Objects.equals(this.deviceType, readerDevice.deviceType) &&
        Objects.equals(this.offlineReaderValidationType, readerDevice.offlineReaderValidationType) &&
        Objects.equals(this.biometricManufacturer, readerDevice.biometricManufacturer) &&
        Objects.equals(this.releaseProvisoryOnExit, readerDevice.releaseProvisoryOnExit) &&
        Objects.equals(this.address, readerDevice.address) &&
        Objects.equals(this.physicalLocation, readerDevice.physicalLocation) &&
        Objects.equals(this.cardFormats, readerDevice.cardFormats) &&
        Objects.equals(this.pairingInReaderInterface, readerDevice.pairingInReaderInterface) &&
        Objects.equals(this.heldOpenTime, readerDevice.heldOpenTime) &&
        Objects.equals(this.urnSensorTime, readerDevice.urnSensorTime) &&
        Objects.equals(this.onlineReaderValidationType, readerDevice.onlineReaderValidationType) &&
        Objects.equals(this.biometryLevel, readerDevice.biometryLevel) &&
        Objects.equals(this.communicationStatus, readerDevice.communicationStatus) &&
        Objects.equals(this.extensibleConfiguration, readerDevice.extensibleConfiguration) &&
        Objects.equals(this.activations, readerDevice.activations) &&
        Objects.equals(this.readerDirection, readerDevice.readerDirection) &&
        Objects.equals(this.relatedReader, readerDevice.relatedReader) &&
        Objects.equals(this.accessTime, readerDevice.accessTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parkingSpaceControll, parent, destinyPhysicalLocation, description, readerDeviceTechnology, headKeyId, integrated, biometricOneToOneValidationType, biometricValidation, urnSensor, validateVehicle, id, originPhysicalLocation, situation, blockProvisoryOnExit, deviceType, offlineReaderValidationType, biometricManufacturer, releaseProvisoryOnExit, address, physicalLocation, cardFormats, pairingInReaderInterface, heldOpenTime, urnSensorTime, onlineReaderValidationType, biometryLevel, communicationStatus, extensibleConfiguration, activations, readerDirection, relatedReader, accessTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReaderDevice {\n");
    
    sb.append("    parkingSpaceControll: ").append(toIndentedString(parkingSpaceControll)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    destinyPhysicalLocation: ").append(toIndentedString(destinyPhysicalLocation)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    readerDeviceTechnology: ").append(toIndentedString(readerDeviceTechnology)).append("\n");
    sb.append("    headKeyId: ").append(toIndentedString(headKeyId)).append("\n");
    sb.append("    integrated: ").append(toIndentedString(integrated)).append("\n");
    sb.append("    biometricOneToOneValidationType: ").append(toIndentedString(biometricOneToOneValidationType)).append("\n");
    sb.append("    biometricValidation: ").append(toIndentedString(biometricValidation)).append("\n");
    sb.append("    urnSensor: ").append(toIndentedString(urnSensor)).append("\n");
    sb.append("    validateVehicle: ").append(toIndentedString(validateVehicle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    originPhysicalLocation: ").append(toIndentedString(originPhysicalLocation)).append("\n");
    sb.append("    situation: ").append(toIndentedString(situation)).append("\n");
    sb.append("    blockProvisoryOnExit: ").append(toIndentedString(blockProvisoryOnExit)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    offlineReaderValidationType: ").append(toIndentedString(offlineReaderValidationType)).append("\n");
    sb.append("    biometricManufacturer: ").append(toIndentedString(biometricManufacturer)).append("\n");
    sb.append("    releaseProvisoryOnExit: ").append(toIndentedString(releaseProvisoryOnExit)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    cardFormats: ").append(toIndentedString(cardFormats)).append("\n");
    sb.append("    pairingInReaderInterface: ").append(toIndentedString(pairingInReaderInterface)).append("\n");
    sb.append("    heldOpenTime: ").append(toIndentedString(heldOpenTime)).append("\n");
    sb.append("    urnSensorTime: ").append(toIndentedString(urnSensorTime)).append("\n");
    sb.append("    onlineReaderValidationType: ").append(toIndentedString(onlineReaderValidationType)).append("\n");
    sb.append("    biometryLevel: ").append(toIndentedString(biometryLevel)).append("\n");
    sb.append("    communicationStatus: ").append(toIndentedString(communicationStatus)).append("\n");
    sb.append("    extensibleConfiguration: ").append(toIndentedString(extensibleConfiguration)).append("\n");
    sb.append("    activations: ").append(toIndentedString(activations)).append("\n");
    sb.append("    readerDirection: ").append(toIndentedString(readerDirection)).append("\n");
    sb.append("    relatedReader: ").append(toIndentedString(relatedReader)).append("\n");
    sb.append("    accessTime: ").append(toIndentedString(accessTime)).append("\n");
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

