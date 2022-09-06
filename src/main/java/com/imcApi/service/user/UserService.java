package com.imcApi.service.user;

import com.imcApi.model.User;

import java.util.Collection;

public interface UserService {
    User saveUser(User user);

    User getUser(String id);

    User updateUser(User user);

    Boolean deleteUser(String id);

    Collection<User> userList(int limit);
}
