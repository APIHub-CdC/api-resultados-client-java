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


public class RechazoObject {
  @SerializedName("tipoRechazo")
  private String tipoRechazo = null;
  @SerializedName("descripcionRechazo")
  private String descripcionRechazo = null;
  @SerializedName("ingresado")
  private Object ingresado = null;
  public RechazoObject tipoRechazo(String tipoRechazo) {
    this.tipoRechazo = tipoRechazo;
    return this;
  }
   
  @ApiModelProperty(example = "LISTA BLANCA", required = true, value = "Tipo de rechazo")
  public String getTipoRechazo() {
    return tipoRechazo;
  }
  public void setTipoRechazo(String tipoRechazo) {
    this.tipoRechazo = tipoRechazo;
  }
  public RechazoObject descripcionRechazo(String descripcionRechazo) {
    this.descripcionRechazo = descripcionRechazo;
    return this;
  }
   
  @ApiModelProperty(example = "CODIGO POSTAL", required = true, value = "Descripción del rechazo aplicado")
  public String getDescripcionRechazo() {
    return descripcionRechazo;
  }
  public void setDescripcionRechazo(String descripcionRechazo) {
    this.descripcionRechazo = descripcionRechazo;
  }
  public RechazoObject ingresado(Object ingresado) {
    this.ingresado = ingresado;
    return this;
  }
   
  @ApiModelProperty(example = "\"65510\"", required = true, value = "Valor recopilado por el cual se aplico el rechazo")
  public Object getIngresado() {
    return ingresado;
  }
  public void setIngresado(Object ingresado) {
    this.ingresado = ingresado;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RechazoObject rechazoObject = (RechazoObject) o;
    return Objects.equals(this.tipoRechazo, rechazoObject.tipoRechazo) &&
        Objects.equals(this.descripcionRechazo, rechazoObject.descripcionRechazo) &&
        Objects.equals(this.ingresado, rechazoObject.ingresado);
  }
  @Override
  public int hashCode() {
    return Objects.hash(tipoRechazo, descripcionRechazo, ingresado);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RechazoObject {\n");
    
    sb.append("    tipoRechazo: ").append(toIndentedString(tipoRechazo)).append("\n");
    sb.append("    descripcionRechazo: ").append(toIndentedString(descripcionRechazo)).append("\n");
    sb.append("    ingresado: ").append(toIndentedString(ingresado)).append("\n");
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
