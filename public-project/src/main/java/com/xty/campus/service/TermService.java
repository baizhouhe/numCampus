package com.xty.campus.service;

import com.xty.campus.baseTable.TermMessage;
import com.xty.campus.result.ResponseResult;

import java.util.List;

public interface TermService {
    ResponseResult addTerm(TermMessage termMessage);
    ResponseResult delTerm(Integer termId);
    ResponseResult updateTerm(TermMessage termMessage);
    List<TermMessage> selAll();

    TermMessage selById(Integer termId);
}
