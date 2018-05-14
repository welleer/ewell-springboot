package com.ewell.emr.infrastructure.dao.oracle;

import org.apache.ibatis.annotations.Mapper;


public class PatientProvider {

    public String findAll() {
        return "select * from Patient";
    }

}