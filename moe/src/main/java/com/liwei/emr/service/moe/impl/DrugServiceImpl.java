package com.liwei.emr.service.moe.impl;

import com.liwei.emr.service.TestService;
import com.liwei.emr.service.moe.DrugService;
import liwei.mapper.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DrugServiceImpl implements DrugService {
    @Resource
    PatientMapper patientMapper;
    @Override
    public Object searchDrug(Object o) {
        return patientMapper.selectAll();
    }
}
