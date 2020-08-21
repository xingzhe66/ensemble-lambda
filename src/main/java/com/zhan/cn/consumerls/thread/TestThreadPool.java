package com.zhan.cn.consumerls.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TestThreadPool {

    public static void main(String[] args) {


        BlockingQueue<Runnable> queue =  new ArrayBlockingQueue<Runnable>(2);
        ThreadFactory factory = new MyFactory();
       // RejectedExecutionHandler handler = null;


        ThreadPoolExecutor pool =
                new ThreadPoolExecutor(3,3,10,TimeUnit.SECONDS,queue,factory);

        pool.prestartAllCoreThreads(); //预启动所有核心线程
        pool.execute(new MyThread("A"));


    }


}

class MyThread implements Runnable{
    private String name;

    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("线程："+i+"--"+name+"is Running");
        }
    }

}
class MyFactory implements ThreadFactory{

    private final AtomicInteger mac = new AtomicInteger(1);

    @Override
    public Thread newThread(Runnable r) {

        Thread th = new Thread(r,"my-thread"+mac.getAndIncrement()+"has be created");
        System.out.println(th.getName());
        System.out.println(mac.getAndIncrement());
        System.out.println(mac.decrementAndGet());
        return th;
    }
}
