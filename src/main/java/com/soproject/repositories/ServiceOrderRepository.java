package com.soproject.repositories;

import com.soproject.repositories.entities.ServiceOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrderEntity, Long> {
    ServiceOrderEntity findByServiceOrderNumber(final String serviceOrderNumber); //O que eh isso ?
}
