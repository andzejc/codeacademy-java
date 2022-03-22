package lt.codeacademy.db.dao;

import lombok.RequiredArgsConstructor;
import lt.codeacademy.db.entity.EmployeeEntity;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class EmployeeDao {

    private final Session session;

    public List<EmployeeEntity> findAll() {
        return session
                .createQuery("FROM EmployeeEntity", EmployeeEntity.class)
                .getResultList();
    }

    public void saveOrUpdate(EmployeeEntity employee) {
        session.saveOrUpdate(employee);
    }

    public Optional<EmployeeEntity> findById(long id) {
        return Optional.ofNullable(session.get(EmployeeEntity.class, id));
    }

    public void delete(long id) {
        session.beginTransaction();
        findById(id).ifPresent(session::delete);
        session.getTransaction().commit();
    }
}
