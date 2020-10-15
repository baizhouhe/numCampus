package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_supplementary_examination")
public class SupplementaryExamination {
    /**
     * 补考表ID
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 班级名称
     * */
    private String className;
    /**
     * 学生ID
     * */
    private String studentId;
    /**
     * 学生姓名
     * */
    private String studentName;
    /**
     * 课程名
     * */
    private String course;
    /**
     * 补考成绩
     * */
    private String score;
    /**
     * 是否通过
     * */
    private String pass;
    /**
     * 学期
     * */
    private String term;
}
