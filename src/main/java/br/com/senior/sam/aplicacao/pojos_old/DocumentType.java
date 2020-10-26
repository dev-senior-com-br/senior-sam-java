package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;

public class DocumentType extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome do Tipo de Documento
     */
    public String name;
    /**
     * Label de Apresentação
     */
    public String label;
    /**
     * Máscara
     */
    public String mask;
    /**
     * Documento Obrigatório
     */
    public Boolean required;
    /**
     * Documento Utilizado pelo REP
     */
    public Boolean useOnREP;

    private List<JsonPatch> jsonPatches;

    public DocumentType() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public DocumentType(Long id, String name, String label, String mask, Boolean required, Boolean useOnREP, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.label = label;
        this.mask = mask;
        this.required = required;
        this.useOnREP = useOnREP;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public DocumentType(String name, String label, Boolean required, Boolean useOnREP) {
        this.name = name;
        this.label = label;
        this.required = required;
        this.useOnREP = useOnREP;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
