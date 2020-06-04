package br.com.senior.sam.portaria.pojos;

public class GroupPersonRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Pessoa
     */
    public PersonRecord person;
    /**
     * Grupo
     */
    public GroupRecord group;

    public GroupPersonRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public GroupPersonRecord(Long id, PersonRecord person, GroupRecord group) {
        this.id = id;
        this.person = person;
        this.group = group;
    }
}