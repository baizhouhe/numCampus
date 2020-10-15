package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_scholarship_review")
public class ScholarshipReview {
    /**
     * 奖/助学金审核表ID
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 奖/助学金 申请表ID
     * */
    private int safid;
    /**
     * 是否通过
     * */
    private int isPass;
    /**
     * 审核时间
     * */
    private String auditTime;
    /**
     * 审核人
     * */
    private String  auditor;
    /**
     * 备注
     * */
    private String note;

}
