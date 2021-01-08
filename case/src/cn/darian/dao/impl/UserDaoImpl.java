package cn.darian.dao.impl;

import cn.darian.dao.UserDao;
import cn.darian.domain.User;
import cn.darian.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private  UserDao dao=new UserDaoImpl();
    private  JdbcTemplate template=new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        //使用JDBC 操作数据库
            //定义sql
        String sql="select * from user";
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }
}
