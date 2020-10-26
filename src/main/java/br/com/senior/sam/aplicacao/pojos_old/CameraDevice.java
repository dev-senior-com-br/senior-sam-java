package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;

public class CameraDevice extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Câmera
     */
    public Camera camera;
    /**
     * Dispositivo
     */
    public Device device;

    private List<JsonPatch> jsonPatches;

    public CameraDevice() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public CameraDevice(Long id, Camera camera, Device device, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.camera = camera;
        this.device = device;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public CameraDevice(Device device) {
        this.device = device;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}