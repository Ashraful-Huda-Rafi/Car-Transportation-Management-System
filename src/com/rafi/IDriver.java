package com.rafi;
import java.lang.*;

public interface IDriver {
    Driver availableDrivers();
    boolean insertDriver(Driver driver);
    boolean removeDriver(Driver driver);
    void showAllDrivers();
}
