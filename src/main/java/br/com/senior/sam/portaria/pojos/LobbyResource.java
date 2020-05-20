package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LobbyResource {
    /**
     * ID
     */
    public Long id;
    /**
     * Nome do recurso
     */
    public String name;
    /**
     * Tipo de Visita ligados ao Recurso
     */
    public List<VisitResource> visitResources;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    private Map<String, Object> custom;

    public LobbyResource() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public LobbyResource(Long id, String name, List<VisitResource> visitResources, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.visitResources = visitResources;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public LobbyResource(String name) {
        this.name = name;
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
