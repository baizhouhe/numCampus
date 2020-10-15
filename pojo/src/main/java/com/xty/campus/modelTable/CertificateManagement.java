package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_certificate_management")
public class CertificateManagement {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 学号
     */
    private String sno;
    /**
     *是否欠费
     */
    private String arrearage;
    /**
     *证书
     */
    private String certificate;
    /**
     *学分情况
     */
    private String learningGrade;
    /**
     *是否允许领取毕业证
     */
    private String allowCertificate;
    /**
     *是否领取毕业证
     */
    private String takeCertificate;
    /**
     *领取时间
     */
    private String takeTime;
    /**
     *领取人
     */
    private String takeMan;
    /**
     *管理人员
     */
    private String admin;
    /**
     *操作时间
     */
    private String updateTime;
    /**
     *备注
     */
    private String note;

}
