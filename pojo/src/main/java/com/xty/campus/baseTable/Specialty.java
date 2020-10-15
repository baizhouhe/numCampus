package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_specialty")
public class Specialty {
    /**
     * 专业id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 专业名
     */
   private String name;
    /**
     * 专业所属院系
     */
   private String depId;
    /**
     * 专业开设时间
     */
   private String createTime;
    /**
     * 备注
     */
   private String note;
}
