package com.example.demo.dto;

import com.example.demo.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class StudentDto {
    @ApiModelProperty(value = "学生编号")
    private Integer sNo;
    @ApiModelProperty(value = "学生名称", required = true)
    @NotNull(message = "学生名称不能为空")
    private String sName;
    @ApiModelProperty(value = "年龄", required = true)
    @Min(value = 0, message = "年龄最小值为0")
    @Max(value = 150, message = "年龄最大值为150")
    private Short sAge;
    @ApiModelProperty(value = "性别")
    @FlagValidator(value = {"0","1"}, message = "性别0：男，1：女")
    private Byte sSex;
}
