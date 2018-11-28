package com.server.remote.user;

import com.common.user.viewobject.UserBasicInfoVo;
import com.server.core.request.RequestEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("common-server")
public interface UserRemote {

    @RequestMapping(value = "/user/accountExistCheck",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object accountExistCheck(RequestEntity<UserBasicInfoVo> commonRequestEntity);
}
