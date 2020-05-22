package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class ExtensibleProperty extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Configuração Extensível
     */
    public ExtensibleConfiguration extensibleConfiguration;
    /**
     * Chave
     */
    public String key;
    /**
     * Valor
     */
    public String value;

    private List<JsonPatch> jsonPatches;

    public ExtensibleProperty() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public ExtensibleProperty(Long id, ExtensibleConfiguration extensibleConfiguration, String key, String value, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.extensibleConfiguration = extensibleConfiguration;
        this.key = key;
        this.value = value;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public ExtensibleProperty(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}