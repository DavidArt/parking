package com.davidrus.freeparking.parking.services;

import com.davidrus.freeparking.parking.dao.ParkingDaoImpl;
import com.davidrus.freeparking.parking.dto.Parking;
import org.apache.commons.lang3.StringUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by david on 12-May-17.
 */
@Service
public class ParkingServicesImpl implements ParkingService{
    @Resource
    private Mapper mapper;

    @Resource
    ParkingDaoImpl dao;

    @Override
    public boolean updateParking(Parking parking) {
        com.davidrus.freeparking.parking.domain.Parking parkingDomain =
                mapper.map(parking, com.davidrus.freeparking.parking.domain.Parking.class);
        if (StringUtils.isEmpty(parking.getName()) && StringUtils.isEmpty(parking.getLocation())) {
            return false;
        }
        dao.addParkingStatus(parkingDomain);

        return false;
    }

    @Override
    public int getNumberOfFreeParkingSpaces(String parkingName) {
        return dao.getNumberOfFreeSpaces(parkingName);
    }
}
