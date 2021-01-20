package com.example.event16.model;

public class Car {

    private String brand;
    private String modal;
    private int    year;

    public Car() { }

    public Car(String brand, String modal, int year) {
        this.brand = brand;
        this.modal = modal;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", modal='" + modal + '\'' +
                ", year=" + year +
                '}';
    }
}
