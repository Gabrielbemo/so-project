package com.soproject.controllers.dto.out;

import com.soproject.repositories.entities.ServiceOrderEntity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class CreateServiceOrderResponseDTO {
    private Long id;

    private String serviceOrderNumber;

    private LocalDateTime createdData;

    private String serviceDescription;

    //private RequestingResponsibleEntity requestingResponsible;

    private LocalDateTime entryVehicleDate;

    private LocalDateTime requestingAutoPartsDate;

    //private VehicleEntity vehicle;

    //private List<ServiceOrderItemEntity> serviceOrderItems;

    private LocalDateTime totalExpectedSpentHours;

    private LocalDateTime waitApproveDate;

    private LocalDateTime approveDate;

    public static CreateServiceOrderResponseDTO fromEntity(final ServiceOrderEntity entity){
        return CreateServiceOrderResponseDTO.builder()
                .id(entity.getId())
                .serviceOrderNumber(entity.getServiceOrderNumber())
                .createdData(entity.getCreatedDate())
                .serviceDescription(entity.getServiceDescription())
                .entryVehicleDate(entity.getEntryVehicleDate())
                .requestingAutoPartsDate(entity.getRequestingAutoPartsDate())
                .totalExpectedSpentHours(entity.getTotalExpectedSpentHours())
                .waitApproveDate(entity.getWaitApproveDate())
                .approveDate(entity.getApproveDate())
                .build();
    }
}
