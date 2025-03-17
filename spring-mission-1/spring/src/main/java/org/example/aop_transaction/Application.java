package org.example.aop_transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @Transactional 사용하지 않고 AOP를 사용한 트랜잭션 관리 구현하기
public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("org.example.aop_transaction");

        UserService userService = context.getBean(UserService.class);

        userService.addUser(new UserDTO(1, "홍길동")); // 추가
        System.out.println(userService.getAllUsers());

        try {
            userService.addUser(new UserDTO(-1, "이순신")); // 오류가 발생하여 추가되지 않는다.
        } catch (Exception e) {}
        System.out.println(userService.getAllUsers());

        userService.addUser(new UserDTO(2, "스프링")); // 추가
        System.out.println(userService.getAllUsers());

        try {
            userService.deleteUser(-1); // 오류가 발생하여 삭제되지 않는다.
        } catch (Exception e) {}
        System.out.println(userService.getAllUsers());

        userService.deleteUser(1); // 삭제
        System.out.println(userService.getAllUsers());
    }
}
