package app.parking;

public class Parking {
    private final int PLAZAS;
    private int plazasOcupadas;

    public Parking(int PLAZAS, int plazasOcupadas) {
        this.PLAZAS = PLAZAS;
        this.plazasOcupadas = plazasOcupadas;
    }

    public synchronized void entrarParking(Coche coche){
        while(plazasOcupadas == PLAZAS){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error en el hilo" + e.getMessage());
            }
        }
        plazasOcupadas++;
        System.out.println("ENTRADA: " + coche.getNombre() + ". Plazas libres: " + (PLAZAS - plazasOcupadas));
        notifyAll();
    }

    public synchronized void salirParking(Coche coche){
        while(plazasOcupadas == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Error en el hilo" + e.getMessage());
            }
        }
        plazasOcupadas--;
        System.out.println("SALIDA: " + coche.getNombre() + ". Plazas libre: " + (PLAZAS - plazasOcupadas));
        notifyAll();
    }

}
