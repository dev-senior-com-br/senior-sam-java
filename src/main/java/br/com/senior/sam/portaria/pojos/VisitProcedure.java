package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class VisitProcedure extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Tipo da visita
     */
    public VisitType visitType;
    /**
     * Procedimento
     */
    public Procedure procedure;
    /**
     * Flag sinalizando se execução do procedimento é obrigatória
     */
    public Boolean required;
    /**
     * Possui integração com GAS
     */
    public Boolean integratedWithGAS = false;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    public VisitProcedure() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VisitProcedure(Long id, VisitType visitType, Procedure procedure, Boolean required, Boolean integratedWithGAS, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.visitType = visitType;
        this.procedure = procedure;
        this.required = required;
        this.integratedWithGAS = integratedWithGAS != null ? integratedWithGAS : false;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public VisitProcedure(Boolean required) {
        this.required = required;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}