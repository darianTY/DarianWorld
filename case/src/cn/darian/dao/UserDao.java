package cn.darian.dao;

import cn.darian.domain.User;

import java.util.List;

//用户操作的Dao
public interface UserDao {
    public List<User> findAll();
}
