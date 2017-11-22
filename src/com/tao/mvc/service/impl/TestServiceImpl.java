package com.tao.mvc.service.impl;

import com.tao.mvc.annotion.Service;
import com.tao.mvc.service.TestService;

import java.util.Map;

/**
 * Created by Taoyongpan on 2017/11/22.
 */
@Service("MyService")
public class TestServiceImpl implements TestService {

    @Override
    public int insert(Map map) {
        System.out.println("MyService:"+"insert");
        return 0;
    }

    @Override
    public int delete(Map map) {
        System.out.println("MyService:"+"delete");
        return 0;
    }

    @Override
    public int update(Map map) {
        System.out.println("MyService:"+"update");
        return 0;
    }

    @Override
    public int select(Map map) {
        System.out.println("MyService:"+"select");
        return 0;
    }
}
