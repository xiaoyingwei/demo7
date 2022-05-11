package com.xiaoyingwei.demo7.mapper;

import com.xiaoyingwei.demo7.bean.User;

import java.util.List;

/**
 * @author xiaoyingwei
 * @since 25/4/2022 下午3:51
 */

public interface UserMapper {
    public void addUser(User user);

    public List<User> getUser();
}
