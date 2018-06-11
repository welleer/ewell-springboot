package com.liwei.emr.application.service.impl;

import com.liwei.emr.application.service.IMedRecService;
import com.liwei.emr.application.service.IPatientService;
import com.liwei.emr.domain.repository.IMedRecRepository;
import com.liwei.emr.domain.repository.IPatientRepository;
import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MedRecServiceImpl implements IMedRecService {

    @Autowired
    IMedRecRepository medRecRepository;

    @Override
    public MedRec find(String clinic_no) {
        return medRecRepository.find(clinic_no);
    }

    @Override
    public int update(MedRec medRec) {
        medRecRepository.update(medRec);
        return 0;
    }
}
