package examen1_12141307;
public abstract class Robot {
    
    private int id, x, y;
    private Boolean carga;
    private int año;

    public Robot() {
    }

    public Robot(int id, int x, int y, Boolean carga, int año) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.carga = carga;
        this.año = año;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Boolean getCarga() {
        return carga;
    }

    public void setCarga(Boolean carga) {
        this.carga = carga;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Robot{" + "id=" + id + ", x=" + x + ", y=" + y + ", carga=" + carga + ", a\u00f1o=" + año + '}';
    }
    public abstract boolean val (int x, int y);
    public abstract int ADV (int x, int y);
    public abstract void CHR ();
    public abstract void DMNT ();
    public abstract int GIR (int degrees, char direction);
    
}
