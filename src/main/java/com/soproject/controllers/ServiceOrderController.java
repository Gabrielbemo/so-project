package com.soproject.controllers;

import com.soproject.controllers.dto.in.CreateServiceOrderRequestDTO;
import com.soproject.controllers.dto.out.CreateServiceOrderResponseDTO;
import com.soproject.repositories.entities.ServiceOrderEntity;
import com.soproject.services.ServiceOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static net.logstash.logback.argument.StructuredArguments.kv;

@RestController
@RequestMapping("/service-order")
@Slf4j
public class ServiceOrderController {

    @Autowired
    private ServiceOrderService serviceOrderService;

    @PostMapping
    public ResponseEntity<CreateServiceOrderResponseDTO> create(@RequestBody @Valid final CreateServiceOrderRequestDTO dtoRequest) throws Exception {
        log.info("service_order_creating",
                kv("serviceOrderNumber", dtoRequest.getServiceOrderNumber()));

        serviceOrderService.create(dtoRequest.toEntity());

        ServiceOrderEntity serviceOrderCreated = serviceOrderService
                .findByServiceOrderNumber(dtoRequest.getServiceOrderNumber());

        log.info("service_order_created",
                kv("serviceOrderNumber", serviceOrderCreated.getServiceOrderNumber()),
                kv("id", serviceOrderCreated.getId()));

        return new ResponseEntity<CreateServiceOrderResponseDTO>(
                CreateServiceOrderResponseDTO.fromEntity(serviceOrderCreated),
                HttpStatus.CREATED);
    }

    @GetMapping
    public String getOk(@RequestParam("id") final String id) {
        return "OK";
    }
}
