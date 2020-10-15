package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.StringReader;

@Data
@TableName("t_grade")
public class Grade {
    /**
     * 成绩表
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 班级名称
     * */
    private String className;
    /**
     * 学号
     * */
    private String sno;
    /**
     * 学生姓名
     * */
    private String studentName;
    /**
     * 课程名
     * */
    private String courseName;
    /**
     * 分数
     * */
    private String score;
    /**
     * 是否补考
     * */
    private String supplementaryExamination;
    /**
     * 是否重修
     * */
    private String reset;
    /**
     * 学期
     * */
    private String term;
}
