package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_student")
public class Student {

    /**
     * 学号
     */
    private String sno;

    /**
     * 姓名
     */
    private String sname;

    /**
     * 性别
     */
    private String ssex;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 身份证号
     */
    private String id;

    /**
     * 入学时间
     */
    private String intime;

    /**
     * 籍贯
     */
    private String birthplace;

    /**
     * 家庭地址
     */
    private String address;

    /**
     * 班级ID
     */
    private Integer classId;
}
