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


public class FicoRazonObject {
  @SerializedName("clave")
  private String clave = null;
  @SerializedName("descripcion")
  private String descripcion = null;
  public FicoRazonObject clave(String clave) {
    this.clave = clave;
    return this;
  }
   
  @ApiModelProperty(example = "R7", required = true, value = "Clave de la razón")
  public String getClave() {
    return clave;
  }
  public void setClave(String clave) {
    this.clave = clave;
  }
  public FicoRazonObject descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }
   
  @ApiModelProperty(example = "Muy pocas cuentas a plazo fijo.", required = true, value = "Código de la razón por la que se genera el valor del score. Ver tabla Razones Score<table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>A0</td><td>Historial de pago de la cuenta es demasiado nuevo</td><tr><td>A1</td><td>Último reporte de la Cuenta en estatus de morosidad</td><tr><td>A2</td><td>Monto de crédito disponibles en cuentas revolventes</td><tr><td>A3</td><td>Monto de deuda en cuentas es demasiado alto</td><tr><td>A4</td><td>Monto de deuda en el banco/nacional en cuentas revolventes</td><tr><td>A5</td><td>Monto de deuda clasificado en cobranza</td><tr><td>A6</td><td>Monto de deuda en las cuentas morosas</td><tr><td>A7</td><td>Monto de deuda en cuentas abiertas recientemente es demasiado alto</td><tr><td>A8</td><td>Monto de deuda en cuentas revolventes abiertas recientemente de banco/nacionales es muy alta</td><tr><td>A9</td><td>Monto de deuda en cuentas abiertos recientemente en empresas de financiamiento al consumo es demasiado alto</td><tr><td>B0</td><td>Monto de deuda en cuentas de minoristas abiertas recientemente es demasiado alta</td><tr><td>B1</td><td>Monto de deuda en cuentas revolventes abiertas recientemente es demasiado alto</td><tr><td>B2</td><td>Monto de deuda en cuentas de empresas de financiamiento de ventas abiertas recientemente es muy alto</td><tr><td>B3</td><td>Monto de deuda en las cuentas de minoristas</td><tr><td>B4</td><td>Monto de deuda en cuentas revolventes</td><tr><td>B5</td><td>Monto de deuda en cuentas de crédito revolventes es demasiado alto</td><tr><td>B6</td><td>Montos en mora en cuentas</td><tr><td>D0</td><td>Declaración de quiebra reportada</td><tr><td>D1</td><td>Fecha de la última consulta muy reciente</td><tr><td>D2</td><td>Morosidad en las cuentas</td><tr><td>D3</td><td>Morosidad en cuentas abiertas recientemente</td><tr><td>D4</td><td>Eliminación de registro público o la cobranza reportada</td><tr><td>D5</td><td>La frecuencia de la morosidad</td><tr><td>D6</td><td>Nivel de morosidad en las cuentas</td><tr><td>D7</td><td>Morosidad grave</td><tr><td>D8</td><td>Morosidad grave, y registro público, o la cobranza reportada</td><tr><td>D9</td><td>Morosidad grave, registro público eliminado, o la cobranza reportada</td><tr><td>E0</td><td>Información Demográfica</td><tr><td>E1</td><td>Falta información demográfica</td><tr><td>E2</td><td>Número de consultas</td><tr><td>E3</td><td>Frecuencia de las consultas</td><tr><td>E4</td><td>La falta de información reciente de la cuenta</td><tr><td>E5</td><td>Monto de deuda en los registros públicos eliminados</td><tr><td>E6</td><td>Proporción del saldo sobre el límite de las cuentas</td><tr><td>F0</td><td>Historial de pagos disponible es insuficiente</td><tr><td>F1</td><td>Falta de cuentas de crédito de reciente creación</td><tr><td>F2</td><td>Falta de cuentas revolventes de reciente creación</td><tr><td>F3</td><td>Falta de información reciente de préstamo de autofinanciamiento</td><tr><td>F4</td><td>Falta de información reciente préstamo de auto</td><tr><td>F5</td><td>Falta de información reciente de banco/nacional revolvente</td><tr><td>F6</td><td>Falta de información reciente sobre cuentas de empresas de financiamiento al consumo</td><tr><td>F7</td><td>Falta de información reciente de préstamos</td><tr><td>F8</td><td>Falta de información reciente de préstamos hipotecarios</td><tr><td>F9</td><td>Falta de información reciente de préstamos no hipotecarios</td><tr><td>G0</td><td>Falta de información reciente de cuentas de minoristas</td><tr><td>G1</td><td>Falta de información reciente de cuentas revolventes</td><tr><td>G2</td><td>No hay créditos hipotecarios reportados</td><tr><td>G3</td><td>No hay información de saldos revolventes recientes de Bancos/Nacional</td><tr><td>G4</td><td>No hay información de saldos no hipotecarios recientes</td><tr><td>G5</td><td>No hay saldos de cuentas minoristas</td><tr><td>G6</td><td>No hay saldos revolventes recientes</td><tr><td>J0</td><td>Tiempo de Duración de las cuentas se han establecido</td><tr><td>J1</td><td>Tiempo de Duración de las cuentas de automóviles se han establecido</td><tr><td>J2</td><td>Tiempo de Duración de las cuentas revolventes del banco/nacionales se han establecido</td><tr><td>J3</td><td>Tiempo de Duración de los préstamos de compañías de financiamiento al consumo se han establecido</td><tr><td>J4</td><td>Tiempo de Duración de los préstamos a plazos se han establecido</td><tr><td>J5</td><td>Tiempo de Duración de las cuentas hipotecarias reportado se han establecido</td><tr><td>J6</td><td>Tiempo de Duración de los préstamos a plazos abiertos se han establecido</td><tr><td>J7</td><td>Tiempo de Duración de las cuentas de minoristas se han establecido</td><tr><td>J8</td><td>Tiempo de Duración de cuentas revolventes se han establecido</td><tr><td>J9</td><td>Tiempo transcurrido desde la actividad de la cuenta es demasiado largo</td><tr><td>K0</td><td>Tiempo transcurrido desde la Morosidad es demasiado reciente o desconocida</td><tr><td>K1</td><td>Tiempo transcurrido desde la eliminación del registro público o de la cobranza es demasiado corto</td><tr><td>K2</td><td>Tiempo transcurrido desde la apertura de la cuenta más reciente es demasiado corto</td><tr><td>K3</td><td>Tiempo transcurrido desde la más reciente apertura de cuenta automática es demasiado corto</td><tr><td>K4</td><td>Tiempo transcurrido desde la apertura de cuenta revolvente de banco/nacionales más reciente es demasiado corto</td><tr><td>K5</td><td>Tiempo transcurrido desde la apertura de cuenta de empresas de financiamiento de consumo más reciente es demasiado corto</td><tr><td>K6</td><td>Tiempo transcurrido desde la apertura de cuenta de préstamo a plazos más reciente es demasiado corto</td><tr><td>K7</td><td>Tiempo transcurrido desde la apertura de cuenta minorista más recientes</td><tr><td>K8</td><td>Tiempo transcurrido desde que se abrió la cuenta revolvente más reciente</td><tr><td>K9</td><td>Ha transcurrido muy poco tiempo desde que se abrió la cuenta más reciente de \"sales finance\"</td><tr><td>M0</td><td>Tiene un número de cuentas actualmente en impago</td><tr><td>M1</td><td>Número de cuentas \"marcadas\" con impago</td><tr><td>M2</td><td>Número de cuentas con impago reciente</td><tr><td>M3</td><td>Número de cuentas revolventes bancarias/nacionales activas</td><tr><td>M4</td><td>Número de cuentas activas de \"retail\"</td><tr><td>M5</td><td>Número de registros públicos adversos/derogados</td><tr><td>M6</td><td>Número de cuentas revolventes bancarias/nacionales con saldo</td><tr><td>M7</td><td>Número de cuentas revolventes bancarias/nacionales</td><tr><td>M8</td><td>Número de cuentas revolventes bancarias/nacionales u otras cuentas revolventes</td><tr><td>M9</td><td>Número de cobranzas registradas</td><tr><td>N0</td><td>Número de cuentas de \"consumerfinancecompany\" establecidas relativas a la longitud de la historia del consumidor</td><tr><td>N1</td><td>Número de consultas por compañías de financiamiento al consumo</td><tr><td>N2</td><td>Número de cuentas establecidas</td><tr><td>N3</td><td>Número de \"open installmentloans\"</td><tr><td>N4</td><td>Número de cuentas recientemente abiertas con compañías de financiamiento al consumo</td><tr><td>N5</td><td>Número de cuentas de \"retail\"</td><tr><td>N6</td><td>Número de cuentas de \"retail\" con saldo</td><tr><td>N7</td><td>Número de cuentas revolventes</td><tr><td>N8</td><td>Número de cuentas revolventes con saldos más altos que su límite</td><tr><td>P0</td><td>La proporción del saldo vs límite en las cuentas de préstamo automotriz es muy alta</td><tr><td>P1</td><td>La proporción del saldo vs límite en las cuentas con impago es muy alta</td><tr><td>P2</td><td>La proporción del saldo vs límite en las cuentas de financiamiento al consumo es muy alta</td><tr><td>P3</td><td>La proporción del saldo vs límite en las cuentas de \"retail\" es muy alta</td><tr><td>P5</td><td>La proporción del saldo vs el límite de crédito en cuentas revolventes nacionales o en otras cuentas revolventes es muy alta</td><tr><td>P6</td><td>La proporción del saldo vs límites de crédito en cuentas revolventes es muy alta</td><tr><td>P7</td><td>La proporción del saldo vs límite en \"sales financecompany\" es muy alta</td><tr><td>P8</td><td>La proporción del saldo vs el préstamo en créditos hipotecarios es muy alta</td><tr><td>P9</td><td>La proporción de saldo del préstamo vs la cantidad del préstamo es muy alta</td><tr><td>Q0</td><td>La proporción de saldos revolventes vs saldos totales es muy alta</td><tr><td>Q1</td><td>La proporción de saldos vs límites de créditos en las cuentas revolventes bancarias/nacionales es muy alta</td><tr><td>R0</td><td>Muy pocas cuentas han sido pagadas actualmente como fue convenido</td><tr><td>R1</td><td>Muy pocas cuentas con saldos</td><tr><td>R2</td><td>Muy pocas cuentas con información reciente de pagos</td><tr><td>R3</td><td>Muy pocas cuentas activas</td><tr><td>R4</td><td>Muy pocas cuentas revolventes bancarias/nacionales </td><tr><td>R5</td><td>Muy pocas cuentas revolventes bancarias/nacionales con información reciente de pagos</td><tr><td>R6</td><td>Muy pocas cuentas con compañías de financiamiento al consumo con información reciente de pagos </td><tr><td>R7</td><td>Muy pocas cuentas de \"instalment\"R8Muy pocas cuentas de \"retail\"</td><tr><td>R9</td><td>Muy pocas cuentas de \"retail\" con información reciente de pagos</td><tr><td>S0</td><td>Muy pocas cuentas revolventes</td><tr><td>S1</td><td>Muy pocas cuentas revolventes con información reciente de pagos</td><tr><td>S2</td><td>Muy pocas cuentas de \"sales financecompany\" con información reciente de pagos</td><tr><td>T0</td><td>Muchas cuentas abiertas recientemente</td><tr><td>T1</td><td>Muchas cuentas con saldos</td><tr><td>T2</td><td>Muchas cuentas revolventes bancarias/nacionales</td><tr><td>T3</td><td>Muchas cuentas de compañías financiamiento al consumo</td><tr><td>T4</td><td>Muchas cuentas de \"instalment\"</td><tr><td>T5</td><td>Muchas consultas en los últimos 12 meses</td><tr><td>T6</td><td>Muchas cuentas activas recientemente</td><tr><td>T7</td><td>Muchas cuentas de automóvil activas recientemente</td><tr><td>T8</td><td>Muchas cuentas revolventes bancarias/nacionales activas recientemente</td><tr><td>T9</td><td>Muchas cuentas de compañías financiamiento al consumo recientemente activas</td><tr><td>U0</td><td>Muchas cuentas de \"instalment loan\" recientemente activas</td><tr><td>U1</td><td>Muchas cuentas de \"retail\" recientemente activas</td><tr><td>U2</td><td>Muchas cuentas de \"sales financecompany\" recientemente activas</td><tr><td>U4</td><td>Muchas cuentas recientemente abiertas con saldos</td><tr><td>U5</td><td>Muchas cuentas revolventes bancarias/nacionales recientemente abiertas</td><tr><td>U6</td><td>Muchas cuentas de compañías de financiamiento al consumo recientemente abiertas</td><tr><td>U7</td><td>Muchas cuentas de \"instalment\" recientemente abiertas</td><tr><td>U8</td><td>Muchas cuentas de \"retail\" recientemente abiertas con saldos</td><tr><td>U9</td><td>Muchas cuentas revolventes recientemente abiertas</td><tr><td>V0</td><td>Muchas cuentas revolventes recientemente abiertas con saldos</td><tr><td>V1</td><td>Muchas cuentas de \"sales financecompany\" recientemente abiertasV2Muchas cuentas de \"retail\"</td><tr><td>V3</td><td>Muchas cuentas revolventes</td><tr><td>V4</td><td>Muchas cuentas revolventes bancarias/nacionales recientemente abiertas con saldos</td><tr><td>W3</td><td>Número de cuentas \"subprime\"</td><tr><td>W4</td><td>Falta de información de cargo reciente a tarjeta </td><tr><td>W5</td><td>Sin saldos de cargo a tarjeta recientes</td><tr><td>W6</td><td>Proporción de saldos vs límites de crédito en cuentas de \"tarjetas de cargo\" es muy alta</td><tr><td>W7</td><td>Sin saldos de cuenta recientesW8La proporción de \"Cash Advances\" vs el \"Límite de Cash Advance\" es muy alta</td><tr><td>W9</td><td>Cash Advance Activity on Accounts</td><tr><td>X0</td><td>Pagos pendientes en las cuentas</td><tr><td>C1</td><td>No existe el expediente.</td><tr><td>C2</td><td>El expediente encontrado no tiene cuentas.</td><tr><td>C3</td><td>El expediente encontrado está marcado como fallecido.</td><tr><td>C4</td><td>El expediente encontrado no tiene cuantas activas en los últimos 24 meses.</td><tr><td>C5</td><td>El expediente está marcado como fraudulento o sospechoso de fraude.</td><tr><td>SC</td><td>No pudo calcularse score.</td></tbody></table>")
  public String getDescripcion() {
    return descripcion;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FicoRazonObject ficoRazonObject = (FicoRazonObject) o;
    return Objects.equals(this.clave, ficoRazonObject.clave) &&
        Objects.equals(this.descripcion, ficoRazonObject.descripcion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(clave, descripcion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FicoRazonObject {\n");
    
    sb.append("    clave: ").append(toIndentedString(clave)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
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
