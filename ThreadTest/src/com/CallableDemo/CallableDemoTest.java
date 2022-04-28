package com.CallableDemo;
// 多线程创建任务方式三
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableDemoTest {
    public static void main(String[] args) {
        // 2 创建 callabl任务对象
        Callable<String> callable1 = new MyCallAble(77);
        // 3 把callable任务对象 交给FutureTask对象
        FutureTask<String> f1 = new FutureTask<>(callable1);
        // FutureTask 对象实现了Runnable接口 可交给Thread
        // FutureTask 对象在线程执行完任务通过get方法得到任务执行结果
        Thread t1 = new Thread(f1);
        t1.setName("No.1线程");
        System.out.println(t1.getName());
        t1.start();
        /**
         * 常用api
         * getName(low) / setName(low) / CurrentThread / Thread.sleep(毫秒mm)
         */

        try {
           String result1 =  f1.get();
           System.out.println(result1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * 1 定义任务类 实现callable接口 重写call方法
 */
class MyCallAble implements Callable<String> {
    private int n;
    public MyCallAble(int n) {
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
            System.out.println(Thread.currentThread().getName() + i);
        }

        return "final result" + sum;
    }
}