package com.liwei.emr.controller;

import com.liwei.emr.service.moe.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    DrugService drugService;

    @RequestMapping(value = "test/{id}")
    public String test(@PathVariable String id){
        Object oo = drugService.searchDrug(null);
        System.out.println(id);
        return "test";
    }
}
