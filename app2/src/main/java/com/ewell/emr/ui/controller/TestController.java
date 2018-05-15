package com.ewell.emr.ui.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ewell.emr.application.service.app1.IOrderService;
import com.ewell.emr.infrastructure.dao.mysql.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/*病例*/
@Controller
@RequestMapping("api/order")
public class TestController {

    @Resource
    public UserMapper userMapper;

    @Reference(version="1.0",check = false)
    IOrderService orderService;


    /**
     *  test
     * @return  String
     */
    @ResponseBody
    @RequestMapping("{id}")
    public String test(@PathVariable int id) {
//        User user = userMapper.findUserById();
//        System.out.println(user.toString());
        orderService.modify(id);
        return "test";
    }
//
//    /**
//     *  增加病例
//     * @param testRequestDto
//     * @return  ResponseDto
//     */
//    @ResponseBody
//    @RequestMapping(method = RequestMethod.POST)
//    public TestResponseDto save(TestRequestDto testRequestDto) {
//        TestResponseDto testResponseDto = new TestResponseDto();
//        testResponseDto.setName("save");
//        return testResponseDto;
//    }
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
