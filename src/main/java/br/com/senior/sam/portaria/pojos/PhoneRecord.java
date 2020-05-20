package br.com.senior.sam.portaria.pojos;

public class PhoneRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Telefone Preferencial
     */
    public Boolean preferential;
    /**
     * DDI/IDD (International Direct Dialing)
     */
    public Long idd;
    /**
     * Número do telefone
     */
    public String number;
    /**
     * Ramal
     */
    public String phoneExtension;

    public PhoneRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PhoneRecord(Long id, Boolean preferential, Long idd, String number, String phoneExtension) {
        this.id = id;
        this.preferential = preferential;
        this.idd = idd;
        this.number = number;
        this.phoneExtension = phoneExtension;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public PhoneRecord(Long id, String number) {
        this.id = id;
        this.number = number;
    }
}