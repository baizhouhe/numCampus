package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_qualification_certificate")
public class QualificationCertificate {
    /**
     * 证书id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 类别
     */
    private String type;
    /**
     * 证书名称
     */
    private String name;
    /**
     * 发证机构
     */
    private String organization;
    /**
     * 获证时间
     */
    private String time;
    /**
     * 学分
     */
    private String credit;
    /**
     * 学生id
     */
    private String studentId;

}
