package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.CustomDTO;
import br.com.senior.sam.portaria.pojos.JsonPatch;

public class LocalTimezone extends CustomDTO {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome do Local
     */
    public String name;
    /**
     * Fuso horário
     */
    public Timezone timezone;
    /**
     * Horário de verão
     */
    public Boolean daylightSaving;
    /**
     * Tipo do horário de verão
     */
    public OffsetDaylightSavingType offsetDaylightSaving;
    /**
     * Data início do horário de verão
     */
    public java.time.LocalDate daylightSavingStartDate;
    /**
     * Data fim do horário de verão
     */
    public java.time.LocalDate daylightSavingFinishDate;

    private List<JsonPatch> jsonPatches;

    public LocalTimezone() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public LocalTimezone(Long id, String name, Timezone timezone, Boolean daylightSaving, OffsetDaylightSavingType offsetDaylightSaving, java.time.LocalDate daylightSavingStartDate, java.time.LocalDate daylightSavingFinishDate, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.timezone = timezone;
        this.daylightSaving = daylightSaving;
        this.offsetDaylightSaving = offsetDaylightSaving;
        this.daylightSavingStartDate = daylightSavingStartDate;
        this.daylightSavingFinishDate = daylightSavingFinishDate;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public LocalTimezone(String name, Timezone timezone, Boolean daylightSaving) {
        this.name = name;
        this.timezone = timezone;
        this.daylightSaving = daylightSaving;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}