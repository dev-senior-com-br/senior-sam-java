package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class IncidentProcedure {

    /**
     * ID
     */
    public Long id;
    /**
     * Incidente
     */
    public Incident incident;
    /**
     * Descrição
     */
    public String description;
    /**
     * Usuário
     */
    public Long user;
    /**
     * Data do trâmite
     */
    public java.time.Instant procedureDate;
    /**
     * Tipo do trâmite
     */
    public IncidentProcedureType incidentProcedureType;
    /**
     * Status anterior
     */
    public IncidentStatus previousStatus;
    /**
     * Status novo
     */
    public IncidentStatus newStatus;
    /**
     * Prioridade anterior
     */
    public IncidentPriority previousPriority;
    /**
     * Prioridade nova
     */
    public IncidentPriority newPriority;
    /**
     * Anexo do tramite
     */
    public IncidentAttachment incidentAttachment;

    private List<JsonPatch> jsonPatches;

    public IncidentProcedure() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public IncidentProcedure(Long id, Incident incident, String description, Long user, java.time.Instant procedureDate, IncidentProcedureType incidentProcedureType, IncidentStatus previousStatus, IncidentStatus newStatus, IncidentPriority previousPriority, IncidentPriority newPriority, IncidentAttachment incidentAttachment, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.incident = incident;
        this.description = description;
        this.user = user;
        this.procedureDate = procedureDate;
        this.incidentProcedureType = incidentProcedureType;
        this.previousStatus = previousStatus;
        this.newStatus = newStatus;
        this.previousPriority = previousPriority;
        this.newPriority = newPriority;
        this.incidentAttachment = incidentAttachment;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public IncidentProcedure(String description, Long user, java.time.Instant procedureDate, IncidentProcedureType incidentProcedureType, IncidentStatus previousStatus, IncidentStatus newStatus, IncidentPriority previousPriority, IncidentPriority newPriority, IncidentAttachment incidentAttachment) {
        this.description = description;
        this.user = user;
        this.procedureDate = procedureDate;
        this.incidentProcedureType = incidentProcedureType;
        this.previousStatus = previousStatus;
        this.newStatus = newStatus;
        this.previousPriority = previousPriority;
        this.newPriority = newPriority;
        this.incidentAttachment = incidentAttachment;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}