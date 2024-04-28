package com.internship.exceltodb.processor;

import com.internship.exceltodb.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserItemProcessor implements ItemProcessor<User, User> {
    @Override
    public User process(User item) throws Exception {
        item.setFirstName(item.getFirstName().toUpperCase());
        item.setLastName(item.getLastName().toUpperCase());
        return item;
    }
}
