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
import mx.com.cdc.client.model.FicoObject;
import mx.com.cdc.client.model.FintechObject;
import mx.com.cdc.client.model.FisObject;
import mx.com.cdc.client.model.FormularioObject;
import mx.com.cdc.client.model.IndicadorObject;
import mx.com.cdc.client.model.LaeObject;
import mx.com.cdc.client.model.MessageObject;
import mx.com.cdc.client.model.RechazoDirectoObject;
import mx.com.cdc.client.model.RechazoObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ResponseExportarExpediente {
  @SerializedName("message")
  private MessageObject message = null;
  @SerializedName("numeroFolio")
  private String numeroFolio = null;
  @SerializedName("fechaRegistro")
  private String fechaRegistro = null;
  @SerializedName("urlZipFile")
  private String urlZipFile = null;
  @SerializedName("formularios")
  private List<FormularioObject> formularios = new ArrayList<FormularioObject>();
  @SerializedName("ficoScore")
  private FicoObject ficoScore = null;
  @SerializedName("fisScore")
  private FisObject fisScore = null;
  @SerializedName("fintechScore")
  private FintechObject fintechScore = null;
  @SerializedName("laeScore")
  private LaeObject laeScore = null;
  @SerializedName("indicadores")
  private List<IndicadorObject> indicadores = new ArrayList<IndicadorObject>();
  @SerializedName("rechazos")
  private List<RechazoObject> rechazos = new ArrayList<RechazoObject>();
  @SerializedName("rechazosDirectos")
  private List<RechazoDirectoObject> rechazosDirectos = new ArrayList<RechazoDirectoObject>();
  public ResponseExportarExpediente message(MessageObject message) {
    this.message = message;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public MessageObject getMessage() {
    return message;
  }
  public void setMessage(MessageObject message) {
    this.message = message;
  }
  public ResponseExportarExpediente numeroFolio(String numeroFolio) {
    this.numeroFolio = numeroFolio;
    return this;
  }
   
  @ApiModelProperty(example = "1069", required = true, value = "Número de folio de la solicitud")
  public String getNumeroFolio() {
    return numeroFolio;
  }
  public void setNumeroFolio(String numeroFolio) {
    this.numeroFolio = numeroFolio;
  }
  public ResponseExportarExpediente fechaRegistro(String fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
    return this;
  }
   
  @ApiModelProperty(example = "2022-01-01T012:00:00.000+0000", required = true, value = "Fecha de registro de la solicitud")
  public String getFechaRegistro() {
    return fechaRegistro;
  }
  public void setFechaRegistro(String fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }
  public ResponseExportarExpediente urlZipFile(String urlZipFile) {
    this.urlZipFile = urlZipFile;
    return this;
  }
   
  @ApiModelProperty(example = "https://orimx-dev-us-east-1-multimedia-e9d.s3.amazonaws.com/export_file/96C90E3E518F7919E05314000A0A8EC0-17064.zip?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Date=20210802T195812Z&X-Amz-SignedHeaders=host&X-Amz-Expires=299&X-Amz-Credential=AKIA5IY6BN7VY5MGHDWG%2F20210802%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Signature=dff404f1f006ddb13fd5f70fa0fda99038ca2890df8d6fad78b1662bb07c2334", required = true, value = "URL para descarga de archivo zip")
  public String getUrlZipFile() {
    return urlZipFile;
  }
  public void setUrlZipFile(String urlZipFile) {
    this.urlZipFile = urlZipFile;
  }
  public ResponseExportarExpediente formularios(List<FormularioObject> formularios) {
    this.formularios = formularios;
    return this;
  }
  public ResponseExportarExpediente addFormulariosItem(FormularioObject formulariosItem) {
    this.formularios.add(formulariosItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Formularios de la solicitud")
  public List<FormularioObject> getFormularios() {
    return formularios;
  }
  public void setFormularios(List<FormularioObject> formularios) {
    this.formularios = formularios;
  }
  public ResponseExportarExpediente ficoScore(FicoObject ficoScore) {
    this.ficoScore = ficoScore;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "FICO® Score")
  public FicoObject getFicoScore() {
    return ficoScore;
  }
  public void setFicoScore(FicoObject ficoScore) {
    this.ficoScore = ficoScore;
  }
  public ResponseExportarExpediente fisScore(FisObject fisScore) {
    this.fisScore = fisScore;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "FIS Financial Inclusion Score")
  public FisObject getFisScore() {
    return fisScore;
  }
  public void setFisScore(FisObject fisScore) {
    this.fisScore = fisScore;
  }
  public ResponseExportarExpediente fintechScore(FintechObject fintechScore) {
    this.fintechScore = fintechScore;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "FinTech Score")
  public FintechObject getFintechScore() {
    return fintechScore;
  }
  public void setFintechScore(FintechObject fintechScore) {
    this.fintechScore = fintechScore;
  }
  public ResponseExportarExpediente laeScore(LaeObject laeScore) {
    this.laeScore = laeScore;
    return this;
  }
   
  @ApiModelProperty(required = true, value = "FICO® Loan Amount Estimator")
  public LaeObject getLaeScore() {
    return laeScore;
  }
  public void setLaeScore(LaeObject laeScore) {
    this.laeScore = laeScore;
  }
  public ResponseExportarExpediente indicadores(List<IndicadorObject> indicadores) {
    this.indicadores = indicadores;
    return this;
  }
  public ResponseExportarExpediente addIndicadoresItem(IndicadorObject indicadoresItem) {
    this.indicadores.add(indicadoresItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Indicadores calculados de la solicitud")
  public List<IndicadorObject> getIndicadores() {
    return indicadores;
  }
  public void setIndicadores(List<IndicadorObject> indicadores) {
    this.indicadores = indicadores;
  }
  public ResponseExportarExpediente rechazos(List<RechazoObject> rechazos) {
    this.rechazos = rechazos;
    return this;
  }
  public ResponseExportarExpediente addRechazosItem(RechazoObject rechazosItem) {
    this.rechazos.add(rechazosItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "")
  public List<RechazoObject> getRechazos() {
    return rechazos;
  }
  public void setRechazos(List<RechazoObject> rechazos) {
    this.rechazos = rechazos;
  }
  public ResponseExportarExpediente rechazosDirectos(List<RechazoDirectoObject> rechazosDirectos) {
    this.rechazosDirectos = rechazosDirectos;
    return this;
  }
  public ResponseExportarExpediente addRechazosDirectosItem(RechazoDirectoObject rechazosDirectosItem) {
    this.rechazosDirectos.add(rechazosDirectosItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Rechazos Directos de la solicitud")
  public List<RechazoDirectoObject> getRechazosDirectos() {
    return rechazosDirectos;
  }
  public void setRechazosDirectos(List<RechazoDirectoObject> rechazosDirectos) {
    this.rechazosDirectos = rechazosDirectos;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseExportarExpediente responseExportarExpediente = (ResponseExportarExpediente) o;
    return Objects.equals(this.message, responseExportarExpediente.message) &&
        Objects.equals(this.numeroFolio, responseExportarExpediente.numeroFolio) &&
        Objects.equals(this.fechaRegistro, responseExportarExpediente.fechaRegistro) &&
        Objects.equals(this.urlZipFile, responseExportarExpediente.urlZipFile) &&
        Objects.equals(this.formularios, responseExportarExpediente.formularios) &&
        Objects.equals(this.ficoScore, responseExportarExpediente.ficoScore) &&
        Objects.equals(this.fisScore, responseExportarExpediente.fisScore) &&
        Objects.equals(this.fintechScore, responseExportarExpediente.fintechScore) &&
        Objects.equals(this.laeScore, responseExportarExpediente.laeScore) &&
        Objects.equals(this.indicadores, responseExportarExpediente.indicadores) &&
        Objects.equals(this.rechazos, responseExportarExpediente.rechazos) &&
        Objects.equals(this.rechazosDirectos, responseExportarExpediente.rechazosDirectos);
  }
  @Override
  public int hashCode() {
    return Objects.hash(message, numeroFolio, fechaRegistro, urlZipFile, formularios, ficoScore, fisScore, fintechScore, laeScore, indicadores, rechazos, rechazosDirectos);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseExportarExpediente {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    numeroFolio: ").append(toIndentedString(numeroFolio)).append("\n");
    sb.append("    fechaRegistro: ").append(toIndentedString(fechaRegistro)).append("\n");
    sb.append("    urlZipFile: ").append(toIndentedString(urlZipFile)).append("\n");
    sb.append("    formularios: ").append(toIndentedString(formularios)).append("\n");
    sb.append("    ficoScore: ").append(toIndentedString(ficoScore)).append("\n");
    sb.append("    fisScore: ").append(toIndentedString(fisScore)).append("\n");
    sb.append("    fintechScore: ").append(toIndentedString(fintechScore)).append("\n");
    sb.append("    laeScore: ").append(toIndentedString(laeScore)).append("\n");
    sb.append("    indicadores: ").append(toIndentedString(indicadores)).append("\n");
    sb.append("    rechazos: ").append(toIndentedString(rechazos)).append("\n");
    sb.append("    rechazosDirectos: ").append(toIndentedString(rechazosDirectos)).append("\n");
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
