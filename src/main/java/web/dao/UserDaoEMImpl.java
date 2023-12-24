//package web.dao;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//import web.model.User;
//
//import javax.persistence.TypedQuery;
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class UserDaoEMImpl implements UserDAO {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    private static int USER_COUNT;
//    private final List<User> users;
//
//    {
//        users = new ArrayList<>();
//        users.add(new User(++USER_COUNT, "Aleks", "Tankin", 25, 51, 3786));
//        users.add(new User(++USER_COUNT, "Leon", "Hudoy", 18, 75, 7958));
//        users.add(new User(++USER_COUNT, "Albert", "Rammshtein", 26, 45, 8505));
//        users.add(new User(++USER_COUNT, "Leonid", "Messourry", 33, 49, 5233));
//        users.add(new User(++USER_COUNT, "Vilen", "Metalin", 38, 20, 1289));
//    }
//
//    @Override
//    public List<User> getAllUser() {
//        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
//        return query.getResultList();
//    }
//
//    @Override
//    @Transactional
//    public User createUser(User user) {
//        entityManager.persist(user);
//        return user;
//    }
//
//    @Override
//    @Transactional
//    public User deleteUser(Integer userId) {
//        User user = readUser(userId);
//        entityManager.remove(user);
//        return user;
//    }
//
//    @Override
//    @Transactional
//    public User updateUser(User user) {
//        return entityManager.merge(user);
//    }
//
//    @Override
//    public User readUser(Integer userId) {
//        return entityManager.find(User.class, userId);
//    }
//
//    public List<User> index() { // чтение
//        return users; // вместо users потом нужно указать бд
//    }
//
//    public User show(int id) { // чтение
//        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
//    }
//
//    public void save(User user) {
//        user.setId(++USER_COUNT);
//        users.add(user);
//    }
//}
