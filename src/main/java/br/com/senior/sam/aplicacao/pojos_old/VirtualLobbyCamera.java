package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class VirtualLobbyCamera {

    /**
     * ID
     */
    public Long id;
    /**
     * Câmera
     */
    public Camera camera;
    /**
     * Portaria Virtual
     */
    public VirtualLobby virtualLobby;

    private List<JsonPatch> jsonPatches;

    public VirtualLobbyCamera() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VirtualLobbyCamera(Long id, Camera camera, VirtualLobby virtualLobby, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.camera = camera;
        this.virtualLobby = virtualLobby;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public VirtualLobbyCamera(Camera camera) {
        this.camera = camera;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}