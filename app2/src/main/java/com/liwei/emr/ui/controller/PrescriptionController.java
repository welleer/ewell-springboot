package com.liwei.emr.ui.controller;

import com.liwei.emr.application.service.IPrescriptionService;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import com.liwei.emr.ui.dto.BaseResponseDto;
import com.liwei.emr.ui.dto.PrescriptionResDto;
import com.liwei.emr.application.service.IPrescriptionService;
import com.liwei.emr.infrastructure.entity.oracle.Prescription;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 处方相关
 */
@RestController
@RequestMapping("patient")
public class PrescriptionController {

    @Resource
    IPrescriptionService prescriptionService;

//    @Reference(version="1.0",check = false)
//    IOrder2Service order2Service;

    /**
     * 根据病人编号提交处方
     */
    @RequestMapping(value = "{clinicno}/{date}/presc", method = RequestMethod.POST)
    public BaseResponseDto test(@PathVariable String clinicno, @RequestBody PrescriptionResDto prescriptionResDto) {
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        prescriptionService.updatePresc(prescriptionResDto.getPresc(),clinicno);
        baseResponseDto.setCode("200");
//        baseResponseDto.setData(list);
        return baseResponseDto;
    }

    /**
     * 根据病人编号查询处方详情
     */
    @RequestMapping(value = "{clinicno}/{date}/presc/list", method = RequestMethod.GET)
    public BaseResponseDto qryPatientDetail(@PathVariable String clinicno) {
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        List<Prescription> list = prescriptionService.query(clinicno);
        baseResponseDto.setCode("200");
        baseResponseDto.setData(list);
        return baseResponseDto;
    }

}

