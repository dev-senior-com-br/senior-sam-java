/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 *
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
import br.com.senior.sam.application.pojos.LocalTimezone;
import br.com.senior.sam.application.pojos.Person;
import br.com.senior.sam.application.pojos.Role;
import java.io.IOException;

/**
 * User
 */




public class User {
  @SerializedName("person")
  private Person person = null;

  @SerializedName("localTimeZone")
  private LocalTimezone localTimeZone = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("login")
  private String login = null;

  @SerializedName("credentialStandardRole")
  private Role credentialStandardRole = null;

  public User person(Person person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @ApiModelProperty(required = true, value = "")
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public User localTimeZone(LocalTimezone localTimeZone) {
    this.localTimeZone = localTimeZone;
    return this;
  }

   /**
   * Get localTimeZone
   * @return localTimeZone
  **/
  @ApiModelProperty(value = "")
  public LocalTimezone getLocalTimeZone() {
    return localTimeZone;
  }

  public void setLocalTimeZone(LocalTimezone localTimeZone) {
    this.localTimeZone = localTimeZone;
  }

  public User id(Integer id) {
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

  public User login(String login) {
    this.login = login;
    return this;
  }

   /**
   * Login
   * @return login
  **/
  @ApiModelProperty(required = true, value = "Login")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public User credentialStandardRole(Role credentialStandardRole) {
    this.credentialStandardRole = credentialStandardRole;
    return this;
  }

   /**
   * Get credentialStandardRole
   * @return credentialStandardRole
  **/
  @ApiModelProperty(value = "")
  public Role getCredentialStandardRole() {
    return credentialStandardRole;
  }

  public void setCredentialStandardRole(Role credentialStandardRole) {
    this.credentialStandardRole = credentialStandardRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.person, user.person) &&
        Objects.equals(this.localTimeZone, user.localTimeZone) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.login, user.login) &&
        Objects.equals(this.credentialStandardRole, user.credentialStandardRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(person, localTimeZone, id, login, credentialStandardRole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    localTimeZone: ").append(toIndentedString(localTimeZone)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    credentialStandardRole: ").append(toIndentedString(credentialStandardRole)).append("\n");
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

