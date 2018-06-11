package com.liwei.emr.application.service.impl;

import com.liwei.emr.application.service.IPatientService;
import com.liwei.emr.domain.repository.IPatientRepository;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    IPatientRepository patientRepository;

    @Override
    public List<Patient> findAll() {
        return patientRepository.queryList(new Patient());
    }
    @Override
    public List<Patient> findByStatus(String status) {
        Patient patient = new Patient();
        patient.setStatus(status);
        return patientRepository.queryList(patient);
    }

    @Override
    public List<Patient> findByStatus(String status, int start, int end) {
        Patient patient = new Patient();
        patient.setStatus(status);
        return patientRepository.queryPageList(patient,start,end);
    }

    @Override
    public int countByStatus(String status) {
        Patient patient = new Patient();
        patient.setStatus(status);
        return patientRepository.count(patient);
    }

    @Override
    public int cliniced(String clinic_no) {
        Patient patient = new Patient();
        patient.setClinic_no(clinic_no);
        patient.setStatus("1");
        return patientRepository.update(patient);
    }

    @Override
    public Patient queryById(String clinic_no) {
        return patientRepository.query(clinic_no);
    }
}
