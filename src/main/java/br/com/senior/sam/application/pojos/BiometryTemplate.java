/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.10.0
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
import java.io.IOException;

/**
 * BiometryTemplate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T15:38:01.539Z")



public class BiometryTemplate {
  @SerializedName("biometry")
  private Biometry biometry = null;

  @SerializedName("template")
  private byte[] template = null;

  @SerializedName("id")
  private Integer id = null;

  public BiometryTemplate biometry(Biometry biometry) {
    this.biometry = biometry;
    return this;
  }

   /**
   * Get biometry
   * @return biometry
  **/
  @ApiModelProperty(value = "")
  public Biometry getBiometry() {
    return biometry;
  }

  public void setBiometry(Biometry biometry) {
    this.biometry = biometry;
  }

  public BiometryTemplate template(byte[] template) {
    this.template = template;
    return this;
  }

   /**
   * Template
   * @return template
  **/
  @ApiModelProperty(value = "Template")
  public byte[] getTemplate() {
    return template;
  }

  public void setTemplate(byte[] template) {
    this.template = template;
  }

  public BiometryTemplate id(Integer id) {
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
    BiometryTemplate biometryTemplate = (BiometryTemplate) o;
    return Objects.equals(this.biometry, biometryTemplate.biometry) &&
        Arrays.equals(this.template, biometryTemplate.template) &&
        Objects.equals(this.id, biometryTemplate.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biometry, Arrays.hashCode(template), id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiometryTemplate {\n");
    
    sb.append("    biometry: ").append(toIndentedString(biometry)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

