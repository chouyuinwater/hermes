package com.fish.hermes;

import java.util.concurrent.*;

public class ThreadPoolUtil {
    private static ThreadPoolExecutor threadPoolExecutor;

    static {
        ThreadFactory threadFactory = r -> new Thread(r, "thread_pool_util_" + System.currentTimeMillis());
        threadPoolExecutor = new ThreadPoolExecutor(
                5,
                10,
                1000,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(),
                threadFactory
        );
    }

    /**
     * 任务提交时，如果核心线程数未满则新建核心线程
     * 创建核心线程时使用CAS增加线程数实现
     * @param args
     */
    public static void main(String[] args) {
        try {
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "is running"));
            Thread.sleep(1000);
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "is running"));
            Thread.sleep(1000);
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "is running"));
            Thread.sleep(1000);
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "is running"));
            Thread.sleep(1000);
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "is running"));
            Thread.sleep(1000);
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "is running"));
            Thread.sleep(1000);
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "is running"));
            Thread.sleep(1000);
            threadPoolExecutor.execute(() -> System.out.println(Thread.currentThread().getName() + "is running"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void create4Pool() {
        Executors.newCachedThreadPool();
        Executors.newFixedThreadPool(1);
        Executors.newSingleThreadExecutor();
        Executors.newScheduledThreadPool(1);
    }
}
