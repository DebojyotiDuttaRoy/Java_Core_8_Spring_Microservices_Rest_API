package com.SpRest.Entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_city")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cityID;
    private String cityName;
    private boolean isActive;
}
