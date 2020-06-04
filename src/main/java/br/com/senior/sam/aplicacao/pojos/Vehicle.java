package br.com.senior.sam.aplicacao.pojos;

import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.PhysicalLocation;
import br.com.senior.sam.portaria.pojos.Role;

import java.util.List;

public class Vehicle {

    /**
     * ID
     */
    public Long id;
    /**
     * Uso do Veículo
     */
    public VehicleUse vehicleUse;
    /**
     * Fabricante
     */
    public String manufacturer;
    /**
     * Modelo
     */
    public String model;
    /**
     * Placa
     */
    public String plate;
    /**
     * Papel do veículo
     */
    public Role role;
    /**
     * Local físico
     */
    public PhysicalLocation physicalLocation;
    /**
     * Data do Último Acesso
     */
    public java.time.Instant lastAccess;
    /**
     * Pessoa Veículo
     */
    public java.util.List<PersonVehicle> personVehicles;
    /**
     * Credênciais do Veículo
     */
    public java.util.List<Credential> credentials;

    private List<JsonPatch> jsonPatches;

    public Vehicle() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Vehicle(Long id, VehicleUse vehicleUse, String manufacturer, String model, String plate, Role role, PhysicalLocation physicalLocation, java.time.Instant lastAccess, java.util.List<PersonVehicle> personVehicles, java.util.List<Credential> credentials, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.vehicleUse = vehicleUse;
        this.manufacturer = manufacturer;
        this.model = model;
        this.plate = plate;
        this.role = role;
        this.physicalLocation = physicalLocation;
        this.lastAccess = lastAccess;
        this.personVehicles = personVehicles;
        this.credentials = credentials;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Vehicle(VehicleUse vehicleUse, String manufacturer, String model, String plate) {
        this.vehicleUse = vehicleUse;
        this.manufacturer = manufacturer;
        this.model = model;
        this.plate = plate;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}