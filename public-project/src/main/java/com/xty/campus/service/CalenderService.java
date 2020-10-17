package com.xty.campus.service;

import com.xty.campus.baseTable.Calender;
import com.xty.campus.result.ResponseResult;

import java.util.List;

public interface CalenderService {
    ResponseResult addCaleder(Calender calender);

    ResponseResult delCaleder(Integer id);

    ResponseResult updateCaleder(Calender calender);

    List<Calender> selAll();

    Calender selById(Integer id);
}
