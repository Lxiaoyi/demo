package com.example.demo.service.impl;

import com.example.demo.mapper.StudentMapper;
import com.example.demo.model.Student;
import com.example.demo.model.StudentExample;
import com.example.demo.service.StudentManagerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManagerServiceImpl implements StudentManagerService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> pageList(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        if (StringUtil.isNotEmpty(keyword)) {
            criteria.andSNameLike("%" + keyword + "%");
        }
        return studentMapper.selectByExample(studentExample);
    }
}
