package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_department")
public class Department {

    /**
     * 院系编号
     */
    private String dmpno;

    /**
     * 院系名称
     */
    private String dname;

    /**
     * 院长名
     */
    private String dmphead;
}
