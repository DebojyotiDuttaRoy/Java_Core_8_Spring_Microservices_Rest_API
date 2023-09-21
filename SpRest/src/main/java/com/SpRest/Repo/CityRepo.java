package com.SpRest.Repo;

import com.SpRest.Entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cities")   //, path="city")
public interface CityRepo extends JpaRepository<City, Integer> {

}
