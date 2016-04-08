package org.hfeng.part1.ex02;

public class Main {
    public static void main(String[] args) {
        ////////////////////////////////////////////////////////
        // Thread implements Runable                          //
        // PrintThread also implements Runable                //
        // So Thread and PrintThread are the same level       //
        // However, only Thread class has the start function  //
        // So, you have to instance a Thread with PrintThread //
        ////////////////////////////////////////////////////////
        new Thread(new PrintThread("Good!")).start();
        new Thread(new PrintThread("Nice!")).start();
    }
}
