package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_evaluate")
public class Evaluate {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 教学评价名称
     */
    private String head;

    /**
     * 评价时间
     */
    private Date evaluateTime;

    /**
     * 教师姓名
     */
    private String evaluateName;

    /**
     * 学号
     */
    private String evaluateSno;

    /**
     * 总分
     */
    private String allGrade;

    /**
     * 原始平均分
     */
    private String avgGrade;

    /**
     * 教学评价第一项
     */
    private String evaluateOne;

    /**
     * 第一项分数
     */
    private String evaluateOneGrade;

    /**
     * 教学评价第二项
     */
    private String evaluateTwo;

    /**
     * 第二项分数
     */
    private String evaluateTwoGrade;

    /**
     * 教学评价第三项
     */
    private String evaluateThree;

    /**
     * 第三项分数
     */
    private String evaluateThreeGrade;

    /**
     * 教学评价第四项
     */
    private String evaluateFour;

    /**
     * 第四项分数
     */
    private String evaluateFourGrade;

    /**
     * 教学评价第五项
     */
    private String evaluateFive;

    /**
     * 第五项分数
     */
    private String evaluateFiveGrade;

    /**
     * 注释
     */
    private String note;
}
