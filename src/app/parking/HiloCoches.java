package app.parking;

public class HiloCoches extends Thread{
    private Coche coche;
    private Parking parking;

    public HiloCoches(Coche coche, Parking parking){
        this.coche = coche;
        this.parking = parking;
    }

    @Override
    public void run(){
        ejecutar();
    }

    public void ejecutar(){
        parking.entrarParking(coche);
        try {
            sleep(Math.round(Math.random() * 10000));
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo" + e.getMessage());
        }
        parking.salirParking(coche);
        ejecutar();
    }


}
