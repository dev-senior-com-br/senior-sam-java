package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.PhysicalLocation;

import java.util.List;

public class VirtualLobby {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome
     */
    public String name;
    /**
     * Descrição
     */
    public String description;
    /**
     * Local Físico
     */
    public PhysicalLocation physicalLocation;
    /**
     * Local Físico de Origem
     */
    public PhysicalLocation originPhysicalLocation;
    /**
     * Local Físico de Destino
     */
    public PhysicalLocation destinationPhysicalLocation;
    /**
     * Grupo
     */
    public Group group;
    /**
     * Situação da Portaria Virtual
     */
    public VirtualLobbySituation situation;
    /**
     * Câmeras da Portaria Virtual
     */
    public java.util.List<VirtualLobbyCamera> cameras;
    /**
     * Acionamentos da Portaria Virtual
     */
    public java.util.List<VirtualLobbyAction> actions;
    /**
     * Dispositivos da Portaria Virtual
     */
    public java.util.List<VirtualLobbyDevice> devices;

    private List<JsonPatch> jsonPatches;

    public VirtualLobby() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VirtualLobby(Long id, String name, String description, PhysicalLocation physicalLocation, PhysicalLocation originPhysicalLocation, PhysicalLocation destinationPhysicalLocation, Group group, VirtualLobbySituation situation, java.util.List<VirtualLobbyCamera> cameras, java.util.List<VirtualLobbyAction> actions, java.util.List<VirtualLobbyDevice> devices, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.physicalLocation = physicalLocation;
        this.originPhysicalLocation = originPhysicalLocation;
        this.destinationPhysicalLocation = destinationPhysicalLocation;
        this.group = group;
        this.situation = situation;
        this.cameras = cameras;
        this.actions = actions;
        this.devices = devices;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public VirtualLobby(String name, PhysicalLocation physicalLocation, PhysicalLocation originPhysicalLocation, PhysicalLocation destinationPhysicalLocation, VirtualLobbySituation situation) {
        this.name = name;
        this.physicalLocation = physicalLocation;
        this.originPhysicalLocation = originPhysicalLocation;
        this.destinationPhysicalLocation = destinationPhysicalLocation;
        this.situation = situation;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}