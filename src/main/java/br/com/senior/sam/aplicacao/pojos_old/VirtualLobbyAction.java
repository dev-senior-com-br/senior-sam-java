package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class VirtualLobbyAction {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome
     */
    public String name;
    /**
     * Portaria Virtual
     */
    public VirtualLobby virtualLobby;
    /**
     * Movimentação da Pessoa
     */
    public VirtualLobbyMovementType virtualLobbyMovementType;
    /**
     * Acionamento Ativo
     */
    public Boolean isActive;
    /**
     * Saídas do Acionamento
     */
    public java.util.List<VirtualLobbyActionOutput> outputs;

    private List<JsonPatch> jsonPatches;

    public VirtualLobbyAction() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VirtualLobbyAction(Long id, String name, VirtualLobby virtualLobby, VirtualLobbyMovementType virtualLobbyMovementType, Boolean isActive, java.util.List<VirtualLobbyActionOutput> outputs, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.virtualLobby = virtualLobby;
        this.virtualLobbyMovementType = virtualLobbyMovementType;
        this.isActive = isActive;
        this.outputs = outputs;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public VirtualLobbyAction(String name, Boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}