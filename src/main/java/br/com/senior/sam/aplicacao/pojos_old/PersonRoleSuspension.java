package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.StatusHistoric;

public class PersonRoleSuspension {

    /**
     * ID
     */
    public Long id;
    /**
     * Ligação Pessoa Papel
     */
    public PersonRole personRole;
    /**
     * Data Início
     */
    public java.time.Instant startDate;
    /**
     * Data Fim
     */
    public java.time.Instant endDate;
    /**
     * Justificativa
     */
    public String justification;
    /**
     * Status
     */
    public StatusHistoric status;

    private List<JsonPatch> jsonPatches;

    public PersonRoleSuspension() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PersonRoleSuspension(Long id, PersonRole personRole, java.time.Instant startDate, java.time.Instant endDate, String justification, StatusHistoric status, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.personRole = personRole;
        this.startDate = startDate;
        this.endDate = endDate;
        this.justification = justification;
        this.status = status;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public PersonRoleSuspension(java.time.Instant startDate, String justification) {
        this.startDate = startDate;
        this.justification = justification;
    }

   public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}