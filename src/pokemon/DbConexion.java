package pokemon;

import java.sql.*;
import javax.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DbConexion {

    private static Connection conexion;

    public static void establecerConexion() {
        //launch(args);

        String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		    conexion = DriverManager.getConnection(url, login, password);

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
        
    }

    public static void cerrarConexion(){
        try {
            conexion.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static List<Pokemon> cargarPokemon() throws SQLException {
		//String pok="Charizard";		
        LinkedList<Pokemon> listaPokemon = new LinkedList<>();
        String consulta = "SELECT * FROM POKEDEX";
        Statement statement = conexion.createStatement();
        ResultSet rs = statement.executeQuery(consulta);

        Pokemon e = null;
        while (rs.next()) {
            e = new Pokemon();
            e.setNumPokedex(rs.getInt("num_pokedex"));
            e.setNombre(rs.getString("nom_pokemon"));
            e.setTipo(Tipo.valueOf(rs.getString("tipo")));
            listaPokemon.add(e);
        }
        statement.close();
        return listaPokemon;
    }

    public static void insertarPokemon(Pokemon p) throws SQLException {
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
			stmt = conexion.createStatement();
			stmt.executeUpdate(sentencia);
			
			System.out.println("Nuevo pokemon insertado. "+p.getNombre());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt.close(); // Puede lanzar SQLExceptions, por eso he puesto el
			// throws en la cabecera del m�todo
		}
													   
	}


}
