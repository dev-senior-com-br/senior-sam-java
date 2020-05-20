package br.com.senior.sam.portaria.pojos;

public class ProvisoryCredentialReasonRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Motivo em Português
     */
    public String reasonInPortuguese;
    /**
     * Motivo em Inglês
     */
    public String reasonInEnglish;
    /**
     * Motivo em Espanhol
     */
    public String reasonInSpanish;
    /**
     * Tempo de Validade
     */
    public Long validityTime;
    /**
     * Tipo de Validade do Tempo
     */
    public TimeValidityType timeValidityType;
    /**
     * Motivo Ativo
     */
    public Boolean isActive;

    public ProvisoryCredentialReasonRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public ProvisoryCredentialReasonRecord(Long id, String reasonInPortuguese, String reasonInEnglish, String reasonInSpanish, Long validityTime, TimeValidityType timeValidityType, Boolean isActive) {
        this.id = id;
        this.reasonInPortuguese = reasonInPortuguese;
        this.reasonInEnglish = reasonInEnglish;
        this.reasonInSpanish = reasonInSpanish;
        this.validityTime = validityTime;
        this.timeValidityType = timeValidityType;
        this.isActive = isActive;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public ProvisoryCredentialReasonRecord(String reasonInPortuguese, String reasonInEnglish, String reasonInSpanish, Long validityTime, TimeValidityType timeValidityType, Boolean isActive) {
        this.reasonInPortuguese = reasonInPortuguese;
        this.reasonInEnglish = reasonInEnglish;
        this.reasonInSpanish = reasonInSpanish;
        this.validityTime = validityTime;
        this.timeValidityType = timeValidityType;
        this.isActive = isActive;
    }
}