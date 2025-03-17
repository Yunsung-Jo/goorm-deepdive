package org.example.aop_transaction;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void addUser(UserDTO userDTO) {
        // 롤백 테스트를 위해 추가 후 오류 발생
        userDAO.insertUser(userDTO);
        System.out.println("추가된 유저: " + userDTO);
        if (userDTO.getId() < 0) {
            throw new IllegalArgumentException("잘못된 id 입니다.");
        }
    }

    public List<UserDTO> getAllUsers() {
        return userDAO.getAllUsers();
    }

    public void deleteUser(int id) {
        // 롤백 테스트를 위해 삭제 후 오류 발생
        userDAO.deleteUser(id);
        if (id < 0) {
            throw new IllegalArgumentException("잘못된 id 입니다.");
        }
    }
}
