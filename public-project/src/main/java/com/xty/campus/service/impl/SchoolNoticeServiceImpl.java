package com.xty.campus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.xty.campus.baseTable.SchoolNotice;
import com.xty.campus.mapper.SchoolNoticeMapper;
import com.xty.campus.result.ResponseResult;
import com.xty.campus.service.SchoolNoticeService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Service
public class SchoolNoticeServiceImpl implements SchoolNoticeService {

    @Autowired
    SchoolNoticeMapper mapper;
    @Override
    public ResponseResult addNotice(SchoolNotice notice) {
        int insert = mapper.insert(notice);
        if (insert>0){
            return ResponseResult.success();
        }
        return ResponseResult.error();
    }

    @Override
    public ResponseResult delNotice(Integer id) {
        int delete = mapper.deleteById(id);
        if (delete>0){
            return ResponseResult.success();
        }
        return ResponseResult.error();
    }

    @Override
    public ResponseResult updateNotice(SchoolNotice notice) {
        int update = mapper.updateById(notice);
        if (update>0){
            return ResponseResult.success();
        }
        return ResponseResult.error();
    }

    @Override
    public List<SchoolNotice> selAll() {
        List<SchoolNotice> schoolNotices = mapper.selectList(new QueryWrapper<SchoolNotice>());
        if (schoolNotices.size()>0){
            return schoolNotices;
        }
        return null;
    }

    @Override
    public SchoolNotice selById(Integer Id) {
        SchoolNotice schoolNotice = mapper.selectById(Id);
        if (schoolNotice!=null){
            return schoolNotice;
        }
        return null;
    }
}
