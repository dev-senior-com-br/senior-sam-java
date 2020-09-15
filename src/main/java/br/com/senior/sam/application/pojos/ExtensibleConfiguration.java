/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.8.1
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
import br.com.senior.sam.application.pojos.ExtensibleProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ExtensibleConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-15T12:45:04.275Z")



public class ExtensibleConfiguration {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("extensibleProperty")
  private List<ExtensibleProperty> extensibleProperty = null;

  public ExtensibleConfiguration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome da Configuração Extensível
   * @return name
  **/
  @ApiModelProperty(value = "Nome da Configuração Extensível")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExtensibleConfiguration id(Integer id) {
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

  public ExtensibleConfiguration extensibleProperty(List<ExtensibleProperty> extensibleProperty) {
    this.extensibleProperty = extensibleProperty;
    return this;
  }

  public ExtensibleConfiguration addExtensiblePropertyItem(ExtensibleProperty extensiblePropertyItem) {
    if (this.extensibleProperty == null) {
      this.extensibleProperty = new ArrayList<ExtensibleProperty>();
    }
    this.extensibleProperty.add(extensiblePropertyItem);
    return this;
  }

   /**
   * Lista de Propriedade Extensível
   * @return extensibleProperty
  **/
  @ApiModelProperty(value = "Lista de Propriedade Extensível")
  public List<ExtensibleProperty> getExtensibleProperty() {
    return extensibleProperty;
  }

  public void setExtensibleProperty(List<ExtensibleProperty> extensibleProperty) {
    this.extensibleProperty = extensibleProperty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensibleConfiguration extensibleConfiguration = (ExtensibleConfiguration) o;
    return Objects.equals(this.name, extensibleConfiguration.name) &&
        Objects.equals(this.id, extensibleConfiguration.id) &&
        Objects.equals(this.extensibleProperty, extensibleConfiguration.extensibleProperty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, extensibleProperty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensibleConfiguration {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    extensibleProperty: ").append(toIndentedString(extensibleProperty)).append("\n");
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

