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
 * Gets or Sets credentialType
 */
@JsonAdapter(CredentialType.Adapter.class)
public enum CredentialType {
  
  HOLDER("HOLDER"),
  
  PROVISORY("PROVISORY");

  private String value;

  CredentialType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CredentialType fromValue(String text) {
    for (CredentialType b : CredentialType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CredentialType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CredentialType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CredentialType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CredentialType.fromValue(String.valueOf(value));
    }
  }
}

