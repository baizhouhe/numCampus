package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_teach_plan")
public class TeachPlan {
    /**
     * 教学计划表ID
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 学期id
     * */
    private String termId;
    /**
     * 班级ID
     * */
    private int classId;
    /**
     * 教室ID
     * */
    private int teacherId;
    /**
     * 课程ID
     * */
    private int courseId;
    /**
     * 学分
     * */
    private String grade;
    /**
     * 考试类型ID
     * */
    private int examTypeId;
    /**
     * 期中比例
     * */
    private String middleRatio;
    /**
     * 期末比例
     * */
    private String finalRadio;
    /**
     * 成绩类型
     * */
    private String gradeType;
}
