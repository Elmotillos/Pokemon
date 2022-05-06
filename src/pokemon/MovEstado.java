package pokemon;
public class MovEstado extends Movimientos{
   
    private String estado;
    private int numTurnos;


    public MovEstado(String estado, int numTurnos) {
        this.estado = estado;
        this.numTurnos = numTurnos;
    }


    public MovEstado(String nombre, String tipoMov, int consumoEstamina, String estado, int numTurnos) {
        super(nombre, tipoMov, consumoEstamina);
        this.estado = estado;
        this.numTurnos = numTurnos;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public int getNumTurnos() {
        return numTurnos;
    }


    public void setNumTurnos(int numTurnos) {
        this.numTurnos = numTurnos;
    }


    @Override
    void calculoConsumo() {
       this.consumoEstamina = this.numTurnos * 10;
        
    }

    
    
}
