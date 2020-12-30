package dao;

import entities.City;

import javax.persistence.EntityManager;

public class CityDao extends AbstractEntityDao<City, Integer> {
    public CityDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<City> getClassType() {
        return City.class;
    }
}
