package com.s_micro_cust_serv.services;

import com.s_micro_cust_serv.classes.MyOrders;
import com.s_micro_cust_serv.classes.Product;
import com.s_micro_cust_serv.entity.Customer;
import com.s_micro_cust_serv.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo repo;

    @Autowired
    RestTemplate restTemplate;

    public Customer saveCust(Customer c){
        return repo.save(c);
    }
    public MyOrders getMyOrders(int custId){
        Optional<Customer> cust = repo.findById(custId);
        int pid = cust.get().getPid();
        Product product = restTemplate.getForObject("http://product-service/product/"+pid, Product.class);
        MyOrders myOrders = new MyOrders();
        myOrders.setCustomer(cust.get());
        myOrders.setProduct(product);
        return myOrders;
    }
}
