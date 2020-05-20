package br.com.senior.sam.portaria.pojos;

import java.util.List;

public class PhysicalLocation {

    /**
     * ID
     */
    public Long id;
    /**
     * Local Físico Pai
     */
    public Long parent;
    /**
     * Nome
     */
    public String name;
    /**
     * Status do Local Físico
     */
    public PhysicalLocationStatus status;

    private List<JsonPatch> jsonPatches;

    public PhysicalLocation() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PhysicalLocation(Long id, Long parent, String name, PhysicalLocationStatus status, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.status = status;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public PhysicalLocation(Long parent, String name, PhysicalLocationStatus status) {
        this.parent = parent;
        this.name = name;
        this.status = status;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
