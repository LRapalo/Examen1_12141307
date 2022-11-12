package examen1_12141307;
public class Robot_Movil_Agil extends Robot{
    
    private int capacidad, llantas, velocidad;

    public Robot_Movil_Agil() {
    }

    public Robot_Movil_Agil(int capacidad, int llantas, int velocidad) {
        this.capacidad = capacidad;
        this.llantas = llantas;
        this.velocidad = velocidad;
    }

    public Robot_Movil_Agil(int capacidad, int llantas, int velocidad, int id, int x, int y, Boolean carga, int año) {
        super(id, x, y, carga, año);
        this.capacidad = capacidad;
        this.llantas = llantas;
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Robot_Movil_Agil{" + "capacidad=" + capacidad + ", llantas=" + llantas + ", velocidad=" + velocidad + '}';
    }
    
    
}
