package com.xty.campus.testTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_short_answer")
public class ShortAnswer {

    @TableId(type = IdType.ASSIGN_ID)
    private String short_num;
    /**
     * 简答题目
     */
    private String short_title;
    /**
     * 简答答案
     */
    private String short_answer;
    /**
     * 适用专业
     */
    private String short_specialty;
    /**
     * 简答课程
     */
    private String short_course;
}
