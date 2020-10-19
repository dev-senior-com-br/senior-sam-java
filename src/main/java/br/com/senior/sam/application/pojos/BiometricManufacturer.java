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
 * Gets or Sets biometricManufacturer
 */
@JsonAdapter(BiometricManufacturer.Adapter.class)
public enum BiometricManufacturer {
  
  NONE("NONE"),
  
  FINGERPRINT_SAGEM("FINGERPRINT_SAGEM"),
  
  FINGERPRINT_SUPREMA("FINGERPRINT_SUPREMA"),
  
  FINGERPRINT_VIRDI("FINGERPRINT_VIRDI"),
  
  FINGERPRINT_NITGEN("FINGERPRINT_NITGEN"),
  
  FINGERPRINT_CAMA("FINGERPRINT_CAMA"),
  
  FINGERPRINT_INNOVATRICS("FINGERPRINT_INNOVATRICS"),
  
  HANDKEY_IR("HANDKEY_IR"),
  
  FACIAL("FACIAL");

  private String value;

  BiometricManufacturer(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BiometricManufacturer fromValue(String text) {
    for (BiometricManufacturer b : BiometricManufacturer.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<BiometricManufacturer> {
    @Override
    public void write(final JsonWriter jsonWriter, final BiometricManufacturer enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BiometricManufacturer read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BiometricManufacturer.fromValue(String.valueOf(value));
    }
  }
}

