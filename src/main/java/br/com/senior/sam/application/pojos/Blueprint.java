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
import br.com.senior.sam.application.pojos.BlueprintCamera;
import br.com.senior.sam.application.pojos.BlueprintDevice;
import br.com.senior.sam.application.pojos.BlueprintPhysicalLocation;
import br.com.senior.sam.application.pojos.PhysicalLocation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Blueprint
 */




public class Blueprint {
  @SerializedName("cameras")
  private List<BlueprintCamera> cameras = null;

  @SerializedName("physicalLocation")
  private List<PhysicalLocation> physicalLocation = null;

  @SerializedName("invertedColors")
  private Boolean invertedColors = null;

  @SerializedName("devices")
  private List<BlueprintDevice> devices = null;

  @SerializedName("physicalLocationsChildren")
  private List<BlueprintPhysicalLocation> physicalLocationsChildren = null;

  @SerializedName("id")
  private Integer id = null;

  public Blueprint cameras(List<BlueprintCamera> cameras) {
    this.cameras = cameras;
    return this;
  }

  public Blueprint addCamerasItem(BlueprintCamera camerasItem) {
    if (this.cameras == null) {
      this.cameras = new ArrayList<BlueprintCamera>();
    }
    this.cameras.add(camerasItem);
    return this;
  }

   /**
   * Lista de Câmeras
   * @return cameras
  **/
  @ApiModelProperty(value = "Lista de Câmeras")
  public List<BlueprintCamera> getCameras() {
    return cameras;
  }

  public void setCameras(List<BlueprintCamera> cameras) {
    this.cameras = cameras;
  }

  public Blueprint physicalLocation(List<PhysicalLocation> physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }

  public Blueprint addPhysicalLocationItem(PhysicalLocation physicalLocationItem) {
    if (this.physicalLocation == null) {
      this.physicalLocation = new ArrayList<PhysicalLocation>();
    }
    this.physicalLocation.add(physicalLocationItem);
    return this;
  }

   /**
   * Local físico
   * @return physicalLocation
  **/
  @ApiModelProperty(value = "Local físico")
  public List<PhysicalLocation> getPhysicalLocation() {
    return physicalLocation;
  }

  public void setPhysicalLocation(List<PhysicalLocation> physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  public Blueprint invertedColors(Boolean invertedColors) {
    this.invertedColors = invertedColors;
    return this;
  }

   /**
   * Cores Invertidas
   * @return invertedColors
  **/
  @ApiModelProperty(value = "Cores Invertidas")
  public Boolean isInvertedColors() {
    return invertedColors;
  }

  public void setInvertedColors(Boolean invertedColors) {
    this.invertedColors = invertedColors;
  }

  public Blueprint devices(List<BlueprintDevice> devices) {
    this.devices = devices;
    return this;
  }

  public Blueprint addDevicesItem(BlueprintDevice devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<BlueprintDevice>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Lista de Dispositivos
   * @return devices
  **/
  @ApiModelProperty(value = "Lista de Dispositivos")
  public List<BlueprintDevice> getDevices() {
    return devices;
  }

  public void setDevices(List<BlueprintDevice> devices) {
    this.devices = devices;
  }

  public Blueprint physicalLocationsChildren(List<BlueprintPhysicalLocation> physicalLocationsChildren) {
    this.physicalLocationsChildren = physicalLocationsChildren;
    return this;
  }

  public Blueprint addPhysicalLocationsChildrenItem(BlueprintPhysicalLocation physicalLocationsChildrenItem) {
    if (this.physicalLocationsChildren == null) {
      this.physicalLocationsChildren = new ArrayList<BlueprintPhysicalLocation>();
    }
    this.physicalLocationsChildren.add(physicalLocationsChildrenItem);
    return this;
  }

   /**
   * Lista de Locais Físicos
   * @return physicalLocationsChildren
  **/
  @ApiModelProperty(value = "Lista de Locais Físicos")
  public List<BlueprintPhysicalLocation> getPhysicalLocationsChildren() {
    return physicalLocationsChildren;
  }

  public void setPhysicalLocationsChildren(List<BlueprintPhysicalLocation> physicalLocationsChildren) {
    this.physicalLocationsChildren = physicalLocationsChildren;
  }

  public Blueprint id(Integer id) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Blueprint blueprint = (Blueprint) o;
    return Objects.equals(this.cameras, blueprint.cameras) &&
        Objects.equals(this.physicalLocation, blueprint.physicalLocation) &&
        Objects.equals(this.invertedColors, blueprint.invertedColors) &&
        Objects.equals(this.devices, blueprint.devices) &&
        Objects.equals(this.physicalLocationsChildren, blueprint.physicalLocationsChildren) &&
        Objects.equals(this.id, blueprint.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cameras, physicalLocation, invertedColors, devices, physicalLocationsChildren, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Blueprint {\n");
    
    sb.append("    cameras: ").append(toIndentedString(cameras)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    invertedColors: ").append(toIndentedString(invertedColors)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    physicalLocationsChildren: ").append(toIndentedString(physicalLocationsChildren)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

