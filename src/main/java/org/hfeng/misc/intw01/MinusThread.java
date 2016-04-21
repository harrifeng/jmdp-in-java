package org.hfeng.misc.intw01;

public class MinusThread extends Thread {
    private Counter counter;

    public MinusThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.decreaseOne();
            counter.display();
        }

    }
}
