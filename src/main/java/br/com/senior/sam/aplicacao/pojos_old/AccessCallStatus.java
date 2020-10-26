package br.com.senior.sam.aplicacao.pojos_old;

public enum AccessCallStatus {
    /**
     * Chamando
     */
    CALLING,
    /**
     * Em Progresso
     */
    IN_PROGRESS,
    /**
     * Finalizada por Timeout
     */
    FINISHED_TIMED_OUT,
    /**
     * Finalizada Com Acesso Permitido
     */
    FINISHED_ACCESS_ALLOWED,
    /**
     * Finalizada Com Acesso Negado
     */
    FINISHED_ACCESS_DENIED
}