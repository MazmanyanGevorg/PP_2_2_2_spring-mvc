package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoEMImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUser() { // возвращает список всех users
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class); //"from User"
        return query.getResultList();
    }

    @Override
    @Transactional
    public User createUser(User user) { // создаёт/добавляет user
        entityManager.persist(user);
        return entityManager.merge(user);
    }

    @Override
    @Transactional
    public void deleteUser(Integer userId) { // удаляет user
        User user = readUser(userId);
        entityManager.remove(user);
    }

    @Override
    @Transactional
    public User updateUser(User user) { // обновление таблицы users
        return entityManager.merge(user);
    }

    @Override
    public User readUser(Integer userId) { // показать user по id
        return entityManager.find(User.class, userId);
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
