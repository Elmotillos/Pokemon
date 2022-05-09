package pokemon;

import java.util.Scanner;

public class Pokemon implements Tipos{
	
	public enum Tipo {
		 Agua,Fuego,Planta,Volador,Electrico,Normal,Bicho,Tierra;
	}
	
	public enum Estado {
		
	    Quemado,Congelado,Dormido,Paralizado,Envenenado,Confundido,SIN_ESTADO
	}
	

    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velocidad;
    private int estamina;
    private int nivel;
    private Movimientos kitMov[];
    private int fertilidad;
    private Tipo tipo;
    private Estado estado;
    private int exp;
    private String mejora;

    public Pokemon() {

        super();
        this.nombre = "";
        this.mote = nombre;
        this.vitalidad = 0;
        this.ataque = 0;
        this.defensa = 0;
        this.ataqueEspecial = 0;
        this.defensaEspecial = 0;
        this.velocidad = 0;
        this.estamina = 0;
        this.nivel = 0;
        this.kitMov = new Movimientos[4];
        this.fertilidad = 5;
        this.estado = Pokemon.Estado.SIN_ESTADO;
        this.exp = 0;
        this.mejora = "";
    }

    public Pokemon(String nombre, String mote, int vitalidad, int ataque, int defensa, int ataqueEspecial,
            int defensaEspecial, int velocidad, int estamina, int nivel, Movimientos[] kitMov, int fertilidad,
            Tipo tipo, Estado estado, int exp, String mejora) {

        super();
        this.nombre = nombre;
        this.mote = mote;
        this.vitalidad = vitalidad;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.estamina = estamina;
        this.nivel = nivel;
        this.kitMov = kitMov;
        this.fertilidad = fertilidad;
        this.tipo = tipo;
        this.estado = estado;
        this.exp = exp;
        this.mejora = mejora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMote() {
        return mote;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Movimientos[] getKitMov() {
        return kitMov;
    }

    public void setMovimiento(Movimientos[] kitMov) {
        this.kitMov = kitMov;
    }

    public int getFertilidad() {
        return fertilidad;
    }

    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getMejora() {
        return mejora;
    }

    public void setMejora(String mejora) {
        this.mejora = mejora;
    }

    public void subirNivel() {

        if (this.exp == 10 * this.nivel) {

            this.nivel++;
            this.exp = 0;

            this.vitalidad = this.vitalidad + ((int) Math.random() * 5 + 1);
            this.ataque = this.ataque + ((int) Math.random() * 5 + 1);
            this.defensa = this.defensa + ((int) Math.random() * 5 + 1);
            this.ataqueEspecial = this.ataqueEspecial + ((int) Math.random() * 5 + 1);
            this.defensaEspecial = this.defensaEspecial + ((int) Math.random() * 5 + 1);
            this.velocidad = this.velocidad + ((int) Math.random() * 5 + 1);

        }

    }

    public void ataqueNuevo(Movimientos[] kitmov, Movimientos ataqueNuevo) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        boolean check = false;

        if (this.nivel % 3 == 0) {

            String respuesta;
            System.out.println("¿Deseas aprender este ataque? (s/n)");

            respuesta = sc.nextLine();

            if (respuesta == "s") {

                do{

                    System.out.println("Elige el ataque que quieres sustituir (1-4): ");

                    for (int i = 0; i < kitMov.length; i++) {

                        System.out.println(kitMov[i] + " " + i + 1);
                    }

                opcion = sc.nextInt();

                if(opcion >= 1 && opcion <= 4){
                    check = true;

                }
                }while(check = false);

                kitMov[opcion - 1] = ataqueNuevo; 

                System.out.println("Sustitución ejecutada exitosamente");

            }
        }

    }

    public void atacar(){

        Scanner sc = new Scanner(System.in);

        int opcion;
        boolean check = false;

        do{

            System.out.println("Elige el ataque (1-4): ");

            for (int i = 0; i < this.kitMov.length; i++) {

                System.out.println(this.kitMov[i] + " " + i + 1);
            }

        opcion = sc.nextInt();

        if(opcion >= 1 && opcion <= 4){
            check = true;

        }
        }while(check = false);

        if(this.kitMov[opcion -1] instanceof MovAtaque){

        }else if (this.kitMov[opcion -1] instanceof MovEstado){

        }else if(this.kitMov[opcion -1] instanceof MovMejora){

        }
    }

	@Override
	public String toString() {
		return "Pokemon [mote=" + mote + "]";
	}
    
    

}
