package com.tao.mvc.service;

import java.util.Map;

/**
 * Created by Taoyongpan on 2017/11/22.
 */
public interface TestService {
    int insert(Map map);

    int delete(Map map);

    int update(Map map);

    int select(Map map);
}
