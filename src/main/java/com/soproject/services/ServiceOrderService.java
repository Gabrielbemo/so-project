package com.soproject.services;

import com.soproject.repositories.entities.ServiceOrderEntity;

import java.util.List;

public interface ServiceOrderService {
    void create (ServiceOrderEntity entity) throws Exception;
    List<ServiceOrderEntity> findAll();
    ServiceOrderEntity findByServiceOrderNumber(final String serviceOrderNumber);
}
