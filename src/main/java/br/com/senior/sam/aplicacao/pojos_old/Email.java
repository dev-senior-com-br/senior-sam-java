package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class Email {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public Person person;
    /**
     * Email Preferencial
     */
    public Boolean preferential = false;
    /**
     * Documento
     */
    public String email;

    private List<JsonPatch> jsonPatches;

    public Email() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Email(Long id, Person person, Boolean preferential, String email, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.preferential = preferential != null ? preferential : false;
        this.email = email;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Email(String email) {
        this.email = email;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
