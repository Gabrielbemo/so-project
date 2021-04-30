package com.soproject.adapters.output.repositories;

import com.soproject.domain.serviceorder.entities.ServiceOrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface ServiceOrderRepository extends CrudRepository<ServiceOrderEntity, Long> {

}
