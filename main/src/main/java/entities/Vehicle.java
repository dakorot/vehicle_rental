package entities;

public abstract class Vehicle {
    int id;
    String brand;
    String model;
    int year;
    double price;
    boolean rented;

    public abstract String toCSV();
    public abstract String toString();
}
