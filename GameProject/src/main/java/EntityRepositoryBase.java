public interface EntityRepositoryBase<T>  {
    void add  (T entity);
    void update(T entity);
    void delete(T entity);
}
