package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    // create
    User saveUser(User user);

    //get all user
    List<User>getAllUser();

    //get user by id
    User getUser(String userId);


}
