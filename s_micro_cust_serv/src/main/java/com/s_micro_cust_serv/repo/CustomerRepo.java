package com.s_micro_cust_serv.repo;

import com.s_micro_cust_serv.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
