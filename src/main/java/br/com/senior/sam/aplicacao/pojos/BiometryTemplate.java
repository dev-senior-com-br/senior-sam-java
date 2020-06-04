package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class BiometryTemplate {

    /**
     * ID
     */
    public Long id;
    /**
     * Biometria
     */
    public Biometry biometry;
    /**
     * Template
     */
    public byte[] template;

    private List<JsonPatch> jsonPatches;

    public BiometryTemplate() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public BiometryTemplate(Long id, Biometry biometry, byte[] template, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.biometry = biometry;
        this.template = template;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public BiometryTemplate(byte[] template) {
        this.template = template;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}