package com.ewell.emr.ui.controller;

import com.ewell.emr.infrastructure.dao.mysql.UserMapper;
import com.ewell.emr.infrastructure.entity.mysql.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/*病例*/
@Controller
@RequestMapping("api/test")
public class TestController {

    @Resource
    public UserMapper userMapper;

    /**
     *  test
     * @return  String
     */
    @ResponseBody
    @RequestMapping()
    public String test() {
        User user = userMapper.findUserById();
        System.out.println(user.toString());
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
