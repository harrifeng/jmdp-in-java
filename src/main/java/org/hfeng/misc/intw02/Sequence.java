package org.hfeng.misc.intw02;

public class Sequence {
    private int size = 4;
    private final int[] order = new int[4];
    private int pos = 0;

    public Sequence(int a, int b, int c, int d) {
        order[0] = a;
        order[1] = b;
        order[2] = c;
        order[3] = d;
    }

    public synchronized void getMyTurn(int printNum) throws InterruptedException {
        while (printNum != order[pos]) {
            wait();
        }
        System.out.println("Now printing:" + order[pos]);
        pos = (pos + 1) % size;
        notifyAll();
    }
}
