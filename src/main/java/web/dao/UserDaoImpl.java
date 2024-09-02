package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    /*
    private EntityManager entityManager;

    @Autowired
    public UserDaoImpl (EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    */

    private static Long USER_ID = 0L;
    private List<User> Users;

    {
        Users = new ArrayList<>();
        Users.add(new User(++USER_ID, "Michael", 27, "mike@gmail.com"));
        Users.add(new User(++USER_ID, "Thomas", 38, "tommy@gmail.com"));
        Users.add(new User(++USER_ID, "Nikolay", 45, "niko@gmail.com"));
        Users.add(new User(++USER_ID, "Antonio", 51, "tony@gmail.com"));
        Users.add(new User(++USER_ID, "Robert", 60, "bob@gmail.com"));
    }


    @Override
    public void addUser(User user) {
        user.setId(++USER_ID);
        Users.add(user);
    }

    @Override
    public void deleteUserById(Long id) {
        Users.remove(getUserById(id));
    }

    @Override
    public void updateUser(Long id, User user) {
        User updatedUser = getUserById(id);
        updatedUser.setName(user.getName());
        updatedUser.setAge(user.getAge());
        updatedUser.setEmail(user.getEmail());
    }

    @Override
    public User getUserById(Long id) {
        return Users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return this.Users;
    }
}
