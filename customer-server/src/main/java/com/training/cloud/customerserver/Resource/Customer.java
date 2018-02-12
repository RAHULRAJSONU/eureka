package com.training.cloud.customerserver.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/customer/server")
public class Customer {

    @GetMapping("")
    public String getCustomer(){
        return "Customer: Anil Kumar Rai";
    }
}
