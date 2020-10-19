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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets vehicleUse
 */
@JsonAdapter(VehicleUse.Adapter.class)
public enum VehicleUse {
  
  PRIVATE_USE("PRIVATE_USE"),
  
  COMMON_USE("COMMON_USE"),
  
  FREE_USE("FREE_USE");

  private String value;

  VehicleUse(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VehicleUse fromValue(String text) {
    for (VehicleUse b : VehicleUse.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<VehicleUse> {
    @Override
    public void write(final JsonWriter jsonWriter, final VehicleUse enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VehicleUse read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VehicleUse.fromValue(String.valueOf(value));
    }
  }
}

