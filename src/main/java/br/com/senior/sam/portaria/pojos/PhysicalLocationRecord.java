package br.com.senior.sam.portaria.pojos;

public class PhysicalLocationRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Local físico pai
     */
    public Long parent;
    /**
     * Nome
     */
    public String name;
    /**
     * Status do local físico
     */
    public PhysicalLocationStatus status;

    public PhysicalLocationRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PhysicalLocationRecord(Long id, Long parent, String name, PhysicalLocationStatus status) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.status = status;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public PhysicalLocationRecord(Long parent, String name, PhysicalLocationStatus status) {
        this.parent = parent;
        this.name = name;
        this.status = status;
    }
}