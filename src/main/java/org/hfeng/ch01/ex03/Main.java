package org.hfeng.ch01.ex03;

public class Main {
    public static void main(String[] args) {
        Gate gate = new Gate();

        new UserThread(gate, "Alice", "Alice").start();
        new UserThread(gate, "Bobby", "Bobby").start();
        new UserThread(gate, "Chris", "Chris").start();
    }
}
