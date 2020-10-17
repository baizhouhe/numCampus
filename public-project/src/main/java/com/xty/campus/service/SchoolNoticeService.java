package com.xty.campus.service;

import com.xty.campus.baseTable.SchoolNotice;
import com.xty.campus.result.ResponseResult;

import java.util.List;

public interface SchoolNoticeService {
    ResponseResult addNotice(SchoolNotice notice);
    ResponseResult delNotice(Integer id);
    ResponseResult updateNotice(SchoolNotice notice);

    List<SchoolNotice> selAll();
    SchoolNotice selById(Integer Id);
}
