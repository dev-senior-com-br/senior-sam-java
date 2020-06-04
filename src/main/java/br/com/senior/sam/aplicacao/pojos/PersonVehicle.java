package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.StatusHistoric;

import java.util.List;

public class PersonVehicle {

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
     * Data Início
     */
    public java.time.Instant startDate;
    /**
     * Data Fim
     */
    public java.time.Instant endDate;
    /**
     * Status
     */
    public StatusHistoric status;

    private List<JsonPatch> jsonPatches;

    public PersonVehicle() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PersonVehicle(Long id, Person person, Vehicle vehicle, java.time.Instant startDate, java.time.Instant endDate, StatusHistoric status, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.person = person;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.jsonPatches = jsonPatches;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}