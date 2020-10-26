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

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets accessCallOrigin
 */
@JsonAdapter(AccessCallOrigin.Adapter.class)
public enum AccessCallOrigin {
  
  DEVICE_INPUT("DEVICE_INPUT"),
  
  DEVICE_READER("DEVICE_READER"),
  
  SELFSERVICE_TERMINAL("SELFSERVICE_TERMINAL");

  private String value;

  AccessCallOrigin(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccessCallOrigin fromValue(String text) {
    for (AccessCallOrigin b : AccessCallOrigin.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccessCallOrigin> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccessCallOrigin enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccessCallOrigin read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccessCallOrigin.fromValue(String.valueOf(value));
    }
  }
}

