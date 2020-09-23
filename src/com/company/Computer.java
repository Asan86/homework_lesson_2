package com.company;

public class Computer {
    private  int HDD;
    private  int SSD;


    Computer(int HDD, int SSD) {
        this.HDD = HDD;
        this.SSD = SSD;

    }

    public Computer() {

    }

    public int getHDD() {
        return HDD;
    }

    public int getSSD() {
        return SSD;
    }
}
