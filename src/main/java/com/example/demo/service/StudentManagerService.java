package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import org.springframework.transaction.annotation.Transactional;

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

    /**
     * 添加学生 添加事务支持
     * @param studentDto
     * @return
     */
    @Transactional
    int addStudent(StudentDto studentDto);
}
