package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class IncidentTypeAction {

    /**
     * ID
     */
    public Long id;
    /**
     * Tipo do Incidente
     */
    public IncidentType incidentType;
    /**
     * Dispositivo de Saída
     */
    public Device outputDevice;
    /**
     * Tipo do Acionamento
     */
    public IncidentTypeActionType incidentTypeActionType;
    /**
     * Tempo do Acionamento
     */
    public Long actionTime;

    private List<JsonPatch> jsonPatches;

    public IncidentTypeAction() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public IncidentTypeAction(Long id, IncidentType incidentType, Device outputDevice, IncidentTypeActionType incidentTypeActionType, Long actionTime, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.incidentType = incidentType;
        this.outputDevice = outputDevice;
        this.incidentTypeActionType = incidentTypeActionType;
        this.actionTime = actionTime;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public IncidentTypeAction(Device outputDevice, IncidentTypeActionType incidentTypeActionType) {
        this.outputDevice = outputDevice;
        this.incidentTypeActionType = incidentTypeActionType;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}