package org.example.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.entity.User;
import org.example.repository.Repository;
import org.example.repository.UserRepository;

public class UserService {

    public UserService() {
        logger.info("+++ USER_SERVICE WAS BORN");
    }

    private final static Logger logger = LogManager.getLogger(UserService.class);

    Repository<User> userRepository = new UserRepository();

    public User giveMeUser(Long id, String login, String password){

//      logger.info("=== >>> userService начал работу {}", this);
//        logger.info("=== >>> userService начал работу");
//        logger.debug("=== >>> userService начал работу");
//        logger.warn("=== >>> userService начал работу");
//        logger.error("=== >>> userService начал работу");
        logger.fatal("=== >>> userService начал работу");
        return userRepository.getUser(id, login, password);

    }

    @Override
    public String toString() {
        return "UserService{" +
                "userRepository=" + userRepository +
                '}';
    }
}
