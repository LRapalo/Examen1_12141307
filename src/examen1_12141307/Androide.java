package examen1_12141307;
public class Androide extends Robot{
    
    private int capacidad;
    private double altura, peso;

    public Androide() {
    }
    
    public Androide(int capacidad, double altura, double peso) {
        this.capacidad = capacidad;
        this.altura = altura;
        this.peso = peso;
    }

    public Androide(int capacidad, double altura, double peso, int id, int x, int y, Boolean carga, int año) {
        super(id, x, y, carga, año);
        this.capacidad = capacidad;
        this.altura = altura;
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() +  "Androide{" + "capacidad=" + capacidad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    public int ADV (int x, int y){
        int t = GIR(degrees, direction);
        if (direction == '<'){
            
        }else if (direction == '>'){
            
        }else if (direction == 'v'){
            
        }else if (direction == '^'){
            
        }
        
        this.setX(x);
        this.setY(y);
    }
    public void CHR ();
    public void DMNT ();
    public int GIR (int degrees, char direction){
        
    }
    
}
