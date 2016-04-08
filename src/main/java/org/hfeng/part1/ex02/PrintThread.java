package org.hfeng.part1.ex02;

public class PrintThread implements Runnable {
    private String message;

    public PrintThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(message);
        }
    }
}
