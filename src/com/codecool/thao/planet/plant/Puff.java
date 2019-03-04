package com.codecool.thao.planet.plant;

public class Puff extends Plant {
    private int foodLimit;

    public Puff(String name, int food) {
        super(name, food);
        this.foodLimit = 10;
    }

    @Override
    public void reactToAlpha() {
        this.food += 2;
        developRadiationOfNextDay();
    }

    @Override
    public void reactToDelta() {
        this.food -= 2;
        developRadiationOfNextDay();
    }

    @Override
    public void reactToNoRadiation() {
        this.food -= 1;
        developRadiationOfNextDay();
    }

    @Override
    public void checkFood() {
        if (this.food == 0 || this.food > this.foodLimit) {
            die();
        }
    }

    public void developRadiationOfNextDay() {
        this.alphaCount += (10 - this.food);
    }
}
