package com.niulx;

import com.niulx.pre.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date 2019-07-01 20:45
 * @Created by nlx
 */
@Service("userService")
public class UserServiceImpl implements IUserService  {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> query() {
        List<User> users = userMapper.query();
        return users;
    }
}
