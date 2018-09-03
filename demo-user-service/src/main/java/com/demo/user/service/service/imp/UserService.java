package com.demo.user.service.service.imp;

import com.demo.user.service.domain.entity.User;
import com.demo.user.service.domain.mapper.UserMapper;
import com.demo.user.api.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lowsury on 2017/5/25.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public UserDTO queryById(UserDTO userDTO) {
        User user = userMapper.selectByPrimaryKey(userDTO.getId());
        return convertUserDto(user);
    }

    private UserDTO convertUserDto(User user) {
        if (user == null) return null;
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        return dto;
    }

}
