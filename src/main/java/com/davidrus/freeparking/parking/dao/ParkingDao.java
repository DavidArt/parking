package com.davidrus.freeparking.parking.dao;

import com.davidrus.freeparking.parking.domain.Parking;
import org.springframework.stereotype.Repository;

/**
 * Created by david on 15-May-17.
 */
@Repository
public interface ParkingDao {

    boolean addParkingStatus(Parking parking);

    int getNumberOfFreeSpaces(String parkingName);

}
