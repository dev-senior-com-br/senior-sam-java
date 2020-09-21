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
import br.com.senior.sam.application.pojos.Credential;
import br.com.senior.sam.application.pojos.PersonVehicle;
import br.com.senior.sam.application.pojos.PhysicalLocation;
import br.com.senior.sam.application.pojos.Role;
import br.com.senior.sam.application.pojos.VehicleColor;
import br.com.senior.sam.application.pojos.VehicleUse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Vehicle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-21T14:51:01.521Z")



public class Vehicle {
  @SerializedName("role")
  private Role role = null;

  @SerializedName("physicalLocation")
  private PhysicalLocation physicalLocation = null;

  @SerializedName("color")
  private VehicleColor color = null;

  @SerializedName("credentials")
  private List<Credential> credentials = null;

  @SerializedName("personVehicles")
  private List<PersonVehicle> personVehicles = null;

  @SerializedName("vehicleUse")
  private VehicleUse vehicleUse = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("plate")
  private String plate = null;

  @SerializedName("lastAccess")
  private OffsetDateTime lastAccess = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("manufacturer")
  private String manufacturer = null;

  public Vehicle role(Role role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public Vehicle physicalLocation(PhysicalLocation physicalLocation) {
    this.physicalLocation = physicalLocation;
    return this;
  }

   /**
   * Get physicalLocation
   * @return physicalLocation
  **/
  @ApiModelProperty(value = "")
  public PhysicalLocation getPhysicalLocation() {
    return physicalLocation;
  }

  public void setPhysicalLocation(PhysicalLocation physicalLocation) {
    this.physicalLocation = physicalLocation;
  }

  public Vehicle color(VehicleColor color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(value = "")
  public VehicleColor getColor() {
    return color;
  }

  public void setColor(VehicleColor color) {
    this.color = color;
  }

  public Vehicle credentials(List<Credential> credentials) {
    this.credentials = credentials;
    return this;
  }

  public Vehicle addCredentialsItem(Credential credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<Credential>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Credênciais do Veículo
   * @return credentials
  **/
  @ApiModelProperty(value = "Credênciais do Veículo")
  public List<Credential> getCredentials() {
    return credentials;
  }

  public void setCredentials(List<Credential> credentials) {
    this.credentials = credentials;
  }

  public Vehicle personVehicles(List<PersonVehicle> personVehicles) {
    this.personVehicles = personVehicles;
    return this;
  }

  public Vehicle addPersonVehiclesItem(PersonVehicle personVehiclesItem) {
    if (this.personVehicles == null) {
      this.personVehicles = new ArrayList<PersonVehicle>();
    }
    this.personVehicles.add(personVehiclesItem);
    return this;
  }

   /**
   * Pessoa Veículo
   * @return personVehicles
  **/
  @ApiModelProperty(value = "Pessoa Veículo")
  public List<PersonVehicle> getPersonVehicles() {
    return personVehicles;
  }

  public void setPersonVehicles(List<PersonVehicle> personVehicles) {
    this.personVehicles = personVehicles;
  }

  public Vehicle vehicleUse(VehicleUse vehicleUse) {
    this.vehicleUse = vehicleUse;
    return this;
  }

   /**
   * Get vehicleUse
   * @return vehicleUse
  **/
  @ApiModelProperty(value = "")
  public VehicleUse getVehicleUse() {
    return vehicleUse;
  }

  public void setVehicleUse(VehicleUse vehicleUse) {
    this.vehicleUse = vehicleUse;
  }

  public Vehicle model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Modelo
   * @return model
  **/
  @ApiModelProperty(value = "Modelo")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Vehicle plate(String plate) {
    this.plate = plate;
    return this;
  }

   /**
   * Placa
   * @return plate
  **/
  @ApiModelProperty(value = "Placa")
  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public Vehicle lastAccess(OffsetDateTime lastAccess) {
    this.lastAccess = lastAccess;
    return this;
  }

   /**
   * Data do Último Acesso
   * @return lastAccess
  **/
  @ApiModelProperty(value = "Data do Último Acesso")
  public OffsetDateTime getLastAccess() {
    return lastAccess;
  }

  public void setLastAccess(OffsetDateTime lastAccess) {
    this.lastAccess = lastAccess;
  }

  public Vehicle id(Integer id) {
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

  public Vehicle manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Fabricante
   * @return manufacturer
  **/
  @ApiModelProperty(value = "Fabricante")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.role, vehicle.role) &&
        Objects.equals(this.physicalLocation, vehicle.physicalLocation) &&
        Objects.equals(this.color, vehicle.color) &&
        Objects.equals(this.credentials, vehicle.credentials) &&
        Objects.equals(this.personVehicles, vehicle.personVehicles) &&
        Objects.equals(this.vehicleUse, vehicle.vehicleUse) &&
        Objects.equals(this.model, vehicle.model) &&
        Objects.equals(this.plate, vehicle.plate) &&
        Objects.equals(this.lastAccess, vehicle.lastAccess) &&
        Objects.equals(this.id, vehicle.id) &&
        Objects.equals(this.manufacturer, vehicle.manufacturer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, physicalLocation, color, credentials, personVehicles, vehicleUse, model, plate, lastAccess, id, manufacturer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    physicalLocation: ").append(toIndentedString(physicalLocation)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    personVehicles: ").append(toIndentedString(personVehicles)).append("\n");
    sb.append("    vehicleUse: ").append(toIndentedString(vehicleUse)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    plate: ").append(toIndentedString(plate)).append("\n");
    sb.append("    lastAccess: ").append(toIndentedString(lastAccess)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
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

