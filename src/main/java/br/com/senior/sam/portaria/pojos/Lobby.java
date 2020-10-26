package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class Lobby extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome da portaria
     */
    public String name;
    /**
     * Local físico
     */
    public PhysicalLocation physicalLocation;
    /**
     * Validade da foto do colaborador em dias
     */
    public Long provisoryCardPhotoValidityInDays;
    /**
     * Validade da foto do visitante em dias
     */
    public Long scheduledVisitPhotoValidityInDays;
    /**
     * Validade da credencial provisória em dias
     */
    public Long provisoryCredentialValidityInDays;
    /**
     * Validade da credencial de visitante em horas
     */
    public Long schedulingCredentialValidityInHours;
    /**
     * Tolerância no agendamento em minutos
     */
    public Long schedulingToleranceInMinutes;
    /**
     * Limite mensal de credenciais provisórias
     */
    public Long provisoryCredentialsMonthlyLimit;
    /**
     * Estado da portaria
     */
    public Boolean isActive;
    /**
     * Possui integração com GAS
     */
    public Boolean integratedWithGAS = false;
    /**
     * Identificador do Relatório de Agendamento na Plataforma
     */
    public String schedulingReportId;
    /**
     * Utiliza credencial
     */
    public Boolean usesCredential = true;
    /**
     * Tecnologia disponível para credencial
     */
    public List<LobbyCredentialTechnology> lobbyCredentialTechnologies;
    /**
     * Controle de limite de visitas
     */
    public VisitLimitControl visitLimitControl;
    /**
     * Limite de dias com visita por semana
     */
    public Long limitOfDaysWithVisitPerWeek;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    public Lobby() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Lobby(Long id, String name, PhysicalLocation physicalLocation, Long provisoryCardPhotoValidityInDays, Long scheduledVisitPhotoValidityInDays, Long provisoryCredentialValidityInDays, Long schedulingCredentialValidityInHours, Long schedulingToleranceInMinutes, Long provisoryCredentialsMonthlyLimit, Boolean isActive, Boolean integratedWithGAS, String schedulingReportId, Boolean usesCredential, List<LobbyCredentialTechnology> lobbyCredentialTechnologies, VisitLimitControl visitLimitControl, Long limitOfDaysWithVisitPerWeek, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.physicalLocation = physicalLocation;
        this.provisoryCardPhotoValidityInDays = provisoryCardPhotoValidityInDays;
        this.scheduledVisitPhotoValidityInDays = scheduledVisitPhotoValidityInDays;
        this.provisoryCredentialValidityInDays = provisoryCredentialValidityInDays;
        this.schedulingCredentialValidityInHours = schedulingCredentialValidityInHours;
        this.schedulingToleranceInMinutes = schedulingToleranceInMinutes;
        this.provisoryCredentialsMonthlyLimit = provisoryCredentialsMonthlyLimit;
        this.isActive = isActive;
        this.integratedWithGAS = integratedWithGAS != null ? integratedWithGAS : false;
        this.schedulingReportId = schedulingReportId;
        this.usesCredential = usesCredential != null ? usesCredential : true;
        this.lobbyCredentialTechnologies = lobbyCredentialTechnologies;
        this.visitLimitControl = visitLimitControl;
        this.limitOfDaysWithVisitPerWeek = limitOfDaysWithVisitPerWeek;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Lobby(String name, PhysicalLocation physicalLocation, Long provisoryCredentialValidityInDays, Long schedulingCredentialValidityInHours, Boolean isActive, VisitLimitControl visitLimitControl) {
        this.name = name;
        this.physicalLocation = physicalLocation;
        this.provisoryCredentialValidityInDays = provisoryCredentialValidityInDays;
        this.schedulingCredentialValidityInHours = schedulingCredentialValidityInHours;
        this.isActive = isActive;
        this.visitLimitControl = visitLimitControl;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
