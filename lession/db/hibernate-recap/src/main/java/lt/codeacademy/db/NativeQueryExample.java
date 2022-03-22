package lt.codeacademy.db;

import lt.codeacademy.db.entity.EmployeeEntity;
import lt.codeacademy.db.helper.DaoManager;
import org.hibernate.query.Query;
import org.hibernate.Session;

import java.util.List;

public class NativeQueryExample {

    public static void main(String[] args) {
        Session session = DaoManager.getSession();
        Query<EmployeeEntity> entityQuery =
                session.createNativeQuery("SELECT * FROM employee", EmployeeEntity.class);

        List<EmployeeEntity> employees = entityQuery.getResultList();
        employees.forEach(System.out::println);
    }
}
