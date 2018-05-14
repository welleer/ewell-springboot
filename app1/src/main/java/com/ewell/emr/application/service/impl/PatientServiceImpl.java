package com.ewell.emr.application.service.impl;

import com.ewell.emr.application.service.IPatientService;
import com.ewell.emr.domain.repository.IPatientRepository;
import com.ewell.emr.infrastructure.entity.oracle.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PatientServiceImpl implements IPatientService {

    @Autowired
    IPatientRepository patientRepository;

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
}
