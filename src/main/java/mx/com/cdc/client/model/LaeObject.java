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
import mx.com.cdc.client.model.MatrizLaeObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class LaeObject {
  @SerializedName("prestamoPersonal")
  private List<MatrizLaeObject> prestamoPersonal = new ArrayList<MatrizLaeObject>();
  @SerializedName("tarjetaCredito")
  private List<MatrizLaeObject> tarjetaCredito = new ArrayList<MatrizLaeObject>();
  @SerializedName("tarjetaDepartamental")
  private List<MatrizLaeObject> tarjetaDepartamental = new ArrayList<MatrizLaeObject>();
  public LaeObject prestamoPersonal(List<MatrizLaeObject> prestamoPersonal) {
    this.prestamoPersonal = prestamoPersonal;
    return this;
  }
  public LaeObject addPrestamoPersonalItem(MatrizLaeObject prestamoPersonalItem) {
    this.prestamoPersonal.add(prestamoPersonalItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Segmento Prestamo Personal")
  public List<MatrizLaeObject> getPrestamoPersonal() {
    return prestamoPersonal;
  }
  public void setPrestamoPersonal(List<MatrizLaeObject> prestamoPersonal) {
    this.prestamoPersonal = prestamoPersonal;
  }
  public LaeObject tarjetaCredito(List<MatrizLaeObject> tarjetaCredito) {
    this.tarjetaCredito = tarjetaCredito;
    return this;
  }
  public LaeObject addTarjetaCreditoItem(MatrizLaeObject tarjetaCreditoItem) {
    this.tarjetaCredito.add(tarjetaCreditoItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Segmento Tarjeta Crédito")
  public List<MatrizLaeObject> getTarjetaCredito() {
    return tarjetaCredito;
  }
  public void setTarjetaCredito(List<MatrizLaeObject> tarjetaCredito) {
    this.tarjetaCredito = tarjetaCredito;
  }
  public LaeObject tarjetaDepartamental(List<MatrizLaeObject> tarjetaDepartamental) {
    this.tarjetaDepartamental = tarjetaDepartamental;
    return this;
  }
  public LaeObject addTarjetaDepartamentalItem(MatrizLaeObject tarjetaDepartamentalItem) {
    this.tarjetaDepartamental.add(tarjetaDepartamentalItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Segmento Tarjeta Departamental")
  public List<MatrizLaeObject> getTarjetaDepartamental() {
    return tarjetaDepartamental;
  }
  public void setTarjetaDepartamental(List<MatrizLaeObject> tarjetaDepartamental) {
    this.tarjetaDepartamental = tarjetaDepartamental;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaeObject laeObject = (LaeObject) o;
    return Objects.equals(this.prestamoPersonal, laeObject.prestamoPersonal) &&
        Objects.equals(this.tarjetaCredito, laeObject.tarjetaCredito) &&
        Objects.equals(this.tarjetaDepartamental, laeObject.tarjetaDepartamental);
  }
  @Override
  public int hashCode() {
    return Objects.hash(prestamoPersonal, tarjetaCredito, tarjetaDepartamental);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaeObject {\n");
    
    sb.append("    prestamoPersonal: ").append(toIndentedString(prestamoPersonal)).append("\n");
    sb.append("    tarjetaCredito: ").append(toIndentedString(tarjetaCredito)).append("\n");
    sb.append("    tarjetaDepartamental: ").append(toIndentedString(tarjetaDepartamental)).append("\n");
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
