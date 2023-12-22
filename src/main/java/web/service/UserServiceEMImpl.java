package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserServiceEMImpl  implements UserService {

    private final UserDAO userDao;

    @Autowired
    public UserServiceEMImpl(@Qualifier("userDaoEMImpl") UserDAO userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public User createUser(User user) {
        return userDao.createUser(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userDao.deleteUser(userId);
    }

    @Override
    public User updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User readUser(Integer userId) {
        return userDao.readUser(userId);
    }

    @Override
    public List<User> index() {
        return null;
    }

    @Override
    public User show(int id) {
        return null;
    }

    @Override
    public void save(User user) {

    }
}
