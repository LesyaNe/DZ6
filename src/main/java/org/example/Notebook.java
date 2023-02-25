package org.example;

public class Notebook {
    private String brand;
    private String model;
    private String color;
    private double screenSize;
   

    public Notebook(String brand, String model, String color, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;

    }

    public String printInfo() {
        System.out.printf("Brand: %s, Model: %s, Color: %s, ScreenSize: %s", brand, model, color, screenSize);
        return ".";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return getColor(null);
    }
    public double getScreenSize() {
        return screenSize;
    }

    public String getColor(String requestUserForSearch) {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

}
