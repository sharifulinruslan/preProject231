package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UserDAO {
    @PersistenceContext
    EntityManager entityManager;

    public List<User> listUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
}
