package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_role")
public class Role {
    /**
     * 角色id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 角色code
     */
    private String code;
    /**
     * 角色名
     */
    private String name;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;
}
