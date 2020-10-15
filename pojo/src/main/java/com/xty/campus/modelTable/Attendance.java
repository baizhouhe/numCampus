package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_attendance")
public class Attendance {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 学生姓名
     */
    private String studentName;

    /**
     * 日期
     */
    private String createDate;

    /**
     * 事假
     */
    private Integer casualLeave;

    /**
     * 病假
     */
    private Integer sickLeave;

    /**
     * 公假
     */
    private Integer sabbaticals;

    /**
     * 迟到
     */
    private Integer late;

    /**
     * 早退
     */
    private Integer leaveEarly;

    /**
     * 睡觉
     */
    private Integer sleep;
}
