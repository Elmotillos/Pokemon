package pokemon;

import java.util.Scanner;

public class Entrenador {

	private Pokemon equipo[];
	private Caja caja;
	private String nombre;
	private int pokedollar;
	// private mochila Objeto;

	public Entrenador() {
		super();
		equipo = new Pokemon[4];
		caja = new Caja();
		nombre = "";
		pokedollar = 0;
	}

	public Entrenador(Pokemon[] equipo, Caja caja, String nombre, int pokedollar) {
		super();
		this.equipo = equipo;
		this.caja = caja;
		this.nombre = nombre;
		this.pokedollar = pokedollar;
	}

	public Pokemon[] getEquipo() {
		return equipo;
	}

	public void setEquipo(Pokemon[] equipo) {
		this.equipo = equipo;
	}

	public Caja getCaja() {
		return caja;
	}

	public void setCaja(Caja caja) {
		this.caja = caja;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPokedollar() {
		return pokedollar;
	}

	public void setPokedollar(int pokedollar) {
		this.pokedollar = pokedollar;
	}

	public void moverEquipoCaja() {

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int miembro;
		for (int i = 0; i < equipo.length; i++) {
			if (equipo[i] != null) {
				cont++;
			}
		}
		if (cont <= 1) {
			System.out.println("El equipo no puede estar vacio.");
		} else {
			do {
				System.out.println("¿Qué pokemon deseas guardar(1-4)?");
				miembro = sc.nextInt();
				miembro--;

			} while (equipo[miembro] == null);
			
			caja.getListPokemon().add(equipo[miembro]);
			equipo[miembro] = null;
		}

		sc.close();

	}

	public void moverCajaEquipo() {

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int candidato;
		Pokemon pokemon;

		if (caja.getListPokemon().isEmpty()) {
			System.out.println("La caja está vacia");
		} else {

			for (int i = 0; i < equipo.length; i++) {
				if (equipo[i] != null) {
					cont++;
				}
			}
			if (cont == 4) {
				System.out.println("El esquipo está lleno.");
			} else {

				System.out.println("Elige el pokemon que deseas unir al equipo.");
				System.out.println(caja.toString());// Te debe dar el mote y la posición.
				candidato = sc.nextInt();

				pokemon = caja.getListPokemon().get(candidato);
				caja.getListPokemon().remove(candidato);

				for (int j = 0; j < equipo.length; j++) {
					cont = 0;
					if (equipo[j] == null) {
						equipo[j] = pokemon;
						cont = 1;
					}
					if (cont == 1) {
						j = 10;
					}
				}
			}
		}

		sc.close();
	}

	
	public void captura() {
		
	}
	
	
	
	
}