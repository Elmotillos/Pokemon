package pokemon;
abstract class Movimientos {

    protected String nombre;

    public Movimientos() {
      this.nombre = "";
    }

    public Movimientos(String nombre) {
    	super();
      this.nombre = nombre;
    }

      public String getNombre() {
          return nombre;
      }

      public void setNombre(String nombre) {
          this.nombre = nombre;
      }

      abstract int calculoConsumo();


  } 