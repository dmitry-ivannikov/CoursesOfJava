import Models.Order;
import Models.Product;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class MainCriteria {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Product> products = null;
        try {
            session.beginTransaction();

            Criteria criteria = session.createCriteria(Product.class, "product");
            criteria.createCriteria("product.productCategory.", "productCategory.");
            criteria.add(Restrictions.eq("product.title", "cat"));
            criteria.setResultTransformer(criteria.DISTINCT_ROOT_ENTITY);

            criteria.setProjection(Projections.distinct(Projections.property("product")));

            //criteria.add(Restrictions.between("price", 10, 20));
            //criteria.add(Restrictions.like("price", "zeNa"));
            //or
           // criteria.add(Restrictions.sqlRestriction("date > 2018-05-08"));
            //criteria.addOrder(org.hibernate.criterion.Order.desc("id"));
            products = criteria.list();


            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
            session.close();
            sessionFactory.close();
        }
        for (Product product: products){
            System.out.println(product.toString());
        }
    }
}
