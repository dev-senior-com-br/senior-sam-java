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
 * Gets or Sets accessEventType
 */
@JsonAdapter(AccessEventType.Adapter.class)
public enum AccessEventType {
  
  VALID("ACCESS_VALID"),
  
  DENIED_PERMISSION("ACCESS_DENIED_PERMISSION"),
  
  DENIED_SITUATION("ACCESS_DENIED_SITUATION"),
  
  DENIED_CARD_VALIDITY("ACCESS_DENIED_CARD_VALIDITY"),
  
  DENIED_LEVEL_CONTROLER("ACCESS_DENIED_LEVEL_CONTROLER"),
  
  DENIED_CREDIT_ACCESS("ACCESS_DENIED_CREDIT_ACCESS"),
  
  DENIED_ROLE_RANGE("ACCESS_DENIED_ROLE_RANGE"),
  
  DENIED_LOCAL_RANGE("ACCESS_DENIED_LOCAL_RANGE"),
  
  DENIED_CARD_NOT_FOUND("ACCESS_DENIED_CARD_NOT_FOUND"),
  
  VALID_ACCOMPANY("ACCESS_VALID_ACCOMPANY"),
  
  DENIED_ACCOMPANY("ACCESS_DENIED_ACCOMPANY"),
  
  DENIED_INVALID_AUTHORIZER("ACCESS_DENIED_INVALID_AUTHORIZER"),
  
  DENIED_WAITING_FOR_NEXT_VALIDATION("ACCESS_DENIED_WAITING_FOR_NEXT_VALIDATION"),
  
  DENIED_ANTI_PASSBACK("ACCESS_DENIED_ANTI_PASSBACK"),
  
  DENIED_CREDIT_RANGE("ACCESS_DENIED_CREDIT_RANGE"),
  
  DENIED_STOCKING_CONTROL("ACCESS_DENIED_STOCKING_CONTROL"),
  
  DENIED_NOT_PARKING_SPACE_TYPE("ACCESS_DENIED_NOT_PARKING_SPACE_TYPE"),
  
  DENIED_NOT_PARKING_SPACE("ACCESS_DENIED_NOT_PARKING_SPACE"),
  
  COERCION("ACCESS_COERCION"),
  
  DENIED_BIOMETRY("ACCESS_DENIED_BIOMETRY"),
  
  DENIED_CARD_FORMAT_ERROR("ACCESS_DENIED_CARD_FORMAT_ERROR"),
  
  DENIED_FACILITY_CODE("ACCESS_DENIED_FACILITY_CODE"),
  
  DENIED_PASSWORD("ACCESS_DENIED_PASSWORD"),
  
  DENIED_SECOND_CARD_NOT_PRESENTED("ACCESS_DENIED_SECOND_CARD_NOT_PRESENTED"),
  
  DESISTENCE("ACCESS_DESISTENCE"),
  
  VALID_AUTHORIZER("ACCESS_VALID_AUTHORIZER"),
  
  VALID_FACILITY_CODE("ACCESS_VALID_FACILITY_CODE"),
  
  VALID_FRAUD("ACCESS_VALID_FRAUD"),
  
  VALID_OUT_REPOSE("ACCESS_VALID_OUT_REPOSE"),
  
  DENIED("ACCESS_DENIED"),
  
  DENIED_CREDENTIAL_NOT_FOUND("ACCESS_DENIED_CREDENTIAL_NOT_FOUND"),
  
  DENIED_CREDENTIAL_VALIDITY("ACCESS_DENIED_CREDENTIAL_VALIDITY"),
  
  DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT("ACCESS_DENIED_INVALID_VEHICLE_CREDENTIAL_FORMAT"),
  
  DENIED_INVALID_VEHICLE_CARD_CREDENTIAL("ACCESS_DENIED_INVALID_VEHICLE_CARD_CREDENTIAL"),
  
  DENIED_WAITING_VEHICLE("ACCESS_DENIED_WAITING_VEHICLE"),
  
  DENIED_READER_NOT_VALIDATE_VEHICLE("ACCESS_DENIED_READER_NOT_VALIDATE_VEHICLE"),
  
  DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE("ACCESS_DENIED_PERSON_NOT_ASSOCIATED_WITH_VEHICLE"),
  
  DENIED_CUSTOM_VALIDATION("ACCESS_DENIED_CUSTOM_VALIDATION"),
  
  DENIED_BLOCK_PROVISORY_ON_EXIT("ACCESS_DENIED_BLOCK_PROVISORY_ON_EXIT");

  private String value;

  AccessEventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccessEventType fromValue(String text) {
    for (AccessEventType b : AccessEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccessEventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AccessEventType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccessEventType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccessEventType.fromValue(String.valueOf(value));
    }
  }
}

