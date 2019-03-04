package com.codecool.thao.planet.plant;

import com.codecool.thao.planet.RadiationType;

public abstract class Plant {
    protected int food;
    protected boolean alive = true;
    protected int alphaCount;
    protected int deltaCount;
    protected String name;
    protected RadiationType radiationType;

    public Plant(String name, int food) {
        this.name = name;
        this.food = food;
    }

    public boolean isAlive() {
        return alive;
    }

    public void checkFood() {
        if (this.food == 0) {
            die();
        }
    }

    public void die() {
        this.alive = false;
        System.out.println(name + " died!");
    }

    public void reactToRadiation() {
        if (radiationType.equals(RadiationType.ALPHA)) {
            reactToAlpha();
        } else if (radiationType.equals(RadiationType.DELTA)) {
            reactToDelta();
        } else if (radiationType.equals(RadiationType.NONE)) {
            reactToNoRadiation();
        }
        radiationOfNextDay();
    }

    public abstract void reactToAlpha();
    public abstract void reactToDelta();
    public abstract void reactToNoRadiation();

    public void radiationOfNextDay() {
        if (alphaCount - deltaCount >= 3) {
            this.radiationType = RadiationType.ALPHA;
        } else if (deltaCount - alphaCount >= 3) {
            this.radiationType = RadiationType.DELTA;
        } else if (Math.abs(alphaCount - deltaCount) < 3
                || Math.abs(deltaCount - alphaCount) < 3) {
            this.radiationType = RadiationType.NONE;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                ", food=" + food +
                ", alive=" + alive +
                '}';
    }
}
