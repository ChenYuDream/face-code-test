package org.jypj.dev.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池测试
 *
 * @author yu_chen
 * @create 2018-01-29 14:54
 **/
public class ThreadPoolTest {

    public static void main(String[] args) {
        ThreadFactory threadFactory = r -> {
            Thread thread = new Thread(r);
            thread.setName("线程a");
            return thread;
        };


        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 2, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5), threadFactory);
        for (int i = 0; i < 15; i++) {
            MyTask task = new MyTask(i);
            executor.execute(task);
            System.out.println("线程池中线程数目：" + executor.getPoolSize()
                    + "，队列中等待执行的任务数目：" + executor.getQueue().size()
                    + "，已执行完毕的任务数目：" + executor.getCompletedTaskCount());
        }
    }
}

class MyTask implements Runnable {

    private int taskNum;

    public MyTask(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        System.out.println("正在执行任务task=" + taskNum);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("任务task=" + taskNum + " 执行完毕");
    }
}