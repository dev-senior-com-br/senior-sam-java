package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class OrganizationalStructureType {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome
     */
    public String name;

    private List<JsonPatch> jsonPatches;

    public OrganizationalStructureType() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public OrganizationalStructureType(Long id, String name, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public OrganizationalStructureType(String name) {
        this.name = name;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}