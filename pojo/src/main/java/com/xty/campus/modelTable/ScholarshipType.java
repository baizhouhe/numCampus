package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@Data
@TableName("t_scholarship_type")
public class ScholarshipType {
    /**
     * 奖/助学金类型表
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 奖/助学金类型
     * */
    private String typeOfApplication;
    /**
     * 金额
     * */
    private BigDecimal money;
    /**
     * 人数
     * */
    private int population;
}
