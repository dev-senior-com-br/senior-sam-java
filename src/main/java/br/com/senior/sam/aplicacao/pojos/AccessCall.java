package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.*;

import java.util.List;

public class AccessCall {

    /**
     * ID
     */
    public Long id;
    /**
     * Data da Criação
     */
    public java.time.Instant creationDate;
    /**
     * Data Início
     */
    public java.time.Instant startDate;
    /**
     * Data Fim
     */
    public java.time.Instant endDate;
    /**
     * Status da Chamada
     */
    public AccessCallStatus accessCallStatus;
    /**
     * Origem da Chamada
     */
    public AccessCallOrigin accessCallOrigin;
    /**
     * Nome usuário
     */
    public String userName;
    /**
     * Portaria Virtual
     */
    public VirtualLobby virtualLobby;
    /**
     * Movimento da Portaria Virtual
     */
    public VirtualLobbyMovement virtualLobbyMovement;
    /**
     * Tipo de Movimentação da Portaria Virtual
     */
    public VirtualLobbyMovementType virtualLobbyMovementType;
    /**
     * Visita da Chamada de Acesso
     */
    public VisitAccessCall visitAccessCall;
    /**
     * Dispositivo de Entrada da Chamada
     */
    public InputDeviceAccessCall inputDeviceAccessCall;
    /**
     * Leitora da Chamada
     */
    public ReaderDeviceAccessCall readerDeviceAccessCall;

    private List<JsonPatch> jsonPatches;

    public AccessCall() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public AccessCall(Long id, java.time.Instant creationDate, java.time.Instant startDate, java.time.Instant endDate, AccessCallStatus accessCallStatus, AccessCallOrigin accessCallOrigin, String userName, VirtualLobby virtualLobby, VirtualLobbyMovement virtualLobbyMovement, VirtualLobbyMovementType virtualLobbyMovementType, VisitAccessCall visitAccessCall, InputDeviceAccessCall inputDeviceAccessCall, ReaderDeviceAccessCall readerDeviceAccessCall, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.creationDate = creationDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.accessCallStatus = accessCallStatus;
        this.accessCallOrigin = accessCallOrigin;
        this.userName = userName;
        this.virtualLobby = virtualLobby;
        this.virtualLobbyMovement = virtualLobbyMovement;
        this.virtualLobbyMovementType = virtualLobbyMovementType;
        this.visitAccessCall = visitAccessCall;
        this.inputDeviceAccessCall = inputDeviceAccessCall;
        this.readerDeviceAccessCall = readerDeviceAccessCall;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public AccessCall(java.time.Instant creationDate, AccessCallStatus accessCallStatus, AccessCallOrigin accessCallOrigin, VirtualLobbyMovementType virtualLobbyMovementType) {
        this.creationDate = creationDate;
        this.accessCallStatus = accessCallStatus;
        this.accessCallOrigin = accessCallOrigin;
        this.virtualLobbyMovementType = virtualLobbyMovementType;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}