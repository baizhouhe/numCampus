package com.xty.campus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xty.campus.baseTable.Calender;
import com.xty.campus.mapper.CalenderMapper;
import com.xty.campus.result.ResponseResult;
import com.xty.campus.service.CalenderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Service
@Component
public class CalenderServiceImpl implements CalenderService {

    @Autowired
    CalenderMapper mapper;

    @Override
    public ResponseResult addCaleder(Calender calender) {
        int insert = mapper.insert(calender);
        if (insert>0){
            return ResponseResult.success();
        }
        return ResponseResult.error();
    }

    @Override
    public ResponseResult delCaleder(Integer id) {
        int delete = mapper.deleteById(id);
        if (delete>0){
            return ResponseResult.success();
        }
        return ResponseResult.error();
    }

    @Override
    public ResponseResult updateCaleder(Calender calender) {
        int update = mapper.updateById(calender);
        if (update>0){
            return ResponseResult.success();
        }
        return ResponseResult.error();
    }

    @Override
    public List<Calender> selAll() {
        List<Calender> calenders = mapper.selectList(new QueryWrapper<Calender>());
        if (calenders.size()>0){
            return calenders;
        }
        return null;
    }

    @Override
    public Calender selById(Integer id) {
        Calender calender = mapper.selectById(id);
        if (calender!=null){
            return calender;
        }
        return null;
    }
}
