package Conf1;

import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory2 = HibernateUtil.getSessionFactory();
    }
}
