package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class IncidentTypeReactionManagerDevice {

    /**
     * ID
     */
    public Long id;
    /**
     * Tipo de Incidente
     */
    public IncidentType incidentType;
    /**
     * Gerênciador
     */
    public Device managerDevice;

    private List<JsonPatch> jsonPatches;

    public IncidentTypeReactionManagerDevice() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public IncidentTypeReactionManagerDevice(Long id, IncidentType incidentType, Device managerDevice, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.incidentType = incidentType;
        this.managerDevice = managerDevice;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public IncidentTypeReactionManagerDevice(Device managerDevice) {
        this.managerDevice = managerDevice;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}