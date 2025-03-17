package org.example.common_interface.aop;

public class Log {
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public void errorLog(Throwable exception) {
        System.out.println("[ERROR] 오류 발생!!" + exception);
    }
}
