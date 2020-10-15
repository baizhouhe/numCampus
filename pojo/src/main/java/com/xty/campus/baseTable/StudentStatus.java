package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_student_status")
public class StudentStatus {

    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     *曾用名
     */
    private String usedName;
    /**
     *在读院校
     */
    private String school;
    /**
     *辅导员
     */
    private String instructor;
    /**
     *学号
     */
    private String studentSno;
    /**
     *专业
     */
    private String specialty;
    /**
     *班级
     */
    private String className;
    /**
     *性别
     */
    private String sex;
    /**
     *籍贯
     */
    private String nativePlace;
    /**
     *生日
     */
    private String birthday;
    /**
     *户口所在地
     */
    private String registeredPermanentResidence;
    /**
     *民族
     */
    private String nation;
    /**
     *家庭住址
     */
    private String homeAddress;
    /**
     *政治面貌
     */
    private String politicsStatus;
    /**
     *家庭电话
     */
    private String homePhone;
    /**
     *健康状况
     */
    private String healthCondition;
    /**
     *学制
     */
    private String eductionalSystem;
    /**
     *身份证号
     */
    private String identityCard;
    /**
     *入学时间
     */
    private String intime;
    /**
     *父亲姓名
     */
    private String fName;
    /**
     *父亲工作单位
     */
    private String fWork;
    /**
     *父亲手机
     */
    private String fPhone;
    /**
     *母亲姓名
     */
    private String mName;
    /**
     *母亲工作单位
     */
    private String mWork;
    /**
     *母亲手机
     */
    private String mPhone;
}
