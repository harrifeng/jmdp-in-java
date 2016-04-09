package org.hfeng.ch01.ex04;

public class EaterThread extends Thread {
    private String name;
    private final Tool leftHand;
    private final Tool rightHand;

    public EaterThread(String name, Tool leftHand, Tool rightHand) {
        this.name = name;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    public void eat() {
        synchronized (leftHand) {
            System.out.println(name + " takes up " + leftHand + " (left)");
            synchronized (rightHand) {
                System.out.println(name + " takes up " + rightHand + " (right)");
                System.out.println(name + " is eating now, yam yam !");
                System.out.println(name + " puts down " + rightHand + " (right)");
            }
            System.out.println(name + " puts down " + leftHand + " (left)");
        }
    }

    @Override
    public void run() {
        while (true) {
            eat();
        }
    }
}
