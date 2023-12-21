package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUser();

    User createUser(User user);

    void deleteUser(Integer userId);

    User updateUser(User user);

    User readUser(Integer userId);

    public List<User> index();

    public User show(int id);

    public void save(User user);
}
/*
List<SomeEntity> entities = ...;

entities.forEach(entityManager::persist);

==================================
 EntityManagerFactory emf = Persistence.createEntityManagerFactory("TDEMSPU");
        em = emf.createEntityManager();


            em.getTransaction().begin();

        List<Enquiry> tempEnqList = tempEnqList();
        for (Iterator<Enquiry> it = tempEnqList.iterator(); it.hasNext();) {
            Enquiry enquiry = it.next();

            em.persist(enquiry);
            em.flush();
            em.clear();
        }

         em.getTransaction().commit();
 */