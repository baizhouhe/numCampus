package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_classroom_type")
public class ClassroomType {

    @TableId(type = IdType.AUTO)
    private Integer classroomNum;
    /**
     * 教室类型名称
     */
    private String classroomSortName;
}
