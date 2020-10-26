package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class VirtualLobbyDevice {

    /**
     * ID
     */
    public Long id;
    /**
     * Dispositivo
     */
    public Device device;
    /**
     * Portaria Virtual
     */
    public VirtualLobby virtualLobby;
    /**
     * Tipo da Geração de Chamado
     */
    public CallGenerationType callGenerationType;
    /**
     * Acionamento da Portaria
     */
    public VirtualLobbyAction virtualLobbyAction;

    private List<JsonPatch> jsonPatches;

    public VirtualLobbyDevice() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VirtualLobbyDevice(Long id, Device device, VirtualLobby virtualLobby, CallGenerationType callGenerationType, VirtualLobbyAction virtualLobbyAction, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.device = device;
        this.virtualLobby = virtualLobby;
        this.callGenerationType = callGenerationType;
        this.virtualLobbyAction = virtualLobbyAction;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public VirtualLobbyDevice(Device device, CallGenerationType callGenerationType, VirtualLobbyAction virtualLobbyAction) {
        this.device = device;
        this.callGenerationType = callGenerationType;
        this.virtualLobbyAction = virtualLobbyAction;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}