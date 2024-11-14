package app.parking;

public class HiloCoches extends Thread{
    private final Coche coche;
    private final Parking PARKING;

    public HiloCoches(Coche coche, Parking parking){
        this.coche = coche;
        this.PARKING = parking;
    }

    @Override
    public void run(){
        while (true){
            ejecutar();
        }
    }

    public void ejecutar(){
        PARKING.entrarParking(coche);
        try {
            sleep(Math.round(Math.random() * 10000));
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo" + e.getMessage());
        }
        PARKING.salirParking(coche);
        try {
            sleep(Math.round(Math.random() * 10000));
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo" + e.getMessage());
        }
    }


}
