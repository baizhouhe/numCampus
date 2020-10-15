package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_score_check")
public class ScoreCheck {
    /**
     * 积分审核表
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 纪律ID
     * */
    private int disciplineTypeId;
    /**
     * 详情
     * */
    private String detail;
    /**
     * 学号
     * */
    private String sno;
    /**
     * 学期ID
     * */
    private int termId;
    /**
     * 处理时间
     * */
    private String time;
    /**
     * 审核状态
     * */
    private String checkStatus;
    /**
     * 审核时间
     * */
    private String checkTime;
    /**
     * 审核内容
     * */
    private String checkDetail;
}
