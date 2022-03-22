package lt.codeacademy.db.dao;

import lombok.RequiredArgsConstructor;
import lt.codeacademy.db.entity.EmployeeEntity;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class AbstractDao<T> {

    private final Session session;
    private final Class<T> entityClass;

    public List<T> findAll() {
        return session
                .createQuery("FROM " + entityClass.getName(), entityClass)
                .getResultList();
    }

    public void saveOrUpdate(T employee) {
        session.saveOrUpdate(employee);
    }

    public Optional<T> findById(long id) {
        return Optional.ofNullable(session.get(entityClass, id));
    }

    public void delete(long id) {
        session.beginTransaction();
        findById(id).ifPresent(session::delete);
        session.getTransaction().commit();
    }
}
