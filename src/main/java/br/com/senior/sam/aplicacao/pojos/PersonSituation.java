package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.aplicacao.pojos.Person;
import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class PersonSituation {

   /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public Person person;
    /**
     * Data do Bloqueio
     */
    public java.time.Instant blockDate;
    /**
     * Motivo do Bloqueio
     */
    public String blockReason;
    /**
     * Data do Desbloqueio
     */
    public java.time.Instant unblockDate;
    /**
     * Procedimento de Desbloqueio
     */
    public String unblockProcedure;
    /**
     * Justificativa do Desbloqueio
     */
    public String unblockJustification;

    private List<JsonPatch> jsonPatches;

    public PersonSituation() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PersonSituation(Long id, Person person, java.time.Instant blockDate, String blockReason, java.time.Instant unblockDate, String unblockProcedure, String unblockJustification, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.blockDate = blockDate;
        this.blockReason = blockReason;
        this.unblockDate = unblockDate;
        this.unblockProcedure = unblockProcedure;
        this.unblockJustification = unblockJustification;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public PersonSituation(java.time.Instant blockDate) {
        this.blockDate = blockDate;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}