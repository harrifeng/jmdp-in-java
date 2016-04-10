package org.hfeng.ch05.ex02;


public class ClearThread extends Thread {

    private final Table table;

    public ClearThread(String name, Table table) {
        super(name);
        this.table = table;

    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                table.clear();
                System.out.println("======" + getName() + " clears everything======");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
