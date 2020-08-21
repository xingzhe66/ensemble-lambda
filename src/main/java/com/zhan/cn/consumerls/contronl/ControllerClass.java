package com.zhan.cn.consumerls.contronl;


import com.zhan.cn.consumerls.ILsRead;
import com.zhan.cn.consumerls.in.LsIn;
import com.zhan.cn.consumerls.rpc.IRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.RequestContext;

@Component
@RestController
public class ControllerClass implements ILsRead {

    @Autowired
    private IRpc iRpc;
    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    @RequestMapping(value= READ_BOOK)
    public void  runService() {

//
//        LsIn in = new LsIn();
//        int a=0;
//        for (int i = 0; i <10 ; i++) {
//
//            in.setNum(i);
//            iRpc.getStr(in);
//        }
//        return "sucess";

        redisTemplate.opsForValue().setIfAbsent("sunlonglong","matingting");



    }

}
