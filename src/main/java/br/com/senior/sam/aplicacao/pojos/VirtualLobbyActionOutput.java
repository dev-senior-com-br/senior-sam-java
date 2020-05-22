package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class VirtualLobbyActionOutput {

    /**
     * ID
     */
    public Long id;
    /**
     * Acionamento da Portaria Virtual
     */
    public VirtualLobbyAction virtualLobbyAction;
    /**
     * Dispositivo de Saída
     */
    public Device outputDevice;
    /**
     * Tipo do Acionamento da Portaria Virtual
     */
    public VirtualLobbyActionType virtualLobbyActionType;
    /**
     * Tempo do Acionamento
     */
    public Long actionTime;

    private List<JsonPatch> jsonPatches;

    public VirtualLobbyActionOutput() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VirtualLobbyActionOutput(Long id, VirtualLobbyAction virtualLobbyAction, Device outputDevice, VirtualLobbyActionType virtualLobbyActionType, Long actionTime, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.virtualLobbyAction = virtualLobbyAction;
        this.outputDevice = outputDevice;
        this.virtualLobbyActionType = virtualLobbyActionType;
        this.actionTime = actionTime;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public VirtualLobbyActionOutput(Device outputDevice, VirtualLobbyActionType virtualLobbyActionType) {
        this.outputDevice = outputDevice;
        this.virtualLobbyActionType = virtualLobbyActionType;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}