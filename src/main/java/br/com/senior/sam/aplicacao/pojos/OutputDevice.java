package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.PhysicalLocation;

import java.util.List;

public class OutputDevice {

    /**
     * ID
     */
    public Long id;
    /**
     * Endereço
     */
    public Long address;
    /**
     * Estado Padrão da Saída
     */
    public OutputState defaultState;
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

    public OutputDevice() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public OutputDevice(Long id, Long address, OutputState defaultState, Device parent, String description, DeviceType deviceType, DeviceSituation situation, PhysicalLocation physicalLocation, DeviceCommunicationStatus communicationStatus, Boolean integrated, ExtensibleConfiguration extensibleConfiguration, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.address = address;
        this.defaultState = defaultState;
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
    public OutputDevice(Long address, OutputState defaultState, String description, DeviceType deviceType, DeviceSituation situation, PhysicalLocation physicalLocation, DeviceCommunicationStatus communicationStatus, Boolean integrated) {
        this.address = address;
        this.defaultState = defaultState;
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