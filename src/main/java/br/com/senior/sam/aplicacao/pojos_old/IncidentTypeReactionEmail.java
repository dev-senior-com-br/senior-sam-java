package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class IncidentTypeReactionEmail {

    /**
     * ID
     */
    public Long id;
    /**
     * Tipo de Incidente
     */
    public IncidentType incidentType;
    /**
     * Email
     */
    public String email;

    private List<JsonPatch> jsonPatches;

    public IncidentTypeReactionEmail() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public IncidentTypeReactionEmail(Long id, IncidentType incidentType, String email, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.incidentType = incidentType;
        this.email = email;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public IncidentTypeReactionEmail(String email) {
        this.email = email;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}