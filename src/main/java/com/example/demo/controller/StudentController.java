package com.example.demo.controller;

import com.example.demo.dto.CommonResult;
import com.example.demo.model.Student;
import com.example.demo.service.StudentManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Api(description = "学生管理")
@RestController // 此处只返回数据使用restController(相当于@Controller + @ResponseBody 结合;若需要返回jsp、html等则需要使用@Controller)
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentManagerService studentManagerService;

    @ApiOperation(value = "根据学生名称获取学生分页获取学生信息")
    @RequestMapping(value = "/queryStuLiByName", method = RequestMethod.GET)
    public Object queryStuLiByName(@RequestParam(value = "学生名称", required = false) String keyword,
                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<Student> studentList =studentManagerService.pageList(keyword, pageNum, pageSize);
        return new CommonResult().pageSuccess(studentList);

    }

}
