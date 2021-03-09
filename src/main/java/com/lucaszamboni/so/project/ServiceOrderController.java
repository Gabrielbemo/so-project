package com.lucaszamboni.so.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class ServiceOrderController {
    @Autowired
    ServiceOrderUseCase serviceOrderUseCase;

    @PostMapping
    public void createServiceOrder(@RequestBody final ServiceOrderDTO serviceOrderDTO){
        serviceOrderUseCase.createServiceOrder(serviceOrderDTO.toServiceOrderEntity());
    }

    @GetMapping
    public String getOk(@RequestParam("id") final String id) {
        System.out.println("Parametro recebido na request GET: " + id);
        return "OK";
    }

    /*@PostMapping
    public ServiceOrderDTO postOk(@RequestBody final ServiceOrderDTO serviceOrderDTO) {
        System.out.println("Parametro recebido na request POST: " + serviceOrderDTO.getId());

        ServiceOrderDTO serviceOrderDTOReturn = new ServiceOrderDTO();
        serviceOrderDTOReturn.setId( serviceOrderDTO.getId() + 1 );

        return serviceOrderDTOReturn;
    }*/
}
