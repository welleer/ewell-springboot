package com.ewell.emr.infrastructure.dao.mysql;

import com.ewell.emr.infrastructure.entity.mysql.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

public interface UserMapper {
    //根据id查询用户的信息
    @SelectProvider(type = UserProvider.class, method = "findUserById")
    public User findUserById();

}