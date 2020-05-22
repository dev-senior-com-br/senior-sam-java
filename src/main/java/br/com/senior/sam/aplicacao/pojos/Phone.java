package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.aplicacao.pojos.Person;
import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class Phone {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public Person person;
    /**
     * Telefone Preferencial
     */
    public Boolean preferential = false;
    /**
     * DDI/IDD (International Direct Dialing)
     */
    public Long idd;
    /**
     * Número do Telefone
     */
    public String number;
    /**
     * Ramal
     */
    public String phoneExtension;

    private List<JsonPatch> jsonPatches;

    public Phone() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Phone(Long id, Person person, Boolean preferential, Long idd, String number, String phoneExtension, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.preferential = preferential != null ? preferential : false;
        this.idd = idd;
        this.number = number;
        this.phoneExtension = phoneExtension;
        this.jsonPatches = jsonPatches;
    }

    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Phone(String number) {
        this.number = number;
    }

    public List<JsonPatch> getJsonPatches() {
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}