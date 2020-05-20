package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.*;

public class VisitResource extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Tipo da visita
     */
    public VisitType visitType;
    /**
     * Recurso
     */
    public LobbyResource lobbyResource;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    public VisitResource() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VisitResource(Long id, VisitType visitType, LobbyResource lobbyResource, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.visitType = visitType;
        this.lobbyResource = lobbyResource;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
