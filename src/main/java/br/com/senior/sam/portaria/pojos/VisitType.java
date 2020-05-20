package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.*;

public class VisitType {

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

    private Map<String, Object> custom;

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

    /**
     * Sets the value of a custom field.
     *
     * @param field name of the field
     * @param value value of the field
     */
    public void setCustom(String field, Object value) {
        if (custom == null) {
            custom = new HashMap<>();
        }
        custom.put(field, value);
    }

    /**
     * Returns the value of the custom field.
     *
     * @param field name of the field
     * @return value of the field, or <code>null</code> if the field is not present
     */
    public Object getCustom(String field) {
        if (custom != null) {
            return custom.get(field);
        }
        return custom;
    }

    /**
     * Returns the map with all custom fields set.
     *
     * @return map with the custom fields
     */
    public Map<String, Object> getCustom() {
        return custom != null ? Collections.unmodifiableMap(custom) : Collections.emptyMap();
    }
}
