package app;

import app.parking.Coche;
import app.parking.HiloCoches;
import app.parking.Parking;

import java.util.ArrayList;

public class App {
    static ArrayList<HiloCoches> hilosCoches;
    public static void main(String[] args) {
        Parking parking = new Parking(5, 0);
        hilosCoches = crearCoches(parking);
        startCoches();

    }

    public static ArrayList<HiloCoches> crearCoches(Parking parking) {
        ArrayList<HiloCoches> hilosCoches = new ArrayList<>();
        Coche coche1 = new Coche("Coche1", false);
        Coche coche2 = new Coche("Coche2", false);
        Coche coche3 = new Coche("Coche3", false);
        Coche coche4 = new Coche("Coche4", false);
        Coche coche5 = new Coche("Coche5", false);
        Coche coche6 = new Coche("Coche6", false);
        Coche coche7 = new Coche("Coche7", false);
        Coche coche8 = new Coche("Coche8", false);

        hilosCoches.add(new HiloCoches(coche1, parking));
        hilosCoches.add(new HiloCoches(coche2, parking));
        hilosCoches.add(new HiloCoches(coche3, parking));
        hilosCoches.add(new HiloCoches(coche4, parking));
        hilosCoches.add(new HiloCoches(coche5, parking));
        hilosCoches.add(new HiloCoches(coche6, parking));
        hilosCoches.add(new HiloCoches(coche7, parking));
        hilosCoches.add(new HiloCoches(coche8, parking));
        return hilosCoches;
    }

    public static void startCoches() {
        for (HiloCoches hiloCoches : hilosCoches) {
            hiloCoches.start();
        }
    }
}
