package lt.codeacademy.db;

import lt.codeacademy.db.entity.EmployeeEntity;
import lt.codeacademy.db.helper.DaoManager;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateQueryExample {

    public static void main(String[] args) {
        Session session = DaoManager.getSession();
        // naudoja java klases pavadinimus o ne db leneteles pavadinimus, compile check
        Query<EmployeeEntity> entityQuery =
                session.createQuery("FROM EmployeeEntity", EmployeeEntity.class);

        List<EmployeeEntity> employees = entityQuery.getResultList();
        employees.forEach(System.out::println);
    }
}
