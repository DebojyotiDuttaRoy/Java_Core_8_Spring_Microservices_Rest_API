package com.s_micro_cust_serv.controllers;

import com.s_micro_cust_serv.classes.MyOrders;
import com.s_micro_cust_serv.entity.Customer;
import com.s_micro_cust_serv.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCust(customer);
    }
    @GetMapping("/myorders/{cid}")
    public MyOrders myProductOrders(@PathVariable("cid") int custId){
        return customerService.getMyOrders(custId);
    }
}
