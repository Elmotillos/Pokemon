package pokemon;

import java.io.IOException;
import java.sql.*;
import javax.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*MovAtaque ataque = new MovAtaque("Pepinazo",5,Tipo.FUEGO);
		MovMejora mejora = new MovMejora("Empapeeee","ataque",5,10);
		MovEstado estado = new MovEstado("Aceite",Estado.QUEMADO,5);
		
		Movimientos kitmov1[]= new Movimientos[4];
		Movimientos kitmov2[]= new Movimientos[4];
		
		kitmov2[0] = ataque;
		kitmov2[1] = estado;
		
		Pokemon pokemon1 = new Pokemon("Charizard","Juan",100,10,10,10,10,10,10,50,kitmov1
				,Tipo.PLANTA,Estado.SIN_ESTADO,0);
		
		Pokemon pokemon2 = new Pokemon("Charizard","Pedro",100,10,10,10,10,10,10,50,kitmov2
				,Tipo.FUEGO,Estado.SIN_ESTADO,0);
		
		
		Pokemon equipo1[] = new Pokemon[4];
		Pokemon equipo2[] = new Pokemon[4];
		
		equipo1[0] = pokemon1;
		equipo2[0] = pokemon2;
		
		Caja caja1 = new Caja();

		
		Entrenador entrenador1 = new Entrenador(equipo1,caja1,"Julian",1000);
		Entrenador entrenador2 = new Entrenador(equipo1,caja1,"Zacarias",1000);
		
		List<Turno>	combate = new LinkedList<Turno>();	
		
		Combate pelea = new Combate(entrenador2,entrenador1,combate,"Nadie",0,0);
		
		pokemon2.atacar(pokemon1);
		
		System.out.println(pokemon2.getEstamina());
		

	}*/

	 
		   //launch(args);

		   String url = "jdbc:mysql://localhost:3306/pokemon ";
		   String login = "root";
		   String password = "";{
		   try {
   
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   Connection connection = DriverManager.getConnection(url, login, password);
   
			   System.out.println("Conexión establecida");
			  // mostrarPokemon(connection);
   
			   Movimientos kitmov1[]= new Movimientos[4];

			   Pokemon poke= new Pokemon("Charizard","Juan",100,10,10,10,10,10,10,50,kitmov1
			   ,Tipo.PLANTA,Estado.SIN_ESTADO,0);
   
			  // insertarPokemon(connection,poke);
   
   
			   try {
				   connection.close();
				   System.out.println("Conexión cerrada");
			   } catch (SQLException e) {
				   e.printStackTrace();
			   }
   
		   } catch (SQLException sqle) {
			   sqle.printStackTrace();
		   } catch (ClassNotFoundException e) {
			   e.printStackTrace();
		   } 
		   
	   }
   
   
	  /* public static void mostrarPokemon(Connection con) throws SQLException {
		   String pok="Charizard";		
		   String consulta = "SELECT * FROM POKEDEX";
		   Statement statement = con.createStatement();
		   ResultSet rs = statement.executeQuery(consulta);
   
		   Pokemon e = null;
		   while (rs.next()) {
			   e = new Pokemon();
			   e.setNumPokedex(rs.getInt("num_pokedex"));
			   e.setNomPokemon(rs.getString("nom_pokemon"));
			   e.setTipo1(rs.getString("tipo1"));
			   e.setTipo2(rs.getString("tipo2"));
			   
			   
			   System.out.println(e.toString());
		   }
		   statement.close();
	   }
   
	   public static void insertarPokemon(Connection con, Pokemon p) throws SQLException {
		   String sentencia ="INSERT INTO POKEDEX(NUM_POKEDEX,NOM_POKEMON, TIPO1, TIPO2) VALUES("+ p.getNumPokedex()
														  +",'"+p.getNomPokemon()
														  +"','"+p.getTipo1()
														  +"','"+p.getTipo2()
														  +"')";
		   Statement stmt = null;
		   try {
			   stmt = con.createStatement();
			   stmt.executeUpdate(sentencia);
			   
			   System.out.println("Nuevo pokemon insertado. "+p.getNomPokemon());
		   } catch (SQLException e) {
			   e.printStackTrace();
		   } finally {
			   stmt.close(); // Puede lanzar SQLExceptions, por eso he puesto el
			   // throws en la cabecera del m�todo
		   }
														  
	   }
   
   
   
   
   
	   
	  /* @Override
	   public void start(Stage primaryStage) {
		   Parent root;
		   try {
			   root = FXMLLoader.load(getClass().getResource("prueba.fxml"));
			   Scene scene = new Scene(root);
			   primaryStage.setScene(scene);
			   primaryStage.show();
   
		   } catch (IOException e) {
			   e.printStackTrace();
		   }*/
   
		   
	   }
}   
   