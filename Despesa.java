public class Despesa {
    private double value;
    private String tipo;

  public Despesa(double value) {
    this.value = value;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Despesa Valor: "+value+"Despesa Tipo: "+tipo;
  }

}
