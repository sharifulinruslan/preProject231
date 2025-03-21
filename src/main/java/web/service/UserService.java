package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> listUsers();

    public void saveUser(User user);

    public void deleteUser(int id);
}
