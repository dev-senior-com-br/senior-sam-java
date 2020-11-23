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
import br.com.senior.sam.application.pojos.HolidayList;
import br.com.senior.sam.application.pojos.TimeSlot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TimeSlotList
 */




public class TimeSlotList {
  @SerializedName("name")
  private String name = null;

  @SerializedName("timeSlots")
  private List<TimeSlot> timeSlots = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("holidayList")
  private HolidayList holidayList = null;

  public TimeSlotList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Nome
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TimeSlotList timeSlots(List<TimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
    return this;
  }

  public TimeSlotList addTimeSlotsItem(TimeSlot timeSlotsItem) {
    if (this.timeSlots == null) {
      this.timeSlots = new ArrayList<TimeSlot>();
    }
    this.timeSlots.add(timeSlotsItem);
    return this;
  }

   /**
   * Lista de Faixas
   * @return timeSlots
  **/
  @ApiModelProperty(value = "Lista de Faixas")
  public List<TimeSlot> getTimeSlots() {
    return timeSlots;
  }

  public void setTimeSlots(List<TimeSlot> timeSlots) {
    this.timeSlots = timeSlots;
  }

  public TimeSlotList id(Integer id) {
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

  public TimeSlotList holidayList(HolidayList holidayList) {
    this.holidayList = holidayList;
    return this;
  }

   /**
   * Get holidayList
   * @return holidayList
  **/
  @ApiModelProperty(value = "")
  public HolidayList getHolidayList() {
    return holidayList;
  }

  public void setHolidayList(HolidayList holidayList) {
    this.holidayList = holidayList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlotList timeSlotList = (TimeSlotList) o;
    return Objects.equals(this.name, timeSlotList.name) &&
        Objects.equals(this.timeSlots, timeSlotList.timeSlots) &&
        Objects.equals(this.id, timeSlotList.id) &&
        Objects.equals(this.holidayList, timeSlotList.holidayList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, timeSlots, id, holidayList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlotList {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    timeSlots: ").append(toIndentedString(timeSlots)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    holidayList: ").append(toIndentedString(holidayList)).append("\n");
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

