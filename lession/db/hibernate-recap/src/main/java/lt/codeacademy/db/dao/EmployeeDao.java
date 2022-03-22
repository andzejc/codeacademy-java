package lt.codeacademy.db.dao;

import lombok.RequiredArgsConstructor;
import lt.codeacademy.db.entity.EmployeeEntity;
import org.hibernate.Session;

import java.util.List;

@RequiredArgsConstructor
public class EmployeeDao {

    private final Session session;

    public List<EmployeeEntity> findAll() {
        return session
                .createQuery("FROM EmployeeEntity", EmployeeEntity.class)
                .getResultList();
    }
}
