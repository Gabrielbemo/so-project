package com.lucaszamboni.so.project;

import java.time.LocalDateTime;
import java.util.List;

public class ServiceOrderEntity {
    //private String licensePlate;
    private String serviceOrderNumber;
    private LocalDateTime createdData;
    private String serviceDescription;
    private RequestingResponsibleEntity requestingResponsible;
    //private String vehicle;
    //private String vehicleModel;
    //private String requestingDriver;
    //private String requestingMaintenance;
    private LocalDateTime entryVehicleDate;
    private LocalDateTime requestingAutoPartsDate;
    private VehicleEntity vehicle;
    //private Double odometerVehicle;
    //private String vehicleObservation;
    //private boolean waterLevelIsGood;
    //private boolean oilLevelIsGood;
    private List<ServiceOrderItemEntity> serviceOrderItems;
    private LocalDateTime TotalExpectedSpentHours;
    private LocalDateTime waitApproveDate;
    private LocalDateTime approveDate;

    public String getServiceOrderNumber() {
        return serviceOrderNumber;
    }

    public void setServiceOrderNumber(String serviceOrderNumber) {
        this.serviceOrderNumber = serviceOrderNumber;
    }

    public LocalDateTime getCreatedData() {
        return createdData;
    }

    public void setCreatedData(LocalDateTime createdData) {
        this.createdData = createdData;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public RequestingResponsibleEntity getRequestingResponsible() {
        return requestingResponsible;
    }

    public void setRequestingResponsible(RequestingResponsibleEntity requestingResponsible) {
        this.requestingResponsible = requestingResponsible;
    }

    public LocalDateTime getEntryVehicleDate() {
        return entryVehicleDate;
    }

    public void setEntryVehicleDate(LocalDateTime entryVehicleDate) {
        this.entryVehicleDate = entryVehicleDate;
    }

    public LocalDateTime getRequestingAutoPartsDate() {
        return requestingAutoPartsDate;
    }

    public void setRequestingAutoPartsDate(LocalDateTime requestingAutoPartsDate) {
        this.requestingAutoPartsDate = requestingAutoPartsDate;
    }

    public VehicleEntity getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleEntity vehicle) {
        this.vehicle = vehicle;
    }

    public List<ServiceOrderItemEntity> getServiceOrderItems() {
        return serviceOrderItems;
    }

    public void setServiceOrderItems(List<ServiceOrderItemEntity> serviceOrderItems) {
        this.serviceOrderItems = serviceOrderItems;
    }

    public LocalDateTime getTotalExpectedSpentHours() {
        return TotalExpectedSpentHours;
    }

    public void setTotalExpectedSpentHours(LocalDateTime totalExpectedSpentHours) {
        TotalExpectedSpentHours = totalExpectedSpentHours;
    }

    public LocalDateTime getWaitApproveDate() {
        return waitApproveDate;
    }

    public void setWaitApproveDate(LocalDateTime waitApproveDate) {
        this.waitApproveDate = waitApproveDate;
    }

    public LocalDateTime getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(LocalDateTime approveDate) {
        this.approveDate = approveDate;
    }

}
