package pokemon;

public class Turno {

    private int numTurno;
    private String accionEntrnador1;
    private String accionEntrenador2;

    public Turno() {
        this.numTurno = 1;
        this.accionEntrnador1 = "";
        this.accionEntrenador2 = "";
    }


    public Turno(int numTurno, String accionEntrnador1, String accionEntrenador2) {
        this.numTurno = numTurno;
        this.accionEntrnador1 = accionEntrnador1;
        this.accionEntrenador2 = accionEntrenador2;
    }


    public int getNumTurno() {
        return numTurno;
    }


    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }


    public String getAccionEntrnador1() {
        return accionEntrnador1;
    }


    public void setAccionEntrnador1(String accionEntrnador1) {
        this.accionEntrnador1 = accionEntrnador1;
    }


    public String getAccionEntrenador2() {
        return accionEntrenador2;
    }


    public void setAccionEntrenador2(String accionEntrenador2) {
        this.accionEntrenador2 = accionEntrenador2;
    }


	@Override
	public String toString() {
		return "Turno [numTurno=" + numTurno + ", accionEntrnador1=" + accionEntrnador1 + ", accionEntrenador2="
				+ accionEntrenador2 + "]";
	}
    
    


    
}
