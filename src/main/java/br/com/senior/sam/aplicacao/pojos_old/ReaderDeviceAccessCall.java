package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class ReaderDeviceAccessCall {

    /**
     * ID
     */
    public Long id;
    /**
     * Chamada de Acesso
     */
    public AccessCall accessCall;
    /**
     * Leitora
     */
    public ReaderDevice readerDevice;
    /**
     * Credencial
     */
    public Credential credential;
    /**
     * Tipo do Evento de Acesso
     */
    public AccessEventType accessEventType;

    private List<JsonPatch> jsonPatches;

    public ReaderDeviceAccessCall() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public ReaderDeviceAccessCall(Long id, AccessCall accessCall, ReaderDevice readerDevice, Credential credential, AccessEventType accessEventType, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.accessCall = accessCall;
        this.readerDevice = readerDevice;
        this.credential = credential;
        this.accessEventType = accessEventType;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public ReaderDeviceAccessCall(ReaderDevice readerDevice, Credential credential, AccessEventType accessEventType) {
        this.readerDevice = readerDevice;
        this.credential = credential;
        this.accessEventType = accessEventType;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}