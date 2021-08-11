package com.test.controller;

import com.test.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/test")
@SessionAttributes("myStudent")
public class Mycontroller {
    @RequestMapping(value = "/register.do")
    public ModelAndView register(Student student){

        ModelAndView mv = new ModelAndView();
        //相当于request.setAttribute("myname",name);
        mv.addObject("myStudent",student);
        mv.setViewName("show");
        return mv;
    }
    @RequestMapping("/register2.do")
    public ModelAndView register2(Student student){

        ModelAndView mv = new ModelAndView();
        //相当于request.setAttribute("myname",name);
       // mv.addObject("myStudent",student);
        mv.setViewName("show");
        //11111111111111111111111111111111
        return mv;
    }


}
