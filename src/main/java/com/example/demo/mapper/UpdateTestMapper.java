package com.example.demo.mapper;

import com.example.demo.model.UpdateTest;
import com.example.demo.model.UpdateTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpdateTestMapper {
    long countByExample(UpdateTestExample example);

    int deleteByExample(UpdateTestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UpdateTest record);

    int insertSelective(UpdateTest record);

    List<UpdateTest> selectByExample(UpdateTestExample example);

    UpdateTest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UpdateTest record, @Param("example") UpdateTestExample example);

    int updateByExample(@Param("record") UpdateTest record, @Param("example") UpdateTestExample example);

    int updateByPrimaryKeySelective(UpdateTest record);

    int updateByPrimaryKey(UpdateTest record);
}