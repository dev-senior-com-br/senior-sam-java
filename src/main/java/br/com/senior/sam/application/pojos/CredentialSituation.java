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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets credentialSituation
 */
@JsonAdapter(CredentialSituation.Adapter.class)
public enum CredentialSituation {
  
  RELEASED("RELEASED"),
  
  BLOCKED("BLOCKED");

  private String value;

  CredentialSituation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CredentialSituation fromValue(String text) {
    for (CredentialSituation b : CredentialSituation.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CredentialSituation> {
    @Override
    public void write(final JsonWriter jsonWriter, final CredentialSituation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CredentialSituation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CredentialSituation.fromValue(String.valueOf(value));
    }
  }
}

