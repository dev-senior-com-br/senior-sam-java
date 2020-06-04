package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class GroupPerson extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public Person person;
    /**
     * Grupo
     */
    public Group group;

    private List<JsonPatch> jsonPatches;

    public GroupPerson() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public GroupPerson(Long id, Person person, Group group, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.group = group;
        this.jsonPatches = jsonPatches;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}