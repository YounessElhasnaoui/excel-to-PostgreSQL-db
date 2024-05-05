package com.internship.exceltodb.service;

import com.internship.exceltodb.dto.UserDto;
import com.internship.exceltodb.model.User;
import com.internship.exceltodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserDto userDto) {
        User user = new User();
        // Map DTO to entity
        user.setUserId(userDto.getUserId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setDobYear(userDto.getDobYear());
        user.setDobMonth(userDto.getDobMonth());
        user.setDobDay(userDto.getDobDay());
        user.setGender(userDto.getGender());
        user.setCity(userDto.getCity());
        user.setEventId(userDto.getEventId());
        user.setRole(userDto.getRole());
        return userRepository.save(user);
    }

    public User findUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
