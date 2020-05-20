package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

/**
 * Credencial
 */
public class ProvisoryCredentialRecord {

    /**
     * Identificador da credencial
     */
    public Long id;
    /**
     * Situação da credencial
     */
    public CredentialSituation situation;
    /**
     * Data de expiração da credencial
     */
    public Instant endDate;
    /**
     * Data de início da credencial
     */
    public Instant startDate;
    /**
     * Pessoa da credencial
     */
    public PersonRecord person;
    /**
     * Papel utilizado para criar a credencial
     */
    public RoleRecord role;
    /**
     * Identificador do agendamento
     */
    public Long schedulingId;
    /**
     * A lista de credenciais de cartão
     */
    public List<InformationCardCredentialRecord> cardCredentialList;
    /**
     * A portaria virtual onde foi emitida a credencial
     */
    public Long virtualLobbyId;
    /**
     * O motivo da credencial provisória
     */
    public ProvisoryCredentialReasonRecord provisoryCredentialReason;
    /**
     * A portaria onde foi emitida a credencial
     */
    public LobbyRecord lobby;

    public ProvisoryCredentialRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public ProvisoryCredentialRecord(Long id, CredentialSituation situation, Instant endDate, Instant startDate, PersonRecord person, RoleRecord role, Long schedulingId, List<InformationCardCredentialRecord> cardCredentialList, Long virtualLobbyId, ProvisoryCredentialReasonRecord provisoryCredentialReason, LobbyRecord lobby) {
        this.id = id;
        this.situation = situation;
        this.endDate = endDate;
        this.startDate = startDate;
        this.person = person;
        this.role = role;
        this.schedulingId = schedulingId;
        this.cardCredentialList = cardCredentialList;
        this.virtualLobbyId = virtualLobbyId;
        this.provisoryCredentialReason = provisoryCredentialReason;
        this.lobby = lobby;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public ProvisoryCredentialRecord(Long id) {
        this.id = id;
    }
}