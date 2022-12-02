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
import mx.com.cdc.client.model.PreguntaObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class SeccionObject {
  @SerializedName("nombreSeccion")
  private String nombreSeccion = null;
  @SerializedName("preguntas")
  private List<PreguntaObject> preguntas = new ArrayList<PreguntaObject>();
  public SeccionObject nombreSeccion(String nombreSeccion) {
    this.nombreSeccion = nombreSeccion;
    return this;
  }
   
  @ApiModelProperty(example = "Datos generales", required = true, value = "Nombre de la sección del formulario")
  public String getNombreSeccion() {
    return nombreSeccion;
  }
  public void setNombreSeccion(String nombreSeccion) {
    this.nombreSeccion = nombreSeccion;
  }
  public SeccionObject preguntas(List<PreguntaObject> preguntas) {
    this.preguntas = preguntas;
    return this;
  }
  public SeccionObject addPreguntasItem(PreguntaObject preguntasItem) {
    this.preguntas.add(preguntasItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Preguntas que componen la sección")
  public List<PreguntaObject> getPreguntas() {
    return preguntas;
  }
  public void setPreguntas(List<PreguntaObject> preguntas) {
    this.preguntas = preguntas;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeccionObject seccionObject = (SeccionObject) o;
    return Objects.equals(this.nombreSeccion, seccionObject.nombreSeccion) &&
        Objects.equals(this.preguntas, seccionObject.preguntas);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombreSeccion, preguntas);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeccionObject {\n");
    
    sb.append("    nombreSeccion: ").append(toIndentedString(nombreSeccion)).append("\n");
    sb.append("    preguntas: ").append(toIndentedString(preguntas)).append("\n");
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
