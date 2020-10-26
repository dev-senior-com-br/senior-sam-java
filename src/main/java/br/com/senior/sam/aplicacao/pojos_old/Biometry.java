package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.BiometricManufacturer;
import br.com.senior.sam.portaria.pojos.JsonPatch;

public class Biometry {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public Person person;
    /**
     * Fabricante Biométrico
     */
    public BiometricManufacturer biometricManufacturer;
    /**
     * Templates Biométricos
     */
    public java.util.List<BiometryTemplate> templates;

    private List<JsonPatch> jsonPatches;

    public Biometry() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Biometry(Long id, Person person, BiometricManufacturer biometricManufacturer, java.util.List<BiometryTemplate> templates, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.biometricManufacturer = biometricManufacturer;
        this.templates = templates;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Biometry(BiometricManufacturer biometricManufacturer) {
        this.biometricManufacturer = biometricManufacturer;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}