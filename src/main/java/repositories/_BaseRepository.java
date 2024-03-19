package repositories;

import entities._BaseEntity;

import java.util.List;

public interface _BaseRepository <T extends _BaseEntity> {
    public void Create(T entity);
    public List<T> ReadAll();
    public void Update(T entity);
    public void DeleteByName(T entity);
    public void DeleteById(int id);
}
