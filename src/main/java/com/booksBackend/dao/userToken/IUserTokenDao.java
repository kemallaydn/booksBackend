package com.booksBackend.dao.userToken;

import com.booksBackend.dao.IBaseDao;
import com.booksBackend.entity.UserToken;

public interface IUserTokenDao extends IBaseDao {
    public abstract void save(UserToken token);
}
