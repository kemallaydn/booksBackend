package com.booksBackend.dao.userToken;

import com.booksBackend.dao.BaseDao;
import com.booksBackend.entity.UserToken;
import jakarta.persistence.EntityManager;


public class UserTokenImpl extends BaseDao implements IUserTokenDao {

    @Override
    public void save(UserToken token) {
        EntityManager em = null;
        try {
            em=openTransactionalConnection();
            em.persist(token);
            commitTransaction(em);

        } catch (Exception ex) {
            rollbackTransaction(em);
            throw ex;
        } finally {
            closeConnection(em);
        }
    }
}
