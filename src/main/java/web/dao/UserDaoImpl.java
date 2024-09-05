package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public List<User> getAllUsers() {
        //return this.Users.stream().filter(user -> user.getDeleted() == 0).toList();
        return entityManager.createQuery("SELECT us FROM User us WHERE deleted=0", User.class).getResultList();
    }

    @Override
    public void updateUser(Long id, User user) {
        getUserById(id);
        entityManager.merge(user);
    }

    @Override
    public void deleteUserById(Long id) {
        getUserById(id).setDeleted(true);
    }



}
