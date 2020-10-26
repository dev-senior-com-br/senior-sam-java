package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.PhysicalLocation;

public class InputDevice {

    /**
     * ID
     */
    public Long id;
    /**
     * Gera Incidente
     */
    public Boolean generateIncident;
    /**
     * Endereço
     */
    public Long address;
    /**
     * Estado Padrão da Entrada
     */
    public InputState defaultState;
    /**
     * Delay de Ativação da Entrada
     */
    public Long activationDelay;
    /**
     * Estado Atual da Entrada
     */
    public InputState inputState;
    /**
     * Tipo de Incidente
     */
    public IncidentType incidentType;
    /**
     * Prioridade do Incidente
     */
    public IncidentPriority incidentPriority;
    /**
     * Mascaramentos da Entrada
     */
    public java.util.List<InputMasking> masks;
    /**
     * Acionamentos
     */
    public java.util.List<OutputDeviceActivations> activations;
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

    public InputDevice() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public InputDevice(Long id, Boolean generateIncident, Long address, InputState defaultState, Long activationDelay, InputState inputState, IncidentType incidentType, IncidentPriority incidentPriority, java.util.List<InputMasking> masks, java.util.List<OutputDeviceActivations> activations, Device parent, String description, DeviceType deviceType, DeviceSituation situation, PhysicalLocation physicalLocation, DeviceCommunicationStatus communicationStatus, Boolean integrated, ExtensibleConfiguration extensibleConfiguration, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.generateIncident = generateIncident;
        this.address = address;
        this.defaultState = defaultState;
        this.activationDelay = activationDelay;
        this.inputState = inputState;
        this.incidentType = incidentType;
        this.incidentPriority = incidentPriority;
        this.masks = masks;
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
    public InputDevice(Boolean generateIncident, Long address, InputState defaultState, Long activationDelay, IncidentType incidentType, IncidentPriority incidentPriority, String description, DeviceType deviceType, DeviceSituation situation, PhysicalLocation physicalLocation, DeviceCommunicationStatus communicationStatus, Boolean integrated) {
        this.generateIncident = generateIncident;
        this.address = address;
        this.defaultState = defaultState;
        this.activationDelay = activationDelay;
        this.incidentType = incidentType;
        this.incidentPriority = incidentPriority;
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