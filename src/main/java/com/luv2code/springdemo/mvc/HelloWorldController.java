package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

    //need a controller method to show initial html form

    @RequestMapping("/showForm")
    public String showForm() {
        return "hello-world-form";
    }

    //need controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm() {
        return "hello-world";
    }

    //Controller method to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        // read the request param from the HTML Form
        String theName = request.getParameter("studentName");
        //convert data to UpperCase
        theName = theName.toUpperCase();
        //create message
        String result = "Yo! " + theName;
        //add to model
        model.addAttribute("message",result);
        return "hello-world";
    }

    //Controller method to read form data and add data to the model using request param
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
        //convert data to UpperCase
        theName = theName.toUpperCase();
        //create message
        String result = "Hey My Friend " + theName;
        //add to model
        model.addAttribute("message",result);
        return "hello-world";
    }

}
