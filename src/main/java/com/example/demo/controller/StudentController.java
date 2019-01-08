package com.example.demo.controller;

import com.example.demo.dto.CommonResult;
import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import com.example.demo.service.StudentManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
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

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @ApiOperation(value = "根据学生名称获取学生分页获取学生信息")
    @RequestMapping(value = "/queryStuLiByName", method = RequestMethod.GET)
    public Object queryStuLiByName(@RequestParam(value = "学生名称", required = false) String keyword,
                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        List<Student> studentList = studentManagerService.pageList(keyword, pageNum, pageSize);
        return new CommonResult().pageSuccess(studentList);

    }

    @ApiOperation(value = "添加学生")
    @RequestMapping(value = "/addStu", method = RequestMethod.POST)
    public Object addStu(@Validated @RequestBody StudentDto studentDto, BindingResult result) {
        if (result.hasErrors()) {
            return new CommonResult().validateFailed(result.getFieldError().getDefaultMessage());
        }
        int count = studentManagerService.addStudent(studentDto);
        CommonResult commonResult;
        if (count == 1) {
            commonResult = new CommonResult().success(studentDto);
            LOGGER.debug("createBrand success:{}", studentDto);
        } else {
            commonResult = new CommonResult().failed();
            LOGGER.debug("createBrand failed:{}", studentDto);
        }
        return commonResult;
    }

}
