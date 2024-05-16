package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.UserDto;
import com.internship.exceltodb.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setDobYear(userDto.getDobYear());
        user.setDobMonth(userDto.getDobMonth());
        user.setDobDay(userDto.getDobDay());
        user.setGender(userDto.getGender());
        user.setCity(userDto.getCity());
        user.setRole(userDto.getRole());
        user.setEventId(userDto.getEventId());

        userRepository.save(user);
        logger.info("Saved User: {}", user);
    }
}
