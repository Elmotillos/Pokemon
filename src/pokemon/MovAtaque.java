package pokemon;

public class MovAtaque extends Movimientos {

	private int potenciaAtaque;
	private Tipo tipo;

	public MovAtaque() {
		super();
		this.potenciaAtaque = 0;
	}

	public MovAtaque(String nombre, int potenciaAtaque, Tipo tipo) {
		super(nombre);
		this.potenciaAtaque = potenciaAtaque;
		this.tipo = tipo;
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

	@Override
	int calculoConsumo() {
		int consumoEstamina = this.potenciaAtaque / 2;

		return consumoEstamina;

	}

}
