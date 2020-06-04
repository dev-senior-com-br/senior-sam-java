package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class ExtensibleConfiguration {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome da Configuração Extensível
     */
    public String name;
    /**
     * Lista de Propriedade Extensível
     */
    public java.util.List<ExtensibleProperty> extensibleProperty;

    private List<JsonPatch> jsonPatches;

    public ExtensibleConfiguration() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public ExtensibleConfiguration(Long id, String name, java.util.List<ExtensibleProperty> extensibleProperty, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.extensibleProperty = extensibleProperty;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public ExtensibleConfiguration(String name) {
        this.name = name;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}