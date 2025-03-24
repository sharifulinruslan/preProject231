package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> listUsers();

    public void saveUser(User user);

    public void deleteUser(int id);

    public User getUserById(int id);

    public void updateUser(User user);
}
