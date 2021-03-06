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
import br.com.senior.sam.application.pojos.Holiday;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HolidayList
 */




public class HolidayList {
  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("holiday")
  private List<Holiday> holiday = null;

  public HolidayList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome da Lista de Feriados
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome da Lista de Feriados")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HolidayList id(Integer id) {
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

  public HolidayList holiday(List<Holiday> holiday) {
    this.holiday = holiday;
    return this;
  }

  public HolidayList addHolidayItem(Holiday holidayItem) {
    if (this.holiday == null) {
      this.holiday = new ArrayList<Holiday>();
    }
    this.holiday.add(holidayItem);
    return this;
  }

   /**
   * Lista de Feriados
   * @return holiday
  **/
  @ApiModelProperty(value = "Lista de Feriados")
  public List<Holiday> getHoliday() {
    return holiday;
  }

  public void setHoliday(List<Holiday> holiday) {
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
    HolidayList holidayList = (HolidayList) o;
    return Objects.equals(this.name, holidayList.name) &&
        Objects.equals(this.id, holidayList.id) &&
        Objects.equals(this.holiday, holidayList.holiday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, holiday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HolidayList {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

