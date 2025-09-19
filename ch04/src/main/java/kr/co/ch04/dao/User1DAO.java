package kr.co.ch04.dao;

import kr.co.ch04.dto.User1DTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Component
public class User1DAO {

    private final JdbcTemplate jdbcTemplate;

    public void insert(User1DTO user1DTO) {

        String sql="INSERT INTO USER1 VALUES (?,?,?,?)";
        Object[] params ={
                user1DTO.getUSER_ID(),
                user1DTO.getUSER_NAME(),
                user1DTO.getBIRTH_DATE(),
                user1DTO.getUSER_AGE()
        };
        jdbcTemplate.update(sql,params);
    }

    public User1DTO select(String uid){
        String sql="SELECT * FROM USER1 WHERE USER_ID=?";

        return User1DTO=jdbcTemplate.queryForObject(sql,new User1RowMapper(),uid);
        ;
    }
    public List<User1DTO> selectAll(){
        String sql="SELECT * FROM USER1";
        return jdbcTemplate.query(sql,new User1RowMapper());
    }
    public void update(User1DTO user1DTO){
        String sql = "UPDATE USER1 SET USER_NAME=?,USER_AGE=? WHERE USER_ID=?";

        Object[] params ={
                user1DTO.getUSER_NAME(),
                user1DTO.getBIRTH_DATE(),
                user1DTO.getUSER_AGE(),
                user1DTO.getUSER_ID()

        };
        jdbcTemplate.update(sql,params);
    }
    public void delete(String uid){
        String sql="DELETE FROM USER1 WHERE USER_ID=?";
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
    }
}

