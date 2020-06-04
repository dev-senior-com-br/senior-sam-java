package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class IncidentType extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome
     */
    public String name;
    /**
     * Descrição
     */
    public String description;
    /**
     * Monitorado
     */
    public Boolean monitored;
    /**
     * Prioridade Padrão
     */
    public IncidentPriority defaultPriority;
    /**
     * Emails
     */
    public java.util.List<IncidentTypeReactionEmail> emails;
    /**
     * Acionamentos
     */
    public java.util.List<IncidentTypeAction> activations;
    /**
     * Gerênciadores
     */
    public java.util.List<IncidentTypeReactionManagerDevice> managerDevices;

    private List<JsonPatch> jsonPatches;

    public IncidentType() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public IncidentType(Long id, String name, String description, Boolean monitored, IncidentPriority defaultPriority, java.util.List<IncidentTypeReactionEmail> emails, java.util.List<IncidentTypeAction> activations, java.util.List<IncidentTypeReactionManagerDevice> managerDevices, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.monitored = monitored;
        this.defaultPriority = defaultPriority;
        this.emails = emails;
        this.activations = activations;
        this.managerDevices = managerDevices;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public IncidentType(String name, Boolean monitored, IncidentPriority defaultPriority) {
        this.name = name;
        this.monitored = monitored;
        this.defaultPriority = defaultPriority;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}