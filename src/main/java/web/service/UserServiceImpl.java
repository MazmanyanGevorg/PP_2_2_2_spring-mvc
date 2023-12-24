//package web.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Service;
//import web.dao.UserDAO;
//import web.model.User;
//
//import java.util.List;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    private final UserDAO userDAO;
//
//    @Autowired
//    public UserServiceImpl(@Qualifier("userDAOImpl") UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }
//
//    @Override
//    public List<User> getAllUser() {
//        return userDAO.getAllUser();
//    }
//
//    @Override
//    public User createUser(User user) {
//        return userDAO.createUser(user);
//    }
//
//    @Override
//    public void deleteUser(Integer userId) {
//        userDAO.deleteUser(userId);
//    }
//
//    @Override
//    public User updateUser(User user) {
//        return userDAO.updateUser(user);
//    }
//
//    @Override
//    public User readUser(Integer userId) {
//        return userDAO.readUser(userId);
//    }
//
//    @Override
//    public List<User> index() { // чтение
//        return userDAO.index(); // вместо users потом нужно указать бд
//    }
//
//    @Override
//    public User show(int id) { // чтение
//        return userDAO.show(id);
//    }
//
//    @Override
//    public void save(User user) {
//    }
//}
