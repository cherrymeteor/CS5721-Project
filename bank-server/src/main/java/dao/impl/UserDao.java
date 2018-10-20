package dao.impl;

import dao.IUserDao;
import entity.UserEntity;
import model.UserStaffEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtils;

import java.util.List;

public class UserDao implements IUserDao {
    private static UserDao instance = null;
    Session session = HibernateUtils.getSessionFactory().openSession();

    public static UserDao getInstance() {
        if (instance == null) {
            return new UserDao();
        }
        return instance;
    }
    /*
    public UserEntity LoginCustomerByUsername(String username, String password) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from UserEntity where username=? and password=?");
        query.setParameter(0, username).setParameter(1, password);
        query.setMaxResults(1);
        UserEntity result = (UserEntity) query.uniqueResult();
        return result;
    }
    */

    public List<UserEntity> getUser() {
        try {

            // All the action with DB via Hibernate
            // must be located in one transaction.
            // Start Transaction.
            session.getTransaction().begin();

            // Create an HQL statement, query the object.
            // Equivalent to the SQL statement:
            String hql ="from UserEntity u ";

            // Create Query object.
            Query query = session.createQuery(hql);


            // Execute query.
            List list = query.getResultList();

            // Commit data.
            session.getTransaction().commit();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        }
    }

    public model.UserEntity LoginCustomerByUsername(String username, String password) {
        return null;
    }
}
