package com.liwei.emr.application.service;

import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.infrastructure.entity.oracle.Patient;

import java.util.List;

public interface IPatientService {

    List<Patient> findAll();

    List<Patient> findByStatus(String type);

    List<Patient> findByStatus(String type,int start,int end);

    int countByStatus(String type);

    int cliniced(String clinic_no);

    Patient queryById(String clinic_no);
}
