package com.ewell.emr.infrastructure.dao.oracle;

import com.ewell.emr.infrastructure.entity.oracle.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;
@Mapper
public interface PatientMapper {
    //根据所有患者
    @SelectProvider(type = PatientProvider.class, method = "findAll")
    public List<Patient> findAll();

}