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
import mx.com.cdc.client.model.FisRazonObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FisObject {
  @SerializedName("score")
  private Long score = null;
  @SerializedName("razones")
  private List<FisRazonObject> razones = new ArrayList<FisRazonObject>();
  public FisObject score(Long score) {
    this.score = score;
    return this;
  }
   
  @ApiModelProperty(example = "630", required = true, value = "Score obtenido")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }
  public FisObject razones(List<FisRazonObject> razones) {
    this.razones = razones;
    return this;
  }
  public FisObject addRazonesItem(FisRazonObject razonesItem) {
    this.razones.add(razonesItem);
    return this;
  }
   
  @ApiModelProperty(required = true, value = "Exclusion Codes")
  public List<FisRazonObject> getRazones() {
    return razones;
  }
  public void setRazones(List<FisRazonObject> razones) {
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
    FisObject fisObject = (FisObject) o;
    return Objects.equals(this.score, fisObject.score) &&
        Objects.equals(this.razones, fisObject.razones);
  }
  @Override
  public int hashCode() {
    return Objects.hash(score, razones);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FisObject {\n");
    
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
