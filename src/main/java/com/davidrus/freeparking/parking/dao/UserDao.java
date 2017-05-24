package com.davidrus.freeparking.parking.dao;

import com.davidrus.freeparking.parking.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by david on 17-May-17.
 */
@Repository
public interface UserDao extends org.springframework.data.repository.Repository<User, Long>{

    /**
     * Creates a new user in the database
     *
     * @param user the user's details
     */
    boolean createUser(User user);

    /**
     * Fetches the user from the database
     *
     * @param id of the user
     * @return the user
     */
    User getUserById(Integer id);

    User getUserByName(String userName);

    /**
     * Updates the user details
     *
     * @param user the user's data
     */
    boolean updateUser(User user);

    /**
     * Deletes the user
     *
     * @param id of the user
     */
    boolean deleteUser(Integer id);

}
