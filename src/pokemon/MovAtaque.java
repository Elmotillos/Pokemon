package pokemon;

public class MovAtaque extends Movimientos{
	

	private int potenciaAtaque;
	private Tipo tipo;

	public MovAtaque() {
		super();
		this.potenciaAtaque = 0;
	}

	public MovAtaque(String nombre, String tipoMov, int consumoEstamina, int potenciaAtaque, Tipo tipo) {
		super(nombre, consumoEstamina);
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
	void calculoConsumo() {
		this.consumoEstamina = this.potenciaAtaque / 2;

	}

}
