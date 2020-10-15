package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_discipline_type")
public class DisciplineType {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 纪律类型
     */
    private String disciplineType;
}
