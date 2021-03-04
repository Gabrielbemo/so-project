package com.lucaszamboni.so.project;

import java.time.LocalDateTime;
import java.util.List;

public class ServiceOrderEntity {
    private String licensePlate;
    private String serviceOrderNumber;
    private LocalDateTime createdData;
    private String serviceDescription;
    private String vehicle;
    private String vehicleModel;
    private String requestingDriver;
    private String requestingMaintenance;
    private LocalDateTime entryVehicleDate;
    private LocalDateTime requestingAutoPartsDate;
    private Double odometerVehicle;
    private String vehicleObservation;
    private boolean waterLevelIsGood;
    private boolean oilLevelIsGood;
    private List<ServiceOrderItem> serviceOrderItems;
    private LocalDateTime TotalExpectedSpentHours;
    private LocalDateTime waitApproveDate;
    private LocalDateTime approveDate;
}
