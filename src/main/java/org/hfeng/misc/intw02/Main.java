package org.hfeng.misc.intw02;

public class Main {
    public static void main(String[] args) {

        Sequence sequence = new Sequence(1, 2, 3, 4);
        new PrinterThread(1, sequence).start();
        new PrinterThread(2, sequence).start();
        new PrinterThread(3, sequence).start();
        new PrinterThread(4, sequence).start();
    }
}
