package ru.korlisa.springboot.cruduser.spingbootcruduser.service;

import ru.korlisa.springboot.cruduser.spingbootcruduser.model.User;

import java.util.List;

public interface UserService {
    List <User> getAllUsers();
    User getUserById (Long id);
    void addUser (User user);
    void removeUser (Long id);
}
