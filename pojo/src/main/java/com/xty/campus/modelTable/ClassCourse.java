package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_class_course")
public class ClassCourse {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 班级名称
     */
    private String className;

    /**
     * 星期
     */
    private String week;

    /**
     * 第一节
     */
    private String first;

    /**
     * 第二节
     */
    private String second;

    /**
     * 第三节
     */
    private String thirdly;

    /**
     * 第四节
     */
    private String fourth;

    /**
     * 学期
     */
    private String term;
}
