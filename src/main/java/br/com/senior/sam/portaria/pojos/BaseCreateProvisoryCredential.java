package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

/**
 * Campos base para a criação de uma credencial provisória
 */
public class BaseCreateProvisoryCredential {

    /**
     * Se deve suspender a credencial existente
     */
    public Boolean isCheckedOverlap;
    /**
     * Lista de cartões de credenciais a serem cadastradas
     */
    public List<InformationCardCredentialRecord> cardCredentialList;
    /**
     * Id do motivo da credencial provisória, cadastro pela entidade provisoryCredentialReason. É utilizado apenas para consultas e estatísticas
     */
    public Long provisoryCredentialReasonId;
    /**
     * A data de início da credencial
     */
    public Instant startDate;
    /**
     * A data de expiração da credencial
     */
    public Instant endDate;
    /**
     * o tipo de tecnologia biométrica e o fabricante
     */
    public BiometricManufacturer biometricManufacturer;
    /**
     * O identificador da biometria da pessoa
     */
    public Long biometricId;
    /**
     * O identificador da portaria virtual, cadastro pelo serviço virtualLobby
     */
    public Long virtualLobbyId;

    public BaseCreateProvisoryCredential() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public BaseCreateProvisoryCredential(Boolean isCheckedOverlap, List<InformationCardCredentialRecord> cardCredentialList, Long provisoryCredentialReasonId, Instant startDate, Instant endDate, BiometricManufacturer biometricManufacturer, Long biometricId, Long virtualLobbyId) {
        this.isCheckedOverlap = isCheckedOverlap;
        this.cardCredentialList = cardCredentialList;
        this.provisoryCredentialReasonId = provisoryCredentialReasonId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.biometricManufacturer = biometricManufacturer;
        this.biometricId = biometricId;
        this.virtualLobbyId = virtualLobbyId;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public BaseCreateProvisoryCredential(Boolean isCheckedOverlap, List<InformationCardCredentialRecord> cardCredentialList, Instant endDate) {
        this.isCheckedOverlap = isCheckedOverlap;
        this.cardCredentialList = cardCredentialList;
        this.endDate = endDate;
    }
}