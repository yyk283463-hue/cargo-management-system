package com.example.cargo.service;

import com.example.cargo.entity.User;
import com.example.cargo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务逻辑层
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> list() {
        return userMapper.selectList(null);
    }

    public User getById(Integer id) {
        return userMapper.selectById(id);
    }

    public boolean add(User user) {
        return userMapper.insert(user) > 0;
    }

    public boolean update(User user) {
        return userMapper.updateById(user) > 0;
    }

    public boolean delete(Integer id) {
        return userMapper.deleteById(id) > 0;
    }
}
