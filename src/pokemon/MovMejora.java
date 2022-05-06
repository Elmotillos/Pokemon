package pokemon;
public class MovMejora extends Movimientos{

    private String mejora;
    private int numTurnos;
    private int valor;


    
    public MovMejora(String mejora, int numTurnos, int valor) {
        this.mejora = mejora;
        this.numTurnos = numTurnos;
        this.valor = valor;
    }



    public MovMejora(String nombre, String tipoMov, int consumoEstamina, String mejora, int numTurnos, int valor) {
        super(nombre, tipoMov, consumoEstamina);
        this.mejora = mejora;
        this.numTurnos = numTurnos;
        this.valor = valor;
    }



    public String getMejora() {
        return mejora;
    }



    public void setMejora(String mejora) {
        this.mejora = mejora;
    }



    public int getNumTurnos() {
        return numTurnos;
    }



    public void setNumTurnos(int numTurnos) {
        this.numTurnos = numTurnos;
    }



    public int getValor() {
        return valor;
    }



    public void setValor(int valor) {
        this.valor = valor;
    }



    @Override
    void calculoConsumo() {
        this.consumoEstamina = numTurnos * 10;
        
    }

 

    
}
