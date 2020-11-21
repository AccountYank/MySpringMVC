package com.yannik.mvc.controller;

import com.yannik.mvc.annotation.Controller;
import com.yannik.mvc.annotation.RequestMapping;
import com.yannik.mvc.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/yannik")
public class MyController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        return "name:" + name;
    }
}
