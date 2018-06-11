package com.liwei.emr.ui.controller;

import com.liwei.emr.application.service.IPatientService;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import com.liwei.emr.ui.dto.BaseResponseDto;
import com.liwei.emr.ui.dto.PatientResDto;
import com.liwei.emr.application.service.IPatientService;
import com.liwei.emr.infrastructure.entity.oracle.Patient;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 病人相关
 * 1。病人列表
 * 2。病人详情
 */
@RestController
@RequestMapping("patient")
public class PatientController {


    @Resource
    public IPatientService patientService;


    /**
     * 根据病人编号进行接诊操作
     */
    @RequestMapping(value = "{clinic_no}", method = RequestMethod.POST)
    public BaseResponseDto test(@PathVariable String clinic_no) {
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        int result = patientService.cliniced(clinic_no);
        baseResponseDto.setCode("200");
        baseResponseDto.setData(result);
        return baseResponseDto;
    }

    /**
     * 根据病人编号查询病人详情
     */
    @RequestMapping(value = "{clinic_no}/{date}/basicinfo", method = RequestMethod.GET)
    public BaseResponseDto qryPatientDetail(@PathVariable String clinic_no) {
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        Patient p = patientService.queryById(clinic_no);
        PatientResDto temp = new PatientResDto();
        temp.setClinicno(p.getClinic_no());
        temp.setEname(p.getEnglish_name());
        temp.setCname(p.getChinese_name());
        temp.setGender(p.getGender().equals("0") ? "男" : "女");
        temp.setAge(p.getAge());
        temp.setIdcard(p.getCard_number());
        baseResponseDto.setCode("200");
        baseResponseDto.setData(temp);
        return baseResponseDto;
    }

    /**
     *  根据类型查询病人列表
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public BaseResponseDto query(@RequestParam String type,@RequestParam(defaultValue = "10") int pageSize, @RequestParam(defaultValue = "0") int page) {
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        Map<String,Object> resultMap = new HashMap<>();
        //病人统计信息
        Map<String,Object> statisticsMap = new HashMap<>();
        int allCount = patientService.countByStatus("0");
        statisticsMap.put("all",allCount);
        int unclinicedCount = patientService.countByStatus("1");
        statisticsMap.put("uncliniced",unclinicedCount);
        int clinicedCount = patientService.countByStatus("2");
        statisticsMap.put("cliniced",clinicedCount);
        resultMap.put("statistics",statisticsMap);
        //队列分页信息
        if (page <= 0) {
            page = 1;// 第一页
        }
        int start = (page - 1) * pageSize;
        int end = start + pageSize;
        int tp = patientService.countByStatus(type);
        Map<String,Object> pageMap = new HashMap<>();
        pageMap.put("tp",tp);
        pageMap.put("cp",page);
        pageMap.put("pagesize",pageSize);
        resultMap.put("paging",pageMap);
        //当前页列表信息
        List<Patient> list = patientService.findByStatus(type, start, end);
        List<PatientResDto> resList = new ArrayList<PatientResDto>();
        for(Patient p : list){
            PatientResDto temp = new PatientResDto();
            temp.setClinicno(p.getClinic_no());
            temp.setEname(p.getEnglish_name());
            temp.setCname(p.getChinese_name());
            temp.setGender(p.getGender().equals("0") ? "男" : "女");
            temp.setAge(p.getAge());
            temp.setIdcard(p.getCard_number());
            temp.setAppointtime(p.getAppointment());
            temp.setState(p.getStatus());
            temp.setStatestring(p.getStatus());
            resList.add(temp);
        }
        resultMap.put("list",resList);
        baseResponseDto.setCode("200");
        baseResponseDto.setData(resultMap);
        return baseResponseDto;
    }

}
