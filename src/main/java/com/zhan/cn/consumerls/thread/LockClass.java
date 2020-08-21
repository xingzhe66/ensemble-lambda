package com.zhan.cn.consumerls.thread;

import lombok.Data;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author sir
 * 18:30
 * 境由心生,事在人为
 */



public class LockClass {




    public static void main(String[] args) {


            SampleClas sampleClas = new SampleClas();
        for (int i = 0; i < 5; i++) {
            new Thread(sampleClas,"线程-" + i).start();
            new Thread(sampleClas,"线程-" + i).interrupt();

        }




    }


}
