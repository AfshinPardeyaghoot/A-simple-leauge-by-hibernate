package dao;

import entities.Game;

import javax.persistence.EntityManager;

public class GameDao extends AbstractEntityDao<Game,Integer> {
    public GameDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Game> getClassType() {
        return Game.class;
    }
}
