package examen1_12141307;
public class Robot_Movil_Pesado extends Robot{
    
    private int capacidad;
    private double peso;

    public Robot_Movil_Pesado() {
    }

    public Robot_Movil_Pesado(int capacidad, double peso) {
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public Robot_Movil_Pesado(int capacidad, double peso, int id, int x, int y, Boolean carga, int año) {
        super(id, x, y, carga, año);
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "Robot_Movil_Pesado{" + "capacidad=" + capacidad + ", peso=" + peso + '}';
    }
    
    
}
