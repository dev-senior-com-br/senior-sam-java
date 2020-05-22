package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.core.user.pojos.Group;
import br.com.senior.sam.portaria.pojos.*;

import java.util.List;

public class Credential {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public Person person;
    /**
     * Veículo
     */
    public Vehicle vehicle;
    /**
     * Proprietário da Credencial
     */
    public CredentialOwner credentialOwner;
    /**
     * Data Início
     */
    public java.time.Instant startDate;
    /**
     * Situação da Credencial
     */
    public CredentialSituation credentialSituation;
    /**
     * Tipo da Credencial
     */
    public CredentialType credentialType;
    /**
     * Formato da Credencial
     */
    public CredentialFormat credentialFormat;
    /**
     * Biometria
     */
    public Biometry biometry;
    /**
     * Papel
     */
    public Role role;
    /**
     * Grupo
     */
    public Group group;
    /**
     * Data Fim
     */
    public java.time.Instant endDate;
    /**
     * Pessoa Visitada
     */
    public Person visitedPerson;
    /**
     * Status
     */
    public StatusHistoric status;
    /**
     * Credênciais de Cartão
     */
    public java.util.List<CardCredential> cardCredentialList;
    /**
     * Portaria Virtual
     */
    public VirtualLobby virtualLobby;
    /**
     * ID do Motivo da Credencial Provisória
     */
    public Long provisoryCredentialReasonId;
    /**
     * Chamada de Acesso
     */
    public AccessCall accessCall;
    /**
     * O identificador do agendamento
     */
    public Scheduling scheduling;
    /**
     * Portaria
     */
    public Lobby lobby;

    private List<JsonPatch> jsonPatches;

    public Credential() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Credential(Long id, Person person, Vehicle vehicle, CredentialOwner credentialOwner, java.time.Instant startDate, CredentialSituation credentialSituation, CredentialType credentialType, CredentialFormat credentialFormat, Biometry biometry, Role role, Group group, java.time.Instant endDate, Person visitedPerson, StatusHistoric status, java.util.List<CardCredential> cardCredentialList, VirtualLobby virtualLobby, Long provisoryCredentialReasonId, AccessCall accessCall, Scheduling scheduling, Lobby lobby, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.vehicle = vehicle;
        this.credentialOwner = credentialOwner;
        this.startDate = startDate;
        this.credentialSituation = credentialSituation;
        this.credentialType = credentialType;
        this.credentialFormat = credentialFormat;
        this.biometry = biometry;
        this.role = role;
        this.group = group;
        this.endDate = endDate;
        this.visitedPerson = visitedPerson;
        this.status = status;
        this.cardCredentialList = cardCredentialList;
        this.virtualLobby = virtualLobby;
        this.provisoryCredentialReasonId = provisoryCredentialReasonId;
        this.accessCall = accessCall;
        this.scheduling = scheduling;
        this.lobby = lobby;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Credential(CredentialOwner credentialOwner, java.time.Instant startDate, CredentialSituation credentialSituation, CredentialType credentialType, CredentialFormat credentialFormat, StatusHistoric status) {
        this.credentialOwner = credentialOwner;
        this.startDate = startDate;
        this.credentialSituation = credentialSituation;
        this.credentialType = credentialType;
        this.credentialFormat = credentialFormat;
        this.status = status;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
