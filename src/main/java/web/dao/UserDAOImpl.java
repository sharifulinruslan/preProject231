package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<User> listUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
}
