package lt.codeacademy.db;

import lt.codeacademy.db.dao.EmployeeDao;
import lt.codeacademy.db.entity.EmployeeEntity;
import lt.codeacademy.db.entity.report.EmployeeCitiesReport;
import lt.codeacademy.db.helper.DaoManager;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Optional;

public class DaoExample {

    private static EmployeeDao employeeDao = null;

    public static void main(String[] args) {
        // service layer
        try (Session session = DaoManager.getSession()) {
            employeeDao = new EmployeeDao(session);
            createNewEmployee(session);
            updateCurrentEmployee(session);
            deleteCurrentEmployee(session);

            System.out.println(employeeDao.getByName("Alma"));

            callReport(session);
        }
    }

    private static void callReport(Session session) {
        Query<EmployeeCitiesReport> query = session.createQuery("from EmployeeCitiesReport", EmployeeCitiesReport.class);
        List<EmployeeCitiesReport> result = query.list();

        result.forEach(System.out::println);
    }

    private static void createNewEmployee(Session session) {
        EmployeeEntity employee = EmployeeEntity.builder()
                .name("Alma")
                .surname("Almanaite")
                .email("a@alma.lt")
                .build();
        employeeDao.saveOrUpdate(employee);
    }

    private static void updateCurrentEmployee(Session session) {
        Optional<EmployeeEntity> employee = new EmployeeDao(session).findById(2L);

        if (employee.isPresent()) {
            employee.get().setName("Edited");

            employeeDao.saveOrUpdate(employee.get());
        }
    }

    private static void deleteCurrentEmployee(Session session) {
        employeeDao.delete(1L);
    }
}
