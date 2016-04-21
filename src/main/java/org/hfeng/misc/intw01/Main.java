package org.hfeng.misc.intw01;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter(0);
        new AddThread(c).start();
        new MinusThread(c).start();

    }
}
