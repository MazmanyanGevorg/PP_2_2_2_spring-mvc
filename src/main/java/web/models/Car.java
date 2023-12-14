package web.models;

import org.springframework.stereotype.Controller;

public class Car {

    private int id;
    private String model;
    private int yearOfManufacture;
    private int price;

    public Car() {
    }

    public Car(int id, String model, int yearOfManufacture, int price) {
        this.id = id;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getyearOfManufacture() {
        return yearOfManufacture;
    }

    public void setyearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
