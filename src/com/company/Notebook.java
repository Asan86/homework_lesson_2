package com.company;

public class Notebook extends Computer {
    private String name;
    private Color color;
    private CountryOfOrigin countryOfOrigin;


    public Notebook(int HDD, int SSD, String name, Color color, CountryOfOrigin countryOfOrigin) {
        super(HDD, SSD);
        this.name = name;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;
    }

    public Notebook() {
        super();
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public CountryOfOrigin getCountryOfOrigin() {
        return countryOfOrigin;
    }

    void getInfo() {
        System.out.println("Без параметров");
    }

    public void getInfo(int HDD, int SSD, Color color) {
        System.out.println("3 параметра" + HDD  + SSD + color);
    }

    public void getInfo(String name, int HDD, int SSD,  Color color, CountryOfOrigin countryOfOrigin) {
        System.out.println(name + HDD + SSD + color + countryOfOrigin);
    }
}


