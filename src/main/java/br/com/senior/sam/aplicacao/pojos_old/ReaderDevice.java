package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.BiometricManufacturer;
import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.PhysicalLocation;

public class ReaderDevice {

    /**
     * ID
     */
    public Long id;
    /**
     * Endereço
     */
    public Long address;
    /**
     * Tecnologia da Leitora
     */
    public ReaderDeviceTechnology readerDeviceTechnology;
    /**
     * Validação Biométrica
     */
    public BiometricValidation biometricValidation;
    /**
     * Fabricante Biométrico
     */
    public BiometricManufacturer biometricManufacturer;
    /**
     * Leitora Relacionada
     */
    public ReaderDevice relatedReader;
    /**
     * Nível de Conferência Biométrica
     */
    public Long biometryLevel;
    /**
     * Direção de Acesso
     */
    public ReaderDirection readerDirection;
    /**
     * Tempo do Sensor de Urna
     */
    public Long urnSensorTime;
    /**
     * Sensor de Urna
     */
    public Device urnSensor;
    /**
     * Controla Vagas
     */
    public Boolean parkingSpaceControll;
    /**
     * Tempo de Acesso
     */
    public Long accessTime;
    /**
     * Tipo de Validação Biométrica Um para Um
     */
    public BiometricOneToOneValidationType biometricOneToOneValidationType;
    /**
     * Tipo de Validação da Leitora Online
     */
    public ReaderValidationType onlineReaderValidationType;
    /**
     * Tipo de Validação da Leitora Offline
     */
    public ReaderValidationType offlineReaderValidationType;
    /**
     * Local Físico de Origem
     */
    public PhysicalLocation originPhysicalLocation;
    /**
     * Local Físico de Destino
     */
    public PhysicalLocation destinyPhysicalLocation;
    /**
     * Baixa Provisório na Saída
     */
    public Boolean releaseProvisoryOnExit;
    /**
     * Bloqueia Provisório na Saída
     */
    public Boolean blockProvisoryOnExit;
    /**
     * Valida Veículo
     */
    public Boolean validateVehicle;
    /**
     * Tempo do Alarme de Porta Aberta
     */
    public Long heldOpenTime;
    /**
     * Leitora Pairada
     */
    public Boolean pairingInReaderInterface;
    /**
     * Identificador da Leitora HeadKey
     */
    public String headKeyId;
    /**
     * Formatos de Cartão
     */
    public java.util.List<ReaderDeviceCardFormat> cardFormats;
    /**
     * Saídas do Acionamento
     */
    public java.util.List<ReaderDeviceAction> activations;
    /**
     * Dispositivo Pai
     */
    public Device parent;
    /**
     * Descrição do Dispositivo
     */
    public String description;
    /**
     * Tipo do Dispositivo
     */
    public DeviceType deviceType;
    /**
     * Situação do Dispositivo
     */
    public DeviceSituation situation;
    /**
     * Local Físico do Dispositivo
     */
    public PhysicalLocation physicalLocation;
    /**
     * Status de Comunicação
     */
    public DeviceCommunicationStatus communicationStatus;
    /**
     * Dispositivo Integrado
     */
    public Boolean integrated;
    /**
     * Configuração Extensível
     */
    public ExtensibleConfiguration extensibleConfiguration;

    private List<JsonPatch> jsonPatches;

    public ReaderDevice() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public ReaderDevice(Long id, Long address, ReaderDeviceTechnology readerDeviceTechnology, BiometricValidation biometricValidation, BiometricManufacturer biometricManufacturer, ReaderDevice relatedReader, Long biometryLevel, ReaderDirection readerDirection, Long urnSensorTime, Device urnSensor, Boolean parkingSpaceControll, Long accessTime, BiometricOneToOneValidationType biometricOneToOneValidationType, ReaderValidationType onlineReaderValidationType, ReaderValidationType offlineReaderValidationType, PhysicalLocation originPhysicalLocation, PhysicalLocation destinyPhysicalLocation, Boolean releaseProvisoryOnExit, Boolean blockProvisoryOnExit, Boolean validateVehicle, Long heldOpenTime, Boolean pairingInReaderInterface, String headKeyId, java.util.List<ReaderDeviceCardFormat> cardFormats, java.util.List<ReaderDeviceAction> activations, Device parent, String description, DeviceType deviceType, DeviceSituation situation, PhysicalLocation physicalLocation, DeviceCommunicationStatus communicationStatus, Boolean integrated, ExtensibleConfiguration extensibleConfiguration, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.address = address;
        this.readerDeviceTechnology = readerDeviceTechnology;
        this.biometricValidation = biometricValidation;
        this.biometricManufacturer = biometricManufacturer;
        this.relatedReader = relatedReader;
        this.biometryLevel = biometryLevel;
        this.readerDirection = readerDirection;
        this.urnSensorTime = urnSensorTime;
        this.urnSensor = urnSensor;
        this.parkingSpaceControll = parkingSpaceControll;
        this.accessTime = accessTime;
        this.biometricOneToOneValidationType = biometricOneToOneValidationType;
        this.onlineReaderValidationType = onlineReaderValidationType;
        this.offlineReaderValidationType = offlineReaderValidationType;
        this.originPhysicalLocation = originPhysicalLocation;
        this.destinyPhysicalLocation = destinyPhysicalLocation;
        this.releaseProvisoryOnExit = releaseProvisoryOnExit;
        this.blockProvisoryOnExit = blockProvisoryOnExit;
        this.validateVehicle = validateVehicle;
        this.heldOpenTime = heldOpenTime;
        this.pairingInReaderInterface = pairingInReaderInterface;
        this.headKeyId = headKeyId;
        this.cardFormats = cardFormats;
        this.activations = activations;
        this.parent = parent;
        this.description = description;
        this.deviceType = deviceType;
        this.situation = situation;
        this.physicalLocation = physicalLocation;
        this.communicationStatus = communicationStatus;
        this.integrated = integrated;
        this.extensibleConfiguration = extensibleConfiguration;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public ReaderDevice(Long address, ReaderDeviceTechnology readerDeviceTechnology, BiometricValidation biometricValidation, BiometricOneToOneValidationType biometricOneToOneValidationType, Boolean validateVehicle, String description, DeviceType deviceType, DeviceSituation situation, PhysicalLocation physicalLocation, DeviceCommunicationStatus communicationStatus, Boolean integrated) {
        this.address = address;
        this.readerDeviceTechnology = readerDeviceTechnology;
        this.biometricValidation = biometricValidation;
        this.biometricOneToOneValidationType = biometricOneToOneValidationType;
        this.validateVehicle = validateVehicle;
        this.description = description;
        this.deviceType = deviceType;
        this.situation = situation;
        this.physicalLocation = physicalLocation;
        this.communicationStatus = communicationStatus;
        this.integrated = integrated;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}