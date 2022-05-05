package pokemon;
public class MovAtaque {

    protected String nombre;
    protected int potenciaAtaque;
    protected Tipo tipo;
    
    public MovAtaque() {
        super();
        this.nombre = "";
        this.potenciaAtaque = 0;
    }
    
    public MovAtaque(int potenciaAtaque, Tipo tipo) {
        super();
        this.nombre = nombre;
        this.potenciaAtaque = potenciaAtaque;
        this.tipo = tipo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPotenciaAtaque() {
        return potenciaAtaque;
    }
    public void setPotenciaAtaque(int potenciaAtaque) {
        this.potenciaAtaque = potenciaAtaque;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
