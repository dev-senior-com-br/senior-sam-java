package br.com.senior.sam.portaria.pojos;

import java.time.Instant;

public class PersonRoleSuspensionRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Ligação pessoa papel
     */
    public PersonRoleRecord personRole;
    /**
     * Data início
     */
    public Instant startDate;
    /**
     * Data fim
     */
    public Instant endDate;
    /**
     * Justificativa
     */
    public String justification;
    /**
     * Status
     */
    public StatusHistoric status;

    public PersonRoleSuspensionRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PersonRoleSuspensionRecord(Long id, PersonRoleRecord personRole, Instant startDate, Instant endDate, String justification, StatusHistoric status) {
        this.id = id;
        this.personRole = personRole;
        this.startDate = startDate;
        this.endDate = endDate;
        this.justification = justification;
        this.status = status;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public PersonRoleSuspensionRecord(Long id, Instant startDate, String justification) {
        this.id = id;
        this.startDate = startDate;
        this.justification = justification;
    }
}