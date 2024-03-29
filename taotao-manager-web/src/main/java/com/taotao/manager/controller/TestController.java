package com.taotao.manager.controller;

import com.taotao.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    // 查询数据库当前时间
    @RequestMapping(value = "queryDate")
    @ResponseBody
    public String queryDate(){
        return  testService.queryDate();
    }
}
