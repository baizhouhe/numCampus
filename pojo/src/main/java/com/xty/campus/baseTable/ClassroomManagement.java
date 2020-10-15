package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_classroom_management")
public class ClassroomManagement {

    @TableId(type = IdType.AUTO)
    private Integer classroomId;
    /**
     * 教室名称
     */
    private String classroomName;
    /**
     * 教学楼名称
     */
    private String classroomBuilding;
    /**
     * 楼层
     */
    private String classroomFloor;
    /**
     * 管理部门
     */
    private String classroomDepartment;
    /**
     * 类型名称
     */
    private String classroomSort;
    /**
     * 教室座位数
     */
    private String classroomSiting;
    /**
     * 教室用途
     */
    private String classroomUse;
    /**
     * 教室备注
     */
    private String classroomNote;
    /**
     * 教室管理员
     */
    private String classroomAdmin;
    /**
     * 教室面积
     */
    private String classroomArea;
}
