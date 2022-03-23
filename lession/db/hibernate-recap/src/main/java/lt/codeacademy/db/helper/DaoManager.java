package lt.codeacademy.db.helper;

import lt.codeacademy.db.entity.CityEntity;
import lt.codeacademy.db.entity.EmployeeEntity;
import lt.codeacademy.db.entity.EmployeeTypeEntity;
import lt.codeacademy.db.entity.report.EmployeeCitiesReport;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DaoManager {

    private static SessionFactory getSessionFactory() {
        Configuration cfg = HibernateHelper.initPostgresConfig();
        cfg.addAnnotatedClass(EmployeeEntity.class);
        cfg.addAnnotatedClass(EmployeeTypeEntity.class);
        cfg.addAnnotatedClass(CityEntity.class);
        cfg.addAnnotatedClass(EmployeeCitiesReport.class);

        return cfg.buildSessionFactory();
    }

    public static Session getSession() {
        return getSessionFactory().openSession();
    }
}
