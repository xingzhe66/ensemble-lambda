package com.zhan.cn.consumerls.rpc;

import com.zhan.cn.consumerls.in.LsIn;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "provider-ls-a")
public interface IRpc {

    @PostMapping("/read/hard")
     String getStr(LsIn in);

}
