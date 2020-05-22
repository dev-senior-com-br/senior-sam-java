package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class OrganizationalStructurePerson {

    /**
     * ID
     */
    public Long id;
    /**
     * Estrutura organizacional
     */
    public OrganizationalStructure organizationalStructure;
    /**
     * Pessoa
     */
    public Person person;

    private List<JsonPatch> jsonPatches;

    public OrganizationalStructurePerson() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public OrganizationalStructurePerson(Long id, OrganizationalStructure organizationalStructure, Person person, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.organizationalStructure = organizationalStructure;
        this.person = person;
        this.jsonPatches = jsonPatches;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}