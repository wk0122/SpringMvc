package tech.aistar.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by js on 2019/6/20.
 */

public class Hello implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv=new ModelAndView();

        mv.addObject("hello","欢迎来到springmvc");
        mv.setViewName("hello.jsp");
        return mv;
    }
}
