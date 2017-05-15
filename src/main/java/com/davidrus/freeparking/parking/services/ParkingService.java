package com.davidrus.freeparking.parking.services;

import com.davidrus.freeparking.parking.dto.Parking;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by david on 12-May-17.
 */
@Service
public interface ParkingService {
    boolean updateParking(Parking parking);
    int getNumberOfFreeParkingSpaces(String parkingName);
}
