package com.zhan.cn.consumerls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.RouteLocator;
import org.springframework.cloud.netflix.zuul.filters.SimpleRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author sir
 * 10:43
 * 境由心生,事在人为
 */
public class TestClass {

    @Autowired
    private RedisTemplate redisTemplate;

    class Myrunnable implements Runnable {
        private int a;

        public Myrunnable(int a) {
            this.a = a;

        }

        @Override
        public void run() {
            System.out.println("第" + a + "线程开始执行" + new Date());
        }
    }

    public static void main(String[] args) {



    }


    public void test() {
        ThreadPoolExecutor th = new ThreadPoolExecutor(3, 5, 2, TimeUnit.SECONDS
                , new ArrayBlockingQueue<>(2), new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 5; i++) {
            Runnable run = new Myrunnable(i);

            th.execute(run);
        }

        th.shutdown();
        if(th.isTerminated()) {
            System.out.println("thread finished !!!");
        }
    }

}
