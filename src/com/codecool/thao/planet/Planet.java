package com.codecool.thao.planet;

import com.codecool.thao.planet.plant.Plant;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private static final int NUM_OF_DAYS = 10;
    private List<Plant> plants = new ArrayList();

    public void seatPlant(Plant plant) {
        plants.add(plant);
    }

    public void simulateRadiationForOneDay() {
        for (Plant plant : plants) {
            if (plant.isAlive()) {
                plant.radiationOfNextDay();
                plant.reactToRadiation();
                plant.checkFood();
                System.out.println(plant);
            }
        }
        System.out.println();
    }

    public void simulateForDays() {
        for (int i = 0; i < NUM_OF_DAYS; i++) {
            simulateRadiationForOneDay();
        }
    }
}
