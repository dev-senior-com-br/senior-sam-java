package br.com.senior.sam.aplicacao.pojos_old;

public enum CallGenerationType {
    /**
     * Não Gera Chamada
     */
    DISABLED,
    /**
     * Sempre Gera Chamada
     */
    ALWAYS,
    /**
     * Gera Chamada no Acesso Permitido
     */
    ON_ACCESS_ALLOWED,
    /**
     * Gera Chamada no Acesso Negado
     */
    ON_ACCESS_DENIED
}