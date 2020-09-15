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
 * Gets or Sets accessCallStatus
 */
@JsonAdapter(AccessCallStatus.Adapter.class)
public enum AccessCallStatus {
  
  CALLING("CALLING"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  FINISHED_TIMED_OUT("FINISHED_TIMED_OUT"),
  
  FINISHED_ACCESS_ALLOWED("FINISHED_ACCESS_ALLOWED"),
  
  FINISHED_ACCESS_DENIED("FINISHED_ACCESS_DENIED");

  private String value;

  AccessCallStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccessCallStatus fromValue(String text) {
    for (AccessCallStatus b : AccessCallStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccessCallStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccessCallStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccessCallStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccessCallStatus.fromValue(String.valueOf(value));
    }
  }
}

