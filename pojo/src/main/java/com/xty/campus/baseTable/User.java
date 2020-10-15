package com.xty.campus.baseTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_admin")
public class User {
    /**
     * 管理员id
     */
    @TableId(type = IdType.AUTO)
    private String id;
    /**
     * 账号
     */
    private String accountName;
    /**
     * 密码
     */
    private String accountPassword;
    /**
     * 类型
     */
    private String accountType;
    /**
     * 角色id
     */
    private String roleId;

}
