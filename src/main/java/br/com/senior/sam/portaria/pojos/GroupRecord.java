package br.com.senior.sam.portaria.pojos;

import java.util.List;

public class GroupRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * ID do pai
     */
    public Long parent;
    /**
     * Nome do grupo
     */
    public String name;
    /**
     * Local físico
     */
    public PhysicalLocationRecord physicalLocation;
    /**
     * Pessoas do grupo
     */
    public List<GroupPersonRecord> people;

    public GroupRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public GroupRecord(Long id, Long parent, String name, PhysicalLocationRecord physicalLocation, List<GroupPersonRecord> people) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.physicalLocation = physicalLocation;
        this.people = people;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public GroupRecord(Long id, Long parent, String name) {
        this.id = id;
        this.parent = parent;
        this.name = name;
    }
}