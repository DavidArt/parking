package com.davidrus.freeparking.parking.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by david on 12-May-17.
 */
@Getter
@Setter
public class Parking {
    private Integer id;
    private String name;
    private String location;
    private int parkingSpaces;
    private int freeParkingSpaces;
    private Timestamp timestamp;

    @Override
    public String toString() {
        return "Parking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", parkingSpaces=" + parkingSpaces +
                ", freeParkingSpaces=" + freeParkingSpaces +
                ", timestamp=" + timestamp +
                '}';
    }
}
