package org.hfeng.part1.ex04;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("ICBC", 100);
        new Thread(new WithdrawThread(bank, 90)).start();
        new Thread(new WithdrawThread(bank, 90)).start();
    }
}
