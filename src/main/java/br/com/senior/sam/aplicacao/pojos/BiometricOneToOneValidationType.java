package br.com.senior.sam.aplicacao.pojos;

public enum BiometricOneToOneValidationType {
    /**
     * Não Configurada
     */
    NONE,
    /**
     * Requisita Somente se Existir Biometria Cadastrada
     */
    OPTIONAL,
    /**
     * Sempre Vai Requisitar Biometria
     */
    REQUIRED
}