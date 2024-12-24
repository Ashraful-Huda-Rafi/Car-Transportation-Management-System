package com.rafi;
import java.lang.*;
public interface ICustomer {
    boolean booked(Ride ride);
    boolean insertCustomer(Customer customer);
    boolean removeCustomer(Customer customer);
    void showAllCustomers();
}
