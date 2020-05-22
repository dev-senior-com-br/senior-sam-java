package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class Document {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public Person person;
    /**
     * Tipo de Documento
     */
    public DocumentType documentType;
    /**
     * Documento
     */
    public String document;

    private List<JsonPatch> jsonPatches;

    public Document() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Document(Long id, Person person, DocumentType documentType, String document, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.documentType = documentType;
        this.document = document;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Document(DocumentType documentType, String document) {
        this.documentType = documentType;
        this.document = document;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }

}
