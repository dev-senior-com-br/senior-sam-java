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
 * Gets or Sets biometricValidation
 */
@JsonAdapter(BiometricValidation.Adapter.class)
public enum BiometricValidation {
  
  NONE("NONE"),
  
  ONE_TO_ONE("ONE_TO_ONE"),
  
  ONE_TO_MANY("ONE_TO_MANY");

  private String value;

  BiometricValidation(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BiometricValidation fromValue(String text) {
    for (BiometricValidation b : BiometricValidation.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BiometricValidation> {
    @Override
    public void write(final JsonWriter jsonWriter, final BiometricValidation enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BiometricValidation read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BiometricValidation.fromValue(String.valueOf(value));
    }
  }
}

