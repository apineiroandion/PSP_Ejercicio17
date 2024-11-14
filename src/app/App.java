package app;

import app.parking.Coche;
import app.parking.HiloCoches;
import app.parking.Parking;

import java.util.ArrayList;
import java.util.List;

public class App {
    static List<HiloCoches> hilosCoches;
    public static void main(String[] args) {
        Parking parking = new Parking(5, 0);
        hilosCoches = crearCoches(parking);
        startCoches();

    }

    public static List<HiloCoches> crearCoches(Parking parking) {
        ArrayList<HiloCoches> hilosCoches = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Coche coche = new Coche("Coche" + i);
            HiloCoches hiloCoches = new HiloCoches(coche, parking);
            hilosCoches.add(hiloCoches);
        }
        return hilosCoches;
    }

    public static void startCoches() {
        for (HiloCoches hiloCoches : hilosCoches) {
            hiloCoches.start();
        }
    }
}
