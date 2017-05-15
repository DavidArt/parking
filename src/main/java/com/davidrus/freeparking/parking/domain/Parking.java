package com.davidrus.freeparking.parking.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by david on 12-May-17.
 */
@Getter
@Setter
@Entity
@NamedQueries({
        @NamedQuery(name = Parking.GET_NUMBER_OF_FREE_PARKING_SPACES, query = "SELECT p FROM Parking p WHERE p.name = :name")
//        @NamedQuery(name = Parking.ADD_PARKING_STATUS, query = "INSERT INTO Parking p VALUES p.name = :name, " +
//                "p.location = :location, p.parkingSpaces = :parkingSpaces, p.freeParkingSpaces = :freeParkingSpaces")
})
public class Parking {
//    public static final String ADD_PARKING_STATUS = "addParkingStatus";
    public static final String GET_NUMBER_OF_FREE_PARKING_SPACES = "getFreeParkingSpaces";

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String location;
    @Column(name = "parkingSpaces")
    private int parkingSpaces;
    @Column(name = "freeParkingSpaces")
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

// reusursa user
// service layer
// persistance layer