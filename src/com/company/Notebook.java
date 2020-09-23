package com.company;

public class Notebook extends Computer {
    private String name;
    private Color color;
    private CountryOfOrigin countryOfOrigin;


    public Notebook(CountryOfOrigin countryOfOrigin) {
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

    final void getInfo(String name) {

        System.out.println("Бренд: " + name);
    }

    public void getInfo(int HDD, int SSD, Color color) {

        System.out.println("HDD: " + HDD + "гб.\n" + "SSD: " + SSD + "гб.\n" + "Цвет: " + color + "\n");
    }

    public void getInfo(String name, int HDD, int SSD, Color color, CountryOfOrigin countryOfOrigin) {
        System.out.println("\nБренд: " + name + "\nHDD: " + HDD + "гб.\n" + "SSD: " + SSD + "гб.\n"
                        + "цвет: " + color +
                "\nСтрана производства: " + countryOfOrigin.getNameСountry() + "\nГород: " + countryOfOrigin.getNamTown());
    }
}


