package org.example.java3.company;

// 직원 클래스와 관리자 클래스 작성하기
public class Application6 {
    public static void main(String[] args) {
        Manager manager1 = new Manager("홍길동");
        manager1.goToWork();
        manager1.job();
        manager1.leaveWork();

        Employee employee1 = new Manager("이순신");
        employee1.goToWork();
        employee1.job();
        employee1.leaveWork();
    }
}
