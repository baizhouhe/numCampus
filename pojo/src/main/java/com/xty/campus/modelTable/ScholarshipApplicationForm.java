package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_scholarship_application_form")
public class ScholarshipApplicationForm {
    /**
     * 奖/助学金申请表ID
     * */
    @TableId(type = IdType.AUTO)
    private int safid;
    /**
     * 学年
     * */
    private String academicYear;
    /**
     * 学校
     * */
    private String school;
    /**
     * 院系
     * */
    private String department;
    /**
     * 学号
     * */
    private String studentNo;
    /**
     * 姓名
     * */
    private String studentName;
    /**
     * 性别
     * */
    private  String gender;
    /**
     * 出生日期
     * */
    private String birthday;
    /**
     * 政治面貌
     * */
    private String politicsStatus;
    /**
     * 民族
     * */
    private String nation;
    /**
     * 入学时间
     * */
    private String admissionDate;
    /**
     * 专业
     * */
    private String major;
    /**
     * 学制
     * */
    private String educationalSystem;
    /**
     * 联系电话
     * */
    private String phone;
    /**
     * 身份证号
     * */
    private String idCardNo;
    /**
     * 籍贯
     * */
    private String nativePace;
    /**
     * 申请理由
     * */
    private String reasonForApplication;
    /**
     * 申请时间
     * */
    private String dataOfApplication;
    /**
     * 申请类型（奖/助学金）
     * */
    private String typeOfApplication;
}
