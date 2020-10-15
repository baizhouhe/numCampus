package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_exam_course")
public class ExamCourse {
    /**
     * 考试科目时间表
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 学期名
     * */
    private int examTimeName;
    /**
     * 课程名
     * */
    private int classScheduleName;
    /**
     * 开始时间
     * */
    private String startTime;
    /**
     * 结束时间
     * */
    private String endTime;
    /**
     * 班级
     * */
    private String clazz;
    /**
     * 教室
     * */
    private String classroom;
    /**
     * 监考教师
     * */
    private String examTeacher;
}
