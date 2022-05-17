package pokemon;
abstract class Movimientos {

    protected String nombre;
    protected int consumoEstamina;

    public Movimientos() {
      this.nombre = "";
      this.consumoEstamina = calculoConsumo();
    }

    public Movimientos(String nombre) {
      this.nombre = nombre;
    }

      public String getNombre() {
          return nombre;
      }

      public void setNombre(String nombre) {
          this.nombre = nombre;
      }

      public int getConsumoEstamina() {
          return consumoEstamina;
      }

      public void setConsumoEstamina(int consumoEstamina) {
    	  this.consumoEstamina = consumoEstamina;
      }

      abstract int calculoConsumo();


  } 