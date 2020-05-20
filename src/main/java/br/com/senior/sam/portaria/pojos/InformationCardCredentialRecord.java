package br.com.senior.sam.portaria.pojos;

/**
 * Informações da credencial de cartão
 */
public class InformationCardCredentialRecord {

    /**
     * Código identificador
     */
    public Long id;
    /**
     * Tecnologia do Cartão
     */
    public CardTechnology cardTechnology;
    /**
     * Número do Cartão
     */
    public Long cardNumber;

    public InformationCardCredentialRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public InformationCardCredentialRecord(Long id, CardTechnology cardTechnology, Long cardNumber) {
        this.id = id;
        this.cardTechnology = cardTechnology;
        this.cardNumber = cardNumber;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public InformationCardCredentialRecord(CardTechnology cardTechnology, Long cardNumber) {
        this.cardTechnology = cardTechnology;
        this.cardNumber = cardNumber;
    }
}