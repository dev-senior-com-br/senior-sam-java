package br.com.senior.sam.portaria.pojos;

public class EmailRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Email Preferencial
     */
    public Boolean preferential;
    /**
     * Endereço do email
     */
    public String email;

    public EmailRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public EmailRecord(Long id, Boolean preferential, String email) {
        this.id = id;
        this.preferential = preferential;
        this.email = email;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public EmailRecord(Long id, String email) {
        this.id = id;
        this.email = email;
    }
}