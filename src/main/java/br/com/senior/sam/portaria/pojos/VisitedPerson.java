package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class VisitedPerson extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Visitado
     */
    public Long personId;
    /**
     * Agendamento
     */
    public Scheduling scheduling;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    public VisitedPerson() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VisitedPerson(Long id, Long personId, Scheduling scheduling, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.personId = personId;
        this.scheduling = scheduling;
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