package mx.com.cdc.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;


public class FintechRazonObject {
  @SerializedName("clave")
  private String clave = null;
  @SerializedName("descripcion")
  private String descripcion = null;
  public FintechRazonObject clave(String clave) {
    this.clave = clave;
    return this;
  }
   
  @ApiModelProperty(example = "R7", required = true, value = "Clave de la razón")
  public String getClave() {
    return clave;
  }
  public void setClave(String clave) {
    this.clave = clave;
  }
  public FintechRazonObject descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }
   
  @ApiModelProperty(example = "Muy pocas cuentas a plazo fijo.", required = true, value = "Código de la razón por la que se genera el valor del score.<table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>E0</td><td>No Hit</td><tr><td>E1</td><td>Cuentas desactualizadas por más de 24 mesess</td><tr><td>E2</td><td>Fecha de defunción antecede a la fecha de cálculo</td></tbody></table>")
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FintechRazonObject fintechRazonObject = (FintechRazonObject) o;
    return Objects.equals(this.clave, fintechRazonObject.clave) &&
        Objects.equals(this.descripcion, fintechRazonObject.descripcion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(clave, descripcion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FintechRazonObject {\n");
    
    sb.append("    clave: ").append(toIndentedString(clave)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
