package br.com.senior.sam.portaria.pojos;

import java.time.Instant;
import java.util.List;

public class PersonRecord {

    /**
     * ID
     */
    public Long id;
    /**
     * Nome
     */
    public String name;
    /**
     * Data da atualização da foto
     */
    public Instant photoDate;
    /**
     * Último acesso
     */
    public Instant lastAccessDate;
    /**
     * Local atual da pessoa
     */
    public PhysicalLocationRecord currentPhysicalLocation;
    /**
     * Situação da pessoa
     */
    public PersonSituationType situation;
    /**
     * Data do último acesso permitido
     */
    public Instant lastAccessAllowedDate;
    /**
     * Local físico do último acesso permitido
     */
    public PhysicalLocationRecord lastAccessAllowedPhysicalLocation;
    /**
     * Documento
     */
    public List<DocumentRecord> documents;
    /**
     * Telefone
     */
    public List<PhoneRecord> phones;
    /**
     * Email
     */
    public List<EmailRecord> emails;
    /**
     * Papéis da pessoa
     */
    public List<PersonRoleRecord> personRoles;
    /**
     * Lista de situação da pessoa
     */
    public List<PersonSituationRecord> situations;
    /**
     * Grupos
     */
    public List<GroupPersonRecord> groups;
    /**
     * Disponibilidade
     */
    public Availability availability;

    public PersonRecord() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public PersonRecord(Long id, String name, Instant photoDate, Instant lastAccessDate, PhysicalLocationRecord currentPhysicalLocation, PersonSituationType situation, Instant lastAccessAllowedDate, PhysicalLocationRecord lastAccessAllowedPhysicalLocation, List<DocumentRecord> documents, List<PhoneRecord> phones, List<EmailRecord> emails, List<PersonRoleRecord> personRoles, List<PersonSituationRecord> situations, List<GroupPersonRecord> groups, Availability availability) {
        this.id = id;
        this.name = name;
        this.photoDate = photoDate;
        this.lastAccessDate = lastAccessDate;
        this.currentPhysicalLocation = currentPhysicalLocation;
        this.situation = situation;
        this.lastAccessAllowedDate = lastAccessAllowedDate;
        this.lastAccessAllowedPhysicalLocation = lastAccessAllowedPhysicalLocation;
        this.documents = documents;
        this.phones = phones;
        this.emails = emails;
        this.personRoles = personRoles;
        this.situations = situations;
        this.groups = groups;
        this.availability = availability;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public PersonRecord(Long id) {
        this.id = id;
    }
}