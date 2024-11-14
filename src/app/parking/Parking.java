package app.parking;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Plaza> plazas;
    private int plazasOcupadas;
    private Boolean libre = true;

    public Parking(int plazas, int plazasOcupadas) {
        this.plazas = generarNumeroPlazas(plazas);
        this.plazasOcupadas = plazasOcupadas;
    }

    public synchronized void entrarParking(Coche coche){
        while(plazasOcupadas == plazas.size()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        plazasOcupadas++;
        System.out.println("ENTRADA: " + coche.getNombre() + ". Plazas libres: " + (plazas.size() - plazasOcupadas));
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
        System.out.println("SALIDA: " + coche.getNombre() + ". Plazas libre: " + (plazas.size() - plazasOcupadas));
        notifyAll();
    }

    public ArrayList<Plaza> generarNumeroPlazas(int numeroPlazas) {
        ArrayList<Plaza> plazas = new ArrayList<>();
        for (int i = 0; i < numeroPlazas; i++) {
            plazas.add(new Plaza("Plaza" + (i + 1)));
        }
        return plazas;
    }


    public ArrayList<Plaza> getPlazas() {
        return plazas;
    }

    public void setPlazas(ArrayList<Plaza> plazas) {
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
