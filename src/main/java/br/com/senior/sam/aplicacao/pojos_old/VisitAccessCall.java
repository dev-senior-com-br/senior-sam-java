package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class VisitAccessCall {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa da Chamada
     */
    public Person personCaller;
    /**
     * Chamada de Acesso
     */
    public AccessCall accessCall;
    /**
     * Credencial Agendada
     */
    public ScheduledCredential scheduledCredential;

    private List<JsonPatch> jsonPatches;

    public VisitAccessCall() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VisitAccessCall(Long id, Person personCaller, AccessCall accessCall, ScheduledCredential scheduledCredential, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.personCaller = personCaller;
        this.accessCall = accessCall;
        this.scheduledCredential = scheduledCredential;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public VisitAccessCall(Person personCaller, ScheduledCredential scheduledCredential) {
        this.personCaller = personCaller;
        this.scheduledCredential = scheduledCredential;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}