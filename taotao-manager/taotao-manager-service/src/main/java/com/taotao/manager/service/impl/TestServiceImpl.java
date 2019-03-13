package com.taotao.manager.service.impl;

import com.taotao.manager.mapper.TestMapper;
import com.taotao.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    /**
     *  查询数据库当前时间
     */
    @Override
    public String queryDate() {
        return testMapper.queryDate();
    }
}