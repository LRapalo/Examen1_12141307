package examen1_12141307;
public class Mano_Robotica extends Robot{
    
    private int capacidad, servo_motores;

    public Mano_Robotica() {
    }

    public Mano_Robotica(int capacidad, int servo_motores) {
        this.capacidad = capacidad;
        this.servo_motores = servo_motores;
    }

    public Mano_Robotica(int capacidad, int servo_motores, int id, int x, int y, Boolean carga, int año) {
        super(id, x, y, carga, año);
        this.capacidad = capacidad;
        this.servo_motores = servo_motores;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getServo_motores() {
        return servo_motores;
    }

    public void setServo_motores(int servo_motores) {
        this.servo_motores = servo_motores;
    }

    @Override
    public String toString() {
        return super.toString() + "Mano_Robotica{" + "capacidad=" + capacidad + ", servo_motores=" + servo_motores + '}';
    }
    
    
}
