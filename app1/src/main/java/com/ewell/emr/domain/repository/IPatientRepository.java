package com.ewell.emr.domain.repository;

import com.ewell.emr.infrastructure.entity.oracle.Patient;

import java.util.List;

public interface IPatientRepository {

    List<Patient> findAll();
}
