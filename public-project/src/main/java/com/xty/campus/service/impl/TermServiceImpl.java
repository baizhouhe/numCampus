package com.xty.campus.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.xty.campus.baseTable.TermMessage;
import com.xty.campus.mapper.TermMapper;
import com.xty.campus.result.ResponseResult;
import com.xty.campus.service.TermService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service
public class TermServiceImpl implements TermService {

    @Autowired
    TermMapper termMapper;


    @Override
    public ResponseResult addTerm(TermMessage termMessage) {
        int insert = termMapper.insert(termMessage);
        if (insert>0){
            return ResponseResult.success();
        }
        return ResponseResult.error();
    }

    @Override
    public ResponseResult delTerm(Integer termId) {
        int delete = termMapper.deleteById(termId);
        if (delete>0){
            return ResponseResult.success();
        }
        return ResponseResult.error();
    }

    @Override
    public ResponseResult updateTerm(TermMessage termMessage) {
        int update = termMapper.updateById(termMessage);
        if (update>0){
            return ResponseResult.success();
        }
        return ResponseResult.error();
    }

    @Override
    public List<TermMessage> selAll() {
        List<TermMessage> termMessages = termMapper.selectList(new QueryWrapper<TermMessage>());
        if (termMessages.size()>0){
            return termMessages;
        }
        return null;
    }

    @Override
    public TermMessage selById(Integer termId) {
        TermMessage termMessage = termMapper.selectById(termId);
        if (termMessage != null){
            return termMessage;
        }
        return null;
    }
}
