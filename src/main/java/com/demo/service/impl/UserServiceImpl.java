package com.demo.service.impl;

import com.demo.domain.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: fanyao
 * @Date: 2019/3/21 11:11
 * @Description:
 */
@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User selectById(Long id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public void saveUser(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void saveUserList(List<User> userList) {
        userMapper.insertList(userList);
    }
}
