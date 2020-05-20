package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class CreateVisitorProvisoryCredential extends BaseCreateProvisoryCredential {

    /**
     * O papel da credencial que o visitante vai assumir, usado principalmente para visitantes sem cadastro prévio, cadastro em sam-aplicacao-backend/entities/role
     */
    public Long roleId;
    /**
     * O visitante que receberá a credencial
     */
    public Visitor visitor;
    /**
     * O agendamento relacionado à credencial, id da entidade scheduling, apenas para visitas agendadas
     */
    public Long schedulingId;

    public CreateVisitorProvisoryCredential() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public CreateVisitorProvisoryCredential(Boolean isCheckedOverlap, List<InformationCardCredentialRecord> cardCredentialList, Long provisoryCredentialReasonId, Instant startDate, Instant endDate, BiometricManufacturer biometricManufacturer, Long biometricId, Long virtualLobbyId, Long roleId, Visitor visitor, Long schedulingId) {
        this.isCheckedOverlap = isCheckedOverlap;
        this.cardCredentialList = cardCredentialList;
        this.provisoryCredentialReasonId = provisoryCredentialReasonId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.biometricManufacturer = biometricManufacturer;
        this.biometricId = biometricId;
        this.virtualLobbyId = virtualLobbyId;
        this.roleId = roleId;
        this.visitor = visitor;
        this.schedulingId = schedulingId;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public CreateVisitorProvisoryCredential(Boolean isCheckedOverlap, List<InformationCardCredentialRecord> cardCredentialList, Instant endDate, Long roleId, Visitor visitor, Long schedulingId) {
        this.isCheckedOverlap = isCheckedOverlap;
        this.cardCredentialList = cardCredentialList;
        this.endDate = endDate;
        this.roleId = roleId;
        this.visitor = visitor;
        this.schedulingId = schedulingId;
    }
}