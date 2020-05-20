package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchedulingResource {

    /**
     * ID
     */
    public Long id;
    /**
     * Agendamento
     */
    public Scheduling scheduling;
    /**
     * Recurso
     */
    public LobbyResource lobbyResource;
    /**
     * Quantidade
     */
    public Long quantity;
    /**
     * Observação
     */
    public String note;
    public String createdBy;
    public Instant createdDate;
    public String lastModifiedBy;
    public Instant lastModifiedDate;

    private List<JsonPatch> jsonPatches;

    private Map<String, Object> custom;

    public SchedulingResource() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public SchedulingResource(Long id, Scheduling scheduling, LobbyResource lobbyResource, Long quantity, String note, String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.scheduling = scheduling;
        this.lobbyResource = lobbyResource;
        this.quantity = quantity;
        this.note = note;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.jsonPatches = jsonPatches;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }

    /**
     * Sets the value of a custom field.
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
