package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class Procedure extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome do procedimento
     */
    public String name;
    /**
     * Descrição do procedimento
     */
    public String description;
    /**
     * Validade do procedimento em dias
     */
    public Long validityDays;
    /**
     * Possui integração com GAS
     */
    public Boolean integratedWithGAS = false;
    /**
     * Exige coleta de informações
     */
    public Boolean requiresInformationGathering = false;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    public Procedure() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Procedure(Long id, String name, String description, Long validityDays, Boolean integratedWithGAS, Boolean requiresInformationGathering, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.validityDays = validityDays;
        this.integratedWithGAS = integratedWithGAS != null ? integratedWithGAS : false;
        this.requiresInformationGathering = requiresInformationGathering != null ? requiresInformationGathering : false;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Procedure(String name, Long validityDays) {
        this.name = name;
        this.validityDays = validityDays;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}