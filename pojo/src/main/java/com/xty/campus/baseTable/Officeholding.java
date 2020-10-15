package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_officeholding")
public class Officeholding {
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 学期名
     */
    private String semesterName;
    /**
     * 担任班级
     */
    private String className;
    /**
     * 职务
     */
    private String post;
    /**
     * 任职时间
     */
    private String time;
    /**
     * 备注
     */
    private String postscript;
    /**
     * 学生id
     */
    private Integer studentId;
}
