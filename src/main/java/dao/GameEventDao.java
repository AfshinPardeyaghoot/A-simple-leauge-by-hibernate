package dao;

import entities.GameEvent;

import javax.persistence.EntityManager;

public class GameEventDao extends AbstractEntityDao<GameEvent,Integer> {
    public GameEventDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<GameEvent> getClassType() {
        return GameEvent.class;
    }
}
