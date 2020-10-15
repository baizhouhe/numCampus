package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_teacher")
public class Teacher {

    /**
     * 教师编号
     */
    private String teano;

    /**
     * 教师姓名
     */
    private String teacherName;

    /**
     * 教师电话
     */
    private String phone;

    /**
     * 教师住址
     */
    private String address;

    /**
     * 教师职务
     */
    private String dutyId;

    /**
     * 教师身份证号
     */
    private String id;

    /**
     * 教师年龄
     */
    private Integer age;

    /**
     * 教师籍贯
     */
    private String birthplace;

    /**
     * 教师性别
     */
    private String sex;

    /**
     * 学历
     */
    private String education;

    /**
     * 备注
     */
    private String note;

    /**
     * 教师所属院系ID
     */
    private String depId;
}
