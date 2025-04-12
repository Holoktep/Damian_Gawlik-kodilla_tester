package com.kodilla.jacoco;

public final class Year {
    private final int value;

    public Year(int value) {
        this.value = value;
    }

    public boolean isLeap() {
        if (this.value % 4 == 0) {
            if (this.value % 100 == 0) {
                return this.value % 400 == 0;
            }
            return true;
        }
        return false;
    }
}