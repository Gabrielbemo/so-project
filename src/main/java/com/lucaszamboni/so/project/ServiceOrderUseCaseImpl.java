package com.lucaszamboni.so.project;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOrderUseCaseImpl implements ServiceOrderUseCase {

    @Override
    public void createServiceOrder(ServiceOrderEntity serviceOrderEntity) {
        System.out.println("Service order creating ");
    }

    @Override
    public ServiceOrderEntity searchById(int id) {
        return null;
    }

    @Override
    public List<ServiceOrderEntity> listServiceOrder(int page) {
        return null;
    }

    @Override
    public void editServiceOrder(ServiceOrderEntity serviceOrderEntity) {

    }

    @Override
    public void excludeServiceOrder(int id) {

    }
}
