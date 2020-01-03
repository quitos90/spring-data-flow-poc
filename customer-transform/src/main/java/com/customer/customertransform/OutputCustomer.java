package com.customer.customertransform;


import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;

@EnableBinding(Source.class)
public class OutputCustomer {

    @InboundChannelAdapter(Source.OUTPUT)
    public Customer metodo() {
        Customer customer = new Customer();
        customer.setName("marcos input");
        return customer;
    }
}