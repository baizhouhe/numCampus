package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_term_message")
public class TermMessage {
    /**
     * 学期id
     */
    @TableId(type = IdType.AUTO)
    private Integer termId;
    /**
     * 学期名
     */
    private String termName;
    /**
     * 学年
     */
    private String termYear;
    /**
     * 学期开始时间
     */
    private String startTime;
    /**
     * 学期结束时间
     */
    private String endTime;
    /**
     * 学期备注
     */
    private String note;
}
