package br.com.senior.sam.portaria.pojos;

public class DocumentTypeRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome do tipo de documento
     */
    public String name;
    /**
     * Label do documento
     */
    public String label;
    /**
     * Máscara do documento
     */
    public String mask;
    /**
     * Documento obrigatório
     */
    public Boolean required;

    public DocumentTypeRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public DocumentTypeRecord(Long id, String name, String label, String mask, Boolean required) {
        this.id = id;
        this.name = name;
        this.label = label;
        this.mask = mask;
        this.required = required;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public DocumentTypeRecord(Long id, String name, String label, Boolean required) {
        this.id = id;
        this.name = name;
        this.label = label;
        this.required = required;
    }
}