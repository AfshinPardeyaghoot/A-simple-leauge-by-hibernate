package dao;

import entities.Stadium;

import javax.persistence.EntityManager;

public class StadiumDao extends AbstractEntityDao<Stadium,Integer> {

    public StadiumDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Stadium> getClassType() {
        return Stadium.class;
    }
}
