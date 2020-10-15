package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_reset")
public class Reset {
    /**
     * 重修表ID
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 班级
     * */
    private String className;
    /**
     * 学号
     * */
    private int sno;
    /**
     * 姓名
     * */
    private String StudentName;
    /**
     * 课程名
     * */
    private String course;
    /**
     * 分数
     * */
    private String score;
    /**
     * 是否通过
     * */
    private String pass;
    /**
     * 重修学期
     * */
    private String term;
    /**
     * 当前学期
     * */
    private String nowTerm;
}
