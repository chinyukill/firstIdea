package com.chenxue.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//自定义一个控制器
//该控制器相当于是一个servlet
public class HelloSpringMVC implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello","hello first spring mvc");
        mv.setViewName("first");
        return mv;
    }
}
