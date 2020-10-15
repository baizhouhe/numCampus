package com.xty.campus.testTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_sel_choice")
public class OptionTitle {
    /**
     * 选择题号
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String sel_num;
    /**
     *选择题目
     */
    private String sel_title;
    /**
     *选项1
     */
    private String sel_option1;
    /**
     *选项2
     */
    private String sel_option2;
    /**
     *选项3
     */
    private String sel_option3;
    /**
     *选项4
     */
    private String sel_option4;
    /**
     *适用专业
     */
    private String sel_specialty;
    /**
     *答案
     */
    private String sel_answer;
    /**
     *适用课程
     */
    private String sel_course;
}
