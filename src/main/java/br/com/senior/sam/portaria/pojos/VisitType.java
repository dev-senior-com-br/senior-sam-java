package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class VisitType extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome do tipo de visita
     */
    public String name;
    /**
     * Procedimentos da visita
     */
    public List<VisitProcedure> visitProcedures;
    /**
     * Papel padrão para o tipo de visita
     */
    public Role role;
    /**
     * Recursos padrão do tipo de visita
     */
    public List<VisitResource> visitResources;
    /**
     * Flag se o tipo de visita é utilizado pelo totem
     */
    public Boolean usedBySelfServiceTerminal;
    /**
     * Flag se envia email de notificação ao visitado
     */
    public Boolean sendEmailToVisited;
    /**
     * Possui integração com GAS
     */
    public Boolean integratedWithGAS = false;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    public VisitType() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public VisitType(Long id, String name, List<VisitProcedure> visitProcedures, Role role, List<VisitResource> visitResources, Boolean usedBySelfServiceTerminal, Boolean sendEmailToVisited, Boolean integratedWithGAS, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.visitProcedures = visitProcedures;
        this.role = role;
        this.visitResources = visitResources;
        this.usedBySelfServiceTerminal = usedBySelfServiceTerminal;
        this.sendEmailToVisited = sendEmailToVisited;
        this.integratedWithGAS = integratedWithGAS != null ? integratedWithGAS : false;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public VisitType(String name, Role role, Boolean usedBySelfServiceTerminal, Boolean sendEmailToVisited) {
        this.name = name;
        this.role = role;
        this.usedBySelfServiceTerminal = usedBySelfServiceTerminal;
        this.sendEmailToVisited = sendEmailToVisited;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
