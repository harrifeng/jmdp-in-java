package org.hfeng.misc.intw02;

public class PrinterThread extends Thread {
    private final int number;
    private Sequence sequence;

    public PrinterThread(int number, Sequence sequence) {
        this.number = number;
        this.sequence = sequence;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sequence.getMyTurn(number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
