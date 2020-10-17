package com.xty.campus.controller;


import com.xty.campus.baseTable.Calender;
import com.xty.campus.result.ResponseResult;
import com.xty.campus.service.impl.CalenderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calender")
public class CalenderController {

    @Autowired
    CalenderServiceImpl calenderServiceImpl;

    @PostMapping("/add")
    public ResponseResult addCalender(Calender calender){
        return calenderServiceImpl.addCaleder(calender);
    }

    @DeleteMapping("/del")
    public ResponseResult del(Integer id){
        return  calenderServiceImpl.delCaleder(id);
    }

    @PutMapping("/put")
    public ResponseResult put(Calender calender){
        return calenderServiceImpl.updateCaleder(calender);
    }

    @GetMapping("/selAll")
    public ResponseResult selAll(){
        List<Calender> calenders = calenderServiceImpl.selAll();
        return  new ResponseResult("200","success",calenders);
    }

    @GetMapping("/sel/{id}")
    public ResponseResult sel(@PathVariable("id") Integer id){
        Calender calender = calenderServiceImpl.selById(id);
        return new ResponseResult("200","success",calender);
    }


}
