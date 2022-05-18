package pokemon;

import java.io.IOException;
import java.sql.*;
import javax.sql.*;

public class App extends Main {
    public static void main(String[] args) {
        //launch(args);

        String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection connection = DriverManager.getConnection(url, login, password);

		    System.out.println("Conexión establecida");
            mostrarPokemon(connection);

            insertarPokemon(connection,pokemon);


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


    public static void mostrarPokemon(Connection con) throws SQLException {
		String pok="Charizard";		
        String consulta = "SELECT * FROM POKEDEX";
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(consulta);

        Pokemon e = null;
        while (rs.next()) {
            e = new Pokemon();
            e.setNumPokedex(rs.getInt("num_pokedex"));
            e.setNombre(rs.getString("nom_pokemon"));
            e.setTipo(Tipo.valueOf(rs.getString("tipo")));
            
            
            
            System.out.println(e.toString());
        }
        statement.close();
    }

    public static void insertarPokemon(Connection con, Pokemon p) throws SQLException {
		String sentencia ="INSERT INTO pokemon_entrenador(id_pokemon, id_pokedex, id_entrenador, mote, vitalidad, ataque, defensa, ataque_esp, defensa_esp, estamina, nivel, velocidad, experiencia, equipo) VALUES("+ p.getNumPokemon()
                                                       +",'"+p.getNumPokedex()
                                                       +",'"+p.getIdEntrenador()
                                                       +",'"+p.getMote()
                                                       +",'"+p.getVitalidad()
                                                       +",'"+p.getAtaque()
                                                       +",'"+p.getDefensa()
                                                       +",'"+p.getAtaqueEspecial()
                                                       +",'"+p.getDefensaEspecial()
                                                       +",'"+p.getEstamina()
                                                       +",'"+p.getNivel()
                                                       +",'"+p.getVelocidad()
                                                       +",'"+p.getExp()
                                                       +"')";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(sentencia);
			
			System.out.println("Nuevo pokemon insertado. "+p.getNombre());
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
        }

        
    }*/
    
}