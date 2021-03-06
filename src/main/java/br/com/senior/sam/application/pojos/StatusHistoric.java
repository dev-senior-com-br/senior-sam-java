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
 * Gets or Sets statusHistoric
 */
@JsonAdapter(StatusHistoric.Adapter.class)
public enum StatusHistoric {
  
  FUTURE("FUTURE"),
  
  PRESENT("PRESENT"),
  
  PAST("PAST");

  private String value;

  StatusHistoric(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StatusHistoric fromValue(String text) {
    for (StatusHistoric b : StatusHistoric.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StatusHistoric> {
    @Override
    public void write(final JsonWriter jsonWriter, final StatusHistoric enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StatusHistoric read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StatusHistoric.fromValue(String.valueOf(value));
    }
  }
}

