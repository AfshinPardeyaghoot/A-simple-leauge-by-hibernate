package dao;

import entities.User;
import javax.persistence.EntityManager;

public class UserDao extends AbstractEntityDao<User,Integer> {
    public UserDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<User> getClassType() {
        return User.class;
    }
}
