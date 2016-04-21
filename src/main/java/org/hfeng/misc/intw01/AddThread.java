package org.hfeng.misc.intw01;


public class AddThread extends Thread {
    private Counter counter;

    public AddThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            counter.increaseOne();
            counter.display();
        }

    }
}
