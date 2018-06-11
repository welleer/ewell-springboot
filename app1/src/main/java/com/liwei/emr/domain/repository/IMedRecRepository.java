package com.liwei.emr.domain.repository;

import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.infrastructure.entity.oracle.MedRec;

import java.util.List;

public interface IMedRecRepository {

    MedRec find(String clinic_no);

    /**
     * 修改MedRec对象
     * @param medRec
     * @return
     */
    public int update(MedRec medRec);

}
