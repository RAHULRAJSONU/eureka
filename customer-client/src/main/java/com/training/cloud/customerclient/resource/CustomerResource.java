package com.training.cloud.customerclient.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/rest/customer/client")
public class CustomerResource {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "")
    public String getCustomer(){
        String url="http://customer-server/rest/customer/server";
        return restTemplate.getForObject(url,String.class);
    }
}
