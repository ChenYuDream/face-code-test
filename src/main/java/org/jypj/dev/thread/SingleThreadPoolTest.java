package org.jypj.dev.thread;

import java.util.concurrent.*;

/**
 * 线程池测试
 *
 * @author yu_chen
 * @create 2018-01-29 14:54
 **/
public class SingleThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 15; i++) {
            MyTask task = new MyTask(i);
            executorService.execute(task);
        }
    }
}

