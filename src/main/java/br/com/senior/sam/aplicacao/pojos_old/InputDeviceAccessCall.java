package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;

public class InputDeviceAccessCall {

    /**
     * ID
     */
    public Long id;
    /**
     * Chamada de Acesso
     */
    public AccessCall accessCall;
    /**
     * Dispositivo de Entrada
     */
    public InputDevice inputDevice;

    private List<JsonPatch> jsonPatches;

    public InputDeviceAccessCall() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public InputDeviceAccessCall(Long id, AccessCall accessCall, InputDevice inputDevice, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.accessCall = accessCall;
        this.inputDevice = inputDevice;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public InputDeviceAccessCall(InputDevice inputDevice) {
        this.inputDevice = inputDevice;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}