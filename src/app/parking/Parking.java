package app.parking;

public class Parking {
    private int plazas;
    private int plazasOcupadas;
    private Boolean libre = true;

    public Parking(int plazas, int plazasOcupadas) {
        this.plazas = plazas;
        this.plazasOcupadas = plazasOcupadas;
    }

    public synchronized void entrarParking(Coche coche){
        while(plazasOcupadas == plazas){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        plazasOcupadas++;
        System.out.println("ENTRADA: " + coche.getNombre() + ". Plazas libres: " + (plazas - plazasOcupadas));
        notifyAll();
    }

    public synchronized void salirParking(Coche coche){
        while(plazasOcupadas == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        plazasOcupadas--;
        System.out.println("SALIDA: " + coche.getNombre() + ". Plazas libre: " + (plazas - plazasOcupadas));
        notifyAll();
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getPlazasOcupadas() {
        return plazasOcupadas;
    }

    public void setPlazasOcupadas(int plazasOcupadas) {
        this.plazasOcupadas = plazasOcupadas;
    }

    public Boolean getLibre() {
        return libre;
    }

    public void setLibre(Boolean libre) {
        this.libre = libre;
    }
}
