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


public class MessageObject {
  @SerializedName("accepted")
  private Boolean accepted = null;
  @SerializedName("message")
  private String message = null;
  public MessageObject accepted(Boolean accepted) {
    this.accepted = accepted;
    return this;
  }
   
  @ApiModelProperty(example = "true", required = true, value = "qwerty")
  public Boolean isAccepted() {
    return accepted;
  }
  public void setAccepted(Boolean accepted) {
    this.accepted = accepted;
  }
  public MessageObject message(String message) {
    this.message = message;
    return this;
  }
   
  @ApiModelProperty(example = "Extracción de información correcta", required = true, value = "qwerty")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageObject messageObject = (MessageObject) o;
    return Objects.equals(this.accepted, messageObject.accepted) &&
        Objects.equals(this.message, messageObject.message);
  }
  @Override
  public int hashCode() {
    return Objects.hash(accepted, message);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageObject {\n");
    
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
