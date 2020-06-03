package edu.gsu.petclinicapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    //When a request comes into the root context,/,index, or index.html, they will match to this request mapping
    @RequestMapping({"","/","index", "index.html"})
    public String index(){
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "noimpl";
    }

}
