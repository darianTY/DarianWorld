package cn.darian.service;

import cn.darian.domain.User;

import java.util.List;

//用户管理业务接口
public interface UserService {
    //查询所有用户
    public List<User> findAll();
}
