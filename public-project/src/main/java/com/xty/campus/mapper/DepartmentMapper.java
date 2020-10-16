package com.xty.campus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xty.campus.baseTable.Department;
import com.xty.campus.result.ResponseResult;

public interface DepartmentMapper extends BaseMapper<Department> {
    /**
     * 添加院系
     * */
    ResponseResult addDepartment(Department department);
    /**
     * 更新院系信息
     * */
    ResponseResult updateDepartment(Department department);

    /**
     * 查询所有院系
     * */
    ResponseResult allDepartment();

    /**
     *
     * */
}
