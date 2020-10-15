package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_graduate_num")
public class GraduateNum {

    /**
     * 毕业证书号id
     */
    @TableId(type = IdType.AUTO)
    private  int id;
    /**
     * 学号
     */
    private String sno;
    /**
     * 姓名
     */
    private String name;
    /**
     * 毕业证号
     */
    private String graduateNum;
    /**
     * 学位证号
     */
    private String degreeNum;
}
