package com.Thread_safe;

public class Account {
    private String ID;
    private double money;

    public Account() {
    }

    public Account(String ID, double money) {
        this.ID = ID;
        this.money = money;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public static void running() { // mock
        synchronized (Account.class) {}
    }


    @Override
    public String toString() {
        return "Account{" +
                "ID='" + ID + '\'' +
                ", money=" + money +
                '}';
    }
    // 同步方法实现锁对象 就是在方法加 synchronizedi修饰 =>  public synchronized void DrewMoney(double money) {}
    public void DrewMoney(double money) {
        String name = Thread.currentThread().getName();
        // 同步代码块
        // 锁对象 建议使用共享资源作为锁对象
        // 实例方法建议使用this
        // 静态方法建议使用字节码 类名.class 作为锁对象
        synchronized (this) {
            if(this.money >= money) {
                System.out.println(name + "钱吐出来 " + money);
                this.money -= money;
                System.out.println(name + "取钱后剩余money" + this.money);
            } else {
                System.out.println("余额不足！for " + name);
            }
        }
    }
}
