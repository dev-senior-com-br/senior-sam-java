package br.com.senior.sam.portaria.pojos;

import java.time.Instant;

public class PersonSituationRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public PersonRecord person;
    /**
     * Data do bloqueio
     */
    public Instant blockDate;
    /**
     * Motivo do bloqueio
     */
    public String blockReason;
    /**
     * Data do desbloqueio
     */
    public Instant unblockDate;
    /**
     * Procedimento de desbloqueio
     */
    public String unblockProcedure;
    /**
     * Justificativa do desbloqueio
     */
    public String unblockJustification;

    public PersonSituationRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PersonSituationRecord(Long id, PersonRecord person, Instant blockDate, String blockReason, Instant unblockDate, String unblockProcedure, String unblockJustification) {
        this.id = id;
        this.person = person;
        this.blockDate = blockDate;
        this.blockReason = blockReason;
        this.unblockDate = unblockDate;
        this.unblockProcedure = unblockProcedure;
        this.unblockJustification = unblockJustification;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public PersonSituationRecord(Long id, PersonRecord person, Instant blockDate, String blockReason) {
        this.id = id;
        this.person = person;
        this.blockDate = blockDate;
        this.blockReason = blockReason;
    }
}