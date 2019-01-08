package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentManagerService {
    /**
     * 分页查询学生信息
     * @param keyword
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Student> pageList(String keyword, Integer pageNum, Integer pageSize);
}
