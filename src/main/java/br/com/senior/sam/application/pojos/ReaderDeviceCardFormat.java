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
import br.com.senior.sam.application.pojos.CardFormat;
import br.com.senior.sam.application.pojos.ReaderDevice;
import java.io.IOException;

/**
 * ReaderDeviceCardFormat
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T15:38:01.539Z")



public class ReaderDeviceCardFormat {
  @SerializedName("cardFormat")
  private CardFormat cardFormat = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("readerDevice")
  private ReaderDevice readerDevice = null;

  public ReaderDeviceCardFormat cardFormat(CardFormat cardFormat) {
    this.cardFormat = cardFormat;
    return this;
  }

   /**
   * Get cardFormat
   * @return cardFormat
  **/
  @ApiModelProperty(value = "")
  public CardFormat getCardFormat() {
    return cardFormat;
  }

  public void setCardFormat(CardFormat cardFormat) {
    this.cardFormat = cardFormat;
  }

  public ReaderDeviceCardFormat id(Integer id) {
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

  public ReaderDeviceCardFormat readerDevice(ReaderDevice readerDevice) {
    this.readerDevice = readerDevice;
    return this;
  }

   /**
   * Get readerDevice
   * @return readerDevice
  **/
  @ApiModelProperty(value = "")
  public ReaderDevice getReaderDevice() {
    return readerDevice;
  }

  public void setReaderDevice(ReaderDevice readerDevice) {
    this.readerDevice = readerDevice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReaderDeviceCardFormat readerDeviceCardFormat = (ReaderDeviceCardFormat) o;
    return Objects.equals(this.cardFormat, readerDeviceCardFormat.cardFormat) &&
        Objects.equals(this.id, readerDeviceCardFormat.id) &&
        Objects.equals(this.readerDevice, readerDeviceCardFormat.readerDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardFormat, id, readerDevice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReaderDeviceCardFormat {\n");
    
    sb.append("    cardFormat: ").append(toIndentedString(cardFormat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    readerDevice: ").append(toIndentedString(readerDevice)).append("\n");
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

