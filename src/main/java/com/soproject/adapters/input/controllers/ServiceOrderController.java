package com.soproject.adapters.input.controllers;

import com.soproject.adapters.input.controllers.dto.CreateServiceOrderDTO;
import com.soproject.domain.serviceorder.entities.ServiceOrderEntity;
import com.soproject.domain.serviceorder.usecases.CreateServiceOrderUseCase;
import com.soproject.domain.serviceorder.usecases.FindServiceOrderUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/payments")
public class ServiceOrderController {

    @Autowired
    private CreateServiceOrderUseCase createUseCase;

    @Autowired
    private FindServiceOrderUseCase findAllUseCase;

    Logger logger = LoggerFactory.getLogger(ServiceOrderController.class);

    @GetMapping
    public String getOk(@RequestParam("id") final String id) {
        System.out.println("Parametro recebido na request GET: " + id);
        return "OK";
    }

    @PostMapping
    public List<ServiceOrderEntity> create(@RequestBody final CreateServiceOrderDTO createServiceOrderDTO) {
        logger.info("Caindo no post");
        createUseCase.create(createServiceOrderDTO.toEntity());

        return StreamSupport
                .stream(findAllUseCase.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
