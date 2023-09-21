/*
package com.SpRest.Service;

import com.SpRest.Entity.City;
import com.SpRest.Repo.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceLayer {

    private final CityRepo cityRepo;

    @Autowired
    public ServiceLayer(CityRepo cityRepo){
        this.cityRepo=cityRepo;
    }
    public List<City> getCities(){
        return cityRepo.findAll();
    }
    public City saveCities(City city){
        return cityRepo.save(city);
    }
}
*/