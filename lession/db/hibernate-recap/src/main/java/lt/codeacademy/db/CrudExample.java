package lt.codeacademy.db;

import lt.codeacademy.db.entity.EmployeeEntity;
import lt.codeacademy.db.helper.DaoManager;
import org.hibernate.Session;

public class CrudExample {

    public static void main(String[] args) {
        Session session = DaoManager.getSession();

        createNewEmployee(session);
        createNewEmployee(session);
    }

    private static void createNewEmployee(Session session) {
        try {
            EmployeeEntity employee = EmployeeEntity.builder()
                    .name("Vladas")
                    .build();
            session.save(employee);
        } finally {
            session.close();
        }
    }

}
