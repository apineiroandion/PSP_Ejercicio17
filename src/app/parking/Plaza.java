package app.parking;

public class Plaza {
    private String nombre;
    private Coche coche;

    public Plaza() {
    }

    public Plaza(String nombre) {
        this.nombre = nombre;
    }

    public Plaza(Coche coche, String nombre) {
        this.coche = coche;
        this.nombre = nombre;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
