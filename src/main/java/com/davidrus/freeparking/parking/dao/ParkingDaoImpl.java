package com.davidrus.freeparking.parking.dao;

import com.davidrus.freeparking.parking.domain.Parking;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.sql.DataSource;
import javax.transaction.Transactional;

/**
 * Created by david on 15-May-17.
 */
@Repository
@Slf4j
public class ParkingDaoImpl implements ParkingDao {

    @Resource
    DataSource dataSource;

    @PersistenceContext
    public EntityManager em;

    @Override
    @Transactional
    public boolean addParkingStatus(Parking parking) {


        em.persist(parking);

        return true;

//        return query.getResultList().isEmpty();
    }

    @Override
    public int getNumberOfFreeSpaces(String parkingName) {
        TypedQuery<Parking> query = em.createNamedQuery(Parking.GET_NUMBER_OF_FREE_PARKING_SPACES, Parking.class);
        query.setParameter("name", parkingName);

        return query.getResultList().get(0).getFreeParkingSpaces();
    }
}
