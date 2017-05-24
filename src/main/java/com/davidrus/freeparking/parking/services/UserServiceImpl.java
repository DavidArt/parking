package com.davidrus.freeparking.parking.services;

import com.davidrus.freeparking.parking.dao.UserDao;
import com.davidrus.freeparking.parking.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by david on 17-May-17.
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Resource
    private Mapper mapper;
    @Resource
    private UserDao userDao;

    @Override
    public boolean createUser(User user) {
        com.davidrus.freeparking.parking.domain.User userDomain = mapper.map(user, com.davidrus.freeparking.parking.domain.User.class);
        return userDao.createUser(userDomain);
    }

    @Override
    public User getUser(Integer id) {
       com.davidrus.freeparking.parking.domain.User user = userDao.getUserById(id);
        User userDto = mapper.map(user, User.class);
        return userDto;
    }

    @Override
    public User getUserByName(String name) {
        com.davidrus.freeparking.parking.domain.User user = userDao.getUserByName(name);
        User userDto = mapper.map(user, User.class);
        return userDto;
    }

    @Override
    public boolean updateUser(User user) {
        com.davidrus.freeparking.parking.domain.User userDomain = mapper.map(user, com.davidrus.freeparking.parking.domain.User.class);
        return userDao.updateUser(userDomain);
    }

    @Override
    public boolean deleteUser(Integer id) {
        com.davidrus.freeparking.parking.domain.User user = userDao.getUserById(id);
        return userDao.deleteUser(id);
    }
}
