package pokemon;

public class MovAtaque extends Movimientos implements Tipos {
	
	public enum Tipo {
		 Agua,Fuego,Planta,Volador,Electrico,Normal,Bicho,Tierra;
	}
	

	private int potenciaAtaque;
	private Tipo tipo;

	public MovAtaque(int potenciaAtaque, Tipo tipo) {
		this.potenciaAtaque = potenciaAtaque;
		this.tipo = tipo;
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
