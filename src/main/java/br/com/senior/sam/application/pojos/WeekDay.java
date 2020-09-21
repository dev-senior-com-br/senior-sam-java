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
 * Gets or Sets weekDay
 */
@JsonAdapter(WeekDay.Adapter.class)
public enum WeekDay {
  
  SUNDAY("SUNDAY"),
  
  MONDAY("MONDAY"),
  
  TUESDAY("TUESDAY"),
  
  WEDNESDAY("WEDNESDAY"),
  
  THURSDAY("THURSDAY"),
  
  FRIDAY("FRIDAY"),
  
  SATURDAY("SATURDAY");

  private String value;

  WeekDay(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WeekDay fromValue(String text) {
    for (WeekDay b : WeekDay.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<WeekDay> {
    @Override
    public void write(final JsonWriter jsonWriter, final WeekDay enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WeekDay read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WeekDay.fromValue(String.valueOf(value));
    }
  }
}

