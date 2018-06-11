package com.liwei.emr.application.service.impl;

import com.liwei.emr.application.service.IPrescriptionService;
import com.liwei.emr.domain.repository.IPrescriptionRepository;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PrescriptionServiceImpl implements IPrescriptionService {

    @Autowired
    IPrescriptionRepository PrescriptionRepository;

    @Override
    public List<Prescription> query(String clinicno) {
        return PrescriptionRepository.query(clinicno);
    }

    @Override
    public List<Prescription> queryList(Prescription prescription) {
        return PrescriptionRepository.queryList(prescription);
    }

    @Override
    public int updatePresc(List<Prescription> list, String clinicno) {
        return PrescriptionRepository.updatePresc(list,clinicno);
    }
}
