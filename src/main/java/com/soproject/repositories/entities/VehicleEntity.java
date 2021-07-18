package com.soproject.repositories.entities;

public class VehicleEntity {
    private String licensePlate;
    private String vehicleName;
    private String vehicleModel;
    // This data doesn't seems to belong this class
    // They are part of life cycle of vehicle
    //   so must be in class type service order
    private Double odometerVehicle;
    private String vehicleObservation;
    private boolean waterLevelIsGood;
    private boolean oilLevelIsGood;
}
