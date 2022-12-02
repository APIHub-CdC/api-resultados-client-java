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
import mx.com.cdc.client.model.FintechRazonObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FintechObject {
  @SerializedName("score")
  private Long score = null;
  @SerializedName("razones")
  private List<FintechRazonObject> razones = new ArrayList<FintechRazonObject>();
  public FintechObject score(Long score) {
    this.score = score;
    return this;
  }
   
  @ApiModelProperty(example = "866", required = true, value = "Número de 3 dígitos que resume su riesgo de crédito")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }
  public FintechObject razones(List<FintechRazonObject> razones) {
    this.razones = razones;
    return this;
  }
  public FintechObject addRazonesItem(FintechRazonObject razonesItem) {
    this.razones.add(razonesItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Exclusion Codes")
  public List<FintechRazonObject> getRazones() {
    return razones;
  }
  public void setRazones(List<FintechRazonObject> razones) {
    this.razones = razones;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FintechObject fintechObject = (FintechObject) o;
    return Objects.equals(this.score, fintechObject.score) &&
        Objects.equals(this.razones, fintechObject.razones);
  }
  @Override
  public int hashCode() {
    return Objects.hash(score, razones);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FintechObject {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    razones: ").append(toIndentedString(razones)).append("\n");
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
