package com.booksBackend.dao.user;

import com.booksBackend.dao.IBaseDao;
import com.booksBackend.entity.User;

public interface IUserDao extends IBaseDao {
    public abstract User save(User user);
    public abstract User getUser(String id);
}
