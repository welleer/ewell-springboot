package com.liwei.emr.application.service;

import com.liwei.emr.infrastructure.entity.oracle.Tablet;
import com.liwei.emr.infrastructure.entity.oracle.Tablet;

import java.util.List;

public interface ITabletService {

    Tablet query(String clinicno);

    List<Tablet> queryList(Tablet Tablet);

}
