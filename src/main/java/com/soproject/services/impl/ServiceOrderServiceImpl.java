package com.soproject.services.impl;

import com.soproject.repositories.ServiceOrderRepository;
import com.soproject.repositories.entities.ServiceOrderEntity;
import com.soproject.services.ServiceOrderService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.List;

@Service
@Slf4j
public class ServiceOrderServiceImpl implements ServiceOrderService {

    @Autowired
    private ServiceOrderRepository repository;

    @Override
    public void create(final ServiceOrderEntity entity) throws Exception {
        validateFieldRequest(entity);
        repository.save(entity);
    }

    private void validateFieldRequest(final ServiceOrderEntity entity) throws Exception {
//        if (entity.getServiceOrderNumber().length() < 2) {
//            throw new MethodArgumentNotValidException("ServiceOrderNumber must be greater than 1 character.");
//        }
    }

    @Override
    public List<ServiceOrderEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public ServiceOrderEntity findByServiceOrderNumber(final String serviceOrderNumber) {
        return repository.findByServiceOrderNumber(serviceOrderNumber);
    }
}
