package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

//    @PersistenceContext
//    private EntityManager entityManager;

    private static int USER_COUNT;
    private final List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(++USER_COUNT, "Aleks", "Tankin", 25, 51, 3786));
        users.add(new User(++USER_COUNT, "Leon", "Hudoy", 18, 75, 7958));
        users.add(new User(++USER_COUNT, "Albert", "Rammshtein", 26, 45, 8505));
        users.add(new User(++USER_COUNT, "Leonid", "Messourry", 33, 49, 5233));
        users.add(new User(++USER_COUNT, "Vilen", "Metalin", 38, 20, 1289));
    }

    @Override
    public List<User> getAllUser() {
        return users;
    }

    @Override
    public User createUser(User user) {
        users.add(user);
        return user;
    }

    @Override
    public void deleteUser(Integer userId) {
        users.stream().filter(user -> user.getId() == userId).forEach(users::remove);
    }

    private User updateUser(User updateUser, User user) {
        updateUser.setAge(user.getAge());
        updateUser.setSurname(user.getSurname());
        updateUser.setName(user.getName());
        updateUser.setLevel(user.getLevel());
        updateUser.setPoints(user.getPoints());

        return updateUser;
    }

    @Override
    public User updateUser(User user) {
        return users.stream()
                .filter(updateUser -> updateUser.getId() == user.getId())
                .map(updateUser -> updateUser(updateUser, user))
                .findFirst()
                .orElse(null);
    }

    @Override
    public User readUser(Integer userId) {
        return null;
    }

    @Override
    public List<User> index() { // чтение
        return users; // вместо users потом нужно указать бд
    }

    @Override
    public User show(int id) { // чтение
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public void save(User user) {
        user.setId(++USER_COUNT);
        users.add(user);
    }
}
