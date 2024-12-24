package com.rafi;

public interface ICar {
    Car availableCar();
    boolean insertCar(Car car);
    boolean removeCar(Car car);
    void showAllCars();
}
