package edu.gsu.petclinicapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")  //<---shortcut if you dont want to keep typing owners in the below request. (Basically prefixing)
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html"}) //<-- What client will request or type
    public String listOwners(){
        return "owner/index"; //<---The name of view that we return to front controller to give to the view
    }

}
