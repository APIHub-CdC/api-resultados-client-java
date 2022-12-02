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


public class RechazoDirectoObject {
  @SerializedName("descripcion")
  private String descripcion = null;
  public RechazoDirectoObject descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }
   
  @ApiModelProperty(example = "Proporción de saldo vencido con respecto a saldo actual es muy alto", required = true, value = "Descripción del rechazo directo aplicado a la solicitud")
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
    RechazoDirectoObject rechazoDirectoObject = (RechazoDirectoObject) o;
    return Objects.equals(this.descripcion, rechazoDirectoObject.descripcion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(descripcion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RechazoDirectoObject {\n");
    
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
