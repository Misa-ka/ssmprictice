package com.tencent.ssm.mappers;

import com.tencent.ssm.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author misaka
 * @create 2022-07-2914:17
 */
@Mapper
public interface UserMapper{
    List<User> getList();
}
