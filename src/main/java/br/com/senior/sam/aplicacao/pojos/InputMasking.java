package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;

import java.util.List;

public class InputMasking {

    /**
     * ID
     */
    public Long id;
    /**
     * Dispositivo de Entrada
     */
    public InputDevice inputDevice;
    /**
     * Hora Inicial
     */
    public java.time.LocalTime startHour;
    /**
     * Hora Final
     */
    public java.time.LocalTime endHour;
    /**
     * Dias da Semana
     */
    public Boolean businessDays;
    /**
     * Sábado
     */
    public Boolean saturday;
    /**
     * Domingo
     */
    public Boolean sunday;
    /**
     * Feriado
     */
    public Boolean holiday;

    private List<JsonPatch> jsonPatches;

    public InputMasking() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public InputMasking(Long id, InputDevice inputDevice, java.time.LocalTime startHour, java.time.LocalTime endHour, Boolean businessDays, Boolean saturday, Boolean sunday, Boolean holiday, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.inputDevice = inputDevice;
        this.startHour = startHour;
        this.endHour = endHour;
        this.businessDays = businessDays;
        this.saturday = saturday;
        this.sunday = sunday;
        this.holiday = holiday;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public InputMasking(java.time.LocalTime startHour, java.time.LocalTime endHour, Boolean businessDays, Boolean saturday, Boolean sunday, Boolean holiday) {
        this.startHour = startHour;
        this.endHour = endHour;
        this.businessDays = businessDays;
        this.saturday = saturday;
        this.sunday = sunday;
        this.holiday = holiday;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}