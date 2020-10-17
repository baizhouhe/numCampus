package com.xty.campus.controller;

import com.xty.campus.baseTable.TermMessage;
import com.xty.campus.result.ResponseResult;
import com.xty.campus.service.impl.TermServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/term")
public class TermController {
    @Autowired
    TermServiceImpl termServiceImpl;

    @PostMapping("/add")
    public ResponseResult addTerm(TermMessage termMessage){
        return termServiceImpl.addTerm(termMessage);
    }

    @DeleteMapping("/del")
    public ResponseResult delTerm(Integer termId){
        return termServiceImpl.delTerm(termId);
    }

    @PutMapping("/update")
    public ResponseResult updateTerm(TermMessage termMessage){
        return termServiceImpl.updateTerm(termMessage);
    }

    @GetMapping("selAll")
    public ResponseResult selAll(){
        List<TermMessage> termMessages = termServiceImpl.selAll();
        return new ResponseResult("200","success",termMessages);
    }

    @GetMapping("/selById/{termId}")
    public ResponseResult selById(@PathVariable("termId") Integer termId){
        System.out.println("termId = " + termId);
        TermMessage termMessage = termServiceImpl.selById(termId);
        return new ResponseResult("200","success",termMessage);
    }

}
