package lt.codeacademy.db.helper;

import org.hibernate.cfg.Configuration;

public class HibernateHelper {

    public static Configuration initPostgresConfig() {
        Configuration cfg = new Configuration();
        cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost/postgres");
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        cfg.setProperty("hibernate.connection.username", System.getProperty("dbUser"));
        cfg.setProperty("hibernate.connection.password", System.getProperty("dbPass"));
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.hbm2ddl.auto", "create-drop");

        return cfg;
    }
}
