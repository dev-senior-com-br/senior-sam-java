package br.com.senior.sam.portaria.pojos;

import java.util.List;

public class Role {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome
     */
    public String name;
    /**
     * Papel Utilizado pelo Provisório
     */
    public Boolean usedByProvisory;
    /**
     * Papel que Recebe Visita
     */
    public Boolean receiveVisit;

    private List<JsonPatch> jsonPatches;

    public Role() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Role(Long id, String name, Boolean usedByProvisory, Boolean receiveVisit, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.usedByProvisory = usedByProvisory;
        this.receiveVisit = receiveVisit;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Role(String name, Boolean usedByProvisory, Boolean receiveVisit) {
        this.name = name;
        this.usedByProvisory = usedByProvisory;
        this.receiveVisit = receiveVisit;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
