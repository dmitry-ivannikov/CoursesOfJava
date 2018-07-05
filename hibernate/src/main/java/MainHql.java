import Models.Product;
import Models.ProductCategory;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class MainHql {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
 //        List<Product> products = null; // hql

        try {
            session.beginTransaction();


            //Query query = session.createQuery("FROM Product as p INNER JOIN FETCH p.productCategory as pc");
            //query.setParameter("id", 1L);
            //products = query.list();
            Product product = new Product();
            session.delete(product);
           // session.save(product);
            //session.delete(product);



            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
            sessionFactory.close();
        }


//        for (Object [] obj : products){
//            System.out.println(obj[0].toString() + ((ProductCategory) obj[1]).getTitle());
//        }



//        for (Product obj : products){
//            System.out.println(obj.toString());
//        }

        /*
        From product; //from *
        from product p
        from product as p, ProductCategory as pc

        SELECT * FROM product p inner join Product_category pc ON p.product_category_id = pc.id

        FROM Product as p INNER JOIN FETCH p.productCategory as pc;
        */


    }
}
