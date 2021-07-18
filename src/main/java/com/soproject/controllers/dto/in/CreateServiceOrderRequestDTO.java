package com.soproject.controllers.dto.in;

import com.soproject.repositories.entities.ServiceOrderEntity;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CreateServiceOrderRequestDTO {

    private String serviceOrderNumber;

    @NotNull(message = "serviceDescription is required.")
    @Min(value = 2)
    private String serviceDescription;

    private LocalDateTime createdDate;

    //TODO
    //incluir demais campo.
    //Colocar regras de validacao para cada campo.

    public ServiceOrderEntity toEntity() {
        return ServiceOrderEntity.builder()
                .serviceOrderNumber(serviceOrderNumber)
                .build();
    }
}
