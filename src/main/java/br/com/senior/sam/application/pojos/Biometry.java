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
import br.com.senior.sam.application.pojos.BiometricManufacturer;
import br.com.senior.sam.application.pojos.BiometryTemplate;
import br.com.senior.sam.application.pojos.Person;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Biometry
 */




public class Biometry {
  @SerializedName("biometricManufacturer")
  private BiometricManufacturer biometricManufacturer = null;

  @SerializedName("person")
  private Person person = null;

  @SerializedName("templates")
  private List<BiometryTemplate> templates = null;

  @SerializedName("id")
  private Integer id = null;

  public Biometry biometricManufacturer(BiometricManufacturer biometricManufacturer) {
    this.biometricManufacturer = biometricManufacturer;
    return this;
  }

   /**
   * Get biometricManufacturer
   * @return biometricManufacturer
  **/
  @ApiModelProperty(required = true, value = "")
  public BiometricManufacturer getBiometricManufacturer() {
    return biometricManufacturer;
  }

  public void setBiometricManufacturer(BiometricManufacturer biometricManufacturer) {
    this.biometricManufacturer = biometricManufacturer;
  }

  public Biometry person(Person person) {
    this.person = person;
    return this;
  }

   /**
   * Get person
   * @return person
  **/
  @ApiModelProperty(value = "")
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public Biometry templates(List<BiometryTemplate> templates) {
    this.templates = templates;
    return this;
  }

  public Biometry addTemplatesItem(BiometryTemplate templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<BiometryTemplate>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Templates Biométricos
   * @return templates
  **/
  @ApiModelProperty(value = "Templates Biométricos")
  public List<BiometryTemplate> getTemplates() {
    return templates;
  }

  public void setTemplates(List<BiometryTemplate> templates) {
    this.templates = templates;
  }

  public Biometry id(Integer id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Biometry biometry = (Biometry) o;
    return Objects.equals(this.biometricManufacturer, biometry.biometricManufacturer) &&
        Objects.equals(this.person, biometry.person) &&
        Objects.equals(this.templates, biometry.templates) &&
        Objects.equals(this.id, biometry.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biometricManufacturer, person, templates, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Biometry {\n");
    
    sb.append("    biometricManufacturer: ").append(toIndentedString(biometricManufacturer)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

