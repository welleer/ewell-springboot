package com.liwei.emr.application.service;

import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.infrastructure.entity.oracle.MedRec;

import java.util.List;

public interface IMedRecService {

    MedRec find(String clinic_no);

    int update(MedRec medRec);
}
