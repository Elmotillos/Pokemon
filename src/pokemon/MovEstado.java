package pokemon;

public class MovEstado extends Movimientos{

    private Estado estado;
    private int numTurnos;


    public MovEstado() {
        super();
        this.estado = Estado.SIN_ESTADO;
        this.numTurnos = 0;
    }


    public MovEstado(String nombre, int consumoEstamina, Estado estado, int numTurnos) {
        super(nombre);
        this.estado = estado;
        this.numTurnos = numTurnos;
    }


    public Estado getEstado() {
        return estado;
    }


    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    public int getNumTurnos() {
        return numTurnos;
    }


    public void setNumTurnos(int numTurnos) {
        this.numTurnos = numTurnos;
    }


    @Override
    int calculoConsumo() {
       int consumoEstamina = this.numTurnos * 10;
       
		return consumoEstamina;

    }
}