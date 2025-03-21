package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Component
public class UserService {
    @Autowired
    UserDAO userDAO;

    public List<User> listUsers() {
        return userDAO.listUsers();
    }
}
