package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.aplicacao.pojos.LocalTimezone;
import br.com.senior.sam.aplicacao.pojos.Person;
import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.Role;

import java.util.List;

public class User {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public Person person;
    /**
     * Login
     */
    public String login;
    /**
     * Fuso Horário Local
     */
    public LocalTimezone localTimeZone;
    /**
     * Papel Padrão Credencial
     */
    public Role credentialStandardRole;

    private List<JsonPatch> jsonPatches;

    public User() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public User(Long id, Person person, String login, LocalTimezone localTimeZone, Role credentialStandardRole, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.login = login;
        this.localTimeZone = localTimeZone;
        this.credentialStandardRole = credentialStandardRole;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public User(Person person, String login) {
        this.person = person;
        this.login = login;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}