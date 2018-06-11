package com.liwei.emr.ui.controller;

import com.liwei.emr.application.service.IMedRecService;
import com.liwei.emr.application.service.IPatientService;
import com.liwei.emr.infrastructure.entity.oracle.Diags;
import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.ui.dto.BaseResponseDto;
import com.liwei.emr.ui.dto.DiagsResDto;
import com.liwei.emr.ui.dto.MedRecResDto;
import com.liwei.emr.application.service.IMedRecService;
import com.liwei.emr.infrastructure.entity.oracle.Diags;
import com.liwei.emr.infrastructure.entity.oracle.MedRec;
import org.apache.commons.collections.ArrayStack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 病历相关
 * @author liwei
 */
@RestController
@RequestMapping("patient")
public class MedRecController {



    @Resource
    public IMedRecService medRecService;

//    @Reference(version="1.0",check = false)
//    IOrder2Service order2Service;


    /**
     * 根据病人编号查询病人病历信息
     */
    @RequestMapping(value = "{clinic_no}/{date}/medrec", method = RequestMethod.GET)
    public BaseResponseDto qryMedRec(@PathVariable String clinic_no) {
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        MedRec m = medRecService.find(clinic_no);
        MedRecResDto temp = new MedRecResDto();
        temp.setChiefcomplaint(m.getChief_complaint());
        temp.setHistoryofpresent(m.getHistory_of_present());
        temp.setHistorymarriage(m.getHistory_marriage());
        temp.setHistorypersonal(m.getHistory_personal());
        temp.setPhysicalexam(m.getPhysical_exam());
        List<DiagsResDto> tempDiag = new ArrayList<>();
        for(Diags diags : m.getDiags()){
            DiagsResDto d = new DiagsResDto();
            d.setDiag(diags.getDiag());
            d.setInstruction(diags.getInstruction());
            d.setDate(diags.getDiagdate());
            d.setDiagtype(diags.getDiagtype());
            tempDiag.add(d);
        }

        temp.setDiags(tempDiag);
        baseResponseDto.setCode("200");
        baseResponseDto.setData(temp);
        return baseResponseDto;
    }

    /**
     * 根据病人编号保存/修改病人病历信息
     */
    @RequestMapping(value = "{clinic_no}/{date}/medrec", method = RequestMethod.POST)
    public BaseResponseDto saveMedRec(@PathVariable String clinic_no,@RequestBody MedRecResDto medRecResDto) {
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        MedRec medRec = medRecService.find(clinic_no);
        medRec.setChief_complaint(medRecResDto.getChiefcomplaint());
        medRec.setHistory_of_present(medRecResDto.getHistoryofpresent());
        medRec.setHistory_marriage(medRecResDto.getHistorymarriage());
        medRec.setHistory_personal(medRecResDto.getHistorypersonal());
        medRec.setPhysical_exam(medRecResDto.getPhysicalexam());
        List<DiagsResDto> diagsList = medRecResDto.getDiags();
        List<Diags> list = new ArrayList<>();
        for(DiagsResDto d : diagsList){
            Diags temp = new Diags();
            temp.setClinic_no(clinic_no);
            temp.setDiag(d.getDiag());
            temp.setInstruction(d.getInstruction());
            temp.setDiagdate(d.getDate());
            temp.setDiagtype(d.getDiagtype());
            list.add(temp);
        }
        medRec.setDiags(list);
        medRecService.update(medRec);

        baseResponseDto.setCode("200");
//        baseResponseDto.setData(patient);
        return baseResponseDto;
    }

}
