package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.PhysicalLocation;

import java.util.List;

public class Incident {

    /**
     * ID
     */
    public Long id;
    /**
     * Descrição
     */
    public String description;
    /**
     * Local Físico
     */
    public PhysicalLocation physicalLocation;
    /**
     * Tipo de Incidente
     */
    public IncidentType incidentType;
    /**
     * Prioridade do Incidente
     */
    public IncidentPriority incidentPriority;
    /**
     * Usuário
     */
    public Long userId;
    /**
     * Dispositivo
     */
    public Device device;
    /**
     * Status do Incidente
     */
    public IncidentStatus status;
    /**
     * Data da Criação
     */
    public java.time.Instant creationDate;
    /**
     * Data
     */
    public java.time.Instant incidentDate;
    /**
     * Timezone offset
     */
    public Long timezoneOffset;
    /**
     * Tramites
     */
    public java.util.List<IncidentProcedure> procedures;
    /**
     * Pessoas
     */
    public java.util.List<IncidentPerson> people;

    private List<JsonPatch> jsonPatches;

    public Incident() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Incident(Long id, String description, PhysicalLocation physicalLocation, IncidentType incidentType, IncidentPriority incidentPriority, Long userId, Device device, IncidentStatus status, java.time.Instant creationDate, java.time.Instant incidentDate, Long timezoneOffset, java.util.List<IncidentProcedure> procedures, java.util.List<IncidentPerson> people, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.description = description;
        this.physicalLocation = physicalLocation;
        this.incidentType = incidentType;
        this.incidentPriority = incidentPriority;
        this.userId = userId;
        this.device = device;
        this.status = status;
        this.creationDate = creationDate;
        this.incidentDate = incidentDate;
        this.timezoneOffset = timezoneOffset;
        this.procedures = procedures;
        this.people = people;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Incident(String description, PhysicalLocation physicalLocation, IncidentType incidentType, IncidentPriority incidentPriority, Long userId, Device device, IncidentStatus status, java.time.Instant creationDate, java.time.Instant incidentDate, Long timezoneOffset) {
        this.description = description;
        this.physicalLocation = physicalLocation;
        this.incidentType = incidentType;
        this.incidentPriority = incidentPriority;
        this.userId = userId;
        this.device = device;
        this.status = status;
        this.creationDate = creationDate;
        this.incidentDate = incidentDate;
        this.timezoneOffset = timezoneOffset;
    }

   public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}