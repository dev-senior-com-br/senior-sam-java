package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Procedure {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome do procedimento
     */
    public String name;
    /**
     * Descrição do procedimento
     */
    public String description;
    /**
     * Validade do procedimento em dias
     */
    public Long validityDays;
    /**
     * Possui integração com GAS
     */
    public Boolean integratedWithGAS = false;
    /**
     * Exige coleta de informações
     */
    public Boolean requiresInformationGathering = false;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    private Map<String, Object> custom;

    public Procedure() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Procedure(Long id, String name, String description, Long validityDays, Boolean integratedWithGAS, Boolean requiresInformationGathering, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.validityDays = validityDays;
        this.integratedWithGAS = integratedWithGAS != null ? integratedWithGAS : false;
        this.requiresInformationGathering = requiresInformationGathering != null ? requiresInformationGathering : false;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Procedure(String name, Long validityDays) {
        this.name = name;
        this.validityDays = validityDays;
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