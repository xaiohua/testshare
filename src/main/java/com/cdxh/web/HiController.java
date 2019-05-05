package com.cdxh.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HiController {

    @RequestMapping("/say")
    public String say(){
        return "WEB-INF/say.jsp";
    }
}
