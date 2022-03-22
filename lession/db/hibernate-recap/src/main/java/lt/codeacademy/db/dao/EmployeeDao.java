package lt.codeacademy.db.dao;

import lt.codeacademy.db.entity.EmployeeEntity;
import org.hibernate.Session;

public class EmployeeDao extends AbstractDao<EmployeeEntity> {

    public EmployeeDao(Session session) {
        super(session, EmployeeEntity.class);
    }
}
