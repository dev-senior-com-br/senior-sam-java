package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class SchedulingResource extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Agendamento
     */
    public Scheduling scheduling;
    /**
     * Recurso
     */
    public LobbyResource lobbyResource;
    /**
     * Quantidade
     */
    public Long quantity;
    /**
     * Observação
     */
    public String note;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    public SchedulingResource() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public SchedulingResource(Long id, Scheduling scheduling, LobbyResource lobbyResource, Long quantity, String note, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.scheduling = scheduling;
        this.lobbyResource = lobbyResource;
        this.quantity = quantity;
        this.note = note;
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
