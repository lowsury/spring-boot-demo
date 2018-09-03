package com.demo.user.service.ctrl;

import com.demo.user.service.service.imp.UserService;
import com.demo.user.api.UserApi;
import com.demo.user.api.dto.ActionResponse;
import com.demo.user.api.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lowsury on 2018/9/3.
 */
@RestController
public class UserServiceCtrl implements UserApi {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    @Override
    public ActionResponse<UserDTO> getById(@RequestBody UserDTO user) {
        return new ActionResponse(userService.queryById(user));
    }
}
