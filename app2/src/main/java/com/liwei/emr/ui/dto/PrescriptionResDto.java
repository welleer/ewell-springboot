package com.liwei.emr.ui.dto;

import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;

import java.util.List;

public class PrescriptionResDto {
    List<Prescription> presc;

    public List<Prescription> getPresc() {
        return presc;
    }

    public void setPresc(List<Prescription> presc) {
        this.presc = presc;
    }
}
