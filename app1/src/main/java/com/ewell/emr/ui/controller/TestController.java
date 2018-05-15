package com.ewell.emr.ui.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ewell.emr.application.service.IPatientService;
import com.ewell.emr.application.service.app2.IOrder2Service;
import com.ewell.emr.infrastructure.entity.oracle.Patient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/*病例*/
@Controller
@RequestMapping("api/order")
public class TestController {

//    @Resource
//    public UserMapper userMapper;

//    @Resource
//    PatientMapper patientService;
    @Resource
    public IPatientService patientService;
    @Reference(version="1.0",check = false)
    IOrder2Service order2Service;

    /**
     *  test
     * @return  String
     */
    @ResponseBody
    @RequestMapping("{id}")
    public String test(@PathVariable int id) {
//        User user = userMapper.findUserById();
//        System.out.println(user.toString());
        order2Service.add(id);
        return "test";
    }
//
    /**
     *  增加病例
     *  增加病例
     * @return  ResponseDto
     */
    @ResponseBody
    @RequestMapping(value = "list")
    public List<Patient> save() {
        return patientService.findAll();
    }
//
//    /**
//     *  删除病例
//     * @param testRequestDto
//     * @return  ResponseDto
//     */
//    @ResponseBody
//    @RequestMapping(method = RequestMethod.DELETE)
//    public TestResponseDto delete(@RequestBody @Valid TestRequestDto testRequestDto) {
//        TestResponseDto testResponseDto = new TestResponseDto();
//        testResponseDto.setName("delete");
//        return testResponseDto;
//    }
//
//    /**
//     *  更新病例
//     * @param testRequestDto
//     * @return  ResponseDto
//     */
//    @ResponseBody
//    @RequestMapping(method = RequestMethod.PUT)
//    public TestResponseDto update(@RequestBody @Valid TestRequestDto testRequestDto) {
//        TestResponseDto testResponseDto = new TestResponseDto();
//        testResponseDto.setName("update");
//        return testResponseDto;
//    }
//
//    /**
//     *  查找病例
//     * @param id
//     * @return  ResponseDto
//     */
//    @ResponseBody
//    @RequestMapping(value = "{id}",method = RequestMethod.GET)
//    public TestResponseDto query(@PathVariable("id") Long id) {
//        TestResponseDto testResponseDto = new TestResponseDto();
//        testResponseDto.setName("query");
//        return testResponseDto;
//    }
}
