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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * BlueprintDevice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T15:38:01.539Z")



public class BlueprintDevice {
  @SerializedName("blueprint")
  private Blueprint blueprint = null;

  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("device")
  private Device device = null;

  @SerializedName("longitude")
  private Double longitude = null;

  public BlueprintDevice blueprint(Blueprint blueprint) {
    this.blueprint = blueprint;
    return this;
  }

   /**
   * Get blueprint
   * @return blueprint
  **/
  @ApiModelProperty(value = "")
  public Blueprint getBlueprint() {
    return blueprint;
  }

  public void setBlueprint(Blueprint blueprint) {
    this.blueprint = blueprint;
  }

  public BlueprintDevice latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude
   * @return latitude
  **/
  @ApiModelProperty(value = "Latitude")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public BlueprintDevice id(Integer id) {
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

  public BlueprintDevice device(Device device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @ApiModelProperty(value = "")
  public Device getDevice() {
    return device;
  }

  public void setDevice(Device device) {
    this.device = device;
  }

  public BlueprintDevice longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude
   * @return longitude
  **/
  @ApiModelProperty(value = "Longitude")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlueprintDevice blueprintDevice = (BlueprintDevice) o;
    return Objects.equals(this.blueprint, blueprintDevice.blueprint) &&
        Objects.equals(this.latitude, blueprintDevice.latitude) &&
        Objects.equals(this.id, blueprintDevice.id) &&
        Objects.equals(this.device, blueprintDevice.device) &&
        Objects.equals(this.longitude, blueprintDevice.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueprint, latitude, id, device, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlueprintDevice {\n");
    
    sb.append("    blueprint: ").append(toIndentedString(blueprint)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

