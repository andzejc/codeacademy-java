package lt.codeacademy.db;

import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        new Configuration().configure().buildSessionFactory();
    }
}
