

import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class Main {

   // private Logger logger = Logger.getInstance(Main.class);

        public static void main(String[] args) {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();

            try {
                session.beginTransaction();
                session.getTransaction().commit();
            }catch (Exception e){
                session.getTransaction().rollback();
                e.printStackTrace();
            }finally {
                session.close();
                sessionFactory.close();
            }

            sessionFactory.close();
        }
}
