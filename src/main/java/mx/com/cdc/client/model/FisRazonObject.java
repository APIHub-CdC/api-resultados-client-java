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


public class FisRazonObject {
  @SerializedName("clave")
  private String clave = null;
  @SerializedName("descripcion")
  private String descripcion = null;
  public FisRazonObject clave(String clave) {
    this.clave = clave;
    return this;
  }
   
  @ApiModelProperty(example = "E3", required = true, value = "Clave de la razón")
  public String getClave() {
    return clave;
  }
  public void setClave(String clave) {
    this.clave = clave;
  }
  public FisRazonObject descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }
   
  @ApiModelProperty(example = "El cliente no tiene la información mínima necesaria para el cálculo del score.", required = true, value = "Exclusion Codes: <table><thead><tr><th>Valor</th><th>Descripción</th></tr></thead><tbody><tr><td>E1</td><td>El cliente posee historial crediticio reportado en alguna de las SICs mexicanas</td></tr><tr><td>E2</td><td>El cliente está reportado como fallecido</td></tr><tr><td>E3</td><td>El cliente no tiene la información mínima necesaria para el cálculo del score</td></tr><tr><td>E4</td><td>El código postal no es correcto</td></tr></tbody></table>")
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
    FisRazonObject fisRazonObject = (FisRazonObject) o;
    return Objects.equals(this.clave, fisRazonObject.clave) &&
        Objects.equals(this.descripcion, fisRazonObject.descripcion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(clave, descripcion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FisRazonObject {\n");
    
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
