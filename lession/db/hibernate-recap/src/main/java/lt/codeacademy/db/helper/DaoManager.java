package lt.codeacademy.db.helper;

import lt.codeacademy.db.entity.EmployeeEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DaoManager {

    private static SessionFactory getSessionFactory() {
        Configuration cfg = HibernateHelper.initPostgresConfig();
        cfg.addAnnotatedClass(EmployeeEntity.class);

        return cfg.buildSessionFactory();
    }

    public static Session getSession() {
        return getSessionFactory().openSession();
    }
}
