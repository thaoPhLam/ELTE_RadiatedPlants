package com.codecool.thao.planet.plant;

public class ParaBush extends Plant {
    public ParaBush(String name, int food) {
        super(name, food);
    }

    @Override
    public void reactToAlpha() {
        this.food += 1;
    }

    @Override
    public void reactToDelta() {
        this.food += 1;
    }

    @Override
    public void reactToNoRadiation() {
        this.food -= 1;
    }
}
