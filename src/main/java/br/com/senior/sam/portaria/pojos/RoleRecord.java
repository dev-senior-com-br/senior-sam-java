package br.com.senior.sam.portaria.pojos;

import java.util.List;

public class RoleRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome
     */
    public String name;
    /**
     * Papel utilizado pelo provisório
     */
    public Boolean usedByProvisory;
    /**
     * Papel que Recebe Visita
     */
    public Boolean receiveVisit;
    /**
     * Relação pessoa papel
     */
    public List<PersonRoleRecord> personRoles;
    /**
     * Relação de papel que acessa o local físico
     */
    public List<RoleAccessPhysicalLocationRecord> roleAccessPhysicalLocations;

    public RoleRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public RoleRecord(Long id, String name, Boolean usedByProvisory, Boolean receiveVisit, List<PersonRoleRecord> personRoles, List<RoleAccessPhysicalLocationRecord> roleAccessPhysicalLocations) {
        this.id = id;
        this.name = name;
        this.usedByProvisory = usedByProvisory;
        this.receiveVisit = receiveVisit;
        this.personRoles = personRoles;
        this.roleAccessPhysicalLocations = roleAccessPhysicalLocations;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public RoleRecord(Long id, String name, Boolean usedByProvisory, Boolean receiveVisit) {
        this.id = id;
        this.name = name;
        this.usedByProvisory = usedByProvisory;
        this.receiveVisit = receiveVisit;
    }
}