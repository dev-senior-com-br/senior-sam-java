package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class Timezone {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome do Timezone
     */
    public String name;
    /**
     * Offset em Minutos do Timezone
     */
    public Long timezoneOffset;

    private List<JsonPatch> jsonPatches;

    public Timezone() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Timezone(Long id, String name, Long timezoneOffset, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.timezoneOffset = timezoneOffset;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Timezone(String name, Long timezoneOffset) {
        this.name = name;
        this.timezoneOffset = timezoneOffset;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}