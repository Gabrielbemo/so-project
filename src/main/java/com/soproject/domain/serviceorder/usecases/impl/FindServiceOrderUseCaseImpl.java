package com.soproject.domain.serviceorder.usecases.impl;

import com.soproject.adapters.output.repositories.ServiceOrderRepository;
import com.soproject.domain.serviceorder.entities.ServiceOrderEntity;
import com.soproject.domain.serviceorder.usecases.FindServiceOrderUseCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindServiceOrderUseCaseImpl implements FindServiceOrderUseCase {

    @Autowired
    private ServiceOrderRepository repository;

    Logger logger = LoggerFactory.getLogger(CreateServiceOrderUseCaseImpl.class);

    @Override
    public Iterable<ServiceOrderEntity> findAll() {
        logger.info("Executando o use case FindAll");
        return repository.findAll();
    }
}
