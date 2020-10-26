package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class OutputDeviceActivations {

    /**
     * ID
     */
    public Long id;
    /**
     * Dispositivo de Entrada
     */
    public InputDevice inputDevice;
    /**
     * Dispositivo de Saída
     */
    public OutputDevice outputDevice;
    /**
     * Tempo do Acionamento
     */
    public Long activationTime;

    private List<JsonPatch> jsonPatches;

    public OutputDeviceActivations() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public OutputDeviceActivations(Long id, InputDevice inputDevice, OutputDevice outputDevice, Long activationTime, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.inputDevice = inputDevice;
        this.outputDevice = outputDevice;
        this.activationTime = activationTime;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public OutputDeviceActivations(OutputDevice outputDevice, Long activationTime) {
        this.outputDevice = outputDevice;
        this.activationTime = activationTime;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}