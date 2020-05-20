package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class PersonRoleRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public PersonRecord person;
    /**
     * Papel
     */
    public RoleRecord role;
    /**
     * Data início
     */
    public Instant startDate;
    /**
     * Data fim
     */
    public Instant endDate;
    /**
     * Status
     */
    public StatusHistoric status;
    /**
     * Suspensões de papéis
     */
    public List<PersonRoleSuspensionRecord> personRoleSuspensions;

    public PersonRoleRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PersonRoleRecord(Long id, PersonRecord person, RoleRecord role, Instant startDate, Instant endDate, StatusHistoric status, List<PersonRoleSuspensionRecord> personRoleSuspensions) {
        this.id = id;
        this.person = person;
        this.role = role;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.personRoleSuspensions = personRoleSuspensions;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public PersonRoleRecord(Long id, Instant startDate) {
        this.id = id;
        this.startDate = startDate;
    }
}