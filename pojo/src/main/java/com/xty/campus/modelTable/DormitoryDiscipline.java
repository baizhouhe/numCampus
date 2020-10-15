package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_dormitory_discipline")
public class DormitoryDiscipline {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 宿舍楼
     */
    private String dormitory;

    /**
     * 宿舍名称
     */
    private String dormitoryName;

    /**
     * 所属班级
     */
    private String dormitoryClass;

    /**
     * 性别
     */
    private String dormitorySex;

    /**
     * 楼层
     */
    private String floor;

    /**
     * 宿舍长
     */
    private String houseparent;

    /**
     * 辅导员
     */
    private String instructor;

    /**
     * 违纪类型
     */
    private String type;

    /**
     * 具体内容
     */
    private String content;

    /**
     * 违纪时间
     */
    private String disciplineTime;
}
