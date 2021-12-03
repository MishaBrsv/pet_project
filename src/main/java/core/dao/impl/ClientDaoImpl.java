package core.dao.impl;

import core.dao.ClientDao;
import core.models.ClientDO;
import core.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDaoImpl implements ClientDao {
    @Override
    public ClientDO findById(Long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(ClientDO.class, id);
    }

    @Override
    public void save(ClientDO clientDO) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(clientDO);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(ClientDO clientDO) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(clientDO);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(ClientDO clientDO) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(clientDO);
        transaction.commit();
        session.close();
    }
}
