package com.tao.mvc.controller;

import com.tao.mvc.annotion.Controller;
import com.tao.mvc.annotion.Autowired;
import com.tao.mvc.annotion.RequestMapping;
import com.tao.mvc.service.TestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Taoyongpan on 2017/11/22.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestService myService;

    @RequestMapping("/insert")
    public String insert(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.insert(null);
        return null;
    }

    @RequestMapping("/delete")
    public String delete(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.delete(null);
        return null;
    }

    @RequestMapping("/update")
    public String update(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.update(null);
        return null;
    }

    @RequestMapping("/select")
    public String select(HttpServletRequest request, HttpServletResponse response, String param) {
        myService.select(null);
        return null;
    }
}
