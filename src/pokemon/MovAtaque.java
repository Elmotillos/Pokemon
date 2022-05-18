package pokemon;

public class MovAtaque extends Movimientos {
	
	public static final int FISICO = -1;
	public static final int ESPECIAL = 1;

	private int potenciaAtaque;
	private Tipo tipo;
	private int formaAtaque;

	public MovAtaque() {
		super();
		this.potenciaAtaque = 0;
		this.formaAtaque = 0;
	}

	public MovAtaque(String nombre, int potenciaAtaque, Tipo tipo,int formaAtaque) {
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

	public int getFormaAtaque() {
		return formaAtaque;
	}

	public void setFormaAtaque(int formaAtaque) {
		this.formaAtaque = formaAtaque;
	}

	@Override
	int calculoConsumo() {
		int consumoEstamina = this.potenciaAtaque / 2;

		return consumoEstamina;

	}

}
