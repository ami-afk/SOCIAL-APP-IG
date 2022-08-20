package ir.saman.socia.service;

import ir.saman.socia.model.Entity;
import ir.saman.socia.model.dao.Dao;

import java.util.Comparator;

public class IdGenerator<T extends Entity> {

    private Dao<T> dao;

    public IdGenerator(Dao<T> dao) {
        this.dao = dao;
    }

    public long getNextId() {
        Long lastPersistedId = dao.getAll().stream()
                .map(Entity::getId)
                .sorted(Comparator.reverseOrder())
                .findFirst()
                .orElse(0L);

        return lastPersistedId++;
    }

}
