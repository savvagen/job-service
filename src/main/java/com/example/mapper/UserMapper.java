package com.example.mapper;

import com.example.entity.User;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserMapper implements RowMapper<User> {


    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUser_id(resultSet.getInt("user_id"));
        user.setFirstname(resultSet.getString("firstname"));
        user.setLastname(resultSet.getString("lastname"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setTelephone(resultSet.getString("telephone"));
        user.setReg_date(resultSet.getTimestamp("reg_date"));
        user.setAge(resultSet.getInt("age"));
        return user;
    }
}
