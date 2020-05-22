package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.CardTechnology;
import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class CardCredential {

    /**
     * ID
     */
    public Long id;
    /**
     * Credencial
     */
    public Credential credential;
    /**
     * Tecnologia do Cartão
     */
    public CardTechnology cardTechnology;
    /**
     * Número do Cartão
     */
    public Long cardNumber;

    private List<JsonPatch> jsonPatches;

    public CardCredential() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public CardCredential(Long id, Credential credential, CardTechnology cardTechnology, Long cardNumber, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.credential = credential;
        this.cardTechnology = cardTechnology;
        this.cardNumber = cardNumber;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public CardCredential(CardTechnology cardTechnology, Long cardNumber) {
        this.cardTechnology = cardTechnology;
        this.cardNumber = cardNumber;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}