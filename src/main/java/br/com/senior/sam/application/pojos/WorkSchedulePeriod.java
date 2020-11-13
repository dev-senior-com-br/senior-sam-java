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
import br.com.senior.sam.application.pojos.WeekDay;
import br.com.senior.sam.application.pojos.WorkSchedule;
import br.com.senior.sam.application.pojos.WorkScheduleSlotTime;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * WorkSchedulePeriod
 */




public class WorkSchedulePeriod {
  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("workSchedule")
  private WorkSchedule workSchedule = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @SerializedName("weekDay")
  private WeekDay weekDay = null;

  @SerializedName("lastModifiedBy")
  private String lastModifiedBy = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("slotTimes")
  private List<WorkScheduleSlotTime> slotTimes = null;

  public WorkSchedulePeriod createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * 
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public WorkSchedulePeriod workSchedule(WorkSchedule workSchedule) {
    this.workSchedule = workSchedule;
    return this;
  }

   /**
   * Get workSchedule
   * @return workSchedule
  **/
  @ApiModelProperty(value = "")
  public WorkSchedule getWorkSchedule() {
    return workSchedule;
  }

  public void setWorkSchedule(WorkSchedule workSchedule) {
    this.workSchedule = workSchedule;
  }

  public WorkSchedulePeriod createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * 
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public WorkSchedulePeriod lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * 
   * @return lastModifiedDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public WorkSchedulePeriod weekDay(WeekDay weekDay) {
    this.weekDay = weekDay;
    return this;
  }

   /**
   * Get weekDay
   * @return weekDay
  **/
  @ApiModelProperty(value = "")
  public WeekDay getWeekDay() {
    return weekDay;
  }

  public void setWeekDay(WeekDay weekDay) {
    this.weekDay = weekDay;
  }

  public WorkSchedulePeriod lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * 
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public WorkSchedulePeriod id(Integer id) {
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

  public WorkSchedulePeriod slotTimes(List<WorkScheduleSlotTime> slotTimes) {
    this.slotTimes = slotTimes;
    return this;
  }

  public WorkSchedulePeriod addSlotTimesItem(WorkScheduleSlotTime slotTimesItem) {
    if (this.slotTimes == null) {
      this.slotTimes = new ArrayList<WorkScheduleSlotTime>();
    }
    this.slotTimes.add(slotTimesItem);
    return this;
  }

   /**
   * Faixas Horárias da Escala
   * @return slotTimes
  **/
  @ApiModelProperty(value = "Faixas Horárias da Escala")
  public List<WorkScheduleSlotTime> getSlotTimes() {
    return slotTimes;
  }

  public void setSlotTimes(List<WorkScheduleSlotTime> slotTimes) {
    this.slotTimes = slotTimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkSchedulePeriod workSchedulePeriod = (WorkSchedulePeriod) o;
    return Objects.equals(this.createdDate, workSchedulePeriod.createdDate) &&
        Objects.equals(this.workSchedule, workSchedulePeriod.workSchedule) &&
        Objects.equals(this.createdBy, workSchedulePeriod.createdBy) &&
        Objects.equals(this.lastModifiedDate, workSchedulePeriod.lastModifiedDate) &&
        Objects.equals(this.weekDay, workSchedulePeriod.weekDay) &&
        Objects.equals(this.lastModifiedBy, workSchedulePeriod.lastModifiedBy) &&
        Objects.equals(this.id, workSchedulePeriod.id) &&
        Objects.equals(this.slotTimes, workSchedulePeriod.slotTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, workSchedule, createdBy, lastModifiedDate, weekDay, lastModifiedBy, id, slotTimes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkSchedulePeriod {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    workSchedule: ").append(toIndentedString(workSchedule)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    weekDay: ").append(toIndentedString(weekDay)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slotTimes: ").append(toIndentedString(slotTimes)).append("\n");
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

