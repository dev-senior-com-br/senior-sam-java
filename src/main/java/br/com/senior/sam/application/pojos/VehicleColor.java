/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.8.2
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
 * Gets or Sets vehicleColor
 */
@JsonAdapter(VehicleColor.Adapter.class)
public enum VehicleColor {
  
  UNDEFINED("UNDEFINED"),
  
  BLACK("BLACK"),
  
  WHITE("WHITE"),
  
  SILVER("SILVER"),
  
  RED("RED"),
  
  GREY("GREY"),
  
  BLUE("BLUE"),
  
  YELLOW("YELLOW"),
  
  GREEN("GREEN"),
  
  ORANGE("ORANGE"),
  
  OTHERS("OTHERS");

  private String value;

  VehicleColor(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static VehicleColor fromValue(String text) {
    for (VehicleColor b : VehicleColor.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<VehicleColor> {
    @Override
    public void write(final JsonWriter jsonWriter, final VehicleColor enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public VehicleColor read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return VehicleColor.fromValue(String.valueOf(value));
    }
  }
}

