package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class ReaderDeviceAction {

    /**
     * ID
     */
    public Long id;
    /**
     * Leitora
     */
    public ReaderDevice readerDevice;
    /**
     * Saída
     */
    public OutputDevice outputDevice;
    /**
     * Tipo do Acesso
     */
    public AccessType accessType;
    /**
     * Tempo do Acionamento
     */
    public Long activationTime;

    private List<JsonPatch> jsonPatches;

    public ReaderDeviceAction() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public ReaderDeviceAction(Long id, ReaderDevice readerDevice, OutputDevice outputDevice, AccessType accessType, Long activationTime, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.readerDevice = readerDevice;
        this.outputDevice = outputDevice;
        this.accessType = accessType;
        this.activationTime = activationTime;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public ReaderDeviceAction(AccessType accessType, Long activationTime) {
        this.accessType = accessType;
        this.activationTime = activationTime;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}