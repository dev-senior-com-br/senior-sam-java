package br.com.senior.sam.aplicacao.pojos;

public enum ReaderValidationType {
    /**
     * Bloqueia acesso
     */
    BLOCK_ACCESS,
    /**
     * Crachá
     */
    CARD,
    /**
     * Crachá ou senha
     */
    CARD_OR_PIN,
    /**
     * Crachá e senha
     */
    CARD_AND_PIN,
    /**
     * Libera acesso
     */
    ALLOW_ACCESS,
    /**
     * Código de acesso
     */
    FACILITY_CODE
}