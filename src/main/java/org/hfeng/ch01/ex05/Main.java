package org.hfeng.ch01.ex05;

public class Main {
    public static void main(String[] args) {
        Tool spoon = new Tool("spoon");
        Tool fork = new Tool("fork");

        new EaterThread("Alice", spoon, fork).start();
        new EaterThread("Bobby", spoon, fork).start();
    }
}
