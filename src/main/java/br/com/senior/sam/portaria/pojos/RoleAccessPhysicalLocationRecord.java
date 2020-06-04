package br.com.senior.sam.portaria.pojos;

public class RoleAccessPhysicalLocationRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Papel
     */
    public RoleRecord role;
    /**
     * Local físico
     */
    public PhysicalLocationRecord physicalLocation;

    public RoleAccessPhysicalLocationRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public RoleAccessPhysicalLocationRecord(Long id, RoleRecord role, PhysicalLocationRecord physicalLocation) {
        this.id = id;
        this.role = role;
        this.physicalLocation = physicalLocation;
    }
}