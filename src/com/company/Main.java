package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Notebook notebook = new Notebook();
        notebook.getInfo();
        notebook.getInfo(500, 120, Color.BLACK);
        notebook.getInfo("Lenovo", 1000, 120, Color.BROWN, new CountryOfOrigin("China", "Shanghai"));
        Lenovo lenovo1 = new Lenovo();
        lenovo1.getInfo(500, 120, Color.BLACK);

        Lenovo lenovo2 = new Lenovo();
        lenovo2.getInfo("Lenovo-2", 1000, 250, Color.GREY, new CountryOfOrigin("China", "Shanghai"));


    }
}
