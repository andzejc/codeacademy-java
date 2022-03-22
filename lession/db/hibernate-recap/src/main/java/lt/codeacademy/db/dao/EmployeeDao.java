package lt.codeacademy.db.dao;

import lt.codeacademy.db.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class EmployeeDao extends AbstractDao<EmployeeEntity> {

    public EmployeeDao(Session session) {
        super(session, EmployeeEntity.class);
    }


    public EmployeeEntity getByName(String name) {
        Query<EmployeeEntity> entityQuery = session.createQuery("FROM EmployeeEntity WHERE name = :name", EmployeeEntity.class);
        entityQuery.setParameter("name", name);
        return entityQuery.getResultList().get(0);
    }


}
