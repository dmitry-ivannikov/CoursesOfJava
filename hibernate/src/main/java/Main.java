

import Models.Product;
import Models.ProductCategory;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;


public class Main {

   // private Logger logger = Logger.getInstance(Main.class);

        public static void main(String[] args) {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
 //          List<Object> products = null;
           List<Object []> products = null;
            try {
                session.beginTransaction();

                SQLQuery queryUpdate = session.createSQLQuery("UPDATE product SET title = :? WHERE id = :?");
                queryUpdate.setParameter(0, "asdasd");
                queryUpdate.setParameter(1, "1");
                queryUpdate.executeUpdate();


                SQLQuery querySelect = session.createSQLQuery("SELECT {p.*}, {pc.*} FROM product p INNER JOIN product_category pc ON p.product_category_id = pc.id");
                querySelect.addEntity("p", Product.class);
                querySelect.addJoin("pc", "p.productCategory");

                products = querySelect.list();



                session.getTransaction().commit();
            }catch (Exception e){
                session.getTransaction().rollback();
                e.printStackTrace();
            }finally {
                session.close();
                sessionFactory.close();
            }


            for (Object [] obj : products){
                System.out.println(obj[0].toString() + ((ProductCategory) obj[1]).getTitle());
            }

        }
}
