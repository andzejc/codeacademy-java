package codeacademy;

import entity.Darbuotojas;
import entity.Users;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
//        Users user1 = session.get(Users.class, 1005L);
//        System.out.println(user1);
//        Objekto issaugojimas i DB.
        Users user = Users.builder().username("Jonas").userPassword("1234").email("jonas@gmal.com").build();
        session.save(user);


//        Atspausdinam visa lista useriu
//        Query<Users> query = session.createQuery("FROM Users", Users.class);
//        List<Users> list = query.list();
//        list.forEach(System.out::println);

//        atnaujiname irasa pagal id
//        Query<Users> query2 = session.createQuery("update Users set username =:newName WHERE id =:id");
//        query2.setParameter("newName", "Petras");
//        query2.setParameter("id", 101L);
//        query2.executeUpdate();

//        Darbuotojas darbuotojas = new Darbuotojas();

        session.getTransaction().commit();
        session.close();
        System.out.println(user.getId());

//        user.setUsername("Andrius");
//
//
        Session session2 = HibernateUtil.getSessionFactory().openSession();
        session2.getTransaction().begin();
        session2.delete(session2.get(Users.class, 114L));
        session2.refresh(user);
//        session2.saveOrUpdate(user);
        session2.getTransaction().commit();
        session2.close();

        System.out.println("new user: " + user);


//        Po issaugojimo objekto id yra suteikiamas automatiskai
//        System.out.println("-----------------------");
//        System.out.println("userId: " + user.getId());
    }
}
