package pokemon;
abstract class Movimientos{

  protected String nombre;
  protected String tipoMov;
  protected int consumoEstamina;
    
  public Movimientos() {
    this.nombre = "";
    this.tipoMov = "";
    this.consumoEstamina = 0;
  }

  public Movimientos(String nombre, String tipoMov, int consumoEstamina) {
    this.nombre = nombre;
    this.tipoMov = tipoMov;
    this.consumoEstamina = consumoEstamina;
  }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipoMov() {
        return tipoMov;
    }
    
    public void setTipoMov(String tipoMov) {
        this.tipoMov = tipoMov;
    }
    
    public int getConsumoEstamina() {
        return consumoEstamina;
    }
    
    public void setConsumoEstamina(int consumoEstamina) {
        this.consumoEstamina = consumoEstamina;
    }
    
    abstract void calculoConsumo();

    
}