package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

/**
 * Campos para a criação de uma credencial provisória para uma pessoa
 */
public class CreatePersonProvisoryCredential extends BaseCreateProvisoryCredential {

    /**
     * O identificador da pessoa que receberá a credencial, cadastro em sam-aplicacao-backend/entities/person
     */
    public Long personId;
    /**
     * O identificador da portaria, cadastro pela entidade lobby
     */
    public Long lobbyId;

    public CreatePersonProvisoryCredential() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public CreatePersonProvisoryCredential(Boolean isCheckedOverlap, List<InformationCardCredentialRecord> cardCredentialList, Long provisoryCredentialReasonId, Instant startDate, Instant endDate, BiometricManufacturer biometricManufacturer, Long biometricId, Long virtualLobbyId, Long personId, Long lobbyId) {
        this.isCheckedOverlap = isCheckedOverlap;
        this.cardCredentialList = cardCredentialList;
        this.provisoryCredentialReasonId = provisoryCredentialReasonId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.biometricManufacturer = biometricManufacturer;
        this.biometricId = biometricId;
        this.virtualLobbyId = virtualLobbyId;
        this.personId = personId;
        this.lobbyId = lobbyId;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public CreatePersonProvisoryCredential(Boolean isCheckedOverlap, List<InformationCardCredentialRecord> cardCredentialList, Instant endDate, Long personId, Long lobbyId) {
        this.isCheckedOverlap = isCheckedOverlap;
        this.cardCredentialList = cardCredentialList;
        this.endDate = endDate;
        this.personId = personId;
        this.lobbyId = lobbyId;
    }
}