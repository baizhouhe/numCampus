package com.xty.campus.controller;

import com.xty.campus.baseTable.SchoolNotice;
import com.xty.campus.result.ResponseResult;
import com.xty.campus.service.impl.SchoolNoticeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schoolNotice")
public class SchoolNoticeController {

    @Autowired
    SchoolNoticeServiceImpl schoolNoticeServiceImpl;

    @PostMapping("/add")
    public ResponseResult addNotice(SchoolNotice notice){
        return schoolNoticeServiceImpl.addNotice(notice);
    }

    @DeleteMapping("/del")
    public ResponseResult delNotice(Integer id){
        return schoolNoticeServiceImpl.delNotice(id);
    }

    @PutMapping("/update")
    public ResponseResult updateNotice(SchoolNotice notice){
        return schoolNoticeServiceImpl.updateNotice(notice);
    }

    @GetMapping("/selAll")
    public ResponseResult selAll(){
        List<SchoolNotice> schoolNotices = schoolNoticeServiceImpl.selAll();
        return new ResponseResult("200","success",schoolNotices);
    }

    @GetMapping("/selById/{id}")
    public ResponseResult selById(@PathVariable("id") Integer id){
        SchoolNotice schoolNotice = schoolNoticeServiceImpl.selById(id);
        return new ResponseResult("200","success",schoolNotice);
    }





}
