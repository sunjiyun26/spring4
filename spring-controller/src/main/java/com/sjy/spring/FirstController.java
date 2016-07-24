package com.sjy.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * com.sjy.spring
 * Created by sunjiyun on 2016/7/21.
 */
@org.springframework.stereotype.Controller
public class FirstController implements Controller {
    @Override
    @RequestMapping("/firstController")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("firstcontroller");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/FirstController");
        return modelAndView;
    }
}
