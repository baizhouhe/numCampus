package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_score_type")
public class ScoreType {
    /**
     * 积分等级表ID
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 积分等级
     * */
    private String scoreType;
    /**
     * 积分最大值
     * */
    private String scoreMax;
    /**
     * 积分最小值
     * */
    private String scoreMin;
}
