package app.parking;

public class Coche {
    private String nombre;
    private Boolean aparcado;

    public Coche(String nombre, Boolean aparcado) {
        this.nombre = nombre;
        this.aparcado = aparcado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getAparcado() {
        return aparcado;
    }

    public void setAparcado(Boolean aparcado) {
        this.aparcado = aparcado;
    }
}
