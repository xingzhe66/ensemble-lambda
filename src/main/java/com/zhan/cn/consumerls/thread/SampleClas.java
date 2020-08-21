package com.zhan.cn.consumerls.thread;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sir
 * 8:51
 * 境由心生,事在人为
 */

public class SampleClas implements Runnable {

    ReentrantLock reentrantLock = new ReentrantLock();
    private int a = 5;

    @Override
    public void run() {


        this.action();



    }

    private  void action() {

   try {

       for (int i = 0; i < 1; i++) {
           reentrantLock.lock();
           while (this.a > 0) {
            // 这是一个循环，所以一次就执行完了，需要执行一次就释放一次锁
               System.out.println(Thread.currentThread().getName());
               System.out.println(Thread.currentThread().getName() + "开始执行" + ";执行结果 a = " + this.a--);

               reentrantLock.unlock();
               if(a==1){
                   break;

               }
           }


       }
   }catch (Exception e){


   }finally {
       Thread.interrupted();
   }



    }
}
