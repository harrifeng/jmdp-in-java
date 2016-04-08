package org.hfeng.part1.ex04;

public class WithdrawThread implements Runnable {
    private Bank bank;
    private int money;

    public WithdrawThread(Bank bank, int money) {
        this.bank = bank;
        this.money = money;
    }

    @Override
    public void run() {
        this.bank.withdraw(this.money);
    }
}
