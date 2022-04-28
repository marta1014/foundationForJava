package com.Thread_safe;

public class ThreadSafeDemo {
    public static void main(String[] args) {
        Account account = new Account("89757",10000.00);

        new DrewMoneyThread(account,"admin").start();
        new DrewMoneyThread(account,"user").start();
    }
}

class DrewMoneyThread extends Thread {
    private Account acc;
    public DrewMoneyThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        acc.DrewMoney(10000.00);
    }
}
