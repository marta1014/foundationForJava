package com.ThreadDemo1;

public class ThreadDemo1 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 33; i++) {
                System.out.println("子线程run" + i);
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程run " + i);
        }


    }
}
