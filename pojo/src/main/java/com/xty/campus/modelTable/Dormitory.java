package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_dormitory")
public class Dormitory {

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
     * 可住人数
     */
    private Integer reside;

    /**
     * 已经居住人数
     */
    private Integer alreadyReside;
}
