package repositories;

import entities._BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class _BaseRepositoryImpl <T extends _BaseEntity> implements _BaseRepository<T>{
    protected List<T> entities = new ArrayList<>();

    @Override
    public void Create(T entity) {
        entities.add(entity);
    }

    @Override
    public List<T> ReadAll() {
        return entities;
    }

    @Override
    public void Update(T entity) {
        entities.removeIf(item -> item.getId() == entity.getId());
        entities.add(entity);

    }

    @Override
    public void DeleteByName(T entity) {
        entities.removeIf(item -> item.getId() == entity.getId());

    }

    @Override
    public void DeleteById(int id) {
        entities.removeIf(item -> item.getId() == id);

    }
}
