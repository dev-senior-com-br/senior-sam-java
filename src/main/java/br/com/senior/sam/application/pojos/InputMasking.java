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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.sam.application.pojos.InputDevice;
import java.io.IOException;

/**
 * InputMasking
 */




public class InputMasking {
  @SerializedName("endHour")
  private String endHour = null;

  @SerializedName("sunday")
  private Boolean sunday = null;

  @SerializedName("saturday")
  private Boolean saturday = null;

  @SerializedName("startHour")
  private String startHour = null;

  @SerializedName("inputDevice")
  private InputDevice inputDevice = null;

  @SerializedName("businessDays")
  private Boolean businessDays = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("holiday")
  private Boolean holiday = null;

  public InputMasking endHour(String endHour) {
    this.endHour = endHour;
    return this;
  }

   /**
   * Hora Final
   * @return endHour
  **/
  @ApiModelProperty(required = true, value = "Hora Final")
  public String getEndHour() {
    return endHour;
  }

  public void setEndHour(String endHour) {
    this.endHour = endHour;
  }

  public InputMasking sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * Domingo
   * @return sunday
  **/
  @ApiModelProperty(required = true, value = "Domingo")
  public Boolean isSunday() {
    return sunday;
  }

  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  public InputMasking saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * Sábado
   * @return saturday
  **/
  @ApiModelProperty(required = true, value = "Sábado")
  public Boolean isSaturday() {
    return saturday;
  }

  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }

  public InputMasking startHour(String startHour) {
    this.startHour = startHour;
    return this;
  }

   /**
   * Hora Inicial
   * @return startHour
  **/
  @ApiModelProperty(required = true, value = "Hora Inicial")
  public String getStartHour() {
    return startHour;
  }

  public void setStartHour(String startHour) {
    this.startHour = startHour;
  }

  public InputMasking inputDevice(InputDevice inputDevice) {
    this.inputDevice = inputDevice;
    return this;
  }

   /**
   * Get inputDevice
   * @return inputDevice
  **/
  @ApiModelProperty(value = "")
  public InputDevice getInputDevice() {
    return inputDevice;
  }

  public void setInputDevice(InputDevice inputDevice) {
    this.inputDevice = inputDevice;
  }

  public InputMasking businessDays(Boolean businessDays) {
    this.businessDays = businessDays;
    return this;
  }

   /**
   * Dias da Semana
   * @return businessDays
  **/
  @ApiModelProperty(required = true, value = "Dias da Semana")
  public Boolean isBusinessDays() {
    return businessDays;
  }

  public void setBusinessDays(Boolean businessDays) {
    this.businessDays = businessDays;
  }

  public InputMasking id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @ApiModelProperty(value = "ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InputMasking holiday(Boolean holiday) {
    this.holiday = holiday;
    return this;
  }

   /**
   * Feriado
   * @return holiday
  **/
  @ApiModelProperty(required = true, value = "Feriado")
  public Boolean isHoliday() {
    return holiday;
  }

  public void setHoliday(Boolean holiday) {
    this.holiday = holiday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputMasking inputMasking = (InputMasking) o;
    return Objects.equals(this.endHour, inputMasking.endHour) &&
        Objects.equals(this.sunday, inputMasking.sunday) &&
        Objects.equals(this.saturday, inputMasking.saturday) &&
        Objects.equals(this.startHour, inputMasking.startHour) &&
        Objects.equals(this.inputDevice, inputMasking.inputDevice) &&
        Objects.equals(this.businessDays, inputMasking.businessDays) &&
        Objects.equals(this.id, inputMasking.id) &&
        Objects.equals(this.holiday, inputMasking.holiday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endHour, sunday, saturday, startHour, inputDevice, businessDays, id, holiday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputMasking {\n");
    
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    inputDevice: ").append(toIndentedString(inputDevice)).append("\n");
    sb.append("    businessDays: ").append(toIndentedString(businessDays)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    holiday: ").append(toIndentedString(holiday)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

