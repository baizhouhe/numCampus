package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_calender")
public class Calender {

    @TableId(type = IdType.AUTO)
    private Integer calenderId;
    /**
     *学期名
     */
    private String calenderTermName;
    /**
     * 家假日
     */
    private String calenderHoliday;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 涉及节次
     */
    private String calenderInfluence;

}
