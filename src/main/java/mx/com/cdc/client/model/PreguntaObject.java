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


public class PreguntaObject {
  @SerializedName("pregunta")
  private String pregunta = null;
  @SerializedName("respuesta")
  private String respuesta = null;
  public PreguntaObject pregunta(String pregunta) {
    this.pregunta = pregunta;
    return this;
  }
   
  @ApiModelProperty(example = "Primer nombre", required = true, value = "Nombre de la pregunta")
  public String getPregunta() {
    return pregunta;
  }
  public void setPregunta(String pregunta) {
    this.pregunta = pregunta;
  }
  public PreguntaObject respuesta(String respuesta) {
    this.respuesta = respuesta;
    return this;
  }
   
  @ApiModelProperty(example = "Juan", required = true, value = "Respesta de la pregunta")
  public String getRespuesta() {
    return respuesta;
  }
  public void setRespuesta(String respuesta) {
    this.respuesta = respuesta;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreguntaObject preguntaObject = (PreguntaObject) o;
    return Objects.equals(this.pregunta, preguntaObject.pregunta) &&
        Objects.equals(this.respuesta, preguntaObject.respuesta);
  }
  @Override
  public int hashCode() {
    return Objects.hash(pregunta, respuesta);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreguntaObject {\n");
    
    sb.append("    pregunta: ").append(toIndentedString(pregunta)).append("\n");
    sb.append("    respuesta: ").append(toIndentedString(respuesta)).append("\n");
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
