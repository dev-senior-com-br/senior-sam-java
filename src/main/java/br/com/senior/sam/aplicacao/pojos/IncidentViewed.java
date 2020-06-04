package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class IncidentViewed {

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
    /**
     * Data de Visualização
     */
    public java.time.Instant viewedDate;

    private List<JsonPatch> jsonPatches;

    public IncidentViewed() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public IncidentViewed(Long id, Incident incident, Person person, java.time.Instant viewedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.incident = incident;
        this.person = person;
        this.viewedDate = viewedDate;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public IncidentViewed(Incident incident, java.time.Instant viewedDate) {
        this.incident = incident;
        this.viewedDate = viewedDate;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}