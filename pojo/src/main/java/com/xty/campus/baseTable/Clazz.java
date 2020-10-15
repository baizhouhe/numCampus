package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_class")
public class Clazz {

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 所属院系
     */
    private String depId;

    /**
     * 班级学时
     */
    private Integer perId;
}
