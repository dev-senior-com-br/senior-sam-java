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
import br.com.senior.sam.application.pojos.CardTechnology;
import br.com.senior.sam.application.pojos.Credential;
import java.io.IOException;

/**
 * CardCredential
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-14T16:45:01.743Z")



public class CardCredential {
  @SerializedName("credential")
  private Credential credential = null;

  @SerializedName("cardTechnology")
  private CardTechnology cardTechnology = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("cardNumber")
  private Integer cardNumber = null;

  public CardCredential credential(Credential credential) {
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @ApiModelProperty(value = "")
  public Credential getCredential() {
    return credential;
  }

  public void setCredential(Credential credential) {
    this.credential = credential;
  }

  public CardCredential cardTechnology(CardTechnology cardTechnology) {
    this.cardTechnology = cardTechnology;
    return this;
  }

   /**
   * Get cardTechnology
   * @return cardTechnology
  **/
  @ApiModelProperty(value = "")
  public CardTechnology getCardTechnology() {
    return cardTechnology;
  }

  public void setCardTechnology(CardTechnology cardTechnology) {
    this.cardTechnology = cardTechnology;
  }

  public CardCredential id(Integer id) {
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

  public CardCredential cardNumber(Integer cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Número do Cartão
   * @return cardNumber
  **/
  @ApiModelProperty(value = "Número do Cartão")
  public Integer getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(Integer cardNumber) {
    this.cardNumber = cardNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardCredential cardCredential = (CardCredential) o;
    return Objects.equals(this.credential, cardCredential.credential) &&
        Objects.equals(this.cardTechnology, cardCredential.cardTechnology) &&
        Objects.equals(this.id, cardCredential.id) &&
        Objects.equals(this.cardNumber, cardCredential.cardNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credential, cardTechnology, id, cardNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardCredential {\n");
    
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    cardTechnology: ").append(toIndentedString(cardTechnology)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
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

