package com.ewell.emr.infrastructure.dao.mysql;

import com.ewell.emr.infrastructure.entity.mysql.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
public class UserProvider {

    public String findUserById() {

        return "select * from Users where id = 1";
    }

}