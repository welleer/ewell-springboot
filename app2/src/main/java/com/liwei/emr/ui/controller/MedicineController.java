package com.liwei.emr.ui.controller;

import com.liwei.emr.application.service.IMedicineService;
import com.liwei.emr.ui.dto.BaseResponseDto;
import com.liwei.emr.application.service.IMedicineService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 病人相关
 * 1。病人列表
 * 2。病人详情
 */
@RestController
@RequestMapping("drugs")
public class MedicineController {


    @Resource
    public IMedicineService MedicineService;



    /**
     * 根据病人编号查询病人详情
     */
    @RequestMapping(value = "search", method = RequestMethod.GET)
    public BaseResponseDto search(String kw) {
        BaseResponseDto baseResponseDto = new BaseResponseDto();
        baseResponseDto.setCode("200");
        baseResponseDto.setData(MedicineService.queryByNameLikeAs(kw));
        return baseResponseDto;
    }

}
