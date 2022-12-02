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


public class MatrizLaeObject {
  @SerializedName("numero")
  private String numero = null;
  @SerializedName("valor")
  private String valor = null;
  @SerializedName("minimo")
  private String minimo = null;
  @SerializedName("maximo")
  private String maximo = null;
  public MatrizLaeObject numero(String numero) {
    this.numero = numero;
    return this;
  }
   
  @ApiModelProperty(example = "1", required = true, value = "")
  public String getNumero() {
    return numero;
  }
  public void setNumero(String numero) {
    this.numero = numero;
  }
  public MatrizLaeObject valor(String valor) {
    this.valor = valor;
    return this;
  }
   
  @ApiModelProperty(example = "1595", required = true, value = "")
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }
  public MatrizLaeObject minimo(String minimo) {
    this.minimo = minimo;
    return this;
  }
   
  @ApiModelProperty(example = "1", required = true, value = "")
  public String getMinimo() {
    return minimo;
  }
  public void setMinimo(String minimo) {
    this.minimo = minimo;
  }
  public MatrizLaeObject maximo(String maximo) {
    this.maximo = maximo;
    return this;
  }
   
  @ApiModelProperty(example = "39", required = true, value = "")
  public String getMaximo() {
    return maximo;
  }
  public void setMaximo(String maximo) {
    this.maximo = maximo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatrizLaeObject matrizLaeObject = (MatrizLaeObject) o;
    return Objects.equals(this.numero, matrizLaeObject.numero) &&
        Objects.equals(this.valor, matrizLaeObject.valor) &&
        Objects.equals(this.minimo, matrizLaeObject.minimo) &&
        Objects.equals(this.maximo, matrizLaeObject.maximo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(numero, valor, minimo, maximo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatrizLaeObject {\n");
    
    sb.append("    numero: ").append(toIndentedString(numero)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    minimo: ").append(toIndentedString(minimo)).append("\n");
    sb.append("    maximo: ").append(toIndentedString(maximo)).append("\n");
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
