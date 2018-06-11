package com.liwei.emr.application.service;

import com.liwei.emr.infrastructure.entity.oracle.Medicine;

import java.util.List;
import java.util.Map;

public interface IMedicineService {

    List<Map<String,Object>> queryByNameLikeAs(String keyword);
}
