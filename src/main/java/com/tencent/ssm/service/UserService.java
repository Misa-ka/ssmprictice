package com.tencent.ssm.service;

import com.tencent.ssm.mapper.UserMapper;
import com.tencent.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author misaka
 * @create 2022-07-2914:19
 */
@Service
public class UserService {
    @Autowired
    private UserMapper mapper;
    public List<User> getList(){
        return mapper.getList();
    }
}
