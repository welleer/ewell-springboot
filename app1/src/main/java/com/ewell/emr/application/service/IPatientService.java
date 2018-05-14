package com.ewell.emr.application.service;

import com.ewell.emr.infrastructure.entity.oracle.Patient;

import java.util.List;

public interface IPatientService {
    List<Patient> findAll();
}
