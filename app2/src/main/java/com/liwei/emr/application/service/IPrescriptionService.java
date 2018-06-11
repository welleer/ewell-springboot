package com.liwei.emr.application.service;

import com.liwei.emr.infrastructure.entity.oracle.Medicine;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;

import java.util.List;

public interface IPrescriptionService {

    List<Prescription> query(String clinicno);

    List<Prescription> queryList(Prescription prescription);

    int updatePresc(List<Prescription> list, String clinicno);

}
