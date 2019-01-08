package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "demo", description = "demo详情")
@RestController
public class HelloWordController {

    @ApiOperation(value = "首页")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index () {
        return "hello Spring Boot123!!";
    }

    @ApiOperation(value = "测试")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam(value = "测试值") String testVal) {
        return testVal;
    }

    @ApiOperation(value = "测试1")
    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public String testId(@RequestParam(value = "测试值") String testVal, @PathVariable long id) {
        return id + ":" + testVal;
    }

}
