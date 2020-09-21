/*
 * Aplicação
 * Serviço do backend da aplicação do Ronda senior X
 *
 * OpenAPI spec version: 4.8.2
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
import br.com.senior.sam.application.pojos.Blueprint;
import br.com.senior.sam.application.pojos.Camera;
import java.io.IOException;

/**
 * BlueprintCamera
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-21T14:51:01.521Z")



public class BlueprintCamera {
  @SerializedName("blueprint")
  private Blueprint blueprint = null;

  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("camera")
  private Camera camera = null;

  @SerializedName("longitude")
  private Double longitude = null;

  public BlueprintCamera blueprint(Blueprint blueprint) {
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

  public BlueprintCamera latitude(Double latitude) {
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

  public BlueprintCamera id(Integer id) {
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

  public BlueprintCamera camera(Camera camera) {
    this.camera = camera;
    return this;
  }

   /**
   * Get camera
   * @return camera
  **/
  @ApiModelProperty(value = "")
  public Camera getCamera() {
    return camera;
  }

  public void setCamera(Camera camera) {
    this.camera = camera;
  }

  public BlueprintCamera longitude(Double longitude) {
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
    BlueprintCamera blueprintCamera = (BlueprintCamera) o;
    return Objects.equals(this.blueprint, blueprintCamera.blueprint) &&
        Objects.equals(this.latitude, blueprintCamera.latitude) &&
        Objects.equals(this.id, blueprintCamera.id) &&
        Objects.equals(this.camera, blueprintCamera.camera) &&
        Objects.equals(this.longitude, blueprintCamera.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueprint, latitude, id, camera, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlueprintCamera {\n");
    
    sb.append("    blueprint: ").append(toIndentedString(blueprint)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    camera: ").append(toIndentedString(camera)).append("\n");
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

