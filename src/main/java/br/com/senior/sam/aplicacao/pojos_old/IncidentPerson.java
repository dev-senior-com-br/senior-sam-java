package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class IncidentPerson {

    /**
     * ID
     */
    public Long id;
    /**
     * Incidente
     */
    public Incident incident;
    /**
     * Pessoa
     */
    public Person person;

    private List<JsonPatch> jsonPatches;

    public IncidentPerson() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public IncidentPerson(Long id, Incident incident, Person person, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.incident = incident;
        this.person = person;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public IncidentPerson(Person person) {
        this.person = person;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}