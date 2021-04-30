package com.soproject.domain.serviceorder.usecases;

import com.soproject.domain.serviceorder.entities.ServiceOrderEntity;

public interface FindServiceOrderUseCase {
    Iterable<ServiceOrderEntity> findAll();
}
