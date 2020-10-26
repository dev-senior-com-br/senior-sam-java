package br.com.senior.sam.aplicacao.pojos_old;

import java.util.List;

import br.com.senior.sam.portaria.pojos.JsonPatch;
import br.com.senior.sam.portaria.pojos.PersonSituationType;
import br.com.senior.sam.portaria.pojos.PhysicalLocation;

public class Person {
    /**
     * ID
     */
    public Long id;
    /**
     * Nome
     */
    public String name;
    /**
     * Sexo
     */
    public Gender gender;
    /**
     * Data de Nascimento
     */
    public java.time.LocalDate birthday;
    /**
     * Matricula
     */
    public String registry;
    /**
     * Data de Cadastro
     */
    public java.time.Instant registerDate;
    /**
     * Data da Última Alteração
     */
    public java.time.Instant lastModificationDate;
    /**
     * Data da Atualização da Foto
     */
    public java.time.Instant photoDate;
    /**
     * Endereço
     */
    public String address;
    /**
     * Bairro
     */
    public String district;
    /**
     * Cidade
     */
    public String city;
    /**
     * Estado
     */
    public String federalState;
    /**
     * Código Postal
     */
    public String zipCode;
    /**
     * Nacionalidade
     */
    public String nationality;
    /**
     * Último Acesso
     */
    public java.time.Instant lastAccessDate;
    /**
     * Local Atual da Pessoa
     */
    public PhysicalLocation currentPhysicalLocation;
    /**
     * Situação da Pessoa
     */
    public PersonSituationType situation;
    /**
     * Data do Último Acesso Permitido
     */
    public java.time.Instant lastAccessAllowedDate;
    /**
     * Local Físico do Último Acesso Permitido
     */
    public PhysicalLocation lastAccessAllowedPhysicalLocation;
    /**
     * Local última atualização de nível
     */
    public PhysicalLocation physicalLocationWhereLevelUpdated;
    /**
     * Documento
     */
    public java.util.List<Document> documents;
    /**
     * Telefone
     */
    public java.util.List<Phone> phones;
    /**
     * Email
     */
    public java.util.List<Email> emails;
    /**
     * Papéis da Pessoa
     */
    public java.util.List<PersonRole> personRoles;
    /**
     * Biometrias da Pessoa
     */
    public java.util.List<Biometry> biometries;
    /**
     * Credênciais da pessoa
     */
    public java.util.List<Credential> credentials;
    /**
     * Lista de Situação da Pessoa
     */
    public java.util.List<PersonSituation> situations;
    /**
     * Visualização de Incidentes
     */
    public java.util.List<IncidentViewed> incidentViewed;
    /**
     * Veículos da Pessoa
     */
    public java.util.List<PersonVehicle> personVehicle;
    /**
     * Grupos
     */
    public java.util.List<GroupPerson> groups;
    /**
     * Estruturas organizacionais da pessoa
     */
    public java.util.List<OrganizationalStructurePerson> organizationalStructuresPerson;
    /**
     * Usuário
     */
    public java.util.List<User> user;

    private List<JsonPatch> jsonPatches;

    public Person() {
    }

    /**
     * This constructor allows initialization of all fields, required and optional.
     */
    public Person(Long id, String name, Gender gender, java.time.LocalDate birthday, String registry, java.time.Instant registerDate, java.time.Instant lastModificationDate, java.time.Instant photoDate, String address, String district, String city, String federalState, String zipCode, String nationality, java.time.Instant lastAccessDate, PhysicalLocation currentPhysicalLocation, PersonSituationType situation, java.time.Instant lastAccessAllowedDate, PhysicalLocation lastAccessAllowedPhysicalLocation, PhysicalLocation physicalLocationWhereLevelUpdated, java.util.List<Document> documents, java.util.List<Phone> phones, java.util.List<Email> emails, java.util.List<PersonRole> personRoles, java.util.List<Biometry> biometries, java.util.List<Credential> credentials, java.util.List<PersonSituation> situations, java.util.List<IncidentViewed> incidentViewed, java.util.List<PersonVehicle> personVehicle, java.util.List<GroupPerson> groups, java.util.List<OrganizationalStructurePerson> organizationalStructuresPerson, java.util.List<User> user, List<JsonPatch> jsonPatches) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.registry = registry;
        this.registerDate = registerDate;
        this.lastModificationDate = lastModificationDate;
        this.photoDate = photoDate;
        this.address = address;
        this.district = district;
        this.city = city;
        this.federalState = federalState;
        this.zipCode = zipCode;
        this.nationality = nationality;
        this.lastAccessDate = lastAccessDate;
        this.currentPhysicalLocation = currentPhysicalLocation;
        this.situation = situation;
        this.lastAccessAllowedDate = lastAccessAllowedDate;
        this.lastAccessAllowedPhysicalLocation = lastAccessAllowedPhysicalLocation;
        this.physicalLocationWhereLevelUpdated = physicalLocationWhereLevelUpdated;
        this.documents = documents;
        this.phones = phones;
        this.emails = emails;
        this.personRoles = personRoles;
        this.biometries = biometries;
        this.credentials = credentials;
        this.situations = situations;
        this.incidentViewed = incidentViewed;
        this.personVehicle = personVehicle;
        this.groups = groups;
        this.organizationalStructuresPerson = organizationalStructuresPerson;
        this.user = user;
        this.jsonPatches = jsonPatches;
    }
    /**
     * This convenience constructor allows initialization of all required fields.
     */
    public Person(String name) {
        this.name = name;
    }

    public List<JsonPatch> getJsonPatches(){
        return jsonPatches == null ? java.util.Collections.emptyList() : jsonPatches;
    }
}
