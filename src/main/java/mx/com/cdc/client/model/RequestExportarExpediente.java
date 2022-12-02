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


public class RequestExportarExpediente {
  @SerializedName("idOtorgante")
  private String idOtorgante = null;
  @SerializedName("folio")
  private Long folio = null;
  public RequestExportarExpediente idOtorgante(String idOtorgante) {
    this.idOtorgante = idOtorgante;
    return this;
  }
   
  @ApiModelProperty(example = "kPDjCZpf", required = true, value = "Identificador del Otorgante")
  public String getIdOtorgante() {
    return idOtorgante;
  }
  public void setIdOtorgante(String idOtorgante) {
    this.idOtorgante = idOtorgante;
  }
  public RequestExportarExpediente folio(Long folio) {
    this.folio = folio;
    return this;
  }
   
  @ApiModelProperty(example = "1069", required = true, value = "Folio de la solicitud")
  public Long getFolio() {
    return folio;
  }
  public void setFolio(Long folio) {
    this.folio = folio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestExportarExpediente requestExportarExpediente = (RequestExportarExpediente) o;
    return Objects.equals(this.idOtorgante, requestExportarExpediente.idOtorgante) &&
        Objects.equals(this.folio, requestExportarExpediente.folio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(idOtorgante, folio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestExportarExpediente {\n");
    
    sb.append("    idOtorgante: ").append(toIndentedString(idOtorgante)).append("\n");
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
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
