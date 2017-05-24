package com.davidrus.freeparking.parking.dao;

import com.davidrus.freeparking.parking.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.sql.DataSource;
import javax.transaction.Transactional;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by david on 17-May-17.
 */
@Repository
@Slf4j
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    public EntityManager em;

    /**
     * Creates a new user in the database
     *
     * @param user the user's details
     */
    @Override
    @Transactional
    public boolean createUser(User user) {
        em.persist(user);

        return true;
    }

    /**
     * Fetches the user from the database
     *
     * @param id of the user
     */
    @Override
    public User getUserById(Integer id) {
        TypedQuery<User> query = em.createNamedQuery(User.GET_USER_BY_ID, User.class);
        query.setParameter("id", id);

        return query.getSingleResult();
    }

    /**
     * Fetches the user from the database
     *
     * @param userName of the user
     */
    @Override
    public User getUserByName(String userName) {
        TypedQuery<User> query = em.createNamedQuery(User.GET_USER_BY_NAME, User.class);
        query.setParameter("name", userName);

        return query.getSingleResult();
    }

    /**
     * Updates the user details
     *
     * @param user the user's data
     */
    @Override
    public boolean updateUser(User user) {
        em.merge(user);

        return true;
    }

    /**
     * Deletes the user
     *
     * @param id of the user
     */
    @Override
    public boolean deleteUser(Integer id) {
        TypedQuery<User> query = em.createNamedQuery(User.GET_USER_BY_ID, User.class);
        query.setParameter("id", id);
        User user = query.getSingleResult();
        em.remove(user);

        return true;
    }

}












