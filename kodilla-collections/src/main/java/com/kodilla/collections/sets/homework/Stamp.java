package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stanped;
    private String name;
    private double height;
    private double wight;

    public Stamp(String stanped, String name, double height, double wight) {
        this.stanped = stanped;
        this.name = name;
        this.height = height;
        this.wight = wight;
    }

    public String getStanped() {
        return stanped;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWight() {
        return wight;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stanped='" + stanped + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", wight=" + wight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(height, stamp.height) == 0 && Double.compare(wight, stamp.wight) == 0 && Objects.equals(stanped, stamp.stanped) && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stanped, name, height, wight);
    }
}


