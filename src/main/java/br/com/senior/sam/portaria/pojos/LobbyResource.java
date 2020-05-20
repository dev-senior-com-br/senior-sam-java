package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class LobbyResource extends CustomDTO {
    /**
     * ID
     */
    public Long id;
    /**
     * Nome do recurso
     */
    public String name;
    /**
     * Tipo de Visita ligados ao Recurso
     */
    public List<VisitResource> visitResources;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    public LobbyResource() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public LobbyResource(Long id, String name, List<VisitResource> visitResources, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.visitResources = visitResources;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public LobbyResource(String name) {
        this.name = name;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
