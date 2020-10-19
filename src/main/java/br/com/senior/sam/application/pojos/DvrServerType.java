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
 * Gets or Sets dvrServerType
 */
@JsonAdapter(DvrServerType.Adapter.class)
public enum DvrServerType {
  
  DIGIFORT("DIGIFORT"),
  
  CAMERITE("CAMERITE"),
  
  MILESTONE("MILESTONE"),
  
  AXXON("AXXON");

  private String value;

  DvrServerType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DvrServerType fromValue(String text) {
    for (DvrServerType b : DvrServerType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DvrServerType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DvrServerType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DvrServerType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DvrServerType.fromValue(String.valueOf(value));
    }
  }
}

