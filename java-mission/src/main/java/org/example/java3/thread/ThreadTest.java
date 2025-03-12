package org.example.java3.thread;

class ThreadTest extends Thread {
    private final int idx;

    ThreadTest(int idx) {
        this.idx = idx;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("스레드" + idx + "번 실행 중: " + i);
        }
        System.out.println("스레드" + idx + "번 종료");
    }
}
