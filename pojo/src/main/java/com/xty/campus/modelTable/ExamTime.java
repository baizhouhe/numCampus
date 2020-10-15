package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_exam_time")
public class ExamTime {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 学期名称
     */
    private String termName;

    /**
     * 考试名称
     */
    private String examName;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 是否开放成绩查询
     */
    private String showOrGrade;
}
