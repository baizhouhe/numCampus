package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_exam_type")
public class ExamType {
    /**
     * 考试类型表ID
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 名称
     * */
    private String examTypeName;
    /**
     * 编号
     * */
    private String examNum;
}
