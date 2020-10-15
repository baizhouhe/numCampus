package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_role_menu")
public class RoleMenu {
    /**
     * 角色id
     */
    @TableId
    private String roleId;
    /**
     * 菜单id
     */
    private String menuId;
}
