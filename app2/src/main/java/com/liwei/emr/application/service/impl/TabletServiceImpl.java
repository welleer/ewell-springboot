package com.liwei.emr.application.service.impl;

import com.liwei.emr.application.service.ITabletService;
import com.liwei.emr.domain.repository.ITabletRepository;
import com.liwei.emr.infrastructure.entity.oracle.Tablet;
import com.liwei.emr.infrastructure.entity.oracle.Tablet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TabletServiceImpl implements ITabletService {

    @Autowired
    ITabletRepository TabletRepository;

    @Override
    public Tablet query(String tablet_id) {
        return TabletRepository.query(tablet_id);
    }

    @Override
    public List<Tablet> queryList(Tablet Tablet) {
        return TabletRepository.queryList(Tablet);
    }

}
