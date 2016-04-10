package org.hfeng.ch05.ex02;

public class Main {
    public static void main(String[] args) {
        Table table = new Table(3);

        new MakerThread("MakerThread-1", table, 31415).start();
        new MakerThread("MakerThread-2", table, 92653).start();
        new MakerThread("MakerThread-3", table, 58979).start();
        new EaterThread("EaterThread-1", table, 32384).start();
        new ClearThread("ClearThread-1", table).start();
    }
}
