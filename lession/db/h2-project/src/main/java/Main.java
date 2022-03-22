import org.hibernate.Session;
import utils.Author;
import utils.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        // Create user
        Author author = new Author();
        session.save(author);

        session.getTransaction().commit();
        session.close();
        HibernateUtil.close();
    }
}
