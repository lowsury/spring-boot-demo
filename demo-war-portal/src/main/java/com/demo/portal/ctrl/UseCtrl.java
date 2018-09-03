package com.demo.portal.ctrl;

import com.demo.user.api.UserApi;
import com.demo.user.api.dto.ActionResponse;
import com.demo.user.api.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lowsury on 2018/9/3.
 */
@RestController
@RequestMapping("/v0/user")
public class UseCtrl {
    public static final String BACK_DOOR_CODE = "_dev_yy_test_";
    private Logger LOGGER = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserApi userApi;

    @RequestMapping(value = "/query/{userId}", method = RequestMethod.GET)
    public ActionResponse<UserDTO> queryById(@PathVariable("userId") final Integer userId) {
        return userApi.getById(new UserDTO() {{
            setId(userId);
        }});
    }
}
