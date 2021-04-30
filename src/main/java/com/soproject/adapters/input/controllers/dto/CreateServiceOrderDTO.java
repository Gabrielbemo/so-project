package com.soproject.adapters.input.controllers.dto;

import com.soproject.domain.serviceorder.entities.ServiceOrderEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateServiceOrderDTO {
    private int id;

    private String serviceOrderNumber;

    public ServiceOrderEntity toEntity(){
        return ServiceOrderEntity.builder()
                .serviceOrderNumber(serviceOrderNumber)
                .build();
    }
}
