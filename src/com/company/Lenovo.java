package com.company;
 public final class Lenovo extends Notebook {

    private String newFunction1;
    private String newFunction2;

    public Lenovo(int HDD, int SSD, String name, Color color, CountryOfOrigin countryOfOrigin, String newFunction1, String newFunction2) {
        this.newFunction1 = newFunction1;
        this.newFunction2 = newFunction2;
    }

    public Lenovo() {
        super();
    }

    public String getNewFunction1() {
        return newFunction1;
    }

    public String getNewFunction2() {
        return newFunction2;
    }

     @Override
     public void getInfo(String name, int HDD, int SSD, Color color,  CountryOfOrigin countryOfOrigin) {
         super.getInfo(name, HDD, SSD, color, countryOfOrigin);

       }
 }
