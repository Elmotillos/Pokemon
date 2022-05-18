package pokemon;


import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		MovAtaque ataque = new MovAtaque("Pepinazo",5,Tipo.FUEGO,MovAtaque.FISICO);
		MovMejora mejora = new MovMejora("Empapeeee","ataque",5,10);
		MovEstado estado = new MovEstado("Aceite",Estado.QUEMADO,5);
		
		Movimientos kitmov1[]= new Movimientos[4];
		Movimientos kitmov2[]= new Movimientos[4];
		
		kitmov2[0] = ataque;
		kitmov2[1] = estado;
		
		Pokemon pokemon1 = new Pokemon("Charizard",1,"Juan",100,10,10,10,10,10,10,50,kitmov1
				,Tipo.PLANTA,Estado.SIN_ESTADO,0);
		
		Pokemon pokemon2 = new Pokemon("Charizard",1,"Pedro",100,10,10,10,10,10,10,50,kitmov2
				,Tipo.FUEGO,Estado.SIN_ESTADO,0);
		
		Pokemon pokemon3 = new Pokemon();
		
		
		Pokemon equipo1[] = new Pokemon[4];
		Pokemon equipo2[] = new Pokemon[4];
		
		equipo1[0] = pokemon1;
		equipo2[0] = pokemon2;
		
		Caja caja1 = new Caja();

		
		Entrenador entrenador1 = new Entrenador(equipo1,caja1,"Julian",1000);
		Entrenador entrenador2 = new Entrenador(equipo1,caja1,"Zacarias",1000);
		
		List<Turno>	combate = new LinkedList<Turno>();	
		
		Combate pelea = new Combate(entrenador2,entrenador1,combate,"Nadie",0,0);
		
		pokemon3 = Pokemon.generarPokemon();
		
	
	}
}

	 
		   