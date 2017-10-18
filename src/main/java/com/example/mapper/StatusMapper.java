package com.example.mapper;

import com.example.entity.Status;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StatusMapper implements RowMapper<Status> {


    @Override
    public Status mapRow(ResultSet resultSet, int i) throws SQLException {
        Status status = new Status();
        status.setStatus_id(resultSet.getInt("status_id"));
        status.setStatus(resultSet.getString("status"));
        return status;
    }
}
