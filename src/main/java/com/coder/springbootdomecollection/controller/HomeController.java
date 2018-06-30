package com.coder.springbootdomecollection.controller;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
/**
 * 表示这是个控制器，但是这个类只能返回jsp，html等页面
 */
@Scope("prototype")
public class HomeController {

    @ResponseBody
    /**
     *  使得被@controller注解应用的类返回json
     */
    @RequestMapping(value = "/",method = {RequestMethod.GET})
    public String Index(){
        return "Welcome to SpringBoot-Demo-Collection";
    }

    @RequestMapping(value="/index",method = {RequestMethod.GET})
    public String Index1(){
        return "index";
    }

    @RequestMapping(value = "/error1")
    public void error() {
        try {
            throw new Exception("throw exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
