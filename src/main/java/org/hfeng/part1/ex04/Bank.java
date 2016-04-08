package org.hfeng.part1.ex04;

public class Bank {
    private int money;
    private String name;
    public Bank(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void deposit(int m) {
        money += m;
    }

    public boolean withdraw(int m) {
        if (money >= m) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            money -= m;
            check();
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    private void check() {
        if (money < 0) {
            System.out.println("Money is not Positive now! money = " + money);
        }
    }

}
