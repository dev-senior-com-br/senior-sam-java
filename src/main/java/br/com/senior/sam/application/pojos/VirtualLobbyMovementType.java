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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets virtualLobbyMovementType
 */
@JsonAdapter(VirtualLobbyMovementType.Adapter.class)
public enum VirtualLobbyMovementType {
  
  ISSUE_ACCESS_CREDENTIAL("ISSUE_ACCESS_CREDENTIAL"),
  
  REGISTER_LEAVE("REGISTER_LEAVE"),
  
  REGISTER_ENTRY("REGISTER_ENTRY");

  private String value;

  VirtualLobbyMovementType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VirtualLobbyMovementType fromValue(String text) {
    for (VirtualLobbyMovementType b : VirtualLobbyMovementType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<VirtualLobbyMovementType> {
    @Override
    public void write(final JsonWriter jsonWriter, final VirtualLobbyMovementType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VirtualLobbyMovementType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VirtualLobbyMovementType.fromValue(String.valueOf(value));
    }
  }
}

