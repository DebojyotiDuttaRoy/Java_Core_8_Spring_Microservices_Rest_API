/*
package com.SpRest.Controller;

import com.SpRest.Entity.City;
import com.SpRest.Service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/city")
public class HomeController {
    private final ServiceLayer serviceLayer;
    @Autowired
    public HomeController(ServiceLayer serviceLayer){
        this.serviceLayer=serviceLayer;
    }
    @GetMapping("")
    public ResponseEntity<List<City>> selectCity(){
        return new ResponseEntity<>(serviceLayer.getCities(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<City> selectCity(@RequestBody City city){
        return new ResponseEntity<>(serviceLayer.saveCities(city), HttpStatus.CREATED);
    }
}
*/