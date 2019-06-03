package com.xf.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThyemeleafController {

    @RequestMapping("testOne")
    public String testOne(ModelMap map){

        map.put("val","java真刺激！");

        return "thytest";
    }
}
