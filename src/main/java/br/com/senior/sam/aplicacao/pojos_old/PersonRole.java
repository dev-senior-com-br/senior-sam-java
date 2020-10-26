package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.Role;
import br.com.senior.sam.portaria.pojos.StatusHistoric;

public class PersonRole {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public Person person;
    /**
     * Papel
     */
    public Role role;
    /**
     * Data Início
     */
    public java.time.Instant startDate;
    /**
     * Data Fim
     */
    public java.time.Instant endDate;
    /**
     * Status
     */
    public StatusHistoric status;
    /**
     * Suspensões de Papéis
     */
    public java.util.List<PersonRoleSuspension> personRoleSuspensions;

    private List<JsonPatch> jsonPatches;

    public PersonRole() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PersonRole(Long id, Person person, Role role, java.time.Instant startDate, java.time.Instant endDate, StatusHistoric status, java.util.List<PersonRoleSuspension> personRoleSuspensions, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.role = role;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.personRoleSuspensions = personRoleSuspensions;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public PersonRole(java.time.Instant startDate) {
        this.startDate = startDate;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}