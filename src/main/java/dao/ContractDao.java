package dao;

import entities.Contract;

import javax.persistence.EntityManager;

public class ContractDao extends AbstractEntityDao<Contract,Integer> {
    public ContractDao(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Contract> getClassType() {
        return Contract.class;
    }
}
