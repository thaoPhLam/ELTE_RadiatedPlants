package com.codecool.thao.planet.plant;

public class DeltaTree extends Plant {
    public DeltaTree(String name, int food) {
        super(name, food);
    }

    @Override
    public void reactToAlpha() {
        this.food -= 3;
        developRadiationOfNextDay();
    }

    @Override
    public void reactToDelta() {
        this.food += 4;
        developRadiationOfNextDay();
    }

    @Override
    public void reactToNoRadiation() {
        this.food -= 1;
        developRadiationOfNextDay();
    }

    public void developRadiationOfNextDay() {
        if (this.food < 5) {
            this.deltaCount += 4;
        } else if (this.food > 5 && this.food < 10) {
            this.deltaCount += 1;
        } else {
            this.deltaCount += 0;
        }
    }
}
