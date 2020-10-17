package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_school_notice")
public class SchoolNotice {
    /**
     * 学校通知id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 标题
     */
    private String handline;
    /**
     * 内容
     */
    private String context;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建人
     */
    private String createMan;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;
    /**
     * 发布院校
     */
    private String pushDepartment;
    /**
     * 附件
     */
    private String affiliateFile;
}
