package com.codecool.thao.planet.app;

import com.codecool.thao.planet.Planet;
import com.codecool.thao.planet.plant.DeltaTree;
import com.codecool.thao.planet.plant.ParaBush;
import com.codecool.thao.planet.plant.Puff;

public class Main {
    public static void main(String[] args) {
        Planet planet = new Planet();

        planet.seatPlant(new Puff("Falank", 7));
        planet.seatPlant(new DeltaTree("Sudar", 5));
        planet.seatPlant(new ParaBush("Kopcos", 4));
        planet.seatPlant(new Puff("Nyulank", 3));

        planet.simulateForDays();
    }
}
