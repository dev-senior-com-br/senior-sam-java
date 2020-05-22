package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.PhysicalLocation;

import java.util.List;

public class Camera extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome
     */
    public String name;
    /**
     * Câmera PTZ
     */
    public Boolean isPTZ;
    /**
     * Servidor DVR
     */
    public DvrServer dvrServer;
    /**
     * Servidor da Câmera
     */
    public String cameraServerId;
    /**
     * Link do Stream da Câmera
     */
    public String streamLink;
    /**
     * Local Físico
     */
    public PhysicalLocation physicalLocation;
    /**
     * Status da Câmera
     */
    public CameraStatus status;
    /**
     * Proxy CCTV
     */
    public CctvProxy cctvProxy;
    /**
     * Relação Câmera e Dispositivos
     */
    public java.util.List<CameraDevice> devices;
    /**
     * Url de streaming
     */
    public String urlStreaming;

    private List<JsonPatch> jsonPatches;

    public Camera() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Camera(Long id, String name, Boolean isPTZ, DvrServer dvrServer, String cameraServerId, String streamLink, PhysicalLocation physicalLocation, CameraStatus status, CctvProxy cctvProxy, java.util.List<CameraDevice> devices, String urlStreaming, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.isPTZ = isPTZ;
        this.dvrServer = dvrServer;
        this.cameraServerId = cameraServerId;
        this.streamLink = streamLink;
        this.physicalLocation = physicalLocation;
        this.status = status;
        this.cctvProxy = cctvProxy;
        this.devices = devices;
        this.urlStreaming = urlStreaming;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Camera(String name, Boolean isPTZ, PhysicalLocation physicalLocation, CameraStatus status) {
        this.name = name;
        this.isPTZ = isPTZ;
        this.physicalLocation = physicalLocation;
        this.status = status;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}