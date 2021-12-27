package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class SillyController {

    @RequestMapping("/showForm")
    public String displayTheForm() {
        return "silly";
    }

}
