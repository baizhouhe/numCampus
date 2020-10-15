package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_dormitory_discipline_type")
public class DormitoryDisciplineType {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 违纪类型
     */
    private String type;
}
