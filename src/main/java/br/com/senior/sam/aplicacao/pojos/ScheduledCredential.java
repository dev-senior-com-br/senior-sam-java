package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.aplicacao.pojos.CredentialFormat;
import br.com.senior.sam.aplicacao.pojos.Group;
import br.com.senior.sam.aplicacao.pojos.Person;
import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.PhysicalLocation;
import br.com.senior.sam.portaria.pojos.Role;

import java.util.List;

public class ScheduledCredential {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public Person person;
    /**
     * Data do Agendamento
     */
    public java.time.Instant scheludingDate;
    /**
     * Formato da Credencial
     */
    public CredentialFormat credentialFormat;
    /**
     * Papel
     */
    public Role role;
    /**
     * Grupo
     */
    public Group group;
    /**
     * Data Final
     */
    public java.time.Instant endDate;
    /**
     * Pessoa Visitada
     */
    public Person visitedPerson;
    /**
     * Localizador
     */
    public String locator;
    /**
     * Local da Visita
     */
    public PhysicalLocation visitedPlace;

    private List<JsonPatch> jsonPatches;

    public ScheduledCredential() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public ScheduledCredential(Long id, Person person, java.time.Instant scheludingDate, CredentialFormat credentialFormat, Role role, Group group, java.time.Instant endDate, Person visitedPerson, String locator, PhysicalLocation visitedPlace, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.scheludingDate = scheludingDate;
        this.credentialFormat = credentialFormat;
        this.role = role;
        this.group = group;
        this.endDate = endDate;
        this.visitedPerson = visitedPerson;
        this.locator = locator;
        this.visitedPlace = visitedPlace;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public ScheduledCredential(Person person, java.time.Instant scheludingDate, Group group, java.time.Instant endDate) {
        this.person = person;
        this.scheludingDate = scheludingDate;
        this.group = group;
        this.endDate = endDate;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}