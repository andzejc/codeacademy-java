package lt.codeacademy.db;

import lt.codeacademy.db.helper.DaoManager;

public class App {
    public static void main(String[] args) {
        DaoManager.getSession();
    }
}
