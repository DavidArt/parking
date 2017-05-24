package com.davidrus.freeparking.parking.services;

import com.davidrus.freeparking.parking.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by david on 17-May-17.
 */
@Service
public interface UserService {
    boolean createUser(User user);

    User getUser(Integer id);

    User getUserByName(String name);

    boolean updateUser(User user);

    boolean deleteUser(Integer id);

}
