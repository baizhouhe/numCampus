package com.xty.campus.testTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_juage")
public class Judge {
    /**
     * 判断题号
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String judge_num;
    /**
     *题目
     */
    private String judge_title;
    /**
     *答案
     */
    private String judge_answer;
    /**
     *适用专业
     */
    private String judge_specialty;
    /**
     *适用课程
     */
    private String judge_course;
}
