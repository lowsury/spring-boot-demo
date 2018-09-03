package com.demo.user.api;

import com.demo.user.api.dto.ActionResponse;
import com.demo.user.api.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lowsury on 2018/9/3.
 */
@FeignClient("demo-user-service")
public interface UserApi {
    @RequestMapping(value = "/query")
    ActionResponse<UserDTO> getById(@RequestBody UserDTO cardBin);
}
