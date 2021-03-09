package com.lucaszamboni.so.project;

import org.springframework.stereotype.Service;

import java.util.List;


public interface ServiceOrderUseCase {


    public void createServiceOrder(ServiceOrderEntity serviceOrderEntity);

    public ServiceOrderEntity searchById(int id);

    public List<ServiceOrderEntity> listServiceOrder(int page);

    public void editServiceOrder(ServiceOrderEntity serviceOrderEntity);

    public void excludeServiceOrder(int id);
}
