package br.com.senior.sam.portaria.pojos;

public class DocumentRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Tipo de documento
     */
    public DocumentTypeRecord documentType;
    /**
     * Documento
     */
    public String document;

    public DocumentRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public DocumentRecord(Long id, DocumentTypeRecord documentType, String document) {
        this.id = id;
        this.documentType = documentType;
        this.document = document;
    }
}