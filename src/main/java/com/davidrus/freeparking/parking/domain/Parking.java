package com.davidrus.freeparking.parking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by david on 12-May-17.
 */
@Getter
@Setter
@Entity
public class Parking {
    private int id;
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
