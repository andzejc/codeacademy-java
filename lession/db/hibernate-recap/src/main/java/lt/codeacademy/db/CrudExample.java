package lt.codeacademy.db;

import lt.codeacademy.db.dao.EmployeeDao;
import lt.codeacademy.db.entity.EmployeeEntity;
import lt.codeacademy.db.helper.DaoManager;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.Optional;

public class CrudExample {

    public static void main(String[] args) {
        try (Session session = DaoManager.getSession()) {
            createNewEmployee(session);
            updateCurrentEmployee(session);
            deleteCurrentEmployee(session);
        }
    }

    private static void createNewEmployee(Session session) {
        EmployeeEntity employee = EmployeeEntity.builder()
                .name("Vladas")
                .build();
        session.save(employee);
    }

    private static void updateCurrentEmployee(Session session) {
        session.beginTransaction();
        EmployeeDao employeeDao = new EmployeeDao(DaoManager.getSession());
        Optional<EmployeeEntity> employee = employeeDao.findAll().stream()
                .filter(empl -> empl.getName().equals("Antanas"))
                .findFirst();

        if (employee.isPresent()) {
            employee.get().setName("Antanas Updated");

            session.update(employee);
            session.getTransaction().commit();
        } else {
            session.getTransaction().rollback();
        }
    }

    private static void deleteCurrentEmployee(Session session) {
        session.beginTransaction();
        EmployeeEntity employee = session.get(EmployeeEntity.class, 1L);
        session.delete(employee);
        session.getTransaction().commit();
    }
}
