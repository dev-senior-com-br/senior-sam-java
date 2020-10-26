package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class IncidentAttachment {

    /**
     * ID
     */
    public Long id;
    /**
     * Incidente
     */
    public Incident incident;

    private List<JsonPatch> jsonPatches;

    public IncidentAttachment() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public IncidentAttachment(Long id, Incident incident, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.incident = incident;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public IncidentAttachment(Incident incident) {
        this.incident = incident;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}