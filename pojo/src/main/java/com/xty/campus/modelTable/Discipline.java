package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_discipline")
public class Discipline {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 学号
     */
    private String studentSno;

    /**
     * 考试科目ID
     */
    private Integer examCourseId;

    /**
     * 违纪详情
     */
    private String badDetail;

    /**
     * 审核人
     */
    private String checkMan;
}
