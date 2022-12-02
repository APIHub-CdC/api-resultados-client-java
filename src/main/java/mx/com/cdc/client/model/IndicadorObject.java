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


public class IndicadorObject {
  @SerializedName("nombreIndicador")
  private String nombreIndicador = null;
  @SerializedName("valor")
  private String valor = null;
  public IndicadorObject nombreIndicador(String nombreIndicador) {
    this.nombreIndicador = nombreIndicador;
    return this;
  }
   
  @ApiModelProperty(example = "CAPACIDAD DE PAGO", required = true, value = "Nombre del indicador")
  public String getNombreIndicador() {
    return nombreIndicador;
  }
  public void setNombreIndicador(String nombreIndicador) {
    this.nombreIndicador = nombreIndicador;
  }
  public IndicadorObject valor(String valor) {
    this.valor = valor;
    return this;
  }
   
  @ApiModelProperty(example = "25000.0", required = true, value = "Valor calculado del indicador")
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicadorObject indicadorObject = (IndicadorObject) o;
    return Objects.equals(this.nombreIndicador, indicadorObject.nombreIndicador) &&
        Objects.equals(this.valor, indicadorObject.valor);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombreIndicador, valor);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicadorObject {\n");
    
    sb.append("    nombreIndicador: ").append(toIndentedString(nombreIndicador)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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
