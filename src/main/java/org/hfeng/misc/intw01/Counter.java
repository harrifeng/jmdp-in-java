package org.hfeng.misc.intw01;


public class Counter {
    private int counter;

    public Counter(int counter) {
        this.counter = counter;
    }

    public synchronized void increaseOne() {
        counter++;
    }

    public synchronized void decreaseOne() {
        counter--;
    }

    public synchronized void display() {
        System.out.println("count is now :" + counter);
    }
}
