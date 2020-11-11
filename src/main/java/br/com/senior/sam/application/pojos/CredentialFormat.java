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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets credentialFormat
 */
@JsonAdapter(CredentialFormat.Adapter.class)
public enum CredentialFormat {
  
  CARD("CARD"),
  
  BIOMETRY("BIOMETRY"),
  
  LICENSE_PLATE("LICENSE_PLATE"),
  
  QRCODE("QRCODE"),
  
  BLUETOOTH("BLUETOOTH");

  private String value;

  CredentialFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CredentialFormat fromValue(String text) {
    for (CredentialFormat b : CredentialFormat.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CredentialFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final CredentialFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CredentialFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CredentialFormat.fromValue(String.valueOf(value));
    }
  }
}

