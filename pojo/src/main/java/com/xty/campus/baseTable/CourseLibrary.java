package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_course_library")
public class CourseLibrary {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer courseId;
    /**
     * 课程代码
     */
    private String courseCore;
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 开课教室
     */
    private String courseClassroom;
    /**
     * 归属系部
     */
    private String courseBelongDepartment;
    /**
     * 课程类别
     */
    private String courseSort;
    /**
     * 课程类型
     */
    private String courseType;
    /**
     * 课程属性
     */
    private String courseProp;
    /**
     * 课程性质
     */
    private String courseNature;
    /**
     * 学分
     */
    private String courseCredit;
    /**
     * 总学时
     */
    private String courseLearnTime;
    /**
     * 实践学时
     */
    private String courseActiveTime;
    /**
     * 备注
     */
    private String coursenote;
    /**
     * 总分
     */
    private String courseAllGrade;
    /**
     * 及格分
     */
    private String coursePassGrade;
    /**
     * 标准类型吗
     */
    private String courseStandardCode;
    /**
     * 开课学期
     */
    private String courseStartTerm;
}
