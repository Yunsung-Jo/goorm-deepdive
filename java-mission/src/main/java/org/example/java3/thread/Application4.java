package org.example.java3.thread;

// 두 개의 스레드를 생성하여 동시에 실행하기
public class Application4 {
    public static void main(String[] args) {
        ThreadTest test1 = new ThreadTest(1);
        ThreadTest test2 = new ThreadTest(2);
        test1.start();
        test2.start();
    }
}
