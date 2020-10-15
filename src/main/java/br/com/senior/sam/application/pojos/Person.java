/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.9.1
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.sam.application.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.sam.application.pojos.Biometry;
import br.com.senior.sam.application.pojos.Credential;
import br.com.senior.sam.application.pojos.Document;
import br.com.senior.sam.application.pojos.Email;
import br.com.senior.sam.application.pojos.Gender;
import br.com.senior.sam.application.pojos.GroupPerson;
import br.com.senior.sam.application.pojos.OrganizationalStructurePerson;
import br.com.senior.sam.application.pojos.PersonRole;
import br.com.senior.sam.application.pojos.PersonSituation;
import br.com.senior.sam.application.pojos.PersonSituationType;
import br.com.senior.sam.application.pojos.PersonVehicle;
import br.com.senior.sam.application.pojos.PersonWorkSchedulePeriod;
import br.com.senior.sam.application.pojos.Phone;
import br.com.senior.sam.application.pojos.PhysicalLocation;
import br.com.senior.sam.application.pojos.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;

/**
 * Person
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-15T16:25:01.526Z")



public class Person {
  @SerializedName("birthday")
  private LocalDate birthday = null;

  @SerializedName("personRoles")
  private List<PersonRole> personRoles = null;

  @SerializedName("workSchedulePeriods")
  private List<PersonWorkSchedulePeriod> workSchedulePeriods = null;

  @SerializedName("zipCode")
  private String zipCode = null;

  @SerializedName("gender")
  private Gender gender = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("documents")
  private List<Document> documents = null;

  @SerializedName("credentials")
  private List<Credential> credentials = null;

  @SerializedName("phones")
  private List<Phone> phones = null;

  @SerializedName("emails")
  private List<Email> emails = null;

  @SerializedName("lastModificationDate")
  private OffsetDateTime lastModificationDate = null;

  @SerializedName("physicalLocationWhereLevelUpdated")
  private PhysicalLocation physicalLocationWhereLevelUpdated = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("situation")
  private PersonSituationType situation = null;

  @SerializedName("registerDate")
  private OffsetDateTime registerDate = null;

  @SerializedName("situations")
  private List<PersonSituation> situations = null;

  @SerializedName("personVehicle")
  private List<PersonVehicle> personVehicle = null;

  @SerializedName("registry")
  private String registry = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("lastAccessAllowedDate")
  private OffsetDateTime lastAccessAllowedDate = null;

  @SerializedName("lastAccessAllowedPhysicalLocation")
  private PhysicalLocation lastAccessAllowedPhysicalLocation = null;

  @SerializedName("groups")
  private List<GroupPerson> groups = null;

  @SerializedName("currentPhysicalLocation")
  private PhysicalLocation currentPhysicalLocation = null;

  @SerializedName("photoDate")
  private OffsetDateTime photoDate = null;

  @SerializedName("biometries")
  private List<Biometry> biometries = null;

  @SerializedName("nationality")
  private String nationality = null;

  @SerializedName("lastAccessDate")
  private OffsetDateTime lastAccessDate = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("federalState")
  private String federalState = null;

  @SerializedName("user")
  private List<User> user = null;

  @SerializedName("organizationalStructuresPerson")
  private List<OrganizationalStructurePerson> organizationalStructuresPerson = null;

  public Person birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

   /**
   * Data de Nascimento
   * @return birthday
  **/
  @ApiModelProperty(value = "Data de Nascimento")
  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public Person personRoles(List<PersonRole> personRoles) {
    this.personRoles = personRoles;
    return this;
  }

  public Person addPersonRolesItem(PersonRole personRolesItem) {
    if (this.personRoles == null) {
      this.personRoles = new ArrayList<PersonRole>();
    }
    this.personRoles.add(personRolesItem);
    return this;
  }

   /**
   * Papéis da Pessoa
   * @return personRoles
  **/
  @ApiModelProperty(value = "Papéis da Pessoa")
  public List<PersonRole> getPersonRoles() {
    return personRoles;
  }

  public void setPersonRoles(List<PersonRole> personRoles) {
    this.personRoles = personRoles;
  }

  public Person workSchedulePeriods(List<PersonWorkSchedulePeriod> workSchedulePeriods) {
    this.workSchedulePeriods = workSchedulePeriods;
    return this;
  }

  public Person addWorkSchedulePeriodsItem(PersonWorkSchedulePeriod workSchedulePeriodsItem) {
    if (this.workSchedulePeriods == null) {
      this.workSchedulePeriods = new ArrayList<PersonWorkSchedulePeriod>();
    }
    this.workSchedulePeriods.add(workSchedulePeriodsItem);
    return this;
  }

   /**
   * Faixas horárias da pessoa
   * @return workSchedulePeriods
  **/
  @ApiModelProperty(value = "Faixas horárias da pessoa")
  public List<PersonWorkSchedulePeriod> getWorkSchedulePeriods() {
    return workSchedulePeriods;
  }

  public void setWorkSchedulePeriods(List<PersonWorkSchedulePeriod> workSchedulePeriods) {
    this.workSchedulePeriods = workSchedulePeriods;
  }

  public Person zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Código Postal
   * @return zipCode
  **/
  @ApiModelProperty(value = "Código Postal")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public Person gender(Gender gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public Person city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Cidade
   * @return city
  **/
  @ApiModelProperty(value = "Cidade")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Person documents(List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public Person addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Documento
   * @return documents
  **/
  @ApiModelProperty(value = "Documento")
  public List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Document> documents) {
    this.documents = documents;
  }

  public Person credentials(List<Credential> credentials) {
    this.credentials = credentials;
    return this;
  }

  public Person addCredentialsItem(Credential credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<Credential>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Credênciais da pessoa
   * @return credentials
  **/
  @ApiModelProperty(value = "Credênciais da pessoa")
  public List<Credential> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<Credential> credentials) {
    this.credentials = credentials;
  }

  public Person phones(List<Phone> phones) {
    this.phones = phones;
    return this;
  }

  public Person addPhonesItem(Phone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<Phone>();
    }
    this.phones.add(phonesItem);
    return this;
  }

   /**
   * Telefone
   * @return phones
  **/
  @ApiModelProperty(value = "Telefone")
  public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }

  public Person emails(List<Email> emails) {
    this.emails = emails;
    return this;
  }

  public Person addEmailsItem(Email emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<Email>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Email
   * @return emails
  **/
  @ApiModelProperty(value = "Email")
  public List<Email> getEmails() {
    return emails;
  }

  public void setEmails(List<Email> emails) {
    this.emails = emails;
  }

  public Person lastModificationDate(OffsetDateTime lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
    return this;
  }

   /**
   * Data da Última Alteração
   * @return lastModificationDate
  **/
  @ApiModelProperty(value = "Data da Última Alteração")
  public OffsetDateTime getLastModificationDate() {
    return lastModificationDate;
  }

  public void setLastModificationDate(OffsetDateTime lastModificationDate) {
    this.lastModificationDate = lastModificationDate;
  }

  public Person physicalLocationWhereLevelUpdated(PhysicalLocation physicalLocationWhereLevelUpdated) {
    this.physicalLocationWhereLevelUpdated = physicalLocationWhereLevelUpdated;
    return this;
  }

   /**
   * Get physicalLocationWhereLevelUpdated
   * @return physicalLocationWhereLevelUpdated
  **/
  @ApiModelProperty(value = "")
  public PhysicalLocation getPhysicalLocationWhereLevelUpdated() {
    return physicalLocationWhereLevelUpdated;
  }

  public void setPhysicalLocationWhereLevelUpdated(PhysicalLocation physicalLocationWhereLevelUpdated) {
    this.physicalLocationWhereLevelUpdated = physicalLocationWhereLevelUpdated;
  }

  public Person id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Person situation(PersonSituationType situation) {
    this.situation = situation;
    return this;
  }

   /**
   * Get situation
   * @return situation
  **/
  @ApiModelProperty(value = "")
  public PersonSituationType getSituation() {
    return situation;
  }

  public void setSituation(PersonSituationType situation) {
    this.situation = situation;
  }

  public Person registerDate(OffsetDateTime registerDate) {
    this.registerDate = registerDate;
    return this;
  }

   /**
   * Data de Cadastro
   * @return registerDate
  **/
  @ApiModelProperty(value = "Data de Cadastro")
  public OffsetDateTime getRegisterDate() {
    return registerDate;
  }

  public void setRegisterDate(OffsetDateTime registerDate) {
    this.registerDate = registerDate;
  }

  public Person situations(List<PersonSituation> situations) {
    this.situations = situations;
    return this;
  }

  public Person addSituationsItem(PersonSituation situationsItem) {
    if (this.situations == null) {
      this.situations = new ArrayList<PersonSituation>();
    }
    this.situations.add(situationsItem);
    return this;
  }

   /**
   * Lista de Situação da Pessoa
   * @return situations
  **/
  @ApiModelProperty(value = "Lista de Situação da Pessoa")
  public List<PersonSituation> getSituations() {
    return situations;
  }

  public void setSituations(List<PersonSituation> situations) {
    this.situations = situations;
  }

  public Person personVehicle(List<PersonVehicle> personVehicle) {
    this.personVehicle = personVehicle;
    return this;
  }

  public Person addPersonVehicleItem(PersonVehicle personVehicleItem) {
    if (this.personVehicle == null) {
      this.personVehicle = new ArrayList<PersonVehicle>();
    }
    this.personVehicle.add(personVehicleItem);
    return this;
  }

   /**
   * Veículos da Pessoa
   * @return personVehicle
  **/
  @ApiModelProperty(value = "Veículos da Pessoa")
  public List<PersonVehicle> getPersonVehicle() {
    return personVehicle;
  }

  public void setPersonVehicle(List<PersonVehicle> personVehicle) {
    this.personVehicle = personVehicle;
  }

  public Person registry(String registry) {
    this.registry = registry;
    return this;
  }

   /**
   * Matricula
   * @return registry
  **/
  @ApiModelProperty(value = "Matricula")
  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }

  public Person address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Endereço
   * @return address
  **/
  @ApiModelProperty(value = "Endereço")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Person lastAccessAllowedDate(OffsetDateTime lastAccessAllowedDate) {
    this.lastAccessAllowedDate = lastAccessAllowedDate;
    return this;
  }

   /**
   * Data do Último Acesso Permitido
   * @return lastAccessAllowedDate
  **/
  @ApiModelProperty(value = "Data do Último Acesso Permitido")
  public OffsetDateTime getLastAccessAllowedDate() {
    return lastAccessAllowedDate;
  }

  public void setLastAccessAllowedDate(OffsetDateTime lastAccessAllowedDate) {
    this.lastAccessAllowedDate = lastAccessAllowedDate;
  }

  public Person lastAccessAllowedPhysicalLocation(PhysicalLocation lastAccessAllowedPhysicalLocation) {
    this.lastAccessAllowedPhysicalLocation = lastAccessAllowedPhysicalLocation;
    return this;
  }

   /**
   * Get lastAccessAllowedPhysicalLocation
   * @return lastAccessAllowedPhysicalLocation
  **/
  @ApiModelProperty(value = "")
  public PhysicalLocation getLastAccessAllowedPhysicalLocation() {
    return lastAccessAllowedPhysicalLocation;
  }

  public void setLastAccessAllowedPhysicalLocation(PhysicalLocation lastAccessAllowedPhysicalLocation) {
    this.lastAccessAllowedPhysicalLocation = lastAccessAllowedPhysicalLocation;
  }

  public Person groups(List<GroupPerson> groups) {
    this.groups = groups;
    return this;
  }

  public Person addGroupsItem(GroupPerson groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<GroupPerson>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Grupos
   * @return groups
  **/
  @ApiModelProperty(value = "Grupos")
  public List<GroupPerson> getGroups() {
    return groups;
  }

  public void setGroups(List<GroupPerson> groups) {
    this.groups = groups;
  }

  public Person currentPhysicalLocation(PhysicalLocation currentPhysicalLocation) {
    this.currentPhysicalLocation = currentPhysicalLocation;
    return this;
  }

   /**
   * Get currentPhysicalLocation
   * @return currentPhysicalLocation
  **/
  @ApiModelProperty(value = "")
  public PhysicalLocation getCurrentPhysicalLocation() {
    return currentPhysicalLocation;
  }

  public void setCurrentPhysicalLocation(PhysicalLocation currentPhysicalLocation) {
    this.currentPhysicalLocation = currentPhysicalLocation;
  }

  public Person photoDate(OffsetDateTime photoDate) {
    this.photoDate = photoDate;
    return this;
  }

   /**
   * Data da Atualização da Foto
   * @return photoDate
  **/
  @ApiModelProperty(value = "Data da Atualização da Foto")
  public OffsetDateTime getPhotoDate() {
    return photoDate;
  }

  public void setPhotoDate(OffsetDateTime photoDate) {
    this.photoDate = photoDate;
  }

  public Person biometries(List<Biometry> biometries) {
    this.biometries = biometries;
    return this;
  }

  public Person addBiometriesItem(Biometry biometriesItem) {
    if (this.biometries == null) {
      this.biometries = new ArrayList<Biometry>();
    }
    this.biometries.add(biometriesItem);
    return this;
  }

   /**
   * Biometrias da Pessoa
   * @return biometries
  **/
  @ApiModelProperty(value = "Biometrias da Pessoa")
  public List<Biometry> getBiometries() {
    return biometries;
  }

  public void setBiometries(List<Biometry> biometries) {
    this.biometries = biometries;
  }

  public Person nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Nacionalidade
   * @return nationality
  **/
  @ApiModelProperty(value = "Nacionalidade")
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Person lastAccessDate(OffsetDateTime lastAccessDate) {
    this.lastAccessDate = lastAccessDate;
    return this;
  }

   /**
   * Último Acesso
   * @return lastAccessDate
  **/
  @ApiModelProperty(value = "Último Acesso")
  public OffsetDateTime getLastAccessDate() {
    return lastAccessDate;
  }

  public void setLastAccessDate(OffsetDateTime lastAccessDate) {
    this.lastAccessDate = lastAccessDate;
  }

  public Person district(String district) {
    this.district = district;
    return this;
  }

   /**
   * Bairro
   * @return district
  **/
  @ApiModelProperty(value = "Bairro")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Person name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome
   * @return name
  **/
  @ApiModelProperty(value = "Nome")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person federalState(String federalState) {
    this.federalState = federalState;
    return this;
  }

   /**
   * Estado
   * @return federalState
  **/
  @ApiModelProperty(value = "Estado")
  public String getFederalState() {
    return federalState;
  }

  public void setFederalState(String federalState) {
    this.federalState = federalState;
  }

  public Person user(List<User> user) {
    this.user = user;
    return this;
  }

  public Person addUserItem(User userItem) {
    if (this.user == null) {
      this.user = new ArrayList<User>();
    }
    this.user.add(userItem);
    return this;
  }

   /**
   * Usuário
   * @return user
  **/
  @ApiModelProperty(value = "Usuário")
  public List<User> getUser() {
    return user;
  }

  public void setUser(List<User> user) {
    this.user = user;
  }

  public Person organizationalStructuresPerson(List<OrganizationalStructurePerson> organizationalStructuresPerson) {
    this.organizationalStructuresPerson = organizationalStructuresPerson;
    return this;
  }

  public Person addOrganizationalStructuresPersonItem(OrganizationalStructurePerson organizationalStructuresPersonItem) {
    if (this.organizationalStructuresPerson == null) {
      this.organizationalStructuresPerson = new ArrayList<OrganizationalStructurePerson>();
    }
    this.organizationalStructuresPerson.add(organizationalStructuresPersonItem);
    return this;
  }

   /**
   * Estruturas organizacionais da pessoa
   * @return organizationalStructuresPerson
  **/
  @ApiModelProperty(value = "Estruturas organizacionais da pessoa")
  public List<OrganizationalStructurePerson> getOrganizationalStructuresPerson() {
    return organizationalStructuresPerson;
  }

  public void setOrganizationalStructuresPerson(List<OrganizationalStructurePerson> organizationalStructuresPerson) {
    this.organizationalStructuresPerson = organizationalStructuresPerson;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.birthday, person.birthday) &&
        Objects.equals(this.personRoles, person.personRoles) &&
        Objects.equals(this.workSchedulePeriods, person.workSchedulePeriods) &&
        Objects.equals(this.zipCode, person.zipCode) &&
        Objects.equals(this.gender, person.gender) &&
        Objects.equals(this.city, person.city) &&
        Objects.equals(this.documents, person.documents) &&
        Objects.equals(this.credentials, person.credentials) &&
        Objects.equals(this.phones, person.phones) &&
        Objects.equals(this.emails, person.emails) &&
        Objects.equals(this.lastModificationDate, person.lastModificationDate) &&
        Objects.equals(this.physicalLocationWhereLevelUpdated, person.physicalLocationWhereLevelUpdated) &&
        Objects.equals(this.id, person.id) &&
        Objects.equals(this.situation, person.situation) &&
        Objects.equals(this.registerDate, person.registerDate) &&
        Objects.equals(this.situations, person.situations) &&
        Objects.equals(this.personVehicle, person.personVehicle) &&
        Objects.equals(this.registry, person.registry) &&
        Objects.equals(this.address, person.address) &&
        Objects.equals(this.lastAccessAllowedDate, person.lastAccessAllowedDate) &&
        Objects.equals(this.lastAccessAllowedPhysicalLocation, person.lastAccessAllowedPhysicalLocation) &&
        Objects.equals(this.groups, person.groups) &&
        Objects.equals(this.currentPhysicalLocation, person.currentPhysicalLocation) &&
        Objects.equals(this.photoDate, person.photoDate) &&
        Objects.equals(this.biometries, person.biometries) &&
        Objects.equals(this.nationality, person.nationality) &&
        Objects.equals(this.lastAccessDate, person.lastAccessDate) &&
        Objects.equals(this.district, person.district) &&
        Objects.equals(this.name, person.name) &&
        Objects.equals(this.federalState, person.federalState) &&
        Objects.equals(this.user, person.user) &&
        Objects.equals(this.organizationalStructuresPerson, person.organizationalStructuresPerson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(birthday, personRoles, workSchedulePeriods, zipCode, gender, city, documents, credentials, phones, emails, lastModificationDate, physicalLocationWhereLevelUpdated, id, situation, registerDate, situations, personVehicle, registry, address, lastAccessAllowedDate, lastAccessAllowedPhysicalLocation, groups, currentPhysicalLocation, photoDate, biometries, nationality, lastAccessDate, district, name, federalState, user, organizationalStructuresPerson);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    personRoles: ").append(toIndentedString(personRoles)).append("\n");
    sb.append("    workSchedulePeriods: ").append(toIndentedString(workSchedulePeriods)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
    sb.append("    physicalLocationWhereLevelUpdated: ").append(toIndentedString(physicalLocationWhereLevelUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    situation: ").append(toIndentedString(situation)).append("\n");
    sb.append("    registerDate: ").append(toIndentedString(registerDate)).append("\n");
    sb.append("    situations: ").append(toIndentedString(situations)).append("\n");
    sb.append("    personVehicle: ").append(toIndentedString(personVehicle)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lastAccessAllowedDate: ").append(toIndentedString(lastAccessAllowedDate)).append("\n");
    sb.append("    lastAccessAllowedPhysicalLocation: ").append(toIndentedString(lastAccessAllowedPhysicalLocation)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    currentPhysicalLocation: ").append(toIndentedString(currentPhysicalLocation)).append("\n");
    sb.append("    photoDate: ").append(toIndentedString(photoDate)).append("\n");
    sb.append("    biometries: ").append(toIndentedString(biometries)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    lastAccessDate: ").append(toIndentedString(lastAccessDate)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    federalState: ").append(toIndentedString(federalState)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    organizationalStructuresPerson: ").append(toIndentedString(organizationalStructuresPerson)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

