package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Notebook notebook = new Notebook();

        notebook.getInfo("Lenovo_1");

        notebook.getInfo(500, 120, Color.BLACK);

        notebook.getInfo("Lenovo_2", 1000, 120, Color.BROWN, new CountryOfOrigin("China", "Shanghai"));

        Lenovo lenovo2 = new Lenovo();
        lenovo2.getInfo("Lenovo-3", 1000, 250, Color.GREY, new CountryOfOrigin("China", "Shanghai"));


    }
}
