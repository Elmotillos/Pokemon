package pokemon;

public class MovMejora extends Movimientos {

	private String mejora;
	private int numTurnos;
	private int valor;

	public MovMejora() {
		super();
		this.mejora = "";
		this.numTurnos = 0;
		this.valor = 0;
	}

	public MovMejora(String nombre, String mejora, int numTurnos, int valor) {
		super(nombre);
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
	int calculoConsumo() {
		int consumoEstamina = numTurnos * 10;
		return consumoEstamina;
	}
}
