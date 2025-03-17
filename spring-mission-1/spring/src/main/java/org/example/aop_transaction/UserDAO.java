package org.example.aop_transaction;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insertUser(UserDTO userDTO) {
        String sql = "INSERT INTO users VALUES(?, ?)";
        jdbcTemplate.update(sql, userDTO.getId(), userDTO.getName());
    }

    public List<UserDTO> getAllUsers() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new UserDTO(rs.getInt("id"), rs.getString("name")));
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
