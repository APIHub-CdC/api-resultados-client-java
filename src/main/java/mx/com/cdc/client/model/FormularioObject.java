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
import mx.com.cdc.client.model.SeccionObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FormularioObject {
  @SerializedName("nombreFormulario")
  private String nombreFormulario = null;
  @SerializedName("secciones")
  private List<SeccionObject> secciones = new ArrayList<SeccionObject>();
  public FormularioObject nombreFormulario(String nombreFormulario) {
    this.nombreFormulario = nombreFormulario;
    return this;
  }
   
  @ApiModelProperty(example = "SOLICITUD DE CREDITO ORIGINACION", required = true, value = "Nombre del formulario")
  public String getNombreFormulario() {
    return nombreFormulario;
  }
  public void setNombreFormulario(String nombreFormulario) {
    this.nombreFormulario = nombreFormulario;
  }
  public FormularioObject secciones(List<SeccionObject> secciones) {
    this.secciones = secciones;
    return this;
  }
  public FormularioObject addSeccionesItem(SeccionObject seccionesItem) {
    this.secciones.add(seccionesItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Secciones que se compone el formulario")
  public List<SeccionObject> getSecciones() {
    return secciones;
  }
  public void setSecciones(List<SeccionObject> secciones) {
    this.secciones = secciones;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormularioObject formularioObject = (FormularioObject) o;
    return Objects.equals(this.nombreFormulario, formularioObject.nombreFormulario) &&
        Objects.equals(this.secciones, formularioObject.secciones);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombreFormulario, secciones);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormularioObject {\n");
    
    sb.append("    nombreFormulario: ").append(toIndentedString(nombreFormulario)).append("\n");
    sb.append("    secciones: ").append(toIndentedString(secciones)).append("\n");
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
