package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User createUser(User user);

    void deleteUser(Integer userId);

    User updateUser(User user);

    User readUser(Integer userId);
}
