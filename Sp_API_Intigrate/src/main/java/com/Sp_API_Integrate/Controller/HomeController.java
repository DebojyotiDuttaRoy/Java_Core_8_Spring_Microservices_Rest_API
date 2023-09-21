package com.Sp_API_Integrate.Controller;

import com.Sp_API_Integrate.Entity.User;
import com.Sp_API_Integrate.Service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final ServiceLayer serviceLayer;
    @Autowired
    public HomeController(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }
    @GetMapping("/")
    public ResponseEntity<User> getData(){
        return new ResponseEntity<User> (serviceLayer.consumeAPI(), HttpStatus.OK);
    }
}
