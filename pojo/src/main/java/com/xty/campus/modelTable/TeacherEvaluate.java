package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_evaluate")
public class TeacherEvaluate {

    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 评价标题
     */
    private String head;
    /**
     * 评价时间
     */
    private String evaluateTime;
    /**
     *教师姓名
     */
    private String evaluateName;
    /**
     *学号
     */
    private String evaluateSno;
    /**
     *总分
     */
    private String allGrade;
    /**
     *平均分
     */
    private String avgGrade;
    /**
     *教学评价第一项
     */
    private String evaluateOne;
    /**
     *第一项分数
     */
    private String evaluateOneGrade;
    /**
     *教学评价第2项
     */
    private String evaluateTwo;
    /**
     *第2项分数
     */
    private String evaluateTwoGrade;
    /**
     *教学评价第3项
     */
    private String evaluateThree;
    /**
     *第3项分数
     */
    private String evaluateThreeGrade;
    /**
     *教学评价第4项
     */
    private String evaluateFour;
    /**
     *第4项分数
     */
    private String evaluateFourGrade;
    /**
     *教学评价第5项
     */
    private String evaluateFive;
    /**
     *第5项分数
     */
    private String evaluateFiveGrade;

}
