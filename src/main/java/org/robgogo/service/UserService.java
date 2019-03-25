package org.robgogo.service;

import org.robgogo.model.User;


public interface UserService extends GenericService<User> {

    boolean authenticate(String email, String password);

    User findByEmail(String email);

}