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
 * Gets or Sets deviceSituation
 */
@JsonAdapter(DeviceSituation.Adapter.class)
public enum DeviceSituation {
  
  INACTIVE("INACTIVE"),
  
  ACTIVE("ACTIVE");

  private String value;

  DeviceSituation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeviceSituation fromValue(String text) {
    for (DeviceSituation b : DeviceSituation.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DeviceSituation> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeviceSituation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeviceSituation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeviceSituation.fromValue(String.valueOf(value));
    }
  }
}

