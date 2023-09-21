package com.s_micro_cust_serv.classes;

import com.s_micro_cust_serv.entity.Customer;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyOrders {
    private Customer customer;
    private Product product;

}
