package codeacademy;

import entity.Darbuotojas;
import entity.Irankis;
import org.hibernate.Session;

public class Runner {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

//       Darbuotojas darbuotojas = new Darbuotojas();
        Irankis irankis = Irankis.builder().irankis("perforatorius").irankio_id(3L).build();
//        Darbuotojas darbuotojas = Darbuotojas.builder().vardas("Antanas")
//                .irankis(irankis).build();
//        session.save(darbuotojas);
//        System.out.println(session.get(Darbuotojas.class, 1L));
        session.save(irankis);
        session.getTransaction().commit();
        session.close();
    }
}
