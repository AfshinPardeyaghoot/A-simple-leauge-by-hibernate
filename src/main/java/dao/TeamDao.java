package dao;

import entities.Team;

import javax.persistence.EntityManager;

public class TeamDao extends AbstractEntityDao<Team,Integer> {
    public TeamDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Team> getClassType() {
        return Team.class;
    }
}
