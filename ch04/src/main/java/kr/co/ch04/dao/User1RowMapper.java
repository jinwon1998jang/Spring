package kr.co.ch04.dao;

import kr.co.ch04.dto.User1DTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User1RowMapper implements RowMapper<User1DTO> {

    @Override
    public User1DTO mapRow(ResultSet rs, int rowNum) throws SQLException {

        User1DTO user=new User1DTO();
        user.setUSER_ID(rs.getString(1));
        user.setUSER_NAME(rs.getString(2));
        user.setBIRTH_DATE(rs.getString(3));
        user.setUSER_AGE(rs.getInt(4));

        return null;
    }
}
