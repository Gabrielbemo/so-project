package com.soproject.repositories.entities;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String serviceOrderNumber;

    private LocalDateTime createdDate;

    private String serviceDescription;

    //private RequestingResponsibleEntity requestingResponsible;

    private LocalDateTime entryVehicleDate;

    private LocalDateTime requestingAutoPartsDate;

    //private VehicleEntity vehicle;

    //private List<ServiceOrderItemEntity> serviceOrderItems;

    private LocalDateTime totalExpectedSpentHours;

    private LocalDateTime waitApproveDate;

    private LocalDateTime approveDate;
}
