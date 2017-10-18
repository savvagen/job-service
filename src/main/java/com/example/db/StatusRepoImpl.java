package com.example.db;

import com.example.entity.Status;
import com.example.mapper.StatusMapper;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StatusRepoImpl implements StatusRepo{

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public StatusRepoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Status> findAll() {
        String sql = "SELECT * FROM status";
        return jdbcTemplate.query(sql, new StatusMapper());
    }

    @Override
    public Status findOne(int id) {
        String sql = "SELECT * FROM status WHERE status_id=?";
        return jdbcTemplate.queryForObject(sql, new StatusMapper(), id);
    }
}
