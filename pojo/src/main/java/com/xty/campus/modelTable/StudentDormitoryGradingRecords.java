package com.xty.campus.modelTable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_student_dormitory_grading_records")
public class StudentDormitoryGradingRecords {
    /**
     * 学生宿舍成绩记录表ID
     * */
    @TableId(type = IdType.AUTO)
    private int id;
    /**
     * 楼号
     * */
    private String buildingNo;
    /**
     * 房间号
     * */
    private String roomNo;
    /**
     * 床铺得分
     * */
    private float bedScore;
    /**
     * 地面得分
     * */
    private float floodScore;
    /**
     * 桌面得分
     * */
    private float tableScore;
    /**
     * 个人用品得分
     * */
    private float suppliesScore;
    /**
     * 墙面得分
     * */
    private float wallScore;
    /**
     * 用电安全得分
     * */
    private float electricityScore;
    /**
     * 其他的分
     * */
    private float otherScore;
    /**
     * 日期
     */
    private String dateline;
    /**
     * 所属班级
     * */
    private String belongClass;
    /**
     * 所属院系
     * */
    private String subordinateDepartments;
    /**
     * 学年
     * */
    private String academicYear;

}
